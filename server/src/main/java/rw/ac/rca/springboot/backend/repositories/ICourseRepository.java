package rw.ac.rca.springboot.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rw.ac.rca.springboot.backend.models.Course;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Long> {

}
