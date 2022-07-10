package rw.ac.rca.springboot.backend.services;

import rw.ac.rca.springboot.backend.models.Student;
import rw.ac.rca.springboot.backend.utils.dtos.CreateStudentDTO;

import java.util.List;

public interface IStudentSevice {
    List<Student> all();

    Student create(CreateStudentDTO student);

    Student link(Long id, Long courseId);

    Student unlink(Long id, Long courseId);
}
