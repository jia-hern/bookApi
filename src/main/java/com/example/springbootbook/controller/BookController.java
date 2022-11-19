package com.example.springbootbook.controller;

import com.example.springbootbook.model.Book;
import com.example.springbootbook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book") //pre-path
public class BookController {
    @Autowired
    private BookService bookService;

    // (create/update)
    @PostMapping //api/book
    public ResponseEntity<?> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);
    }


    @DeleteMapping("delete/{bookId}")//api/book/delete/{bookId}
    public ResponseEntity<?> deleteBook(@PathVariable String bookId){
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping //api/book
    public ResponseEntity<?> getAllBooks(){
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }

    @GetMapping("{title}") //api/book/{title}
    public ResponseEntity<?> getBooksByTitle(@PathVariable String title){
        return new ResponseEntity<>(bookService.findBooksByTitle(title), HttpStatus.OK);
    }
    @GetMapping("{name}/name") //api/book/{name}/name
    public ResponseEntity<?> findBooksByAuthorName(@PathVariable String name){
        return new ResponseEntity<>(bookService.findBooksByAuthorName(name), HttpStatus.OK);
    }
}
