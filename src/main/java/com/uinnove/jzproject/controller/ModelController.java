package com.uinnove.jzproject.controller;

import com.uinnove.jzproject.domain.entity.Model;
import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.service.ModelService;
import com.uinnove.jzproject.service.SceneService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ModelController {

    @Resource
    private ModelService modelService;

    @Resource
    private SceneService sceneService;

    @RequestMapping("/allModels")
    @ResponseBody
    public ModelAndView allModels(Integer sceneId,ModelAndView modelAndView){

        List<Model> list= modelService.modelList(sceneId);
        Scene scene=sceneService.selectIdAndSource(sceneId);
        modelAndView.addObject("sceneId",scene.getSceneId());
        modelAndView.addObject("sceneSource",scene.getSceneSource());
        modelAndView.addObject("list",list);
        modelAndView.setViewName("3d.html");
        return modelAndView;
    }
}
