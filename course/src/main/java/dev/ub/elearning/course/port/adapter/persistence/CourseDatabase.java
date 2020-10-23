package dev.ub.elearning.course.port.adapter.persistence;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.ub.elearning.course.domain.model.course.Course;
import dev.ub.elearning.course.domain.model.course.CourseId;
import dev.ub.elearning.course.domain.model.course.CourseRepository;

@Repository
public class CourseDatabase implements CourseRepository{
    
    public Optional<Course> findById(CourseId id){
        return Optional.empty();
    }
}
