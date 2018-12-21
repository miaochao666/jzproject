package com.uinnove.jzproject.controller;

import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.service.SceneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {

    @Resource
    private SceneService sceneService;

    @RequestMapping("/")
    public ModelAndView mian(ModelAndView modelAndView){
        modelAndView.setViewName("login.html");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView login(String name,String password,ModelAndView modelAndView){
        if(name.equals("admin")&&password.equals("123")){
            modelAndView.setViewName("map.html");
        }else{
            modelAndView.setViewName("login.html");
        }
        return modelAndView;
    }

    @RequestMapping("/map")
    public ModelAndView map(ModelAndView modelAndView){
        modelAndView.setViewName("map.html");
        return modelAndView;
    }


}
