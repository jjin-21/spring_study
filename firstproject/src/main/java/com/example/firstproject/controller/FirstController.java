package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    String name = "재진1";
;    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "재진");
        return "greetings"; // templates 디렉터리의 greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username", name);
        return "bye"; // templates 디렉터리의 greetings.mustache 파일 반환
    }
}
