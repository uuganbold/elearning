package dev.ub.elearning.course.domain.model.lesson;

import lombok.NonNull;
import lombok.Value;

@Value
public class LessonId {
    @NonNull Long lessonId;
}
