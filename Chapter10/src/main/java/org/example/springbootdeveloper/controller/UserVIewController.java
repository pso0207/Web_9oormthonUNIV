package org.example.springbootdeveloper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UserVIewController {
    @GetMapping("/login")
    public String login() {
        return "oauthLogin";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }
}
