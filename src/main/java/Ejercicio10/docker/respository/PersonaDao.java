package Ejercicio10.docker.respository;


import Ejercicio10.docker.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Integer> {
    List<Persona> findByname(String name);

}
