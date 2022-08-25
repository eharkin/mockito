package com.eharkin1.mockito.fake.service;

import com.eharkin1.mockito.fake.model.Book;
import com.eharkin1.mockito.fake.repository.BookRepository;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void testFakeAddingBooks() {
        BookRepository bookRepository = new BookRepositoryTest();
        BookService bookService = new BookService(bookRepository);

        //adding books to the concurrent hash map bookstore
        bookService.addBook(new Book("1", "Fake Mockito", 260, LocalDate.now()));
        bookService.addBook(new Book("2", "Fake Junit5", 200, LocalDate.now()));

        // if the expected value should be two books added to the test repository˚
        assertEquals(2, bookService.findNumberOfBooks());
    }
}