package com.example.book_keeper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.book_keeper.entity.Book;
import com.example.book_keeper.service.BookService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/book")
@Setter
@Getter
@AllArgsConstructor
public class BookController {

    private final BookService service;
    
    @GetMapping
    public List<Book> getBooks(){
        System.out.println("Inside controller");
        return service.getBooks();
    }

    @GetMapping("/search")
    public List<Book> getBooksByTitle(@RequestParam("title") String title){
        return service.getBooksByTitle(title);
    }
    
}
