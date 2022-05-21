package com.stud.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

    @RequestMapping
    public String helloWorld(){
        return "Hello from spring boot.";
    }

    @RequestMapping("/goodbye")
    public String helloWorldGoodbye(){
        return "Goodbye from spring boot.";
    }
}
