<%--
  Created by IntelliJ IDEA.
  User: zbigniew
  Date: 12.07.18
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Km to miles</title>
</head>
<body>
Przelicznik: <br>
${param.km} km to ${param.km / 1.609344 * param.km} mil.
</body>
</html>
