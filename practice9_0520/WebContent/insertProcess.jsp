<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>INSERT PROCESS</title>
</head>
<body>
	<%
	String dept_id = request.getParameter("dept_id");
	String dept_name = request.getParameter("dept_name");
	String loc_id = request.getParameter("loc_id");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String strSql = "INSERT INTO DEPT VALUES(?, ?, ?)";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setInt(1, Integer.parseInt(dept_id));
	stmt.setString(2, dept_name);
	stmt.setInt(3, Integer.parseInt(loc_id));
	stmt.executeUpdate();
	stmt.close();
	conn.close();
	response.sendRedirect("List.jsp");
	%>

</body>
</html>