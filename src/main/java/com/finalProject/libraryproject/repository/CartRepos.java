package com.finalProject.libraryproject.repository;

import com.finalProject.libraryproject.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepos extends JpaRepository<Cart,Long> {
}
