package com.uinnove.jzproject.domain.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="model")
public class Model {

    /**
     * 模型id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer modelId;

    /**
     * 模型名称
     */
    @Column
    private String modelName;

    /**
     * 模型坐标X
     */
    @Column
    private Double positionX;

    /**
     * 模型坐标Y
     */
    @Column
    private Double positionY;

    /**
     * 模型坐标Z
     */
    @Column
    private Double positionZ;


    /**
     * 模型路径
     */
    @Column
    private String modelAttrUrl;


    /**
     * 场景id
     */
    @Column
    private Integer sceneId;

}
