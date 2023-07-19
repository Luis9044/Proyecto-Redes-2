package com.luis.parcial.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.experimental.Accessors;

@Getter
@AllArgsConstructor
@Accessors(fluent = true, chain = true)
public class NewNameDto {
    String name;
}
