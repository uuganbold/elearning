package dev.ub.elearning.course.domain.model.category;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Category {
    
    @NonNull private CategoryId categoryId;

    @NonNull private String name;
}
