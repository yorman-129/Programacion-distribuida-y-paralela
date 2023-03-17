<%-- 
    Document   : personaCliente
    Created on : 17/03/2023, 01:35:43 PM
    Author     : Estiv
--%>


<%@page import="co.edu.poli.DTO.Proveedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <body>
        
        <% Proveedor proveedor = (Proveedor)request.getAttribute("proveedor");
        out.println("<h1> Proveedor" + proveedor.getNombreProveedor()+ "nombre Producto:" + proveedor.getNombreProducto()+ "</h1>");
        %>
    </body>
</html>
