package com.example.APIRest.Controllers;

import com.example.APIRest.Entities.Base;
import com.example.APIRest.Entities.Domicilio;
import com.example.APIRest.Services.DomicilioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}
