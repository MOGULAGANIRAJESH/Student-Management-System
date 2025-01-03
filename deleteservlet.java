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

/**
 * Servlet implementation class deleteservlet
 */
@WebServlet("/delete")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   //     String num=request.getParameter("id");
		int num=Integer.parseInt(request.getParameter("id"));
		
		System.out.println("hello servlet");
		System.out.println(num);
		
		studentmodel sm=new studentmodel();
		sm.setId(num);
		System.out.println(sm.getId());
		
		StudentDAO sd=new StudentDAO();
		int n=sd.deletestudentdata(sm);
		System.out.println(n);
		
        request.setAttribute("student", sm);
		RequestDispatcher rd=request.getRequestDispatcher("updatestudent.jsp");
			rd.forward(request, response);
    }

}

