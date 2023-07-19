package com.luis.parcial.service;

import com.luis.parcial.document.Persona;
import com.luis.parcial.repository.PersonaRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    private final PersonaRepository personaRepository;
    public PersonaService(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    public List<Persona> all() {
        return personaRepository.findAll();
    }
    public Persona getById(ObjectId id){
        return personaRepository.findById(id).orElseThrow(()-> new Error("A llorar"));
    }
    public void delete(ObjectId id) {personaRepository.deleteById(id);}

    public Persona save(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona add(Persona persona){
        return personaRepository.insert(persona);
    }

}
