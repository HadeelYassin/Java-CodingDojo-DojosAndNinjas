<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/01/2021
  Time: 18:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table, th,th, tr, td{
            border: 1px solid black;
        }
    </style>
</head>
<body>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<table>
    <h1><c:out value="${dojo.name}"/>  Location Ninja</h1>
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ninjas}" var="ninja">
        <tr>
            <td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>
            <td><c:out value="${ninja.age}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
