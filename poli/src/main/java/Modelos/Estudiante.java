package Modelos;

public class Estudiante {
    @id
    private  String _id="";
    private  String seudonimo="";
    private  String nombre ="";

    public Estudiante(String _id, String seudonimo, String nombre) {
        this._id = _id;
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
