<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 		<h1>REGISTRATION FORM</h1>
    <form name="registration" method="post" action="register" onsubmit="return verify()">
        <p><input type="text" name="firstname" id="firstname" placeholder="FIRSTNAME"></p>
        <p><input type="text" name="lastname" id="lastname" placeholder="LASTNAME"></p>
        <p><input type="text" name="username" id="username" placeholder="USERNAME"></p>
        <p><input type="password" name="password" id="password" placeholder="PASSWORD"></p>
        <p><input type="password" name="confirmpassword" id="confirmpassword" placeholder="CONFIRMPASSWORD"></p>
        <p><input type="email" name="email" id="email" placeholder="EMAIL"></p>
        <p><input type="text" name="phonenumber" id="phonenumber" placeholder="PHONENUMBER"></p>
        <p id="f"></p>
        <button type="submit">submit</button>
       </form>
  		 <script>
    function verify() {
        let firstname = document.getElementById("firstname").value;
        let lastname = document.getElementById("lastname").value;
        let username = document.getElementById("username").value;
        let password = document.getElementById("password").value;
        let confirmpassword = document.getElementById("confirmpassword").value;
        let email = document.getElementById("email").value;
        let phonenumber = document.getElementById("phonenumber").value;

        if (firstname == "") 
        {
            document.getElementById("f").innerHTML = "firstname is mandatory";
            document.getElementById("f").style.color = "red";
            return false;
        } 
        else if (lastname == "") 
        {
            document.getElementById("f").innerHTML = "lastname is mandatory";
            return false;
        } 
        else if (username == "") 
        {
            document.getElementById("f").innerHTML = "username is mandatory";
            return false;
        } 
        else if (password == "") 
        {
            document.getElementById("f").innerHTML = "password is mandatory";
            return false;
        }
        else if (confirmpassword == "") {
            document.getElementById("f").innerHTML = "confirmpassword is mandatory";
            return false;
        } 
        else if (password != confirmpassword) 
        {
            document.getElementById("f").innerHTML = "password is not matching";
            return false;
        } 
        else if (email == "") {
            document.getElementById("f").innerHTML = "email is mandatory";
            return false;
        } 
        else if (phonenumber == "") 
        {
            document.getElementById("f").innerHTML = "phonenumber is mandatory";
            return false;
        } 
        else 
        {
            return true;
        }
    }
    </script>
</body>
</html>
 		

