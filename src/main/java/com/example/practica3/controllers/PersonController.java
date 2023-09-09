package com.example.practica3.controllers;

import com.example.practica3.entities.Person;
import com.example.practica3.services.PersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/persons")
public class PersonController extends BaseController<Person, PersonService> {

}
