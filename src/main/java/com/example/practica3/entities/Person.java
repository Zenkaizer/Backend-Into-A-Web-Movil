package com.example.practica3.entities;


import com.sun.istack.NotNull;
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
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Person extends Base {

    @NotNull
    @Column(name = "rut")
    private String rut;
    @NotNull
    @Column(name = "first_name")
    public String firstName;
    @NotNull
    @Column(name = "last_name")
    public String lastName;
    @NotNull
    @Column(name = "phone")
    private Long phone;

}
