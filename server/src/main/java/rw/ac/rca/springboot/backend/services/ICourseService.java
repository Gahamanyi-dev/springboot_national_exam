package rw.ac.rca.springboot.backend.services;

import rw.ac.rca.springboot.backend.models.Course;
import rw.ac.rca.springboot.backend.utils.dtos.CreateCourseDTO;

import java.util.List;

public interface ICourseService {

    List<Course> all();

    Course create(CreateCourseDTO course);

    Course findById(Long courseId);
}
