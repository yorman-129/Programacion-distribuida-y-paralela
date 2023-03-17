<%-- 
    Document   : personaCliente
    Created on : 17/03/2023, 01:35:43 PM
    Author     : Estiv
--%>


<%@page import="co.edu.poli.DTO.PersonaTrabajador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%PersonaTrabajador personaTrabajador = (PersonaTrabajador)request.getAttribute("personatrabajador");
        out.println("<h2> Nombre" + personaTrabajador.getNombre() +  "<br>" + personaTrabajador.getApellido() + "</h2>");
        %>
    </body>
</html>
