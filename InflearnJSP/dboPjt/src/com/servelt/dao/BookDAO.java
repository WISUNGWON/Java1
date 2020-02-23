package com.servelt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.servelt.dto.BookDTO;

//DAO객체를 이용해서 DB에서 데이터를 가져옴 
public class BookDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver"; //Driver
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //DB의 IP와 port번호
	String id = "SYS as sysdba";
	String pw = "1234";
	
	
	public BookDAO() {
		try {
			Class.forName(driver); //1) driver로딩
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//2) select() 메서드 호출을 하면
	public ArrayList<BookDTO> select(){
		//3) ArrayList를 만들어서, DB에서 가져온 값들은 담는다. 
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
				list.add(bookDTO); //4) add로 담고 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(res != null) //5) 자원반납
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list; //6) list반납 
	}
}
