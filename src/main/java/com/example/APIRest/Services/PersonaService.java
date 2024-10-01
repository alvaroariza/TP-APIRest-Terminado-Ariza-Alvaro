package com.example.APIRest.Services;

import com.example.APIRest.Entities.Persona;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {

    List<Persona> search(String filtro) throws Exception;
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

}
