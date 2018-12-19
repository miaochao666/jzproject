package com.uinnove.jzproject.service.impl;

import com.uinnove.jzproject.domain.entity.Scene;
import com.uinnove.jzproject.mapper.SceneMapper;
import com.uinnove.jzproject.service.SceneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SceneServiceImpl implements SceneService {

    @Resource
    private SceneMapper sceneMapper;

    @Override
    public int countScene(String sceneSource) {
        return sceneMapper.countSceneBySceneSourceIs(sceneSource);
    }

    @Override
    public int insertNewScene(Scene scene) {
        scene.setSceneImg("/scene/"+scene.getSceneSource()+"/preview.jpg");
        return sceneMapper.copyScene(scene.getSceneDescribe(),scene.getSceneImg(),scene.getSceneName(), scene.getSceneSource());
    }

    @Override
    public List<Scene> selectList() {
        return sceneMapper.findAll();
    }

    @Override
    public int setPoint(Integer sceneId, String longitude, String latitude) {
        return sceneMapper.updateScene(sceneId,longitude,latitude);
    }
}
