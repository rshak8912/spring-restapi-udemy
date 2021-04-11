package me.seunghak.restapi.repository;

import me.seunghak.restapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
