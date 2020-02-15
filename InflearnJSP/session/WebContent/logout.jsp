<%@page import="java.util.Enumeration" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
    	Enumeration enumeration = session.getAttributeNames(); //모든 브라우저에 존재하면 세션 네임을  다 받아오고 
		while(enumeration.hasMoreElements()){ //반복을 돌림
			String sName = enumeration.nextElement().toString(); 
			String sValue = (String)session.getAttribute(sName);
			
			//if(sValue.equals("abcde")) out.println(sValue + "님 안녕하세요." + "<br/>"); //해당 세션이 존재하면 인삿말 출력
			if(sValue.equals("abcde")) session.removeAttribute(sName);
		}
	%>
	
	<a href="sessiontest.jsp">sessionTest</a>

</body>
</html>