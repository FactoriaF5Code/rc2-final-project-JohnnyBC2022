package com.devdojo.backend.Controllers.Courses;

import java.util.UUID;

public class CourseResponse {
    private String id;
    private String imageUrl;
    private  String courseName;
    private  String description;
    private  Double price;

    CourseResponse(String id,String imageUrl, String courseName, String description, Double price){
        this.id = id;
        this.imageUrl = imageUrl;
        this.courseName =courseName;
        this.description = description;
        this.price = price;
    }

    public String getId() {
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
