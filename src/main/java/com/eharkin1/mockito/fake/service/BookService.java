package com.eharkin1.mockito.fake.service;

import com.eharkin1.mockito.fake.model.Book;
import com.eharkin1.mockito.fake.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public int findNumberOfBooks() {
        return bookRepository.findAll().size();
    }
}
