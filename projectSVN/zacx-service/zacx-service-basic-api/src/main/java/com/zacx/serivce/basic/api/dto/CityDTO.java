package com.zacx.serivce.basic.api.dto;


import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.List;

/**
* @desc    城市实体类
* @version 1.0
* @author  Liang Jun
* @date    2018年10月03日 19:29:56
**/
@Data
public class CityDTO extends BaseDTO {

    //城市编号
    private Integer id;

    //层级：城市类型 1省 2市 3县 4区
    private Integer type;

    //城市名称
    private String name;

    //拼音
    private String code;

    //编码
    private String parentCode;

    //1省 2市 3县
    private Integer level;

    //简拼
    private String pinyinCode;

    //2级城市
    private List<CityDTO> relationCity;

}