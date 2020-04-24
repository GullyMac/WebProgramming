<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
     <title>회원</title>
</head>
	<body>
	<!-- JSP 문법 작성 -->
	<%
	String name=request.getParameter("name");
	String id=request.getParameter("id");
	String pw=request.getParameter("pw1");
	out.println("이름 : " + name);
	out.println("<br>ID : " + id);
	out.println("<br>PW : " + pw);
	%>
	</body>
</html>