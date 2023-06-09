package com.example.practica3.services;

import com.example.practica3.entities.Person;
import com.example.practica3.repositories.IBaseRepository;
import com.example.practica3.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person, Integer> implements IPersonService{

    @Autowired
    private IPersonRepository personRepository;

    public PersonService(IBaseRepository<Person, Integer> baseRepository) {
        super(baseRepository);
    }
}
