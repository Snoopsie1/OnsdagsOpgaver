<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online huskeseddel</title>
    <link rel="stylesheet" href="FrontpageStyle.css">
</head>
<body>

<h1 class="center">Velkommen til online huskesedler</h1>
<h2 class="center">Her kan du oprette dig som bruger</h2>
<br>

<h4 class="center", style="padding-bottom: 10px;">${requestScope.passWarning}</h4>

<form action="hello-servlet" , method="get", class="loginBox", style="">
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
<br>
<br>
<a href="hello-servlet">Hello Servlet</a> ... <- The fuck is this
</body>
</html>