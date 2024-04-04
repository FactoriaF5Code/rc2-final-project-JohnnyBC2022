package com.devdojo.backend.Controllers.Courses;

import com.devdojo.backend.Persistence.Course;
import com.devdojo.backend.Persistence.CourseRepository;
import com.devdojo.backend.Services.CourseSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping ("/api/courses")
public class CourseController {
    private CourseSearchService courseSearch;
    private CourseRepository courseRepository;
   public  CourseController(@Autowired CourseSearchService courseSearchService){
       this.courseSearch = courseSearchService;
   }

   @GetMapping
    public CourseSearchResponse searchCourse(@RequestParam(name = "q", required = true) String query){
        var courseResults = courseSearch.searchCourses(query)
                .stream()
                .map(this::responseFromCourse)
                .collect(Collectors.toList());
        return new CourseSearchResponse(courseResults);
    }

    private CourseResponse responseFromCourse(Course course) {
       return new CourseResponse(
               course.getCourseId().toString(),
               course.getImageUrl(),
               course.getCourseName(),
               course.getDescription(),
               course.getPrice()
       );
    }
}
