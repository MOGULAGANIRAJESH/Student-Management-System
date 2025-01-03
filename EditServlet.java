package com.vcube.controller;

import java.io.IOException;

import com.vcube.DAO.StudentDAO;
import com.vcube.model.studentmodel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("id");
		int n=Integer.parseInt(num);
		System.out.println(num);
		StudentDAO sd=new StudentDAO();
		studentmodel sm=sd.getStudent(n);
//		System.out.println(sm.getFirstname()+sm.getId());
		
		request.setAttribute("student", sm);
		
		RequestDispatcher rd=request.getRequestDispatcher("updatestudent.jsp");
			rd.forward(request, response);
		
	}

}
