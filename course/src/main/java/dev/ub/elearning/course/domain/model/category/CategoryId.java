package dev.ub.elearning.course.domain.model.category;

import java.util.UUID;

import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class CategoryId {
    
    @NonNull String categoryId;
}
