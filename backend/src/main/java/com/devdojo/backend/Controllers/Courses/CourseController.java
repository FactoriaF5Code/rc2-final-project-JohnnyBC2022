package com.devdojo.backend.Controllers.Courses;

import com.devdojo.backend.Persistence.Course;
import com.devdojo.backend.Persistence.CourseRepository;
import com.devdojo.backend.Services.CourseSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:5173")
public class CourseController {
    private CourseSearchService courseSearch;
    private CourseRepository courseRepository;

    public CourseController(@Autowired CourseSearchService courseSearchService,
            @Autowired CourseRepository courseRepository) {
        this.courseSearch = courseSearchService;
        this.courseRepository = courseRepository;
    }

    /*
     * @GetMapping("/search")
     * public CourseSearchResponse searchCourse(@RequestParam(name = "q", required =
     * false) String query){
     * var courseResults = courseSearch.searchCourses(query)
     * .stream()
     * .map(this::responseFromCourse)
     * .collect(Collectors.toList());
     * return new CourseSearchResponse(courseResults);
     * }
     */
    @GetMapping("/search")
    public List<Course> searchCourses(@RequestParam String searchTerm) {
        return courseSearch.searchCourses(searchTerm);
    }

    @GetMapping
    public List<CourseResponse> getAllCourses() {
        return courseRepository.findAll().stream()
                .map(this::responseFromCourse)
                .collect(Collectors.toList());
    }

    private CourseResponse responseFromCourse(Course course) {
        return new CourseResponse(
                course.getCourseId().toString(),
                course.getImageUrl(),
                course.getCourseName(),
                course.getDescription(),
                course.getPrice());

    }

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        course.setCourseId(UUID.randomUUID());
        Course savedCourse = courseRepository.save(course);
        return ResponseEntity.ok(savedCourse);
    }
}
