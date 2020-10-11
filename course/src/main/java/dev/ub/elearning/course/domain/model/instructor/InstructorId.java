package dev.ub.elearning.course.domain.model.instructor;

import java.util.UUID;

import lombok.NonNull;
import lombok.Value;

@Value
public class InstructorId {
    @NonNull UUID instructorId;
}
