package com.example.practica3.dtos;

import com.example.practica3.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class PersonDto {

    private String name;
    private String faculty;
    private Date date_last_reserve;
    private Integer cant_reserves_last_month;
    List<Book> reserves;

}
