package dev.ub.elearning.course.application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SampleController {
    

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World";
    }
    
}
