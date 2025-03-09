package com.example.book_keeper.service;

import com.example.book_keeper.entity.Book;
import com.example.book_keeper.repo.*;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bkRepo;

    private List<Book> books;

    @Transactional(readOnly = true)
    public List<Book> getBooks(){
        return bkRepo.findAll();
    }

    @Transactional(readOnly = true)
    public List<Book> getBooksByTitle(String bookTitle){
        return bkRepo.findBooksByTitleLike(bookTitle);
    }
}
