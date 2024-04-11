package com.devdojo.backend.Persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "Courses")
public class Course {
    @Id
    private UUID courseId;
    private String imageUrl;
    private  String courseName;
    private  String description;
    private  Double price;

    public Course(){
    }

    public Course(String imageUrl, String courseName, String description, Double price){
        this.courseId = UUID.randomUUID();
        this.imageUrl = imageUrl;
        this.courseName = courseName;
        this.description = description;
        this.price = price;
    }


    public UUID getCourseId() {
        return courseId;
    }

    public void setCourseId(UUID id) {
        this.courseId = id;
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
