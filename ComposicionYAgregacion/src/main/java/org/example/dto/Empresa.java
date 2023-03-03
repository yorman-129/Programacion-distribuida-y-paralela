package org.example.dto;

public class Empresa {
    private Cliente cliente;
    private Empleado empleado;

    public Empresa(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empresa(Empleado empleado) {
        this.empleado = empleado;
    }
}
