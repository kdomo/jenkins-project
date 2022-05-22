package com.kdomo.jenkinsproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Wolrd!";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "Hello1 Wolrd!";
    }

}
