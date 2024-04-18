package com.devdojo.backend.Services;

import com.devdojo.backend.Persistence.Course;
import com.devdojo.backend.Persistence.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CourseSearchService {
    private CourseRepository repository;

    public CourseSearchService(@Autowired CourseRepository repository){
        this.repository = repository;
    }

    public List<Course> searchCourses(String query) {
        return repository.findByCourseNameContaining(query);
    }

    public  boolean courseExists(String courseId) {
        return  repository.existsById(UUID.fromString(courseId));
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

}
