package dto;

public class Sede {
    private String ciudad=" ";
    private String direccion=" ";
    private String numero=" ";

    public Sede() {
    }

    public Sede(String ciudad, String direccion, String numero) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
