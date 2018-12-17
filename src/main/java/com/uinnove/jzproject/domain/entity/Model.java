package com.uinnove.jzproject.domain.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="model")
public class Model {

    /**
     * 模型id
     */
    @Id
    private String modelId;

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
     * 模型宽度
     */
    @Column
    private Double modelWidth;

    /**
     * 模型长度
     */
    @Column
    private Double modelLength;

    /**
     * 模型高度
     */
    @Column
    private Double modelHeight;

    /**
     * 模型路径
     */
    @Column
    private String modelAttrUrl;

    /**
     * 模型图片
     */
    private String modelImg;

    /**
     * 场景id
     */
    @Column
    private String sceneId;
}
