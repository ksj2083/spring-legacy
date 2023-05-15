package com.mycatgib.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ViewController {
    @GetMapping("/view/{name}")
    public String helloSpring(
            @PathVariable String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "hello";
    }
}
