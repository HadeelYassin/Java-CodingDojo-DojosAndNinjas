<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 11/01/2021
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
<h1>New Dojo</h1>
<form:form action="/dojos/new" method="post" modelAttribute="dojo">
    <p>
    <form:label path="name">Name</form:label>
    <form:input path="name"/>
    </p>
    <input type="submit" value="Create"/>
</form:form>
</center>

</body>
</html>
