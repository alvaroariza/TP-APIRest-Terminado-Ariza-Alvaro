package com.example.APIRest.Services;

import com.example.APIRest.Repositories.BaseRepository;
import com.example.APIRest.Entities.Localidad;
import com.example.APIRest.Repositories.LocalidadRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService{

    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
