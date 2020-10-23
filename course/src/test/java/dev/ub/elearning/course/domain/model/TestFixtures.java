package dev.ub.elearning.course.domain.model;
import java.util.UUID;

import dev.ub.elearning.course.domain.model.category.CategoryId;
import dev.ub.elearning.course.domain.model.course.Course;
import dev.ub.elearning.course.domain.model.course.CourseId;
import dev.ub.elearning.course.domain.model.instructor.InstructorId;

public class TestFixtures {

    public static String String0(){
        return StringN(0);
    }


    public static String String5(){
        return StringN(5);
    }

    public static String String50(){
        return StringN(50);
    }

    public static String StringN(int n){
        StringBuilder builder=new StringBuilder("");
        for(int i=0;i<n;i++){
            builder.append((char)('A'+i%58));
        }

        return builder.toString();
    }

    public static String CourseTitle(){
        return StringN(10);
    }

    public static String CourseDescription(){
        return StringN(40);
    }

    public static String CategoryName(){
        return StringN(8);
    }

    public static CourseId CourseId(){
        return CourseId.of(UUID.randomUUID());
    }

    public static CategoryId CategoryId(){
        return CategoryId.of(CategoryName());
    }

    public static InstructorId InstructorId(){
        return InstructorId.of(UUID.randomUUID());
    }

    public static Course Course(){
        return Course.create(CourseId(), CourseTitle(), CourseDescription(), CategoryId(), InstructorId()).get();
    }
}
