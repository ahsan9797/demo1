package com.example1.demo1.service;

import com.example1.demo1.model.Book;

import java.util.Optional;

/**
 * @author : Ahsan Ahmad
 * @created on : 2/9/2020, Sun
 **/
public interface BookService {
    void createBook(Book book);
    Optional<Book> getBook(Long id);
    Book updateBook(Book book);
    void deleteBook(Long id);
}
