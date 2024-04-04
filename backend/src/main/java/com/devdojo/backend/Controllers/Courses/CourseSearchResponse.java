package com.devdojo.backend.Controllers.Courses;

import java.util.List;

public class CourseSearchResponse {
    private List<CourseResponse> results;
    public CourseSearchResponse(List<CourseResponse> results){
        this.results = results;
    }

    public List<CourseResponse> getResults() {
        return results;
    }
}
