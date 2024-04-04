package com.devdojo.backend.Controllers.Courses;

import java.util.UUID;

public class CourseResponse {
    private UUID id;
    private String imageUrl;
    private  String courseName;
    private  String description;
    private  Double price;

    private CourseResponse(String imageUrl, String courseName, String description, Double price){
        this.id = UUID.randomUUID();
        this.imageUrl = imageUrl;
        this.courseName =courseName;
        this.description = description;
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
