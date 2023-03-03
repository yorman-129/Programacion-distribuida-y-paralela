package modelo;


import dto.Sede;

public class DAOsede {
    Sede sede;

    public boolean createSede(Sede sede) {
        return true;
    }
    public boolean deleteSede(Sede sede) {
        return true;
    }

    public Sede getSede(String ciudad) {
        return sede;
    }

    public Sede updateSede(Sede dtosede) {
        sede=dtosede;
        return sede;
    }
}
