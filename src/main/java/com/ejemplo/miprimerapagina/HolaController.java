package com.ejemplo.miprimerapagina;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/")
    public String inicio() {
        return """
                <h1>Mi primera aplicacion Spring Boot</h1>
                <h2>Aplicacion publicada en Internet</h2>
                <p>Desarrollado con Java y Spring Boot.</p>
                """;
    }
}