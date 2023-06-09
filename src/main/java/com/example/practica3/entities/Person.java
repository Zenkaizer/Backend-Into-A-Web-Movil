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
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Person extends Base {

    @Column(name = "name")
    private String name;
    @Column(name = "code")
    public String code;
    @Column(name = "faculty")
    private String faculty;

}
