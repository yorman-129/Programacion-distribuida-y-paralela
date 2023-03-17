/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.Controller;

import co.edu.poli.DTO.PersonaTrabajador;
import co.edu.poli.Modelo.DAOpersonaTrabajador;
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
public class ctrlPersonaTrabajador extends HttpServlet {

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
            
            int cedula = Integer.parseInt(request.getParameter("cedula"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String fechaIngreso = request.getParameter("fechaIngreso");
            String cargo = request.getParameter("cargo");
            double salario = Double.parseDouble(request.getParameter("salario"));
            
            
            PersonaTrabajador dtoPersonalTrabajador = new PersonaTrabajador();
            DAOpersonaTrabajador daoPersonaTrabajador = new DAOpersonaTrabajador();
            
            dtoPersonalTrabajador.setNombre(nombre);
            dtoPersonalTrabajador.setApellido(apellido);
            dtoPersonalTrabajador.setCedula(cedula);
            dtoPersonalTrabajador.setFechaIngreso(fechaIngreso);
            dtoPersonalTrabajador.setDireccion(direccion);
            dtoPersonalTrabajador.setCargo(cargo);
            dtoPersonalTrabajador.setSalario(salario);

            
            daoPersonaTrabajador.createpersonaTrabajador(dtoPersonalTrabajador);
            request.setAttribute("personatrabajador", dtoPersonalTrabajador);
            request.getRequestDispatcher("personaTrabajador.jsp").forward(request, response);
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
