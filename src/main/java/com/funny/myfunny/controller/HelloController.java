package com.funny.myfunny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/goodbye")
    public String farewell(){
        return "farewell";
    }
}
