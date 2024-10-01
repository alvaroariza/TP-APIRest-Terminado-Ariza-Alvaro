package com.example.APIRest.Controllers;

import com.example.APIRest.Entities.Libro;
import com.example.APIRest.Services.LibroServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libro")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}