package com.zacx.serivce.user.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

/**
* @desc    意见反馈
* @version 1.0
* @author  Liang Jun
* @date    2018年10月07日 19:23:20
**/
@Data
public class FeedbackDTO extends BaseDTO {
    private Integer id;
    private Integer userId;
    private String content;
    /**
     * 图片路径（多张图片，路径间用英逗号隔开）
     */
    private String imagePath;
    /**
     * 类型: 1意见 2投诉
     */
    private Integer type;
    private String remark;
}