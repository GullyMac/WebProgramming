package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		req.getRequestDispatcher("Link.html").include (req, resp);
		HttpSession session = req.getSession(false);
		if (session != null) {
			String name = (String)session.getAttribute("name");
			String password = (String)session.getAttribute("password");
			out.print("name : " + name + ", password : " + password);
		} else {
			out.print("Please login first");
			req.getRequestDispatcher("Login.html").include(req, resp);
		}

		out.close();
	}

}
