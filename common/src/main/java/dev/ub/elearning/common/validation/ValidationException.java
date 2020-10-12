package dev.ub.elearning.common.validation;

public class ValidationException extends IllegalArgumentException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private ValidationErrors errors;

    public ValidationException(ValidationErrors errors){
        super();
        this.errors=errors;
    }

    public String getMessage(){
        return errors.toString();
    } 
    
}
