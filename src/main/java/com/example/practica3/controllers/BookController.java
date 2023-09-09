package com.example.practica3.controllers;

import com.example.practica3.dtos.BookDto;
import com.example.practica3.dtos.ReservePersonDto;
import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/books")
public class BookController extends BaseController<Book, BookService> {

}