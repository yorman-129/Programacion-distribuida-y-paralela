package com.example.tienda.resolver;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.tienda.model.Cajero;
import com.example.tienda.model.Producto;
import com.example.tienda.repository.CajeroRepository;
import com.example.tienda.repository.ProductoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MutationResolver implements GraphQLMutationResolver {

    private static final Logger logger = LoggerFactory.getLogger(MutationResolver.class);
    @Autowired
    private CajeroRepository cajeroRepository;
    @Autowired
    private ProductoRepository productoRepository;

    public Cajero saveCajero(Cajero cajero){
        return cajeroRepository.save(cajero);
    }

    public Producto saveProducto(Producto producto){
        return productoRepository.save(producto);
    }

}
