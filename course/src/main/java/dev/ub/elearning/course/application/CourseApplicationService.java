package dev.ub.elearning.course.application;

import org.springframework.stereotype.Service;

import dev.ub.elearning.course.domain.model.course.CourseRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseApplicationService {
    
    private final CourseRepository courseRepository;

}
