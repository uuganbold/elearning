package dev.ub.elearning.course.domain.model.student;

import java.util.UUID;

import lombok.NonNull;
import lombok.Value;

@Value
public class StudentId {
    @NonNull private UUID studentId;
}
