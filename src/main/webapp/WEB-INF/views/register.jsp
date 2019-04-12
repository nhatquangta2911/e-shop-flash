<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/12/19
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Register Page</title>
    <style>
        * {
            font-family: sans-serif;
            color: #474747;
        }
        .btn {
            border: 1px solid forestgreen;
            color: #fff;
            background-color: forestgreen;
            padding: 5px 10px;
            border-radius: 4px;
            text-decoration: none;
        }
    </style>
</head>
<body>
<form:form action="/register" method="post" modelAttribute="registerForm">
    <form:label path="name">Name:</form:label>
    <form:input path="name"/>
    <br>
    <form:label path="email">Email:</form:label>
    <form:input path="email"/>
    <br>
    <form:label path="password">Password:</form:label>
    <form:password path="password"/>
    <br>
    <form:label path="checkPassword">Retry Password:</form:label>
    <form:password path="checkPassword"/>
    <br>
    <form:label path="phoneNumber">Phone Number:</form:label>
    <form:input path="phoneNumber"/>
    <br>
    <form:radiobuttons path="gender" items="${gender}"/>
    <br><br>
    <input type="submit" class="btn" value="Register"/>
</form:form>
</body>
</html>