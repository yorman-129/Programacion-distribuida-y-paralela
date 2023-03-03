/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.dto;

/**
 *
 * @author Estiv
 */
public class Persona {
    private String nombre= " ";
    private String Apellido=" ";
    private int edad=0;

    public Persona() {
        
    }
    
    public Persona(String nombre, String apellido, int edad) {
    this.nombre = nombre;
    this.Apellido = apellido;
    this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
