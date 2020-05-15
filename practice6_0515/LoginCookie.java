package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginCookie")
public class LoginCookie extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body>");
		
		Cookie cId = new Cookie("userId", userId);
		cId.setPath("/");
		resp.addCookie(cId);
		Cookie cPwd = new Cookie("userPwd", userPwd);
		cPwd.setPath("/");
		resp.addCookie(cPwd);
		
		out.print("userId cookie created");
		out.print("</body></html>");
	}
}