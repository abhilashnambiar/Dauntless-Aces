package com.airbus.aerothon.model;

import javax.persistence.*;

@Entity
public class Bug {

    @Id
    @SequenceGenerator(name = "bug_sequence", sequenceName = "bug_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bug_sequence")
    private Long id;
    private String title;
    private String description;
    private String author;
    private String email;

    public Bug() {
    }

    public Bug(String title, String description, String author, String email) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
