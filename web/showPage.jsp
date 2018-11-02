<%@ page import="project.Model.ModelConnection" %><%--
  Created by IntelliJ IDEA.
  User: a.vetrov
  Date: 02.11.2018
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    ModelConnection m1 = (ModelConnection) session.getAttribute("modelconnect");

    out.println(m1);
%>
</body>
</html>
