package com.vcube.model;

public class loginmodel {
	
	private String firstname;
	
	public loginmodel()
	{
		
	}
	public loginmodel(String firstname)
	{
		this.firstname=firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String toString()
	{
		return firstname;
		
	}
}
