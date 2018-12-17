package com.uinnove.jzproject.domain.dto;


import lombok.Data;

@Data
public class Scene {

    /**
     * 主键id
     */
    private String sceneId;

    /**
     * 名称
     */
    private String sceneName;

    /**
     * 描述
     */
    private String sceneDescribe;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 场景图片
     */
    private String sceneImg;

    /**
     * 来源
     */
    private String sceneSource;

}
