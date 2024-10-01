package com.example.APIRest.Controllers;

import com.example.APIRest.Entities.Autor;
import com.example.APIRest.Services.AutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{
}
