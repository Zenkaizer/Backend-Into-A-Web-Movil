package com.example.practica3.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReserveBookDto {

    private Integer id;
    private String code;
    private String book;
    private String description;

    @Override
    public String toString() {
        return book;
    }

}
