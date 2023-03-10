<%-- 
    Document   : mostrarPedido
    Created on : 10/03/2023, 02:51:27 PM
    Author     : Estiv
--%>

<%@page import="co.edu.poli.DTO.DTOComputador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pedido</title>
    </head>
    <body>
        
        <% DTOComputador dtoComputador = (DTOComputador)request.getAttribute("dtoComputador");
        out.println("<h1> Marca:" + dtoComputador.getMarca()+ "</h1>");
        %>
    </body>
</html>
