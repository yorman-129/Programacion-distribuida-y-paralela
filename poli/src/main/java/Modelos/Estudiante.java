package Modelos;

import org.springframework.data.annotation.Id;

public class Estudiante {
    @Id
    private  String id;
    private  String seudonimo="";
    private  String nombre ="";

    public Estudiante(String id, String seudonimo, String nombre) {
        this.id = id;
        this.seudonimo = seudonimo;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
