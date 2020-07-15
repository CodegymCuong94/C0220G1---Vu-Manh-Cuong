<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/10/2020
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ChangeMoney</title>
</head>
<body>
<h1>Change Money USD to VND</h1>
<form action="/changemoney" method="get">
    <label>USD</label>
    <input type="number" name="usd"><br>
    <label>Rate</label>
    <input type="number" name="rate"><br>
    <input type="submit" value="convert">
</form>
</body>
</html>
