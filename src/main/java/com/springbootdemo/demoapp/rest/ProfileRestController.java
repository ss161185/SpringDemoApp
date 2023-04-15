package com.springbootdemo.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileRestController {

    @GetMapping("profile")
    public static String Profile(){

        return ("Name: Shubham Sharma "+ "Age: 24 " + "Level Of Study: Master Of Engineering (Software Engineering");
    }
}
