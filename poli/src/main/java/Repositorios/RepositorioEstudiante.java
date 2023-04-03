package Repositorios;

import Modelos.Estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface RepositorioEstudiante extends MongoRepository<Estudiante,String> {
    @Query("{'url':?0,'metodo':?1}")
    Estudiante getEstudiante(String seudonimo, String nombre);
}
