<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : mostrarp
    Created on : 06-04-2022, 09:14:03 AM
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
        <h1>Todos los registros</h1>
        <c:forEach var="listaTotal" items="${sessionScope.productos}">
            ID: ${listaTotal.idP}<br>
            Nombre: ${listaTotal.nombreP}<br>
            Descripcion: ${listaTotal.desProducto}<br>
            Stock: ${listaTotal.stock}<br>
            Precio: ${listaTotal.precio}<br>
            Unidad de medida: ${listaTotal.unidadDeMedida}<br>
            Estado: ${listaTotal.estadoP}<br>
            Categoria: ${listaTotal.categoria}<br>
            Fecha: ${listaTotal.dateTime}<br>

<br>
    <hr>
        </c:forEach>
    </body>
</html>
