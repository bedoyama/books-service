package com.telluriac.repository;

import java.util.List;

import com.telluriac.dto.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
@CrossOrigin(origins = "http://localhost:8000")
public interface BookRepository extends MongoRepository<Book, String> {

    Book findByGuid(String guid);
    List<Book> findByYear(String year);

}