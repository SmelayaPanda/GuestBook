<%--
  Created by IntelliJ IDEA.
  User: Smela
  Date: 09.06.2016
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Panda.com</title>
</head>
<body>
<h1>Hello ${greeting}</h1>
<h2>
    <form action="gbook" method="post">
        Name:<br>
        <input type="text" name="name">
        <br>
        Wishes:<br>
        <input type="text" name="comment" >
        <br><br>
        <input type="submit" value="Submit">
    </form>
</h2>
</body>
</html>
