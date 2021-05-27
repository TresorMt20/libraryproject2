package com.finalProject.libraryproject.service;

import com.finalProject.libraryproject.model.Book;
import com.finalProject.libraryproject.repository.BookRepos;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {

    private BookRepos bookRepos;


    public BookService(BookRepos bookRepository) {
        this.bookRepos = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepos.findAll();
    }

    @Override
    public Book findById_(long id) {
        Optional<Book> con=bookRepos.findById(id);
        Book b=con.get();

        return b;
    }

    @Override
    public void _Save(Book book) {
        bookRepos.save(book);
    }

    @Override
    public void update(Book bookDetails) {
        Optional<Book> con=bookRepos.findById(bookDetails.getId());

        Book b=con.get();

        b.setAuthor(bookDetails.getAuthor());
        b.setCoverPhotoURL(bookDetails.getCoverPhotoURL());
        b.setLanguage(bookDetails.getLanguage());
        b.setPrice(bookDetails.getPrice());
        b.setIsbnNumber(bookDetails.getIsbnNumber());
        b.setTitle(bookDetails.getTitle());
        bookRepos.save(b);
    }

    @Override
    public void deleteById_(Long id) {
        bookRepos.deleteById(id);
    }
}
