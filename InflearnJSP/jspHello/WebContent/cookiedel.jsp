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
  for(int i = 0; i < cookies.length; i++){
	  String str = cookies[i].getName();
	  String str1 = cookies[i].getValue();
	  if(str.equals("cookieN") && str1.equals("cookieV")){
		  out.println("name: " + cookies[i].getName() + "<br/>");
		  out.println("value: " + cookies[i].getValue() + "<br/>");
		  cookies[i].setMaxAge(0); //유효기간을 0으로만듬 즉, 해당 쿠키를 삭제
		  response.addCookie(cookies[i]); // 그 쿠키를 다시 response객체에 탑재(수정하거나, 확인을 위해서는 다시 탑재해야함)/ 생성 -> 속성변경(유효기간 0으로) -> 탑재 (현재코드)) 
	  }
  }
  %>
  
  <a href="cookietest.jsp">쿠키확인</a>

</body>
</html>