/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.control;

import co.edu.poli.dto.Persona;
import co.edu.poli.modelo.DAOpersona;

/**
 *
 * @author Estiv
 */
public class controllerPersona {
    Persona persona;
    DAOpersona daopersona = new DAOpersona();
    
     public boolean createPesona( Persona persona ){
    return daopersona.createPesona(persona);
    }
    
    public boolean deletePesona( Persona persona ){
    return daopersona.deletePesona(persona);
    }
    
     public Persona getPersona (Persona persona){
         return daopersona.getPersona(persona);
     }
    
    public Persona updatePersona( Persona dtopersona ){
    return daopersona.updatePersona(dtopersona);
    }
}
