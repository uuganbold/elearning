package dev.ub.elearning.course.domain.model.comment;

import lombok.NonNull;
import lombok.Value;

@Value
public class CommentId {
    
    @NonNull Long commentId;
}
