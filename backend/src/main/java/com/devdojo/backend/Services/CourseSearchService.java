package com.devdojo.backend.Services;

import com.devdojo.backend.Persistence.Course;
import com.devdojo.backend.Persistence.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*@Service
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
}*/
@Service
public class CourseSearchService {

    public List<Course> searchCourses(String query) {
        // Simulando datos de prueba
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("url1", "Curso 1", "Descripción del curso 1", 10.0));
        courses.add(new Course("url2", "Curso 2", "Descripción del curso 2", 20.0));
        courses.add(new Course("url3", "Curso 3", "Descripción del curso 3", 30.0));
        return courses;
    }

    public boolean courseExists(String courseId) {
        // Simplemente devuelve true para simular que el curso existe
        return true;
    }
}