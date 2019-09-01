package com.learning.boot.requestInterceptor.controller;


import com.learning.boot.requestInterceptor.exception.InvalidFieldException;
import com.learning.boot.requestInterceptor.model.Student;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/request")
public class RequestHandler {
    @PostMapping
    public String handleRequest(@RequestHeader("auth-key") String authKey, @RequestBody Student student) {
        if (StringUtils.isEmpty(student.getLastName())) {
            throw new InvalidFieldException("Last name is required field");
        }
        return String.format("Request Handle Successfully");
    }

}
