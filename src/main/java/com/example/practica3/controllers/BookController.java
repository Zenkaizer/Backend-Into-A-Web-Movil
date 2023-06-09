package com.example.practica3.controllers;

import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.services.BookService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/books")
public class BookController extends BaseController<Book, BookService> {

    public List<Book> getBooksList() {

        try{
            List<Book> entities = service.findAll();
            return entities;
        }
        catch (Exception e){
            return null;
        }
    }

}