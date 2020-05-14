package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 implements Servlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet is initialized");
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>Hello Servlet</b>");
		out.print("</body></html>");
		System.out.println("Servlet is serviced");
	}

	public void destroy() {
		System.out.println("Servlet is destroyed");
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}
}


