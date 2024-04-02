package com.devdojo.backend.Models.Courses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    private UUID id;
    private String imageUrl;
    private  String courseName;
    private  String description;
    private  Double price;

    public  Course(){
    }
    public  Course(String imageUrl, String courseName, String description, Double price){
        this.id = UUID.randomUUID();
        this.imageUrl = imageUrl;
        this.courseName = courseName;
        this.description = description;
        this.price = price;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
