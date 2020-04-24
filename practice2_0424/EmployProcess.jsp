<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
     <title>GET/POST 방식 요청</title>
</head>
	<body>
	<!-- JSP 문법 작성 -->
	<%
	String userId=request.getParameter("userId");
	String userPwd=request.getParameter("userPwd");
	out.println(userId + ", " + userPwd);
	%>
	</body>
</html>