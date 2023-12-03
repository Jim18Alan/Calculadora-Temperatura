<%--
  Created by IntelliJ IDEA.
  User: alan7
  Date: 01/12/2023
  Time: 09:50 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>

<%
     String gC = (String) request.getAttribute("gradosC");
     String gF = (String) request.getAttribute("gradosF");
%>
<h1>Resultado Conversion</h1>
<br>
<label>Grados Celsius :</label>
<span><%= gC%></span><br>
<label>Grados Fahrenheit :</label>
<span><%= gF%></span><br>


<form action="" method="get">
    <input type="hidden" name="action"  value="agregar"><br>
    <input type="submit" value="Regresar">
</form>


</body>
</html>
