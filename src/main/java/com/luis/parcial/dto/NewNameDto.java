package com.luis.parcial.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class NewNameDto {
    String name;

    @JsonCreator
    public NewNameDto(@JsonProperty("name") String name){
        this.name = name;
    }
}
