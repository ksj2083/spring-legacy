package com.mycatgib.springstudy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;

@Controller
public class BasicController {

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String helloMessage(Model model) {
        System.out.println("helloMessage");
        model.addAttribute("message", "HelloBasicController");
        //return "redirect:/basicView/messageView";//Dispatcher
        return "basicView/messageView";
    }
    @GetMapping(value = "/lesson")
    public ModelAndView lessonMessage() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("lesson", "SpringLesson");
        modelAndView.setViewName("basicView/messageLesson");
        return modelAndView;
    }

    @PostMapping(value = "/empValue")
    public String empValueProcess(@RequestParam(value = "job",required = false,defaultValue = "doctor") String job,
                                  @RequestParam(value = "sal",required = false,defaultValue = "1000")      int sal,Model model) {
        model.addAttribute("job", job);
        model.addAttribute("sal", sal);
        return "basicView/empView";
    }

    @PostMapping(value = "/lessonCheck")
    public String lessonCheckProcess(Model model, HttpServletRequest request) {
        String []chValue=request.getParameterValues("lesson");
        model.addAttribute("chValue", chValue);
        return "basicView/lessonCheck";
    }

}
