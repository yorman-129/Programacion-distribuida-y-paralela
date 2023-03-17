<%@page import="co.edu.poli.DTO.Venta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ventas</title>
    </head>
    <body>
        
        <% Venta venta = (Venta)request.getAttribute("venta");
         out.println("<h1> codigoVenta" + venta.getCodigoVenta() + "</h1>");
        out.println("<h1> nombreProducto" + venta.getNombreProducto() + "</h1>");
        out.println("<h1> codigoProducto" + venta.getCodigoProducto() + "</h1>");
        out.println("<h1> cantidad" + venta.getCantidad() + "</h1>");
        out.println("<h1> precioVenta" + venta.getPrecioVenta() + "</h1>");
        out.println("<h1> fechaSalida" + venta.getFechaSalida());
        %>
    </body>
</html>
