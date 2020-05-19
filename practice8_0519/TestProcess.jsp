<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" errorPage="myErrorPage.jsp"%>
<%
String name = request.getParameter("name");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<input type="text" value="<%=name%>">
	<%=name%><br>
	current time :
	<%=java.util.Calendar.getInstance().getTime()%><br>
	<%Date d = new Date();%>
	<%=new Date()%>
	<%=10/0%>
</body>
</html>