<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<label>USD</label>
<c:out value="${usdfloat}"></c:out>
<br>
<label>Rate</label>
<c:out value="${rateFloat}"></c:out>
<br>
<label>VND</label>
<c:out value="${vnd}"></c:out>
</body>
</html>
