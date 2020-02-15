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
  Cookie[] cookies = request.getCookies(); // 쿠키 배열을 가져옴
  if(cookies != null){ //쿠키객체가 null이 아니면 for문 실행 , 여기 에 cookie가 찍히면 안됨, 전에 del로 삭제했기 때문에.
	  for(int i = 0; i < cookies.length; i++){
		  out.println(cookies[i].getName() + "<br/>");
		  out.println(cookies[i].getValue() + "<br/>");
	  }
  }
%>

</body>
</html>