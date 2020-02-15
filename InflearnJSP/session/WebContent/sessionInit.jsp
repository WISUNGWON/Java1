<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	
  <%// 속성의 이름, 값
    session.setAttribute("mySessionName", "mySessionData"); //session : 내부객체 JSP컨테이너에서 Servlet으로 만들때 자동으로 만들어 주기 떄문에 선언을 안해도 바로 사용 가능
    session.setAttribute("myNum", 12345); //여러개 지정 가능 
  %>

  <a href="sessionGet.jsp">session get</a> <!--session get으로 넘어감  --> 
</body>
</html>