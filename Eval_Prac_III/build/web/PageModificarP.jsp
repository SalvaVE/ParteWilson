<%-- 
    Document   : PageModificarP
    Created on : 06-04-2022, 12:01:53 PM
    Author     : acer1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Ingrese los valores a modificar</h1>
        
        <form action="modificarp.do" method="POST">                                                    
        ID: <input type="text" name="txtIdP" value="" /><br><br>
        Nombre: <input type="text" name="txtNombreP" value="" /><br><br>
        DesProducto: <input type="text" name="txtDesProducto" value="" /><br><br>
        Stock: <input type="text" name="txtStock" value="" /><br><br>
        Precio: <input type="text" name="txtPrecio" value="" /><br><br>
        Unidad de Medida: <input type="text" name="txtUnidadDeMedida" value="" /><br><br>
        EstadoP: <input type="text" name="txtEstadoP" value="" /><br><br>
        Categoria: <input type="text" name="txtCategoria" value="" /><br><br>
       
       <input type="submit" value="Modificar"/>
    </body>
</html>
