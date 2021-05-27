package com.finalProject.libraryproject.repository;

import com.finalProject.libraryproject.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepos extends JpaRepository<Guest,Long> {
}
