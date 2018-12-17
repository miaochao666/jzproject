package com.uinnove.jzproject.domain.dto;

import lombok.Data;

@Data
public class Model {
    /**
     * 模型id
     */
    private String modelId;

    /**
     * 模型名称
     */
    private String modelName;

    /**
     * 模型坐标X
     */
    private Double positionX;

    /**
     * 模型坐标Y
     */
    private Double positionY;

    /**
     * 模型坐标Z
     */
    private Double positionZ;

    /**
     * 模型宽度
     */
    private Double modelWidth;

    /**
     * 模型长度
     */
    private Double modelLength;

    /**
     * 模型高度
     */
    private Double modelHeight;

    /**
     * 模型路径
     */
    private String modelAttrUrl;

    /**
     * 模型图片
     */
    private String modelImg;

    /**
     * 场景id
     */
    private String sceneId;
}
