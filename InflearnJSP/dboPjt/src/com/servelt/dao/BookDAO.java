package com.servelt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.servelt.dto.BookDTO;

//DAO��ü�� �̿��ؼ� DB���� �����͸� ������ 
public class BookDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver"; //Driver
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //DB�� IP�� port��ȣ
	String id = "SYS as sysdba";
	String pw = "1234";
	
	
	public BookDAO() {
		try {
			Class.forName(driver); //1) driver�ε�
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2) select() �޼��� ȣ���� �ϸ�
	public ArrayList<BookDTO> select(){
		//3) ArrayList�� ����, DB���� ������ ������ ��´�. 
		ArrayList<BookDTO> list = new ArrayList<BookDTO>();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "SELECT * FROM member";
			pstmt = con.prepareStatement(sql);
			res = pstmt.executeQuery();
			
			while (res.next()) {
				String memberID = res.getString("member_ID");
				String memberPW = res.getString("member_PW");
				String memberName = res.getString("member_NAME");
				String memberPhone = res.getString("member_PHONE");
				
				BookDTO bookDTO = new BookDTO(memberID, memberPW, memberName, memberPhone);
				list.add(bookDTO); //4) add�� ��� 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(res != null) //5) �ڿ��ݳ�
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list; //6) list�ݳ� 
	}
}
