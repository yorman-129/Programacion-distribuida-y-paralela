package com.example.tienda.resolver;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.tienda.model.Cajero;
import com.example.tienda.model.Producto;
import com.example.tienda.repository.CajeroRepository;
import com.example.tienda.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class MutationResolver implements GraphQLMutationResolver {


    @Autowired
    private CajeroRepository cajeroRepository;
    @Autowired
    private ProductoRepository productoRepository;

    public Cajero saveCajero(String nombreEmpleado){
        Cajero cajero = Cajero.builder().nombreEmpleado(nombreEmpleado).build();
        cajero.setNombreEmpleado(nombreEmpleado);
        Cajero savedCajero = cajeroRepository.save(cajero);
        return savedCajero;
    }

    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

}
