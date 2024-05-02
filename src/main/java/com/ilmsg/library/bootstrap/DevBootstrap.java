package com.ilmsg.library.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ilmsg.library.models.Author;
import com.ilmsg.library.models.Book;
import com.ilmsg.library.models.Publisher;
import com.ilmsg.library.repositories.AuthorRepository;
import com.ilmsg.library.repositories.BookRepository;
import com.ilmsg.library.repositories.PublisherRepository;

@Component
public class DevBootstrap implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        initData();
    }

    private void initData() {
        Publisher publisher = new Publisher();
        publisher.setName("Wrox");
        publisher.setAddress("");
        publisherRepository.save(publisher);

        Author author = new Author();
        author.setFirstName("Craig");
        author.setLastName("Walls");

        Book book = new Book();
        book.setIsbn("9781617294945");
        book.setTitle("Spring in Action");
        book.setPublisher(publisher);

        author.getBooks().add(book);
        book.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(book);
    }

}
