package modelo;


import dto.Administrativo;

public class DAOadministrativo {
    Administrativo administrativo;

    public boolean createAdministrativo(Administrativo administrativo) {
        return true;
    }
    public boolean deleteAdministrativo(Administrativo administrativo) {
        return true;
    }

    public Administrativo getAdministrativo(String cedula) {
        return administrativo;
    }

    public Administrativo updateAdministrativo(Administrativo dtoadministrativo) {
        administrativo=dtoadministrativo;
        return administrativo;
    }
}
