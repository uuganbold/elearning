package dev.ub.elearning.course.domain.model.course;

import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import dev.ub.elearning.course.domain.model.category.CategoryId;
import dev.ub.elearning.course.domain.model.instructor.InstructorId;
import static dev.ub.elearning.course.domain.model.TestFixtures.*;
import io.vavr.control.Either;
import dev.ub.elearning.common.events.ValidationError;

public class TestCourse {

    @Test
    void givenInvalidData_whenCreate_thenValidationError(){
        assertTrue(Course.create(null, CourseTitle(), CourseDescription(), CategoryId(), InstructorId()).isLeft());
        assertTrue(Course.create(CourseId(), CourseTitle(), CourseDescription(), null, InstructorId()).isLeft());
        assertTrue(Course.create(CourseId(), CourseTitle(), CourseDescription(), CategoryId(), null).isLeft());
        assertTrue(Course.create(CourseId(), StringN(1), CourseDescription(), CategoryId(), InstructorId()).isLeft());
        assertTrue(Course.create(CourseId(), null, CourseDescription(), CategoryId(), InstructorId()).isLeft());
        assertTrue(Course.create(CourseId(), CourseTitle(), StringN(3), CategoryId(), InstructorId()).isLeft());
        assertTrue(Course.create(CourseId(), String0(), null, CategoryId(), InstructorId()).isLeft());
    }

    @Test 
    void givenValidData_whenCreate_thenCourseCreated(){
        Either<ValidationError,Course> result=Course.create(CourseId(), CourseTitle(), CourseDescription(), CategoryId(), InstructorId());
        assertTrue(result.isRight());
        Course course=result.get();
        assertEquals(course.price(), Price.NOT_SET);
    }

    @Test
    void givenInvalidPrice_whenUpdatePrice_thenValidationError(){
        //too small
        assertTrue(Course().updatePrice(-1).isLeft());
        //too big
        assertTrue(Course().updatePrice(1_000_001).isLeft());
        //
        assertTrue(Course().updatePrice(103).isLeft());
        assertTrue(Course().updatePrice(1125).isLeft());
    }
}
