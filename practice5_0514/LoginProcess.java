package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.print("<b> Login... : ");
		String userName = req.getParameter("userName");
		String userPassword = req.getParameter("userPassword");
		if (userName.equals("ȫ�浿") && userPassword.equals("1234")) {
			out.print("<b> �α��� �ϼ̽��ϴ�.");
		} else {
			out.print("<b> �α��� ������ ��ġ���� �ʽ��ϴ�.");
		}
		out.close();
	}
}