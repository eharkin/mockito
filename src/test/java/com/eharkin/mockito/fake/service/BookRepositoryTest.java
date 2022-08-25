package com.eharkin.mockito.fake.service;

import com.eharkin.mockito.fake.model.Book;
import com.eharkin.mockito.fake.repository.BookRepository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

public class BookRepositoryTest implements BookRepository {

    // Using fake test double as part of this do either use in memory DB, HashMap or List
    ConcurrentHashMap<String, Book> bookStore = new ConcurrentHashMap<>();

    @Override
    public void save(Book book) {
        bookStore.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
