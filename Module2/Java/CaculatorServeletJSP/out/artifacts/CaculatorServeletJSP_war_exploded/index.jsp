<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/2/2020
  Time: 9:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Caculator</title>
</head>
<body>
<form action="/caculator" method="post">
    <div class="caculator">
        <label>Caculator</label><br>
        <label>First operand:</label>
        <input type="text" name="firstOperand"><br>
        <label>Operator</label>
        <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
        </select><br>
        <label>Second operand</label>
        <input type="text" name="secondOperand"><br>
        <input type="submit" value="caculator" name="caculator">

    </div>

</form>

</body>
</html>
