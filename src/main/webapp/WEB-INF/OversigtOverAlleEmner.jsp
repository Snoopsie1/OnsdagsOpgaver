<%--
  Created by IntelliJ IDEA.
  User: oliverrasoli
  Date: 28/10/2021
  Time: 15.29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oversigt over alle emner</title>
</head>
<body>

<h1> Alle emner der er tilføjet af brugere: </h1>
<c:forEach items="${applicationScope.alleEmner}" var="emne">
    ${emne}
    <br>
</c:forEach>


</body>
</html>
