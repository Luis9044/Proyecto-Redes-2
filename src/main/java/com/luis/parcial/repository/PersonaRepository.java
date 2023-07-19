package com.luis.parcial.repository;

import com.luis.parcial.document.Persona;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, ObjectId> {
}
