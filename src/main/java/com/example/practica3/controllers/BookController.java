package com.example.practica3.controllers;

import com.example.practica3.dtos.BookDto;
import com.example.practica3.dtos.ReservePersonDto;
import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.entities.Reserve;
import com.example.practica3.services.BookService;
import com.example.practica3.services.IReserveService;
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

    @Autowired
    private IReserveService reserveService;

    @GetMapping("/reserves")
    public ResponseEntity<?> endpoint2() {
        try{

            List<Book> bookList = service.findAll();
            List<Reserve> reserveList = reserveService.findAll();
            List<BookDto> bookDtoList = new ArrayList<>();

            for (Book book : bookList){

                BookDto bookDto = new BookDto();
                bookDto.setName(book.getBook());
                bookDto.setDescription(book.getDescription());

                for (Reserve reserve : reserveList){

                    Book reserveBook = reserve.getBook();
                    Person reservePerson = reserve.getPerson();

                    if (reserveBook.equals(book)){

                        ReservePersonDto reservePersonDto = new ReservePersonDto();
                        reservePersonDto.setId(reservePerson.getId());
                        reservePersonDto.setName(reservePerson.getName());
                        reservePersonDto.setFaculty((reservePerson.getFaculty()));

                        bookDto.getReserves().add(reservePersonDto);
                    }
                }
                bookDtoList.add(bookDto);
            }

            return ResponseEntity.status(HttpStatus.OK).body(bookDtoList);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }
}