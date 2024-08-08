package com.synchronia.letfolio.entrypoint.rest.dto;

import com.synchronia.letfolio.core.model.Course;

import java.time.Instant;

public class NoteDTO {

    private String title;
    private String content;
    private Course course;
    private byte[] image;
    private Instant creationDate;

    public NoteDTO() {
    }

    public NoteDTO( String title, String content, Course course, byte[] image, Instant creationDate) {
        this.title = title;
        this.content = content;
        this.course = course;
        this.image = image;
        this.creationDate = creationDate;
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
