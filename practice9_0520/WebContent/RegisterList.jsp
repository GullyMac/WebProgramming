<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.test.dao.*"%>
<%@ page import="com.test.beans.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>REGISTER LIST</title>
</head>
<body>
	<table border="1">
	<tr>
		<td>아이디</td><td>이름</td><td>비밀번호</td><td>성별</td><td>이메일</td><td>회사</td>
	</tr>
	<%
	List<Register> list = RegisterDao.getAllRecords();
	for (Register r : list) {
	%>
	<tr>
		<td><%=r.getId()%></td>
		<td><a href="RegisterView.jsp?id=<%=r.getId()%>"><%=r.getName()%></td>
		<td><%=r.getPassword()%></td>
		<td><%=r.getSex()%></td>
		<td><%=r.getEmail()%></td>
		<td><%=r.getCountry()%></td>
	</tr>
	<%
	}
	%>
	</table> 
</body>
</html>