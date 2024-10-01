package com.example.APIRest.Services;

import com.example.APIRest.Repositories.BaseRepository;
import com.example.APIRest.Entities.Persona;
import com.example.APIRest.Repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personarepository;

    public PersonaServiceImpl(BaseRepository <Persona, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try{
            //List<Persona> personas = personarepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Persona> personas = personarepository.search(filtro);
            List<Persona> personas = personarepository.searchNativo(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public org.springframework.data.domain.Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Persona> personas = personarepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Persona> personas = personarepository.search(filtro, pageable);
            Page<Persona> personas = personarepository.searchNativo(filtro, (org.springframework.data.domain.Pageable) pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}

