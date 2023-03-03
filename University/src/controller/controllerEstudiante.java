package controller;

import dto.Estudiante;
import modelo.DAOestudiante;

public class controllerEstudiante {
    Estudiante estudiante;
    DAOestudiante daoEstudiante=new DAOestudiante();

    public boolean createEstudiante(Estudiante estudiante) {
        return daoEstudiante.createEstudiante(estudiante);
    }
    public boolean deleteEstudiante(Estudiante estudiante) {
        return daoEstudiante.deleteEstudiante(estudiante);
    }

    public Estudiante getEstudiante(String cedula) {
        return daoEstudiante.getEstudiante(cedula);
    }

    public Estudiante updatePersona(Estudiante dtoestudiante) {
        return daoEstudiante.updateEstudiante(dtoestudiante);
    }
}
