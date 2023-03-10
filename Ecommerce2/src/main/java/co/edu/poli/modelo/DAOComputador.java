/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.modelo;
import co.edu.poli.DTO.DTOComputador;

/**
 *
 * @author Estiv
 */
public class DAOComputador {
    public boolean createComputador(DTOComputador dtoComputador){
        return true;
    }
    
    public boolean deleteComputador(DTOComputador dtoComputador){
        return true;
    }
    
    public DTOComputador updateComputador(DTOComputador dtoComputador){
        return dtoComputador;
    }
    public DTOComputador leerComputador(DTOComputador dtoComputador){
        return dtoComputador;
    }
    
    
}
