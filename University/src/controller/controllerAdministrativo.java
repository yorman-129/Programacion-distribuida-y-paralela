package controller;

import dto.Administrativo;
import modelo.DAOadministrativo;

public class controllerAdministrativo {
    Administrativo administrativo;
    DAOadministrativo daOadministrativo;

    public boolean createAdministrativo(Administrativo administrativo) {
        return daOadministrativo.createAdministrativo(administrativo);
    }
    public boolean deleteAdministrativo(Administrativo administrativo) {
        return daOadministrativo.deleteAdministrativo(administrativo);
    }

    public Administrativo getAdministrativo(String cedula) {
        return daOadministrativo.getAdministrativo(cedula);
    }

    public Administrativo updateAdministrativo(Administrativo dtoadministrativo) {
        return daOadministrativo.updateAdministrativo(dtoadministrativo);
    }
}
