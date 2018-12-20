package com.uinnove.jzproject.service.impl;

import com.uinnove.jzproject.domain.entity.Model;
import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.mapper.ModelMapper;
import com.uinnove.jzproject.service.ModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Resource
    private ModelMapper modelMapper;

    @Override
    public List<Model> modelList(Integer sceneId) {
        return modelMapper.findAllBySceneId(sceneId);
    }

    @Override
    public int deleteModels(Integer sceneId) {
        return modelMapper.deleteBySceneId(sceneId);
    }

    @Override
    public int addModels(String modelAttrUrl,String modelName,Double positionX,Double positionY,Double positionZ,Integer sceneId) {

        return modelMapper.addModel(modelAttrUrl,modelName,positionX,positionY,positionZ,sceneId);
    }


}
