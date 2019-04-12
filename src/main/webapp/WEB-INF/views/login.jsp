
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
${message}
<form:form action="/login" method="post" modelAttribute="loginForm">
    <form:label path="email">Email:</form:label>
    <form:input path="email"/>
    <br>
    <form:label path="password">Mat khau:</form:label>
    <form:password path="password"/>
    <br>
    <input type="submit" value="Dang nhap"/>
</form:form>
</body>
</html>