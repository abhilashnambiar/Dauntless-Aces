package com.airbus.aerothon.model;

import javax.persistence.*;

@Entity
public class Feedback {

    @Id
    @SequenceGenerator(name = "feedback_sequence", sequenceName = "feedback_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feedback_sequence")
    private Long id;
    private String description;
    private String author;
    private Integer rating;

    public Feedback() {
    }

    public Feedback(String description, String author, Integer rating) {
        this.description = description;
        this.author = author;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
