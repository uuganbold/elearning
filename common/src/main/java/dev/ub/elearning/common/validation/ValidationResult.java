package dev.ub.elearning.common.validation;

public class ValidationResult {
    ValidationErrors errors;

    ValidationResult(){
        this.errors=new ValidationErrors();
    }

    public ValidationErrors errors(){
        return errors;
    }

    public void addError(String field, String message){
        errors.add(field, message);
    }

    public boolean isValid(){
        return errors.isEmpty();
    }

    public boolean notValid(){
        return !isValid();
    }

    public void throwErrors(){
        throw new ValidationException(errors);
    }
}
