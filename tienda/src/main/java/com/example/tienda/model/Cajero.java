package com.example.tienda.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

public class Cajero {
    @Id
    private String cajeroId;
    private String nombreEmpleado;
}
