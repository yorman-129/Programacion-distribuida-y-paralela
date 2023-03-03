package modelo;

import co.edu.poli.dto.DTOpersona;

public class DAOpersona {

    DTOpersona persona;
    public boolean createPersona(DTOpersona dtOpersona) {
        return true;
    }
    public boolean deletePersona(DTOpersona dtOpersona) {
        return true;
    }

    public DTOpersona getPersona(String cedula) {
        return persona;
    }

    public DTOpersona updatePersona(DTOpersona dtOpersona) {
        persona=dtOpersona;
        return persona;
    }


}
