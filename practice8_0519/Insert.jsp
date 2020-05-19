<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DEPT INSERT</title>
</head>
<body>
	<form action="insertProcess.jsp" method="get">
		부서번호 : <input type="text" name="dept_id"><br>
		부서명 : <input type="text" name="dept_name"><br>
		위치코드 : <input type="text" name="loc_id"><br>
		<input type="submit" value="저장">
		<input type="reset" value="초기화">
	</form>
</body>
</html>