package com.Book.Bookapi.service;

import java.util.Collection;

import com.Book.Bookapi.domain.Book;

public interface BookService {
    Collection<Book> findAll();

    Book findById(Long id);

    Book save(Book book);

    Book update(Book book);

    Book deleteById(Long id);
}
