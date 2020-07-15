<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/12/2020
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Simple</title>
</head>
<body>
<h1>Calculator Simple</h1>
<form action="/calculator">
    <input type="text" name="num1">
    <input type="text" name="num2">
    <br>
    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="sub">Subtraction(-)</button>
    <button type="submit" name="operator" value="multi">Multiplication(*)</button>
    <button type="submit" name="operator" value="divi">Division(/)</button>
</form>
</body>
</html>
