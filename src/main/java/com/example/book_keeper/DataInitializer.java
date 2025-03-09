package com.example.book_keeper;

import java.time.Instant;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.book_keeper.entity.Book;
import com.example.book_keeper.repo.BookRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner{

    private final BookRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Book(null, "Dan Brown", Instant.now()));
        repo.save(new Book(null, "Pet Semetary", Instant.now()));
        repo.save(new Book(null, "India That Is Bharat", Instant.now()));
        repo.save(new Book(null, "Diplomacy", Instant.now()));
        repo.save(new Book(null, "The Spy", Instant.now()));
        repo.save(new Book(null, "Icon", Instant.now()));
    }

}
