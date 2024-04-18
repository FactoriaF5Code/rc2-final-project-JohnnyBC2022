package com.devdojo.backend.integration;

import com.devdojo.backend.Persistence.Course;
import com.devdojo.backend.Persistence.CourseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CourseSearchTest {
        @Autowired
        private MockMvc api;

        @Autowired
        private CourseRepository courseRepository;

        @BeforeEach
        void setup() {
                courseRepository.deleteAll();
        }

        @Test
        void course_search_by_name() throws Exception {
                courseRepository.saveAll(List.of(
                                new Course("unsplash.com/img02.jpg",
                                                "Introducción a CSS",
                                                "descripción del curso de CSS",
                                                12.95)

                ));

                api.perform(get("/api/courses?q=CSS"))
                                .andExpectAll(
                                                status().isOk(),
                                                jsonPath("$", hasSize(1)),
                                                jsonPath("$[0].imageUrl", equalTo("unsplash.com/img02.jpg")),
                                                jsonPath("$[0].courseName", equalTo("Introducción a CSS")),
                                                jsonPath("$[0].description", equalTo("descripción del curso de CSS")),
                                                jsonPath("$[0].price", equalTo(12.95)));

        }
}
