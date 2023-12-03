<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Convertidor</title>
    <link rel="stylesheet" href="resources/css/main.css" type="text/css">
</head>
<body>
<header>
    <h1>Convertidor de grados celsius a fahrenheit</h1>
</header>
<section>
    <p>Agrega los datos</p>
</section>
<br>
<section>
    <form action="lista" method="post">
        <input type="hidden" name="action" value="calcular">
        <label for="gradosC">Grados Celsius:</label>
        <input type="text" id="gradosC" name="gradosC"><br>
        <label for="enviar">&nbsp;</label>
        <input type="submit" id="enviar" value="Calcular">
    </form>
</section>
</body>
</html>