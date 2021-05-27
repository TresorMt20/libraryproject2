package com.finalProject.libraryproject.model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public class IUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Iuser_id")
    private long id;
    private String name;
    private String email;
    private String password;

    public IUser(){

    }

    public IUser( String name, String email) {
        this.name = name;
        this.email = email;
    }
}
