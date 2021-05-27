package com.finalProject.libraryproject.service;

import com.finalProject.libraryproject.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> getBooks();

    Book findById_(long id);

    void _Save(Book book);

    void update( Book bookDetails);

    void deleteById_(Long id);
}
