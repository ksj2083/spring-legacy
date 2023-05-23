package com.mycatgib.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login() {
        return "mvcDemo/adminLogin";
    }

    @GetMapping(value = "/list")
    public String list() {
        return "mvcDemo/list";
    }

    @PostMapping(value = "/loginAction")
    public String loginAction(@RequestParam(value = "user_id",required = true) String userId,
                                    @RequestParam(value = "user_passwd", required = true) String userPassword) {

        if("Admin".equalsIgnoreCase(userId) && "1234".equalsIgnoreCase(userPassword)) {
            return "mvcDemo/list";

        }

        return "redirect:login";
    }
}
