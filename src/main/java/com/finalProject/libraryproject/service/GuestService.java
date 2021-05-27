package com.finalProject.libraryproject.service;

import com.finalProject.libraryproject.model.Guest;
import com.finalProject.libraryproject.repository.GuestRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestService {

    @Autowired
    GuestRepos guestRepos;

    public List<Guest> getUsers() {
        return guestRepos.findAll();
    }

    public Guest getbYid(Long id) {


        Guest b =new Guest();


        try {

            Optional<Guest> con=guestRepos.findById(id);
            b=con.get();
        } catch(Exception e){
            b.setEmail("djjd");
            b.setPassword("l");
        }

        return b;

    }
    public void _Save(Guest guest) {
        guestRepos.save(guest);
    }

    public void deleteById_(Long id) {
        guestRepos.deleteById(id);
    }
}
