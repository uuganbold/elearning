package dev.ub.elearning.course.application;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SampleController {
    

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World";
    }
    
}
