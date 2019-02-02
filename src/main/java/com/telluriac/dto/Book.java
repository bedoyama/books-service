package com.telluriac.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
public class Book {

    @Id
    public String id;

    private String year;

    private String isbn13;

    private String guid;

    private String publisher;

    private String description;

    private String language;

    private String isbn10;

    private String title;

    private List<Price> prices;

    private List<Author> authors;

    private List<String> tags;

    @Override
    public String toString() {
        return "ClassPojo [year = " + year + ", isbn13 = " + isbn13 + ", guid = " + guid + ", publisher = " + publisher + ", description = " + description + ", language = " + language + ", isbn10 = " + isbn10 + ", title = " + title + ", prices = " + prices + ", authors = " + authors + ", tags = " + tags + "]";
    }
}