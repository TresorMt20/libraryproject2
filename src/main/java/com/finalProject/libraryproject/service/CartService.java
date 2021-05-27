package com.finalProject.libraryproject.service;

import com.finalProject.libraryproject.model.Book;
import com.finalProject.libraryproject.model.Cart;
import com.finalProject.libraryproject.repository.CartRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepos cartRepos;

    @Autowired
    BookService bookService;


    public List<Book> GetListCart(){

        List<Cart> itemincart=cartRepos.findAll();
        List<Book> booktobedisplayed=new ArrayList<>();

        for(Cart itm : itemincart){

            try{

                booktobedisplayed.add(bookService.findById_(itm.getBook()));
            }catch (Exception e){
                cartRepos.deleteById(itm.getId());
            }

        }

        return booktobedisplayed;
    }

    public List<Cart> displaycart(){

        return cartRepos.findAll();

    }


    public  void Addtocart(Cart cart){
        cartRepos.save(cart);
    }

}
