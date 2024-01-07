package com.example.self_pjt.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/articles/list")
    public String list() {
        return "articles/list";
    }
}
