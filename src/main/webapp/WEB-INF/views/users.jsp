<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ksenia
  Date: 28.09.2017
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <link type="text/css" rel="stylesheet" href="<c:url value="/static/css/style.css"/>"/>
    <script type="application/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="<c:url value="/static/js/script.js"/>"></script>
</head>
<body>
<div id="mainDiv">
    <form action="<c:url value="/user"/>" method="get">
        Please, input text:
        <input id="searchedParam" name="searchedParam" type="text" size="10"/>
        <button id="searchButton" type="submit" role="button">Search</button>
    </form>
</div>

<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>FirstName</th>
        <th>LastName</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
