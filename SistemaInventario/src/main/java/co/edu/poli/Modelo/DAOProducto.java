/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.Modelo;

import co.edu.poli.DTO.Producto;

/**
 *
 * @author Estiv
 */
public class DAOProducto {
     public boolean createProducto (Producto dtoProducto){
        return true;
    }
    public boolean deleteProducto (Producto dtoProducto){
        return true;
    }
    public Producto updateProducto (Producto dtoProducto){
        return dtoProducto;
    }
    public Producto leerProducto (Producto dtoProducto){
        return dtoProducto;
    }
}
