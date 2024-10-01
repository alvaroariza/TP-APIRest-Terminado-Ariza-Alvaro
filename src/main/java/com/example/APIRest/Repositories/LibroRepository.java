package com.example.APIRest.Repositories;

import com.example.APIRest.Entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends BaseRepository<Libro, Long> {
}
