<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEPT LIST</title>
</head>
<body>
	<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url = "jdbc:oracle:thin:@localhost:1521:company";
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String strSql = "SELECT * FROM DEPT ORDER BY DEPT_ID DESC";
	PreparedStatement stmt = conn.prepareStatement(strSql);
	ResultSet rs = stmt.executeQuery();			
	%>

	<a href="Insert.jsp">추가</a>
	<table border="1">
		<tr>
			<td>부서번호</td><td>부서명</td><td>위치코드</td>
		</tr>
	<%
	while(rs.next()){
	%>
		<tr>
			<td><%=rs.getInt("DEPT_ID")%></td>
			<td><a href="View.jsp?dept_id=<%=rs.getInt("DEPT_ID")%>">
				<%=rs.getString("DEPT_NAME")%></a></td>
			<td><%=rs.getInt("LOC_ID")%></td>
			<td><a href="Delete.jsp?dept_id=<%=rs.getInt("DEPT_ID")%>">삭제</a></td>
		</tr>
	<%
	}
	rs.close();
	%>
	</table>
</body>
</html>