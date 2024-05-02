package com.ilmsg.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ilmsg.library.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
