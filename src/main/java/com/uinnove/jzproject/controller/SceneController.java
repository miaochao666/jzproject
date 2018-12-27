package com.uinnove.jzproject.controller;

import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.service.ModelService;
import com.uinnove.jzproject.service.SceneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SceneController {

    @Autowired
    private SceneService sceneService;

    @Autowired
    private ModelService modelService;


    @RequestMapping("/count")
    @ResponseBody
    public Integer count(String sceneSource){

        int count=sceneService.countScene(sceneSource);


        return count;
    }

    @RequestMapping("/addScene")
    @ResponseBody
    public Integer addScene(Scene scene){

           return sceneService.insertNewScene(scene);

    }

    @RequestMapping("/sceneList")
    @ResponseBody
    public List<Scene> sceneList(){
        return sceneService.selectList();
    }

    @RequestMapping("/scene")
    public ModelAndView scene(ModelAndView modelAndView){
        modelAndView.setViewName("scene.html");
        return modelAndView;
    }

    @RequestMapping("/sceneIncludeModel")
    public ModelAndView sceneIncludeModel(ModelAndView modelAndView){
        List<Scene> list=sceneService.selectList();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("sceneIncludeModel.html");
        return modelAndView;
    }

    @RequestMapping("/savePoint")
    @ResponseBody
    public Integer savePoint(Integer sceneId,String longitude,String latitude){
        return sceneService.setPoint(sceneId,longitude,latitude);
    }

    @RequestMapping("/cancelScene")
    @ResponseBody
    public Integer cancelScene(Integer sceneId){
        modelService.deleteModels(sceneId);
         sceneService.delScene(sceneId);
        return 1;
    }

    @RequestMapping("/sceneMap")
    @ResponseBody
    public List<Scene> sceneMap(){
        List<Scene> list=sceneService.selectList();
        return list;
    }

}
