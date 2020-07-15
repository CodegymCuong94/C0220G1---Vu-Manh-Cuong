<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/1/2020
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/currency">
    <div class=" CurrencyConverter">
        <h2>Currency Converter</h2>
        <label>Rate:</label>
        <input type="number" name="rate" placeholder="rate"/>
        <br>
        <label>USD:</label>
        <input type="number" name="usd" placeholder="usd"/>
        <br>
        <input type="submit" value="converter"/>

    </div>
</form>
</body>
</html>
