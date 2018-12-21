package com.uinnove.jzproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public ModelAndView mian(ModelAndView modelAndView){
        modelAndView.setViewName("map.html");
        return modelAndView;
    }




}
