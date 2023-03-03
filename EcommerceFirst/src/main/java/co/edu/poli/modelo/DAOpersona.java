/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.modelo;

import co.edu.poli.dto.Persona;

/**
 *
 * @author Estiv
 */
public class DAOpersona {
    
    Persona persona;
    public boolean createPesona( Persona persona ){
    return true;
    }
    
    public boolean deletePesona( Persona persona ){
    return true;
    }
     public Persona getPersona (Persona persona){
         return persona;
     }
    
    public Persona updatePersona( Persona dtopersona ){
    persona=dtopersona;
    return persona;
    }
}
