<%@ page import="java.awt.geom.FlatteningPathIterator" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 6/1/2020
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<%
    Float rate = Float.parseFloat(request.getParameter("rate"));
    Float usd = Float.parseFloat(request.getParameter("usd"));
    Float vnd = usd * rate;
%>
<h1>Rate: <%=rate%>
</h1>
<h1>USD:<%=usd%>
</h1>
<h1>VND:<%=vnd%>
</h1>
</body>
</html>
