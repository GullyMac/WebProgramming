<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>VIEW DEPT</title>
</head>
<body>
	<%
	String dept_id = request.getParameter("dept_id");
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String strSql = "SELECT * FROM DEPT WHERE DEPT_ID = ?";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	stmt.setInt(1, Integer.parseInt(dept_id));
	ResultSet rs = stmt.executeQuery();
	%>
	<%while(rs.next()){%>
	<table border="1">
		<tr>
			<td>부서번호</td><td><%=rs.getInt("DEPT_ID")%></td>
		</tr>
		<tr>
			<td>부서이름</td><td><%=rs.getString("DEPT_NAME")%></td>
		</tr>
		<tr>
			<td>위치코드</td><td><%=rs.getInt("LOC_ID")%></td>
		</tr>
	</table>
	<%}%>
	<br>
	<a href="List.jsp">목록</a>&nbsp;
	<a href="Update.jsp?dept_id=" + dept_id>수정</a>&nbsp;
	<a href="Delete.jsp?dept_id=" + dept_id>삭제</a>
</body>
</html>