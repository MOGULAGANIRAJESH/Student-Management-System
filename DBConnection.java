package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public Connection getconnection()
	{
		Connection con=null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
	      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b48","root","root");
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
}
}
