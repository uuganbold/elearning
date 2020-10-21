package dev.ub.elearning.common.events;

import io.vavr.collection.List;
import io.vavr.collection.Seq;
import lombok.NonNull;
import lombok.Value;

@Value(staticConstructor = "of")
public class ValidationError{
    
    @NonNull Seq<String> errors;

    public static ValidationError of(String err){
        return of(List.of(err));
    }

}
