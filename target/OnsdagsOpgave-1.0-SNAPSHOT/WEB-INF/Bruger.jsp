<%--
  Created by IntelliJ IDEA.
  User: oliverrasoli
  Date: 27/10/2021
  Time: 14.21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Brugerside</title>
    <link rel="stylesheet" href="FrontpageStyle.css">
</head>
<body>


<h1> Velkommen ! Du er nu logget ind som ${sessionScope.name} </h1>
<h2> Her kan du tilføje emner til din huskeseddel</h2>

<form action="AddSubject" , method="post">
    <label for="emne">Emne:</label><br>
    <input type="text" id="emne" name="emne" value="Beer bong!">
    <br>
    <br>
    <input type="submit" value="Submit">
</form>
<br>
<div class="warning">${sessionScope.msg} </div>
<form action="SletEmne" , method="post">
    <label for="emne">Slet emne :</label><br>
    <input type="text" id="sletemne" name="emne" value="">
    <br>
    <br>
    <input type="submit" value="Slet">
</form>

<form action="VisOversigt" , method="get">
    <input type="submit" value="Gå til oversigt">
</form>


<c:forEach items="${sessionScope.emneListe}" var="emne">
    ${emne}
    <br>
</c:forEach>




</body>
</html>
