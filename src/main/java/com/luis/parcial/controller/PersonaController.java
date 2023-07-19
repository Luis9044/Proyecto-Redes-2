package com.luis.parcial.controller;
import com.luis.parcial.document.Persona;
import com.luis.parcial.dto.NewNameDto;
import com.luis.parcial.dto.PersonaDto;
import org.bson.types.ObjectId;
import com.luis.parcial.service.PersonaService;
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
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarPersona(@PathVariable String id) {
        personaService.delete(new ObjectId(id));
        return ResponseEntity.ok("Persona eliminada correctamente");
    }
    @PutMapping("/save/{id}")
    public ResponseEntity<Persona> update(@RequestBody NewNameDto dto, @PathVariable ObjectId id) {
        return ResponseEntity.ok(personaService.save(
                personaService.getById(id).setFull_name(dto.name())
        ));
    }


    @PostMapping("/new")
    public ResponseEntity<Persona> add(@RequestBody PersonaDto dto ) {
        return ResponseEntity.ok(personaService.add(
                new Persona()
                        .setId(new ObjectId())
                        .setEmail(dto.email())
                        .setPhone(dto.phone())
                        .setFull_name(dto.full_name())
                        .setGender(dto.gender())
        ));
    }


}
