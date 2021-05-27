package com.finalProject.libraryproject.controller;

import com.finalProject.libraryproject.model.Book;
import com.finalProject.libraryproject.model.Cart;
import com.finalProject.libraryproject.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RequestMapping("/api/v")
@RestController
public class CartController {

    @Autowired
    CartService cartService;

    @GetMapping("/TheCart")
    public List<Book> GetListCart_(){
        return cartService.GetListCart();
    }


    @GetMapping("/TheCart/cart")
    public List<Cart> Getcart(){
        return cartService.displaycart();
    }

    @PostMapping("/TheCart")
    public void SaveCart(@RequestBody Cart cart){

        cartService.Addtocart(cart);
    }

    @DeleteMapping("/Books/{id}")
    public void deleteById_(@PathVariable Long id) {



    }


}
