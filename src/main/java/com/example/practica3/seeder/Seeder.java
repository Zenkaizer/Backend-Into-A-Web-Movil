package com.example.practica3.seeder;

import com.example.practica3.entities.Book;
import com.example.practica3.entities.Person;
import com.example.practica3.services.BookService;
import com.example.practica3.services.PersonService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class Seeder implements CommandLineRunner {

    @Autowired
    private PersonService personService;
    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        // Cargar y convertir los datos de los archivos JSON en objetos Java
        ObjectMapper objectMapper = new ObjectMapper();
        List<Person> persons = Arrays.asList(objectMapper.readValue(new ClassPathResource("persons.json").getFile(), Person[].class));
        List<Book> books = Arrays.asList(objectMapper.readValue(new ClassPathResource("books.json").getFile(), Book[].class));

        // Guardar los usuarios en la base de datos utilizando el servicio y repositorio correspondientes
        for (Person person : persons){
            personService.save(person);
        }
        // Guardar los libros en la base de datos utilizando el servicio y repositorio correspondientes
        for (Book book : books){
            bookService.save(book);
        }

    }
}
