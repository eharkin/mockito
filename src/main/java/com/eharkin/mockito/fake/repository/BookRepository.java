package com.eharkin.mockito.fake.repository;


import com.eharkin.mockito.fake.model.Book;

import java.util.Collection;

public interface BookRepository {

    //save book to the H2 in memory database
    void save(Book book);

    //find all the books in the h2 in memory database
    Collection<Book> findAll();
}
