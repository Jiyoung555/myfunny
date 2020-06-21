package com.funny.myfunny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {
    @GetMapping("/privacy")
    public String privacy(Model model){
        model.addAttribute("pcy", "개인정보");
        return "static/privacy";
    }

    @GetMapping("/terms")
    public String terms(Model model){
        model.addAttribute("tms", "이용약관");
        return "static/terms";
    }
}
