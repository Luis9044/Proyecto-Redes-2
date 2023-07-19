package com.luis.parcial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true, chain = true)
@AllArgsConstructor
public class PersonaDto {
    private String full_name;
    private String gender;
    private String email;
    private String phone;
}
