package com.Book.Bookapi.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Book.Bookapi.domain.Book;
import com.Book.Bookapi.service.BookService;

@Service
public class BookServiceImpl implements BookService {
     
    private Long bookId = 100L;
    private Map<Long, Book> bookMap = new HashMap<Long, Book>();

    {
        Book book = new Book();

        book.setId(bookId);
        book.setTitle("Spring Microservices in Action");
        book.setAuthor("John Carnell");
        book.setCoverPhotoURL("https://repository-images.githubusercontent.com/155638338/82ecf400-6f73-11e9-8908-dfadfe1aa923");
        book.setIsbnNumber(1234567890L);
        book.setPrice(22700.00);
        book.setLanguage("English");
        bookMap.put(book.getId(), book);

    }

    public Collection<Book> findAll(){
        return bookMap.values();
    }

    public Book findById(Long id){
        return bookMap.get(id);
     }

    public Book save(Book book){
        Long newBookId = ++bookId;
        book.setId(newBookId);
        bookMap.put(book.getId(), book);
        return bookMap.get(newBookId);
    }

    public Book update(Book book){
        bookId = book.getId();
        if(bookMap.get(bookId) != null){
            bookMap.put(bookId, book);
            return bookMap.get(bookId);
        }
        return null;
    }

    public Book deleteById(Long id){
        if(bookMap.get(id) != null){
            return bookMap.remove(id);
        }
        return null;
    }
}
