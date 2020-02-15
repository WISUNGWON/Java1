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
  Cookie[] cookies = request.getCookies();
  
  if(cookies != null){
	  for(int i = 0; i < cookies.length; i++){
		  if(cookies[i].getValue().equals("abcde")){ //id가 abcde인 쿠키값을 삭제함
			  cookies[i].setMaxAge(0);
			  response.addCookie(cookies[i]); //변경된 속성은다시 탑재 (생성 -> 속성입력 -> 탑재원리)
		  }
	  }
  }
  
  //response.sendRedirect("login.html");
  response.sendRedirect("cookietest.jsp"); //cookiestest에는 abcde가 삭제돼있는지 확인
 
%>

</body>
</html>