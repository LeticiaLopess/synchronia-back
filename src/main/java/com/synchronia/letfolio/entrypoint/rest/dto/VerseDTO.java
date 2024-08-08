package com.synchronia.letfolio.entrypoint.rest.dto;

import java.time.Instant;

public class VerseDTO {

    private String book;
    private String chapter;
    private Integer number;
    private String text;
    private Instant creationDate;

    public VerseDTO() {
    }

    public VerseDTO(String book, String chapter, Integer number, String text, Instant creationDate) {
        this.book = book;
        this.chapter = chapter;
        this.number = number;
        this.text = text;
        this.creationDate = creationDate;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }
}
