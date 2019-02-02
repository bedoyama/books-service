package com.telluriac.repository;

import java.util.List;

import com.telluriac.dto.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByGuid(String guid);
    public List<Book> findByYear(String year);

}