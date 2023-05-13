package com.products.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Product")
@Data
public class Product {
    @Id
    private String id; //codigo del producto
    private String nombre;
    private String tipo;
    private String marca;
    private String modelo;
    private int cantidad;
    private int precio;
    private String caracteristicas;
    private String fechaIngreso;

}
