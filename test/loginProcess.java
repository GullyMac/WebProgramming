package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("로그인을 하였습니다.<br>");
		out.print("당신의 아이디는 : " + req.getParameter("userId") + "<br>");
		out.print("당신의 비밀번호는 : " + req.getParameter("userPwd") + "<br>");
		out.print("당신의 성별은 : " + req.getParameter("gender") + "<br>");
		out.print("수고 많으셨습니다.");
	}

}
