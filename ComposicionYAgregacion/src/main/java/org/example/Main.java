package org.example;

import org.example.dto.Cliente;
import org.example.dto.Empleado;
import org.example.dto.Empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(new Empleado());
        Cliente cliente = new Cliente();
        Empresa empresa1 = new Empresa(cliente);
        Empresa empresa2 = new Empresa(cliente);
    }
}