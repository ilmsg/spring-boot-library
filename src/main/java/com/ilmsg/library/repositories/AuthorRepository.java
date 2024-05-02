package com.ilmsg.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ilmsg.library.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
