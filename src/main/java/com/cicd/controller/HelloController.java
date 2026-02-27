package com.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello User";
    }


    @GetMapping("/dummy")
    public String dummyMessage(){
        return "Dummy Message";
    }

    @GetMapping("/dummy")
    public String dummyMessage1(){
        return "Dummy message";
    }

}
