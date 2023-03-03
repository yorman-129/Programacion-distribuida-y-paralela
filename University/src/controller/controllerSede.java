package controller;

import dto.Sede;
import modelo.DAOsede;

public class controllerSede {
    Sede sede;
    DAOsede daOsede = new DAOsede();

    public boolean createSede(Sede sede) {
        return daOsede.createSede(sede);
    }
    public boolean deleteSede(Sede sede) {
        return daOsede.deleteSede(sede);
    }

    public Sede getSede(String ciudad) {
        return daOsede.getSede(ciudad);
    }

    public Sede updateSede(Sede dtosede) {
        return daOsede.updateSede(dtosede);
    }
}
