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
		
		//newBook.jsp에서 사용자가 입력한 값을 받아옴 
		/*
		String memberID = request.getParameter("member_id");
		String memberPW = request.getParameter("member_pw");
		String memberName = request.getParameter("member_name");
		String memberPhone = request.getParameter("member_phone");
		*/
		// 실제로 데이터베이스를 사용하기 위한 코드 정의
		String driver = "oracle.jdbc.driver.OracleDriver"; //Driver
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl"; //DB의 IP와 port번호
		String id = "SYS as sysdba";
		String pw = "1234";
		
		Connection con = null; //connection 객체
		Statement stmt = null; // statement 객체
		ResultSet res = null;
		
		try {
			Class.forName(driver); //driverloading
			
			con = DriverManager.getConnection(url, id, pw);
			stmt = con.createStatement();
			String sql = "SELECT * FROM member";
			res = stmt.executeQuery(sql); //select일 떄만 executeQuery 사용
			// select from을 통해 받아온 data를 res셋에 받아놓는다.
			
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
