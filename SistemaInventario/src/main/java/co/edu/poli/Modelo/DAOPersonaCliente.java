/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.Modelo;

import co.edu.poli.DTO.PersonaCliente;

/**
 *
 * @author Estiv
 */
public class DAOPersonaCliente {
    public boolean createPersonaCliente(PersonaCliente personaCliente){
        return true;
    }
    
    public boolean deletePersonaCliente(PersonaCliente personaCliente){
        return true;
    }
    
    public PersonaCliente updatePersonaCliente(PersonaCliente personaCliente){
        return personaCliente;
    }
    public PersonaCliente leerPersonaCliente(PersonaCliente personaCliente){
        return personaCliente;
    }
}
