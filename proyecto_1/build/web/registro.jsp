<%-- 
    Document   : registrojsp
    Created on : 15/01/2020, 01:07:56 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USUARIO</title>
    </head>
    <body>
    <center>
        <h1>REGISTRO:</h1>
        <form action="Datos" method="get">
            <label class="1">Nombre:</label>
            <input type="text" name="nom">
            <br><br>
            <label class="1">Apellido:</label>
            <input type="text" name="ape">
            <br><br>
            <label class="1">Email:</label>
            <input type="text" name="ema">
            <br><br>
            <label class="1">Contraseña:</label>
            <input type="text" name="con">
            <br><br>
            <label class="1">NumTajerta:</label>
            <input type="text" name="num">
            <br><br>
            <input type="submit" value="Registrar">
            <br><br>
            <input type="reset" value="borrar">
            <br><br>
            </center>
            <a href="index.jsp">Regresar al inicio</a>
        </form>    
    </body>
</html>
