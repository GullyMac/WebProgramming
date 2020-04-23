<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="UTF-8"%>

<html>
<head>
     <title>GET 방식 요청</title>
</head>
	<body>
	<!-- JSP 문법 작성 -->
	<%
	String strName=request.getParameter("name");
	out.println("당신의 이름은 " + strName + "입니다. <strong><font color=blue>반갑습니다.</font></strong>");
	%>
	</body>
</html>