<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%! //form �±׿��� �� �������� �����ϱ� ���� ����ο��� id, pw��
		String id, pw;
	%>
	<%
		id = request.getParameter("id"); 
		pw = request.getParameter("pw");
		
		//���߿� �����ͺ��̽��� ���� DB�� �����ؼ� ���� ȸ������ �����ϴ� ��������.
		if(id.equals("abcde")&& pw.equals("12345")){ //���߿� �ϳ��� false���̸� else���� -> �ٽ� �α����϶�� �������� ������
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(60);
			response.addCookie(cookie);
			response.sendRedirect("welcome.jsp"); //������ to welcome.jsp
		}else {
			response.sendRedirect("login.html");	// �ٽ� �α��� �϶�! login.html�� ������	
		}
		
	%>

</body>
</html>