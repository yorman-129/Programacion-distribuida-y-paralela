package controller;

import co.edu.poli.dto.DTOpersona;
import modelo.DAOpersona;

public class controllerPersona {
    DTOpersona persona;
    DAOpersona daOpersona=new DAOpersona();
    public boolean createPersona(DTOpersona dtOpersona) {
        return daOpersona.createPersona(dtOpersona);
    }
    public boolean deletePersona(DTOpersona dtOpersona) {
        return daOpersona.deletePersona(dtOpersona);
    }

    public DTOpersona getPersona(String cedula) {
        return daOpersona.getPersona(cedula);
    }

    public DTOpersona updatePersona(DTOpersona dtOpersona) {
        return daOpersona.updatePersona(dtOpersona);
    }
}
