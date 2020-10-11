package dev.ub.elearning.course.domain.model.category;

import java.util.UUID;

import lombok.NonNull;
import lombok.Value;

@Value
public class CategoryId {
    
    @NonNull String categoryId;
}
