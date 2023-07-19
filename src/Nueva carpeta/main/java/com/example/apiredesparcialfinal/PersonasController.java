package com.example.apiredesparcialfinal;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persona")
public class PersonasController {
    @GetMapping("/allnames")
    public ResponseEntity<String> allNames() {
        return new ResponseEntity<String>("All names", HttpStatus.OK);
    }
}
