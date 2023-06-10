package com.example.practica3.seeder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReserveSeed {

    private Integer id;
    private Date reserved_at;
    private Integer id_user;
    private Integer id_book;

}
