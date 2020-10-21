package dev.ub.elearning.course.domain.model.course;

import dev.ub.elearning.course.domain.model.category.CategoryId;
import dev.ub.elearning.course.domain.model.instructor.InstructorId;
import io.vavr.collection.Seq;
import io.vavr.control.Either;
import io.vavr.control.Try;
import io.vavr.control.Validation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Value;
import lombok.experimental.Accessors;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Course {
    
    private CourseId courseId;
    private Title title;

    private Description description;
    private Price price;

    private CategoryId categoryId;

    private InstructorId instructorId;

    public static Validation<Seq<String>,Course> create(CourseId id, String title, String description, CategoryId categoryId, InstructorId instructorId){
        return Validation.combine(
            id!=null?Validation.valid(id):Validation.invalid("ID must be given"),
            Title.of(title),
            Description.of(description)
        ).ap((validId,validTitle,validDescription)->new Course(validId,validTitle,validDescription,Price.NOT_SET,categoryId,instructorId));
    }

    public void setPrice(int price){
        Price.of(price);
    }

}

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class Title{

    private String title;
    static Validation<String,Title> of(String title){
        
        if(title==null||title.isBlank()) return Validation.invalid("Title is required"); 
        if(title.trim().length()<5) return Validation.invalid("Title should be longer than 5");
        if(title.trim().length()>50) return Validation.invalid("Title should be shorter than 50");

        return Validation.valid(new Title(title.trim()));
    }
}

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
class Description {

    private String description;
    static Validation<String,Description> of(String title){
        
        if(title==null||title.isBlank()) return Validation.invalid("Description is required"); 
        if(title.trim().length()<5) return Validation.invalid("Description should be longer than 5");
        if(title.trim().length()>2000) return Validation.invalid("Description should be shorter than 2000");

        return Validation.valid(new Description(title.trim()));
    }
}



