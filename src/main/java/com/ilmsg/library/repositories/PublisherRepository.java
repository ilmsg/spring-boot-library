package com.ilmsg.library.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ilmsg.library.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
