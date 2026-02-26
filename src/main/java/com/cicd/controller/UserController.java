package com.cicd.controller;


import com.cicd.model.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/send")
    public UserRequest sendUserData(@RequestBody UserRequest request) {

        // Simply returning same data received
        return request;
    }
}
