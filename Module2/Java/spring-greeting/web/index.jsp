<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Greeting</title>
</head>
<body>
<h1>Hello Spring MVC</h1>
<a href="/greeting">greeting</a>

<form action="/greeting" method="get">
    <input type="text" name="name">
    <input type="submit" value="ok">
</form>
</body>
</html>
