<%@page import="java.util.Enumeration" %>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    String path = request.getRealPath("fileFolder"); //실제로 파일이 저장되는 폴더를 지정하여, request가 해당 폴더에 수행될 수 있게 함. 즉, 파일이 저장되는 경로
    //파일 용량 설정. 최대 몇 메가바이트까지 업로드 할 수 있는지.
    int size = 1024 * 1024 * 10; //10M
    String file = ""; // 업로드한 파일의 이름
    String oriFile=""; // 다른 파일이지만 같은 이름일 경우, 새로운 파일이 기존파일을 덮어씌워 파일이 삭제되는 것을 방지함. 이런 경우 file이름에 1->2->3->4가 붙어 중복을 방지
    
    //try catch를 통해 실제파일을 업로드하는 프로세스 진행
    try{
        MultipartRequest multi = new MultipartRequest(request, path, size, new DefaultFileRenamePolicy()); //MultipartRequest 인스턴스 생성시에, path(파일저장경로), size(파일최대용량), "EUC-KR"
                //(한글 깨짐 방지), DefaultFileRenmaePolicy : 중복방지를 위해 file뒤에 1,2,3,4를 붙이는 작업 수행)
        Enumeration files = multi.getFileNames(); //multi에서 File이름을 받아
        String str = (String)files.nextElement(); // str스트링에 저장 
        
        file = multi.getFilesystemName(str); // 중복되어 있을 경우 파일의 이름을 구함
        oriFile = multi.getOriginalFileName(str); //실제 파일 이름을 구함 
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