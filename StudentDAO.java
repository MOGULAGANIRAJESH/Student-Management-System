package com.vcube.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.utility.DBConnection;
import com.vcube.model.studentmodel;


public class StudentDAO {
	
	DBConnection db=new DBConnection();
	Connection con=db.getconnection();
	
	public String insertstudentdata(studentmodel s)
	{
		String status="failure";
		String insertdata="insert into student47(firstname,lastname,username,password,email,phonenumber) values(?,?,?,?,?,?)";
		 try {
			PreparedStatement ps=con.prepareStatement(insertdata);
			
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getUsername());
			ps.setInt(4, s.getPassword());
			ps.setString(5, s.getEmail());
			ps.setLong(6, s.getPhonenumber());
			int n=ps.executeUpdate();
			if(n>0)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
			
		}
		 
		 catch (Exception e) {
			System.out.println(e);	
		}
		return status;
	}
	
	public String selectstudentdata(studentmodel s)
	{
		String status="failure";
		String selectdata="select *from student47 where firstname=?";
		 try {
			PreparedStatement ps=con.prepareStatement(selectdata);
			
			ps.setString(1, s.getFirstname());
			int n=ps.executeUpdate();
			if(n>0)
			{
				status="success";
			}
			else
			{
				status="failure";
			}
			
		}
		 
		 catch (Exception e) {
			System.out.println(e);	
		}
		return status;
	}
	
	public 	studentmodel getStudent(int n)
	{
		
		studentmodel sm=new studentmodel();;
			String data1="select *from student47 where sno=?";
			 try {
				PreparedStatement ps=con.prepareStatement(data1);
				
				//ps.setString(1, n.getId());
//				ps.setString(2, s.getLastname());
//				ps.setString(3, s.getUsername());
//				ps.setInt(4, s.getPassword());
//				ps.setString(5, s.getEmail());
//				ps.setLong(6, s.getPhonenumber());
//				
				ps.setInt(1, n);
				ResultSet rs=ps.executeQuery();
				
				if(rs.next())
				{
					 
					sm.setId(rs.getInt(1));
					sm.setFirstname(rs.getString(2));
					sm.setLastname(rs.getString(2));
					sm.setUsername(rs.getString(4));
					sm.setPassword(rs.getInt(5));
					sm.setEmail(rs.getString(6));
					sm.setPhonenumber(rs.getLong(7));
				}

				
			 }
			 
			 catch (Exception e) {
				System.out.println(e);	
			}
			return sm;	
	}
	
	public List<studentmodel> getall()
	{
		List<studentmodel> li=new ArrayList<studentmodel>();
		studentmodel sm=null;
		String data="select *from student47";
		 try {
			PreparedStatement ps=con.prepareStatement(data);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
		        sm=new studentmodel();
		       sm.setId(rs.getInt(1));
		       sm.setFirstname(rs.getString(2));
		       sm.setLastname(rs.getString(3));
		       sm.setUsername(rs.getString(4));
		       sm.setPassword(rs.getInt(5));
		       sm.setEmail(rs.getString(6));
		       sm.setPhonenumber(rs.getLong(7));
		       li.add(sm);
			}
				
			}
			
			 
		 catch (Exception e) {
			System.out.println(e);	
		
	}
		return li;
	}
	
	public int deletestudentdata(studentmodel s)
	{
		int n=0;
			
			String deletedata="delete from student47 where sno=?";
			 try {
				PreparedStatement ps=con.prepareStatement(deletedata);
				
				ps.setInt(1, s.getId());
				 n=ps.executeUpdate();
			
				
			}
			 
			 catch (Exception e) {
				System.out.println(e);	
			}
			return n;
		
	}
	
	public int updatestudentdata (studentmodel s)
	{
		int n=0;
		String updatedata="update student47 set firstname=?,lastname=?,username=?,password=?,email=?,phonenumber=? where sno=?";
		 try {
			PreparedStatement ps=con.prepareStatement(updatedata);
			
			ps.setString(1, s.getFirstname());
			ps.setString(2, s.getLastname());
			ps.setString(3, s.getUsername());
			ps.setInt(4, s.getPassword());
			ps.setString(5, s.getEmail());
			ps.setLong(6, s.getPhonenumber());
			ps.setInt(7, s.getId());
			n=ps.executeUpdate();
			
		}
		 catch (Exception e) {
			System.out.println(e);	
		}
		return n;
	}	
}
	
	