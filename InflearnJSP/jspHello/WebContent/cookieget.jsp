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
	  Cookie[] cookies = request.getCookies(); //getCookies()를 통해 cookieset.jsp로부터 값(cookieN, cookieV)을 받음. 값이 여러개일 수 있으므로 배열로 받음
	  
	  for(int i = 0; i<cookies.length; i++){
		  String str = cookies[i].getName(); 
		  if(str.equals("cookieN")){
			  out.println("cookies[" + i + "] name:" + cookies[i].getName() + "<br/>");
			  out.println("cookies[" + i + "] value:" + cookies[i].getValue() + "<br/>");
			  out.println("======================<br/>");
			  
		  }
	  }
	%>
	
	<a href = "cookiedel.jsp">cookie delete</a>

</body>
</html>