package com.vcube.controller;

import java.io.IOException;
import java.util.List;

import com.vcube.DAO.StudentDAO;
import com.vcube.model.studentmodel;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class logincontroller extends studentcontroller  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public logincontroller()
	{
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	
		
//		System.out.println(st);
		RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
		rd.forward(request, response);
	}
}
