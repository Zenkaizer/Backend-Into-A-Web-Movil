package com.example.practica3.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "reserve")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Reserve extends Base{

    private Date reserved_at;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "id_person", referencedColumnName = "id")
    private Person person;
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "id_book", referencedColumnName = "id")
    private Book book;

}
