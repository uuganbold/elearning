package dev.ub.elearning.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import dev.ub.elearning.course.CourseConfig;

@SpringBootApplication
@Import({CourseConfig.class})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
