
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ELIMINAR REGISTRO</h1>
        
        <h1>Ingrese el DUI del registro a Eliminar</h1>
         <form action= "eliminarp.do" method="POST">
           ID:  <input type="text" name="txtIdP" value="" /><br><br>
        <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>
