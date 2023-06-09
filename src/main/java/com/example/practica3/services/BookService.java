package com.example.practica3.services;

import com.example.practica3.entities.Book;
import com.example.practica3.repositories.IBaseRepository;
import com.example.practica3.repositories.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService extends BaseService<Book, Integer> implements IBookService{

    @Autowired
    private IBookRepository bookRepository;

    public BookService(IBaseRepository<Book, Integer> baseRepository) {
        super(baseRepository);
    }
}
