package com.finalProject.libraryproject.controller;

import com.finalProject.libraryproject.model.Book;
import com.finalProject.libraryproject.service.BookService;
import com.finalProject.libraryproject.service.IBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/api/v1")
@RestController

public class BookController implements IBookService {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/Books")
    @Override
    public List<Book> getBooks() {

        return bookService.getBooks();
    }

    @GetMapping("/Books/{id}")
    @Override
    public Book findById_(@PathVariable long id) {

        //bookService.findById_(id);
        return bookService.findById_(id);
    }

    @PostMapping("/Books")
    @Override
    public void _Save(@RequestBody Book book) {
        bookService._Save(book);
    }

    @PutMapping("/Books")
    @Override
    public void update(@RequestBody Book bookDetails) {
        bookService.update(bookDetails);
    }


    @DeleteMapping("/Books/{id}")
    @Override
    public void deleteById_(@PathVariable Long id) {
        bookService.deleteById_(id);
    }

}
