package com.telluriac.dto;

import org.springframework.data.annotation.Id;

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

    private Price[] prices;

    private Author[] authors;

    private String[] tags;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price[] getPrices() {
        return prices;
    }

    public void setPrices(Price[] prices) {
        this.prices = prices;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "ClassPojo [year = " + year + ", isbn13 = " + isbn13 + ", guid = " + guid + ", publisher = " + publisher + ", description = " + description + ", language = " + language + ", isbn10 = " + isbn10 + ", title = " + title + ", prices = " + prices + ", authors = " + authors + ", tags = " + tags + "]";
    }
}