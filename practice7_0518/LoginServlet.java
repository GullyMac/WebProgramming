package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("Link.html").include (req, resp);
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if (name.equals("test") && password.equals("1234")) {
			out.print("Welcome, " + name);
			HttpSession session = req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("password", password);
		} else {
			out.print("Mismatch name or password error!");
			req.getRequestDispatcher("Login.html").include(req,  resp);
		}
	}

}
