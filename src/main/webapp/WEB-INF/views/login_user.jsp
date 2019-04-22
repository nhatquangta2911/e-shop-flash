<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/22/19
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
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
<span style="font-weight: bold; color: red;">${error}</span><br><br>
<form:form cssStyle="width: 400px;" action="/login" method="post" modelAttribute="loginForm">
    <form:label path="email">Email:</form:label>
    <form:input path="email"/>
    <br><br>
    <form:label path="password">Password:</form:label>
    <form:password path="password"/>
    <br><br>
    <input class="btn" type="submit" value="Log In"/>
</form:form>
</body>
</html>