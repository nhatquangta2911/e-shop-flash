<%--
  Created by IntelliJ IDEA.
  User: ryan-ta
  Date: 4/22/19
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add user</title>
</head>
<body>
<table>
    <form:form method="post" modelAttribute="userForm">
        <tr>
            <td>
                <form:label path="id">Id:</form:label>
            </td>
            <td>
                <form:input path="id"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="password">Password:</form:label>
            </td>
            <td>
                <form:input path="password"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="fullName">Full name:</form:label>
            </td>
            <td>
                <form:input path="fullName"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="photo">Photo:</form:label>
            </td>
            <td>
                <form:input path="photo"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="email">Email:</form:label>
            </td>
            <td>
                <form:input path="email"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Add user">
            </td>
            <td>
            </td>
        </tr>
    </form:form>
</table>
</body>
</html>
