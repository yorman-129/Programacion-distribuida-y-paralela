package modelo;

import dto.Profesor;

public class DAOprofesor {
   Profesor profesor;

    public boolean createProfesor(Profesor profesor) {
        return true;
    }
    public boolean deleteProfesor(Profesor profesor) {
        return true;
    }

    public Profesor getProfesor(String cedula) {
        return profesor;
    }

    public Profesor updateProfesor(Profesor dtoprofesor) {
        profesor=dtoprofesor;
        return profesor;
    }
}
