package dev.ub.elearning.course.domain.model.course;

import io.vavr.control.Validation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;


@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class Price {

    private final static int MILLION=1_000_000;
    private final static int THOUSAND=1_000;
    
    static Price Free=new Price(0);

    static Price NOT_SET=new Price(-1);

    final int price;

    static Validation<String,Price> of(int price){
        
        if(price<0) return Validation.invalid("Price should be positive"); 
        if(price>MILLION) return Validation.invalid("Price should be less than a million");
        if(price%THOUSAND!=0) return Validation.invalid("Price should be divisible by a thousand");

        return Validation.valid(new Price(price));
    }        
}

