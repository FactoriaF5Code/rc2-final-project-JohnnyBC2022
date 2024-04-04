package com.devdojo.backend.Persistence;

import com.devdojo.backend.Persistence.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
    List<Course> findByCourseNameContaining(String query);
}
