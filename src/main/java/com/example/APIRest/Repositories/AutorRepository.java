package com.example.APIRest.Repositories;

import com.example.APIRest.Entities.Autor;
import com.example.APIRest.Entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends BaseRepository<Autor, Long> {
}