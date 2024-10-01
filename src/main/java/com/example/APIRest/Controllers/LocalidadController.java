package com.example.APIRest.Controllers;

import com.example.APIRest.Entities.Base;
import com.example.APIRest.Entities.Localidad;
import com.example.APIRest.Services.LocalidadServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
