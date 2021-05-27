package com.finalProject.libraryproject.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Guest extends IUser {

    private String address;
    private String phone;

    public Guest(){
        // cart=new Cart();
    }
    public Guest(String name, String email) {
        super( name, email);
    }
}
