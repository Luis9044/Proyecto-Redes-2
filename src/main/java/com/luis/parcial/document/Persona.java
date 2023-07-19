package com.luis.parcial.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="collection")
@Data
@RequiredArgsConstructor
@Accessors(chain = true)
public class Persona {
    @Id
    private ObjectId id;
    private String full_name;
    private String gender;
    private String email;
    private String phone;
}
