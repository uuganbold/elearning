package dev.ub.elearning.course.domain.model.course;

import java.util.UUID;

import lombok.Value;

@Value(staticConstructor = "of")
public class CourseId {
    private UUID courseId;
}
