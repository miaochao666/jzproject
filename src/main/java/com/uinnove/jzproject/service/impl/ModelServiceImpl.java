package com.uinnove.jzproject.service.impl;

import com.uinnove.jzproject.domain.entity.Model;
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
}
