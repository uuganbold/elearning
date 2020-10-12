package dev.ub.elearning.common.validation;

public class Validator {
    
    private ValidationResult result;

    private Validator(){
        result=new ValidationResult();
    }

    public static Validator get(){
        return new Validator();
    }

    public ValidationResult end(){
        return result;
    }

    public Validator check(String field, String message, boolean isValid){
        if(!isValid){
            result.addError(field,message);
        }
        return this;
    }

}
