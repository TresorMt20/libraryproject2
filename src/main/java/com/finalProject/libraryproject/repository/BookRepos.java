package com.finalProject.libraryproject.repository;

import com.finalProject.libraryproject.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepos extends JpaRepository<Book,Long> {
}
