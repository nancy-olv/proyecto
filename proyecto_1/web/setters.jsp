    <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BUSQUEDA</title>
    </head>
    <body>
    <center>
        <h1>BUSQUEDA</h1>
    </center>
        
        <img src="SOFTWARE.png" width="200" height="300">   
         
        <jsp:useBean id="rectangulo" class="areas.Figuras" scope="session" />
        <br>
        <br>
        IMPRIMIR NOTA:
        <br>
        <br>
        <%
           int nota= 2;
           int raton = 01;
        %>
        
        <jsp:setProperty name="rectangulo" property="base" value="<%=nota%>"/>
        
        NOMBRE DEL LOCAL:CompuTinta <%=nota%>
        <br>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=raton%>"/>
          
        TIPO DE MANTENIMIENTO:mantenimiento preventivo <%=raton%>
   
       <jsp:useBean id="rombo" class="areas.Rombo" scope="session" />
        <br>
         
        <br>
        <br>
        <%
           int baseMayorValor = 55332145;
           int baseMenorValor = 0;
        %>
        
        <jsp:setProperty name="rombo" property="base" value="<%=baseMayorValor%>"/>
        
        TELEFONO: <%=baseMayorValor%>
        <br>
        <jsp:setProperty name="rombo" property="baseMayor" value="<%=baseMenorValor%>"/>
          
        DIRECCION:calle 9 los reyes lapaz entrelerma y tenancingo <%=baseMenorValor%>
        
          <jsp:useBean id="triangulo" class="areas.Triangulo" scope="session" />
        <br>
        <br>
        
        <br>
        <br>
        <%
           int base = 7;
           int altura = 4;
        %>
        
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
