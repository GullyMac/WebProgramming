<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.test.dao.*" %>
<%@ page import="com.test.beans.*" %>
<%
	String id = request.getParameter("id");
	Register r = RegisterDao.getRecordById(Integer.parseInt(id));
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
		<td>아이디</td><td>이름</td><td>비밀번호</td><td>성별</td><td>이메일</td><td>회사</td>
	</tr>
	<tr>
		<td><%=r.getId()%></td>
		<td><%=r.getName()%></td>
		<td><%=r.getPassword()%></td>
		<td><%=r.getSex()%></td>
		<td><%=r.getEmail()%></td>
		<td><%=r.getCountry()%></td>
	</tr>
	</table> 
</body>
</html>