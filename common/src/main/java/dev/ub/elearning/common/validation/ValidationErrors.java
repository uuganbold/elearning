package dev.ub.elearning.common.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidationErrors {
    
    private List<ValidationError> errors;

    public ValidationErrors(){
        errors=new ArrayList<>();
    }

    void add(String field, String message){
        errors.add(ValidationError.of(field, message));
    }

    public boolean isEmpty(){
        return errors.isEmpty();
    }

    public List<ValidationError> get(){
        return new ArrayList<>(errors);
    }

    public List<ValidationError> forField(String field){
        return errors.stream().filter(err->err.field().equals(field)).collect(Collectors.toList());
    }

    public String toString(){
        return errors.stream().map(ValidationError::message).collect(Collectors.joining("\n"));
    }
}
