package com.vcube.model;

public class studentmodel {
	private int id;
	private String firstname;
	private String lastname;
	private String username;
	private int password;
	private String email;
	private long phonenumber;
	
	public studentmodel()
	{
		
	}
	public studentmodel(int id,String firstname,String lastname,String username,int password,String email,long phonenumber)
	{
		this.setId(id);
		this.firstname=firstname;
		this.lastname=lastname;
		this.username=username;
		this.password=password;
		this.email=email;
		this.phonenumber=phonenumber;
	
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 public long getPhonenumber() 
	 { return phonenumber;
	 } 
	 public void setPhonenumber(long phonenumber) 
	 { 
		 this.phonenumber = phonenumber; 
		 }
	 	public String toString()
	{
		return firstname + " "+lastname +" " +username +" " +password+" "+email+" "+phonenumber ;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	

}
