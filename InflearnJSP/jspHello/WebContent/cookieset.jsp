<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- cookieset.jsp���� ���� ��, �������� ��Ű�� ������  -->
	<% //��ũ��Ʈ�� �ڹ��ڵ� �Է�
	  Cookie cookie = new Cookie("cookieN", "cookieV"); //1)��Ű�� �����ϱ����� ��Ű ��ü ����, ���ڰ����� �տ����°� ��Ű�� Name �ڿ����� ���� Value
	  cookie.setMaxAge(60*60); // 1�ð����� ��Ⱑ ������. 2)�Ӽ� ������
	  response.addCookie(cookie); //����(��Ű��ü�� ����)�� �ؾ� �ϱ� ������ response��ü�� cookie��ü�� add���� 3) response��ü�� ž�� 
	%>
	
	<a href="cookieget.jsp">cookie get</a> <!-- 4) cookieget.jsp��  ���� �ѱ�. 1)������ ������ ��Ű�� cookie get�̶�� ��ư�� ������ cookieget.jps�� �Ѿ-->

</body>
</html>