/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.Controller;

import co.edu.poli.DTO.Venta;
import co.edu.poli.Modelo.DAOVenta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Estiv
 */
public class ctrlVentas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String codigoVenta = request.getParameter("codigoVenta");
            String nombreProducto = request.getParameter("nombreProducto");
            String codigoProducto = request.getParameter("codigoProducto");
            String fechaSalida = request.getParameter("fechaSalida");
            int cantidad = Integer.parseInt(request.getParameter("Cantidad"));
            double precioVenta = Double.parseDouble(request.getParameter("precioVenta"));
            
            Venta venta = new Venta();
            DAOVenta daoventa = new DAOVenta();
            
            venta.setCodigoVenta(codigoVenta);
            venta.setNombreProducto(nombreProducto);
            venta.setCodigoProducto(codigoProducto);
            venta.setFechaSalida(fechaSalida);
            venta.setCantidad(cantidad);
            venta.setPrecioVenta(precioVenta);
            
            daoventa.createVenta(venta);
            request.setAttribute("venta", venta);
            request.getRequestDispatcher("ventas.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
