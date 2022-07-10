package rw.ac.rca.springboot.backend.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rw.ac.rca.springboot.backend.services.ICourseService;
import rw.ac.rca.springboot.backend.utils.dtos.CreateCourseDTO;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final ICourseService courseService;

    @Autowired
    public CourseController(ICourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<?> all() {
        return ResponseEntity.ok(courseService.all());
    }

    @PostMapping ResponseEntity<?> create(@Valid @RequestBody CreateCourseDTO course) {
        return ResponseEntity.ok(courseService.create(course));
    }
}
