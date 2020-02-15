<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! //form 태그에서 온 정보들을 저장하기 위해 선언부에서 id, pw언선
		String id, pw;
	%>
	<%
		id = request.getParameter("id"); 
		pw = request.getParameter("pw");
		
		//나중에 데이터베이스를 배우면 DB에 접속해서 실제 회원인지 인증하는 절차도함.
		if(id.equals("abcde")&& pw.equals("12345")){ //둘중에 하나라도 false값이면 else실행 -> 다시 로그인하라는 페이지로 포워딩
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(60);
			response.addCookie(cookie);
			response.sendRedirect("welcome.jsp"); //포워딩 to welcome.jsp
		}else {
			response.sendRedirect("login.html");	// 다시 로그인 하라! login.html로 포워딩	
		}
		
	%>

</body>
</html>