<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.vcube.DAO.StudentDAO" %>
<%@ page import="com.vcube.model.studentmodel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>UPDATE REGISTRATION FORM</h1>
<%
    studentmodel sm = (studentmodel) request.getAttribute("student");

%>
		<form action="update1" method="post" >
		<p><input type="text" name="sid" id="sid" value="<%= sm.getId() %>" readonly></p>
		 <p><input type="text" name="firstname" id="firstname" value=<%=sm.getFirstname()%>></p>
        <p><input type="text" name="lastname" id="lastname" value=<%=sm.getLastname()%>></p>
        <p><input type="text" name="username" id="username" value=<%=sm.getUsername()%>></p>
        <p><input type="text" name="password" id="password" value=<%=sm.getPassword()%>></p>
        <p><input type="email" name="email" id="email" value=<%=sm.getEmail()%>></p>
        <p><input type="text" name="phonenumber" id="phonenumber" value=<%=sm.getPhonenumber()%>></p>
        <button type="submit">Update</button>
       </form>
</body>
</html>