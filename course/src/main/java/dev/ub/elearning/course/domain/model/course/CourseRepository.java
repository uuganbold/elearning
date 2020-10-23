package dev.ub.elearning.course.domain.model.course;

import java.util.Optional;


public interface CourseRepository {
    
    Optional<Course> findById(CourseId id);


}
