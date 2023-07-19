package com.example.apiredesparcialfinal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="collection")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personas {
    @Id
    private ObjectId id;
    private String full_name;
    private String gender;
    private String email;
    private Integer phone;

}
