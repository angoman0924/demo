package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 站点DTO
 * Created by song on 2018/10/3.
 */
@Data
public class SiteDTO extends BaseDTO {

    private static final long serialVersionUID = -6910500605091129562L;
    private Integer id;

    //站点名称
    private String name;

    //省
    private String provinceCode;

    //市
    private String cityCode;

    //县、区
    private String countyCode;

    //乡镇
    private String placeCode;

    //纬度
    private BigDecimal latitude;

    //经度
    private BigDecimal longitude;

    //详细地址
    private String address;

    //删除标记
    private Boolean isDelete;

    private Date createOn;

    private String createBy;

    private Date modifyOn;

    private String modifyBy;
}
