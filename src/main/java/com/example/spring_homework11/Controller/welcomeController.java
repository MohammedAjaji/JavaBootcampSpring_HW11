package com.example.spring_homework11.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("get")
public class welcomeController {

    @GetMapping(path = "/name")
    public String getName(){
        return "My name is Mohammed Alajaji";
    }
    @GetMapping(path = "/age")
    public String getAge(){
        return "I am 25 years old";
    }
    @GetMapping(path = "/check/status")
    public String checkStatus(){
        return "Everything is OK";
    }
    @GetMapping(path = "/health")
    public String getHealth(){
        return "Server health is up and running";
    }


}
