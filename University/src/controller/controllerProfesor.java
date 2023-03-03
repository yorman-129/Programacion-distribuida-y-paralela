package controller;

import dto.Profesor;
import modelo.DAOprofesor;

public class controllerProfesor {
    Profesor profesor;
    DAOprofesor daOprofesor=new DAOprofesor();

    public boolean createProfesor(Profesor profesor) {
        return daOprofesor.createProfesor(profesor);
    }
    public boolean deleteProfesor(Profesor profesor) {
        return daOprofesor.deleteProfesor(profesor);
    }

    public Profesor getProfesor(String cedula) {
        return daOprofesor.getProfesor(cedula);
    }

    public Profesor updateProfesor(Profesor dtoprofesor) {
        return daOprofesor.updateProfesor(dtoprofesor);
    }
}
