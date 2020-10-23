package dev.ub.elearning.course.domain.model.instructor;

import java.util.UUID;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class InstructorId {
    @NonNull UUID instructorId;
}
