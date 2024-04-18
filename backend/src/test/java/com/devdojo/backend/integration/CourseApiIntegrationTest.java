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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class CourseApiIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private CourseRepository courseRepository;

    @BeforeEach
    void setup() {
        courseRepository.deleteAll();
    }

    @Test
    void GetAllCoursesTest() throws Exception {
        courseRepository.saveAll(List.of(
                new Course("url1", "Curso 1", "Descripción del curso 1", 10.0),
                new Course("url2", "Curso 2", "Descripción del curso 2", 20.0),
                new Course("url3", "Curso 3", "Descripción del curso 3", 30.0)));

        mockMvc.perform(get("/api/courses"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$.length()").value(3))
                .andExpect(jsonPath("$[0].imageUrl").value("url1"))
                .andExpect(jsonPath("$[0].courseName").value("Curso 1"))
                .andExpect(jsonPath("$[0].description").value("Descripción del curso 1"))
                .andExpect(jsonPath("$[0].price").value(10.0))
                .andExpect(jsonPath("$[1].imageUrl").value("url2"))
                .andExpect(jsonPath("$[1].courseName").value("Curso 2"))
                .andExpect(jsonPath("$[1].description").value("Descripción del curso 2"))
                .andExpect(jsonPath("$[1].price").value(20.0))
                .andExpect(jsonPath("$[2].imageUrl").value("url3"))
                .andExpect(jsonPath("$[2].courseName").value("Curso 3"))
                .andExpect(jsonPath("$[2].description").value("Descripción del curso 3"))
                .andExpect(jsonPath("$[2].price").value(30.0));
    }

}
