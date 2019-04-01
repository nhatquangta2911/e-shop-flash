
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
${message}
<form:form method="post" modelAttribute="loginForm" action="/login">
    <form:label path="username">Username:</form:label>
    <form:input path="username"/>
    <form:errors path="username"></form:errors>
    <br>
    <form:label path="password">Password:</form:label>
    <form:password path="password"/>
    <form:errors path="password"></form:errors>
    <br>
    <input type="submit" value="Login">
</form:form>
</body>
</html>