package com.uinnove.jzproject.domain.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="scene")
public class Scene {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer sceneId;

    /**
     * 名称
     */
    @Column
    private String sceneName;

    /**
     * 描述
     */
    @Column
    private String sceneDescribe;

    /**
     * 经度
     */
    @Column
    private String longitude;

    /**
     * 纬度
     */
    @Column
    private String latitude;

    /**
     * 场景图片
     */
    @Column
    private String sceneImg;

    /**
     * 来源
     */
    @Column
    private String sceneSource;


}
