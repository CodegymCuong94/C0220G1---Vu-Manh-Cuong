<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/1/2020
  Time: 10:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
<form action="Converter.jsp" method="post">
    <label>Rate:</label>
    <input type="number" name="rate" placeholder="rate"/><br>
    <label>USD:</label>
    <input type="number" name="usd" placeholder="usd"/><br>
    <input type="submit" value="Converter" name="converter"/>

</form>


</body>
</html>
