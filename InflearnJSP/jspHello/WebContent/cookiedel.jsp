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
		  cookies[i].setMaxAge(0); //��ȿ�Ⱓ�� 0���θ��� ��, �ش� ��Ű�� ����
		  response.addCookie(cookies[i]); // �� ��Ű�� �ٽ� response��ü�� ž��(�����ϰų�, Ȯ���� ���ؼ��� �ٽ� ž���ؾ���)/ ���� -> �Ӽ�����(��ȿ�Ⱓ 0����) -> ž�� (�����ڵ�)) 
	  }
  }
  %>
  
  <a href="cookietest.jsp">��ŰȮ��</a>

</body>
</html>