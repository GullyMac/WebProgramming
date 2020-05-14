package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html><body>");
		out.println("id : ");
		out.println("<input type=text name=userId><br>");
		out.println("pwd : ");
		out.println("<input type=text name=userPwd><br>");
		out.println("<input type=button value='Login'><br>");
		out.println("</body></html>");
	}
	
}
