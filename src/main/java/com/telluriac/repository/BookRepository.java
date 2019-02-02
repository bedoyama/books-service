package com.telluriac.repository;

import java.util.List;

import com.telluriac.dto.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends MongoRepository<Book, String> {

    Book findByGuid(String guid);
    List<Book> findByYear(String year);

}