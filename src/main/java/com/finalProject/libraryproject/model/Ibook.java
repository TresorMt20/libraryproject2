package com.finalProject.libraryproject.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class Ibook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Ibook_id")
    private long id;
    private String title;
    private String author;
    private String coverPhotoURL;
    private long isbnNumber;
    private Double price;
    private String language;

    public Ibook(){}

    public Ibook(String title, String author, String coverPhotoURL, long isbnNumber, Double price, String language) {
        this.title = title;
        this.author = author;
        this.coverPhotoURL = coverPhotoURL;
        this.isbnNumber = isbnNumber;
        this.price = price;
        this.language = language;
    }
}
