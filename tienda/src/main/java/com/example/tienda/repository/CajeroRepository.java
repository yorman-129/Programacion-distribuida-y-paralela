package com.example.tienda.repository;

import com.example.tienda.model.Cajero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CajeroRepository extends MongoRepository<Cajero, String> {
}
