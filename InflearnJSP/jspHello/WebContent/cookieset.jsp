<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- cookieset.jsp에서 실행 즉, 서버에서 쿠키가 생성됨  -->
	<% //스크립트로 자바코드 입력
	  Cookie cookie = new Cookie("cookieN", "cookieV"); //1)쿠키를 설정하기위한 쿠키 객체 생성, 인자값으로 앞에오는게 쿠키의 Name 뒤에오는 값이 Value
	  cookie.setMaxAge(60*60); // 1시간동안 쿠기가 유지됨. 2)속성 값을줌
	  response.addCookie(cookie); //응답(쿠키객체를 보냄)을 해야 하기 때문에 response객체에 cookie객체를 add해줌 3) response객체에 탑재 
	%>
	
	<a href="cookieget.jsp">cookie get</a> <!-- 4) cookieget.jsp로  값을 넘김. 1)번에서 생성한 쿠키가 cookie get이라는 버튼을 누르면 cookieget.jps로 넘어감-->

</body>
</html>