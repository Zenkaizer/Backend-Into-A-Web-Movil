package com.example.practica3.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Book extends Base {

    @Column(name = "book")
    private String book;
    @Column(name = "code")
    public String code;
    @Column(name = "description")
    private String description;

}
