package com.securitystart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String home () {
        return "/home";
    }

    @GetMapping("/login")
    public String loginGet () {
        return "/login";
    }

    @PostMapping("/login")
    public String loginPost () {
        return "redirect:/user";
    }

    @GetMapping("/user")
    public String user () {
        return "/user";
    }

    @GetMapping("/logout")
    public String logout () {
        return "redirect:/";
    }


}
