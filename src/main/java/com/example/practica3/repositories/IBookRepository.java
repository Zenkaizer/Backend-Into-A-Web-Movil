package com.example.practica3.repositories;

import com.example.practica3.entities.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends IBaseRepository<Book, Integer> {

}
