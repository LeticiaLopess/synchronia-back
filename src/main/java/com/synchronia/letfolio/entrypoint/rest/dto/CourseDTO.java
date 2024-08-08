package com.synchronia.letfolio.entrypoint.rest.dto;

import com.synchronia.letfolio.core.model.Note;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class CourseDTO {

    private String title;
    private String description;
    private List<Note> notes;
    private Instant completionDate;
    private Instant creationDate;

    public CourseDTO() {
        this.notes = new ArrayList<>();
    }

    public CourseDTO( String title, String description, Instant completionDate, Instant creationDate) {
        this.title = title;
        this.description = description;
        this.completionDate = completionDate;
        this.creationDate = creationDate;
        this.notes = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Instant completionDate) {
        this.completionDate = completionDate;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
