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
    <script type="application/javascript" src="<c:url value="/static/js/script.js"/>"></script>
</head>
<body>
<div id = "mainDiv">
    Please, input id:
    <input id="checkedId" type="text" size="10"/>
    <button id="goButton">Go</button>
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
