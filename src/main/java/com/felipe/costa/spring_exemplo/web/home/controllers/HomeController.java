package com.felipe.costa.spring_exemplo.web.home.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public String index() {
        return "home/index";
    }
    
}
