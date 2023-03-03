package modelo;

import dto.Estudiante;

public class DAOestudiante {

Estudiante estudiante;

    public boolean createEstudiante(Estudiante estudiante) {
        return true;
    }
    public boolean deleteEstudiante(Estudiante estudiante) {
        return true;
    }

    public Estudiante getEstudiante(String cedula) {
        return estudiante;
    }

    public Estudiante updateEstudiante(Estudiante dtoestudiante) {
        estudiante=dtoestudiante;
        return estudiante;
    }
}
