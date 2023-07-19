package com.example.apiredesparcialfinal;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonasRepository extends MongoRepository<Personas, ObjectId> {
    
}
