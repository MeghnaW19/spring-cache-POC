package com.stackroute.springcache.repository;

import com.stackroute.springcache.domain.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
