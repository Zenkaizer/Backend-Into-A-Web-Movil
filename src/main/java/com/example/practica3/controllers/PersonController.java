package com.example.practica3.controllers;

import com.example.practica3.Utils;
import com.example.practica3.dtos.PersonDto;
import com.example.practica3.dtos.ReserveBookDto;
import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.entities.Reserve;
import com.example.practica3.services.IReserveService;
import com.example.practica3.services.PersonService;
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
@RequestMapping(path = "api/persons")
public class PersonController extends BaseController<Person, PersonService> {

    @Autowired
    private IReserveService reserveService;

    @GetMapping("/reserves")
    public ResponseEntity<?> endpoint1() {
        try{

            List<Reserve> reserveList = reserveService.findAll();
            List<Person> personList = service.findAll();
            List<PersonDto> personDtoList = new ArrayList<>();

            for (Person person : personList){

                PersonDto personDto = new PersonDto();
                personDto.setName(person.getName());
                personDto.setFaculty(person.getFaculty());
                List<Reserve> personReserve = new ArrayList<>();

                for (Reserve reserve : reserveList){
                    if (reserve.getPerson().getId().equals(person.id)){
                        personReserve.add(reserve);
                    }
                }

                for (Reserve reserve : personReserve){

                    Book book = reserve.getBook();
                    ReserveBookDto reserveBookDto = new ReserveBookDto();
                    reserveBookDto.setId(book.getId());
                    reserveBookDto.setCode(book.getCode());
                    reserveBookDto.setBook(book.getBook());
                    reserveBookDto.setDescription(book.getDescription());

                    personDto.getReserves().add(reserveBookDto);
                }

                Reserve lastMonthReserve = Utils.lastReserve(personReserve);
                int countLastMonthReserve = Utils.countReserveLastMonth(personReserve);

                if (lastMonthReserve != null){
                    personDto.setDate_last_reserve(lastMonthReserve.getReserved_at());
                }
                personDto.setCant_reserves_last_month(countLastMonthReserve);

                personDtoList.add(personDto);
            }

            return ResponseEntity.status(HttpStatus.OK).body(personDtoList);
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }
}
