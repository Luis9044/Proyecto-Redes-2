package com.luis.parcial.controller;

import com.luis.parcial.document.Persona;
import com.luis.parcial.dto.NewNameDto;
import com.luis.parcial.dto.PersonaDto;
import com.luis.parcial.service.PersonaService;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
public class PersonaController {

    private final PersonaService personaService;
    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }
    @GetMapping("/allnames")
    public ResponseEntity<?> allNames() {
        return ResponseEntity.ok(personaService.all());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> eliminarPersona(@PathVariable String id) {
        personaService.delete(new ObjectId(id));
        return ResponseEntity.ok("Persona eliminada correctamente");
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Persona> update(@RequestBody NewNameDto dto, @PathVariable String id) {
        return ResponseEntity.ok(personaService.save(
                personaService.getById(new ObjectId(id)).setFull_name(dto.getName()))
        );
    }


    @PostMapping("/new")
    public ResponseEntity<Persona> add(@RequestBody PersonaDto dto ) {
        return ResponseEntity.ok(personaService.add(
                new Persona()
                        .set_id(new ObjectId())
                        .setEmail(dto.email())
                        .setPhone(dto.phone())
                        .setFull_name(dto.full_name())
                        .setGender(dto.gender())
        ));
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Persona> getById(@PathVariable String id) {
        return ResponseEntity.ok(personaService.getById(new ObjectId(id)));
    }
}
