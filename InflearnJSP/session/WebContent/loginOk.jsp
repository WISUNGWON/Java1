<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <%!
 	String id, pw;
 %>
 <%
 	id = request.getParameter("id");
 	pw = request.getParameter("pw"); 
 	
 	if(id.equals("abcde") && pw.equals("12345")){
 		session.setAttribute("id", id); //아이디와 패스워드가 일치하면 세션에 id값 저장 
 		response.sendRedirect("welcome.jsp"); 
 	} else {
 		response.sendRedirect("login.html");
 	}
 %>
 

</body>
</html>