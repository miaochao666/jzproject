package com.uinnove.jzproject.service;

import com.uinnove.jzproject.domain.entity.Model;

import java.util.List;

public interface ModelService {

    List<Model> modelList(Integer sceneId);

    int deleteModels(Integer sceneId);

    int addModels(String modelAttrUrl,String modelName,Double positionX,Double positionY,Double positionZ,Integer sceneId);
}
