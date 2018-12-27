package com.uinnove.jzproject.mapper;


import com.uinnove.jzproject.domain.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ModelMapper extends JpaRepository<Model,Integer> {


    List<Model> findAllBySceneId(Integer sceneId);

    @Modifying
    @Transactional
    int deleteBySceneId(Integer sceneId);

    int save(List<Model> models);

    @Modifying
    @Transactional
    @Query(value="insert into Model(model_attr_url,model_name,positionX,positionY,positionZ,scene_id) values(?1,?2,?3,?4,?5,?6)",nativeQuery = true)
    int addModel(String modelAttrUrl,String modelName,Double positionX,Double positionY,Double positionZ,Integer sceneId);

}
