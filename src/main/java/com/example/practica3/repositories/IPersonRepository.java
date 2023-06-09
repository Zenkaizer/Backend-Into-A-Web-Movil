package com.example.practica3.repositories;

import com.example.practica3.entities.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends IBaseRepository<Person, Integer> {

}