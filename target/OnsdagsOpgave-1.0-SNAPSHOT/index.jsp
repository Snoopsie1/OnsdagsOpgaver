<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>

<form action="hello-servlet" , method="get">
    <label for="name">Username:</label><br>
    <input type="text" id="name" name="name" value="Username">
    <br>
    <label for="pass1">Password:</label><br>
    <input type="text" id="pass1" name="pass1" value="Password">
    <br>
    <label for="pass2">Re-type Password:</label><br>
    <input type="text" id="pass2" name="pass2" value="Re-type Password">
        <br>
        <br>
    <input type="submit" value="Submit">
</form>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>