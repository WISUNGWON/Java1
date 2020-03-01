<%@page import="java.util.Enumeration" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    String path = request.getRealPath("fileFolder"); //������ ������ ����Ǵ� ������ �����Ͽ�, request�� �ش� ������ ����� �� �ְ� ��. ��, ������ ����Ǵ� ���
    //���� �뷮 ����. �ִ� �� �ް�����Ʈ���� ���ε� �� �� �ִ���.
    int size = 1024 * 1024 * 10; //10M
    String file = ""; // ���ε��� ������ �̸�
    String oriFile=""; // �ٸ� ���������� ���� �̸��� ���, ���ο� ������ ���������� ����� ������ �����Ǵ� ���� ������. �̷� ��� file�̸��� 1->2->3->4�� �پ� �ߺ��� ����
    
    //try catch�� ���� ���������� ���ε��ϴ� ���μ��� ����
    try{
        MultipartRequest multi = new MultipartRequest(request, path, size, new DefaultFileRenamePolicy()); //MultipartRequest �ν��Ͻ� �����ÿ�, path(����������), size(�����ִ�뷮), "EUC-KR"
                //(�ѱ� ���� ����), DefaultFileRenmaePolicy : �ߺ������� ���� file�ڿ� 1,2,3,4�� ���̴� �۾� ����)
        Enumeration files = multi.getFileNames(); //multi���� File�̸��� �޾�
        String str = (String)files.nextElement(); // str��Ʈ���� ���� 
        
        file = multi.getFilesystemName(str); // �ߺ��Ǿ� ���� ��� ������ �̸��� ����
        oriFile = multi.getOriginalFileName(str); //���� ���� �̸��� ���� 
    } catch (Exception e){
        e.printStackTrace();
    }
%>    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
    file upload success!
</body>
</html>