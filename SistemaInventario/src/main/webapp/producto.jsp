<%@page import="co.edu.poli.DTO.Producto"%>
<%@page import="co.edu.poli.Controller.ctrlProducto" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%Producto producto = (Producto)request.getAttribute("dtoProducto");
        out.println("<h1> Nombre" + producto.getNombre() + "</h1>");
        out.println("<h1> Tipo" + producto.getTipo() + "</h1>");
        out.println("<h1> Marca" + producto.getMarca() + "</h1>");
        out.println("<h1> Cantidad" + producto.getCantidad() + "</h1>");
        out.println("<h1> Precio" + producto.getPrecio() + "</h1>");
        %>
    </body>
</html>

