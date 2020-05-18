package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Param")
public class Param extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		ServletContext sc = this.getServletContext();
		String userName = sc.getInitParameter("userName");
		out.print(userName);
		
		Student stu = new Student();
		stu.setName("test");
		stu.setAge(20);
		sc.setAttribute("student1", stu);
		
		out.close();
	}

}
