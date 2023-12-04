package com.Book.Bookapi.resource.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Book.Bookapi.domain.Book;
import com.Book.Bookapi.resource.Resource;
import com.Book.Bookapi.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookResourceImpl implements Resource<Book> {
      @Autowired
    private BookService bookService;

    
     public ResponseEntity <Collection<Book>> findAll(){
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    
    public ResponseEntity <Book> findById(Long id){
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
     }

    
    public ResponseEntity <Book> save(Book book){
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }

    
    public ResponseEntity <Book> update(Book book){
        return new ResponseEntity<>(bookService.update(book), HttpStatus.OK);
    }

    
    public ResponseEntity <Book> deleteById(Long id){
        return new ResponseEntity<>(bookService.deleteById(id), HttpStatus.OK);
    }
}
