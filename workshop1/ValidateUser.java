package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet{
	
	private boolean userExists(String id, String pwd){
		String idDB = "홍길동";
		String pwdDB = "1234";
		if (id.equals(idDB) && pwd.equals(pwdDB)){
			return true;
		} else {return false;}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		
		if (userExists(id, pwd) == true) {
			resp.sendRedirect("Welcome");
		} else {
			out.print("<script>alert('사용자 아이디나 비밀번호가 잘못되었습니다. 다시 입력하세요.');");
			out.print("location.href=\"LoginForm\"</script>");
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		out.print("<script>alert('잘못된 접근입니다. 로그인 페이지로 이동합니다.');");
		out.print("location.href=\"LoginForm\"</script>");
	}
	
}
