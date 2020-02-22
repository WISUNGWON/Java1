package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/newbook2")
public class NewBook2 extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//newBook.jsp���� ����ڰ� �Է��� ���� �޾ƿ� 
		/*
		String memberID = request.getParameter("member_id");
		String memberPW = request.getParameter("member_pw");
		String memberName = request.getParameter("member_name");
		String memberPhone = request.getParameter("member_phone");
		*/
		// ������ �����ͺ��̽��� ����ϱ� ���� �ڵ� ����
		String driver = "oracle.jdbc.driver.OracleDriver"; //Driver
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //DB�� IP�� port��ȣ
		String id = "SYS as sysdba";
		String pw = "1234";
		
		Connection con = null; //connection ��ü
		Statement stmt = null; // statement ��ü
		ResultSet res = null;
		
		try {
			Class.forName(driver); //driverloading
			
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			String sql = "SELECT * FROM member";
			res = stmt.executeQuery(sql); //select�� ���� executeQuery ���
			// select from�� ���� �޾ƿ� data�� res�¿� �޾Ƴ��´�.
			
			while (res.next()) {
				String memberID = res.getString("member_ID");
				String memberPW = res.getString("member_PW");
				String memberName = res.getString("member_NAME");
				String memberPhone = res.getString("member_PHONE");
				
				out.print("memberID : " + memberID + ", ");
				out.print("memberPW : " + memberPW + ", ");
				out.print("memberName : " + memberName + ", ");
				out.print("memberPhone : " + memberPhone + "<br>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
