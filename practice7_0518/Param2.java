package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Param2")
public class Param2 extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().append("served at : ").append(req.getContextPath() + "<br>");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		
		Student stu = (Student)sc.getAttribute("student1");
		out.print(stu.getName() + ", " + stu.getAge());
		
		String userId = req.getParameter("userId");
		String userPwd = req.getParameter("userPwd");
		HttpSession session = req.getSession();
		session.setAttribute("userID", userId);
		session.setAttribute("userPwd", userPwd);
		out.print("Set session values ");
		out.print("<a href='LoginProcess2'>Session view</a>");
		
		out.close();
	}

}
