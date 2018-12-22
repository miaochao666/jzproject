package com.uinnove.jzproject.controller;

import com.uinnove.jzproject.domain.entity.Model;
import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.service.ModelService;
import com.uinnove.jzproject.service.SceneService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Iterator;
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

    @RequestMapping("/enterScene")
    @ResponseBody
    public ModelAndView enterScene(Integer sceneId,ModelAndView modelAndView){

        List<Model> list= modelService.modelList(sceneId);
        Scene scene=sceneService.selectIdAndSource(sceneId);
        modelAndView.addObject("sceneSource",scene.getSceneSource());
        modelAndView.addObject("list",list);
        modelAndView.setViewName("indexScene.html");
        return modelAndView;
    }

    @RequestMapping("/updateModels")
    @ResponseBody
    public String updateModels(HttpServletRequest request) throws Exception {
        String jsonStr=request.getParameter("params");
        String sceneId=request.getParameter("sceneId");


        JSONArray jsonArray=JSONArray.fromObject(jsonStr);
        Iterator<Object> iterator=jsonArray.iterator();
        modelService.deleteModels(Integer.parseInt(sceneId));
        while(iterator.hasNext()){
            JSONObject job=(JSONObject)iterator.next();

            modelService.addModels((String) job.get("modelAttrUrl"),(String)job.get("modelName"),(Double)job.get("positionX"),(Double)job.get("positionY"),(Double)job.get("positionZ"),Integer.parseInt(sceneId));
        }
        return "success";
    }



    @RequestMapping("/previewScene")
    @ResponseBody
    public List<Model> previewScene(Integer sceneId){
        List<Model> list= modelService.modelList(sceneId);
        return list;
    }
}
