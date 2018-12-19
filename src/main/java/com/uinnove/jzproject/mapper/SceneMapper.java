package com.uinnove.jzproject.mapper;

import com.uinnove.jzproject.domain.entity.Scene;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface SceneMapper extends JpaRepository<Scene,Integer> {

    /**
     * 统计有多少改场景
     * @param sceneSource
     * @return
     */
    int countSceneBySceneSourceIs(@Param("sceneSource") String sceneSource);

    /**
     * 复制场景
     * @param scene_describe
     * @param scene_img
     * @param scene_name
     * @param scene_source
     * @return
     */
    @Modifying
    @Transactional
    @Query(value="insert into scene(scene_describe,scene_img,scene_name,scene_source) values(?1,?2,?3,?4)",nativeQuery = true)
    int copyScene(String scene_describe,String scene_img,String scene_name,String scene_source);


    @Modifying
    @Transactional
    @Query(value="update scene set longitude=?2,latitude=?3 where scene_id=?1",nativeQuery = true)
    int updateScene(Integer sceneId,String longitude,String latitude);
}
