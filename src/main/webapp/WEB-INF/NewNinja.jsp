<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/01/2021
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/ninjas/new" method="post" modelAttribute="ninja">
    <p>
        <form:label path="dojo">Dojo</form:label>
        <form:select path="dojo">
            <c:forEach items="${dojos}" var="dojo">
                <form:option value="${dojo.id} "> ${dojo.name}</form:option>
            </c:forEach>
        </form:select>
    </p>
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">Age</form:label>
        <form:input  type="number"  min="1" path="age"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>
</center>

</body>
</html>
