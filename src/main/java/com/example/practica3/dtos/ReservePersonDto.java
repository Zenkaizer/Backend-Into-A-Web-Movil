package com.example.practica3.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservePersonDto {

    private Integer id;
    private String name;
    private String faculty;

    @Override
    public String toString() {
        return name;
    }
}
