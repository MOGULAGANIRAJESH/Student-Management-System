package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.DAO.StudentDAO;
import com.vcube.model.studentmodel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update1")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num=Integer.parseInt(request.getParameter("sid")) ;
		String fn=request.getParameter("firstname");
		String ln=request.getParameter("lastname");
		String un=request.getParameter("username");
		int pwd=Integer.parseInt(request.getParameter("password"));
		String mail=request.getParameter("email");
		long mno=Long.parseLong(request.getParameter("phonenumber"));
		
		studentmodel sm = new studentmodel();
		sm.setId(num);
		sm.setFirstname(fn);
		sm.setLastname(ln);
		sm.setUsername(un);
		sm.setEmail(mail);
		sm.setPassword(pwd);
		sm.setPhonenumber(mno);
		StudentDAO sd=new StudentDAO();
		int n=sd.updatestudentdata(sm);
		if(n>0) {
			 List<studentmodel> st = sd.getall();
	            request.setAttribute("studentList", st);
	            RequestDispatcher rd = request.getRequestDispatcher("data.jsp");
	            rd.forward(request, response);
		}
	}

}
