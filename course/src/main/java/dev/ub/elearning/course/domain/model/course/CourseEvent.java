package dev.ub.elearning.course.domain.model.course;

import java.time.Instant;
import java.util.UUID;

import dev.ub.elearning.common.events.DomainEvent;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Accessors;

public interface CourseEvent extends DomainEvent{
    
    public CourseId courseId();

    @Value
    @Accessors(fluent = true)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class CourseCreated implements CourseEvent{
          @NonNull UUID eventId=UUID.randomUUID();
          @NonNull Instant occurredOn;
          @NonNull Course course;

          public CourseId courseId(){
              return course.courseId();
          }
        
          public static CourseCreated now(Course course) {
			return new CourseCreated(Instant.now(),course);
		}
          
    }

    @Value
    @Accessors(fluent = true)
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    class PriceUpdated implements CourseEvent{
          @NonNull UUID eventId=UUID.randomUUID();
          @NonNull Instant occurredOn;
          @NonNull CourseId courseId;
          @NonNull Price price;
        
          public static PriceUpdated now(CourseId courseId, Price price) {
			return new PriceUpdated(Instant.now(), courseId, price);
		}
          
    }


}
