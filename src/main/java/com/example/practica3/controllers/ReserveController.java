package com.example.practica3.controllers;

import com.example.practica3.dtos.BookDto;
import com.example.practica3.dtos.PersonDto;
import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.entities.Reserve;
import com.example.practica3.services.ReserveService;
import org.apache.coyote.Request;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/reserves")
public class ReserveController extends BaseController<Reserve, ReserveService>{

    @GetMapping ("/users")
    public ResponseEntity<?> getUsers() {
        try{

            List<PersonDto> entities = new ArrayList<>();
            List<Reserve> reserves = service.findAll();

            PersonDto personDto = new PersonDto();

            for (Reserve reserve : reserves){

                personDto.setName(reserve.getPerson().getName());
                personDto.setFaculty(reserve.getPerson().getFaculty());
                personDto.setDate_last_reserve(reserve.getReserved_at());
                personDto.setCant_reserves_last_month(reserves.size());
                List<Book> books = new ArrayList<>();
                books.add(reserve.getBook());
                personDto.setReserves(books);
            }
            return ResponseEntity.status(HttpStatus.OK).body(personDto);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @GetMapping ("/books")
    public ResponseEntity<?> getBooks() {

        try{

            List<BookDto> entities = new ArrayList<>();
            List<Reserve> reserves = service.findAll();

            BookDto bookDto = new BookDto();

            for (Reserve reserve : reserves){

                personDto.setName(reserve.getPerson().getName());
                personDto.setFaculty(reserve.getPerson().getFaculty());
                personDto.setDate_last_reserve(reserve.getReserved_at());
                personDto.setCant_reserves_last_month(reserves.size());
                List<Book> books = new ArrayList<>();
                books.add(reserve.getBook());
                personDto.setReserves(books);
            }
            return ResponseEntity.status(HttpStatus.OK).body(personDto);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }


}
