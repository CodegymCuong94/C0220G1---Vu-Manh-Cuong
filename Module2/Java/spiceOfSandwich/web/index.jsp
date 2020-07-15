<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/12/2020
  Time: 7:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<form action="/sandwichController" method="get">
    <h1>Sandwich Condiments</h1>
    <input type="checkbox" name="spices" value="lettuce">
    <label>Lettuce</label>
    <input type="checkbox" name="spices" value="tomato">
    <label>Tomato</label>
    <input type="checkbox" name="spices" value="mustard">
    <label>Mustard</label>
    <input type="checkbox" name="spices" value="sprouts">
    <label>Sprouts</label>
    <button type="submit" value="" name="spices">save</button>
</form>
</body>
</html>
