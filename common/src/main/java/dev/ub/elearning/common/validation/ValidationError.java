package dev.ub.elearning.common.validation;

import lombok.Value;
import lombok.experimental.Accessors;

@Value(staticConstructor = "of")
@Accessors(fluent = true)
public class ValidationError {
    
    private String field;
    private String message;
}
