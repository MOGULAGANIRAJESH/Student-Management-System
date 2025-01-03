<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.vcube.DAO.StudentDAO" %>
<%@ page import="com.vcube.model.studentmodel" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
		<table class="table table-striped">
  <thead> <!-- Table Header (optional) -->
    <tr>
      <th>Id</th>
      <th>FirstName</th>
      <th>LastName</th>
      <th>Mobile</th>
      <th>UserName</th>
      <th>email</th>
      <th>Edit</th>
      <th>Delete</th>
    </tr>
  </thead>
  <tbody> 
  <%List<studentmodel> st = (List<studentmodel>)request.getAttribute("studentList");
  
  
  for(studentmodel sm:st){ %>
    <tr>
   
    <td><%=sm.getId() %></td>
      <td><%=sm.getFirstname() %></td>
      <td><%=sm.getLastname() %></td>
      <td><%=sm.getPhonenumber() %></td>
      <td><%=sm.getUsername() %></td>
      <td><%=sm.getEmail() %></td>
      <td><a href="edit?id=<%=sm.getId()%>">Edit</a></td>
      <td><a href="delete?id=<%=sm.getId()%>">Delete</a></td>
    </tr>
   <%} %>
  </tbody>
</table>
</body>
</html>