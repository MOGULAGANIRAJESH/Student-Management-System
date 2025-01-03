package com.vcube.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Scanner;

import com.vcube.DAO.StudentDAO;
import com.vcube.model.loginmodel;
import com.vcube.model.studentmodel;

 @WebServlet("/register")
public class studentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello servlet");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		int password=Integer.parseInt(request.getParameter("password"));
		String  email=request.getParameter("email");
		long phonenumber=Long.parseLong(request.getParameter("phonenumber"));
		
		System.out.println("hello" + firstname + lastname + username + password +email+phonenumber  );
		
	
		studentmodel s=new studentmodel();
		s.setFirstname(firstname);
		System.out.println(s.getFirstname());
		s.setLastname(lastname);
		System.out.println(s.getLastname());
		s.setUsername(username);
		System.out.println(s.getUsername());
		s.setPassword(password);
		s.setEmail(email);
		System.out.println(s.getEmail());
		
		 s.setPhonenumber(phonenumber); 
		  System.out.println(s.getPhonenumber());
		  
		 
		StudentDAO sd=new StudentDAO();
		String status=sd.insertstudentdata(s);
		System.out.println(status);
		
	//	String status=sd.updatestudentdata(s);
	//	System.out.println(status);
		
		
	/*
	 * Scanner sc=new Scanner(System.in);
	 * System.out.println("please enter the number:"); int n=sc.nextInt(); switch(n)
	 * { case 1: { System.out.println("inserted studentdata"); String
	 * status=sd.insertstudentdata(s); System.out.println(status); } case 2: {
	 * System.out.println("select studentdata"); String
	 * status=sd.selectstudentdata(l); } case 3: {
	 * 
	 * }
	 * 
	 * 
	 */
		 if(status.equals("success"))
		  { 
				
				HttpSession session=request.getSession(); 
				session.setAttribute("fn",firstname);
			  RequestDispatcher rd=request.getRequestDispatcher("/login.jsp"); 
			  rd.include(request, response);
		  } 
		  else 
		  { 
		  RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
		  rd.include(request, response); 
		  }
	}


 }


