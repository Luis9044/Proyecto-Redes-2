package com.luis.parcial.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.luis.parcial.document.Persona;

@Repository
public interface PersonaRepository extends MongoRepository<Persona, ObjectId> {
}
