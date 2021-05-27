package com.finalProject.libraryproject.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Cart_id")
    private long id;


    //
    private Long guest;

    private Long book;

    private int quantity;
}
