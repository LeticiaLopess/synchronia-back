package com.synchronia.letfolio.core.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private Long id;
    private String title;
    private String description;
    private List<Note> notes;
    private Instant completionDate;
    private Instant creationDate;

    public Course() {
        this.notes = new ArrayList<>();
    }

    public Course(Long id, String title, String description, Instant completionDate, Instant creationDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completionDate = completionDate;
        this.creationDate = creationDate;
        this.notes = new ArrayList<>();
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
}
