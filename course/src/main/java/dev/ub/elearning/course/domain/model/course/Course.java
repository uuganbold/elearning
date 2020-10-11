package dev.ub.elearning.course.domain.model.course;

import dev.ub.elearning.course.domain.model.category.CategoryId;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Course {
    
    private CourseId courseId;
    private String title;

    private Price price;

    private CategoryId categoryId;
}
