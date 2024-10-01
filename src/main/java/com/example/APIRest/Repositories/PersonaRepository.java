package com.example.APIRest.Repositories;

import com.example.APIRest.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.appellido LIKE %:filtro%", countQuery = "SELECT count(*) FROM persona", nativeQuery = true)
    List<Persona> searchNativo(@Param("filtro") String filtro);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    org.springframework.data.domain.Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE %filtro% OR persona.appellido LIKE %:filtro%", countQuery = "SELECT count(*) FROM persona", nativeQuery = true)
    org.springframework.data.domain.Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);

}
