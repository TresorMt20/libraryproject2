package com.finalProject.libraryproject.controller;

import com.finalProject.libraryproject.model.Guest;
import com.finalProject.libraryproject.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/api/v2")
@RestController
public class GuestController {

    @Autowired
    GuestService guestService;

    @GetMapping("/users")
    public List<Guest> GetListCart_(){
        return guestService.getUsers();
    }

    @GetMapping("/users/{id}")
    public Guest findById_(@PathVariable long id) {

        //bookService.findById_(id);
        return guestService.getbYid(id);
    }

    @PostMapping("/users")
    public void _Save(@RequestBody Guest guest) {
        guestService._Save(guest);
    }

    @DeleteMapping("/users/{id}")
    public void deleteById_(@PathVariable Long id) {
        guestService.deleteById_(id);
    }
}
