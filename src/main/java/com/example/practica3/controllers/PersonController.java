package com.example.practica3.controllers;

import com.example.practica3.dtos.PersonDto;
import com.example.practica3.entities.Person;
import com.example.practica3.entities.Reserve;
import com.example.practica3.services.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/persons")
public class PersonController extends BaseController<Person, PersonService> {

    public List<Person> getPersonList() {

        try{
            List<Person> entities = service.findAll();
            return entities;
        }
        catch (Exception e){
            return null;
        }
    }
}
