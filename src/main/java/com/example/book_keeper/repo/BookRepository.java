package com.example.book_keeper.repo;

import com.example.book_keeper.entity.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long>{
 
    List<Book> findByTitleContainingIgnoreCase(String title);

    @Query("SELECT b FROM Book b WHERE b.title LIKE %:title%")
    List<Book> findBooksByTitleLike(@Param("title") String title);
}
