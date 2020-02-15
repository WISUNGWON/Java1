<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import= "java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

  <%
    Object obj1 = session.getAttribute("mySessionName"); //getAttribute로 받아온 값은 Object 타입임.
    String mySessionName = (String) obj1; //원하는 데이터 값으로 캐스팅해서 사용
    out.println(mySessionName + "<br/>");
    
    Object obj2 = session.getAttribute("myNum"); //set때는(보낼 때) int지만 get할때는 Object로 받아옴 
    Integer myNum = (Integer)obj2;
    out.println(myNum + "<br/>");
    
    out.println("******************* <br/>");
    
    String sName;
    String sValue;
    Enumeration enumeration = session.getAttributeNames(); // 모든 값을 바기 위해 직렬화 객체 Enumeration 사용 
    while(enumeration.hasMoreElements()){
    	sName =enumeration.nextElement().toString();
    	sValue = session.getAttribute(sName).toString();
    	out.println("sName : " + sName + "<br/>");
    	out.println("sValue : " +sValue + "<br/>");
    }
    
    out.println("******************* <br/>");
    
    String sessionID = session.getId();
    out.println("sessionID : " + sessionID + "<br/>");
    int sessionInter = session.getMaxInactiveInterval();
    out.println("sessionInter : " + sessionInter + "<br/>");
    
    out.println("******************* <br/>");
    
    session.removeAttribute("mySessionName"); //sessoin의 data값만 삭제
    Enumeration enumeration1 = session.getAttributeNames();
    while(enumeration1.hasMoreElements()){
    	sName = enumeration1.nextElement().toString();
    	sValue = session.getAttribute(sName).toString();
    	out.println("sName : " + sName + "<br/>");
    	out.println("sValue : " + sValue + "<br/>");
    }
    
    out.println("******************* <br/>");
    
    session.invalidate(); //값 전체 삭제
    if(request.isRequestedSessionIdValid()){ 
    	out.println("session valid");
    } else {
    	out.println("session invalid");
    }
    
  %>

</body>
</html>