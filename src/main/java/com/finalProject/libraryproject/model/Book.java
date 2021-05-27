package com.finalProject.libraryproject.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Book extends Ibook{

    public Book() {
    }

    public Book(String title, String author, String coverPhotoURL, long isbnNumber, Double price, String language) {
        super(title, author, coverPhotoURL, isbnNumber, price, language);
    }
}
