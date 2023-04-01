package com.springbootdemo.demoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    @GetMapping("/")
    public String sayHello(){

        return "Hello World";
    }

    @GetMapping("name")
    public String myName(){
        return "Shubham Sharma";
    }
}
