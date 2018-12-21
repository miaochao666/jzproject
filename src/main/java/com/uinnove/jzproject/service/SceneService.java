package com.uinnove.jzproject.service;


import com.uinnove.jzproject.domain.entity.Scene;

import java.util.List;

public interface SceneService {


     int countScene(String sceneSource);

     int insertNewScene(Scene scene);

     List<Scene> selectList();

     int setPoint(Integer sceneId,String longitude,String latitude);

     void delScene(Integer sceneId);

     Scene selectIdAndSource(Integer sceneId);


}
