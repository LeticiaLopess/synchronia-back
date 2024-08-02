package com.synchronia.letfolio.core.model;

import java.time.Instant;

public class Note {

    private Long id;
    private String title;
    private String content;
    private Course course;
    private byte[] image;
    private Instant creationDate;

    public Note() {
    }

    public Note(Long id, String title, String content, Course course, byte[] image, Instant creationDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.course = course;
        this.image = image;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }
}
