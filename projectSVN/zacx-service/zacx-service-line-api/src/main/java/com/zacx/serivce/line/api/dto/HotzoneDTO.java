package com.zacx.serivce.line.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 热区
 * Created by song on 2018/10/3.
 */
@Data
public class HotzoneDTO extends BaseDTO {
    private static final long serialVersionUID = -3455838126395264656L;
     private Integer id;

    private Integer lineId;

    private Integer siteId;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Integer radiusOne;

    private Long priceOne;

    private Integer radiusTwo;

    private Long priceTwo;

    private Integer radiusThree;

    private Long priceThree;

    private Boolean isTemplate;

    private Integer status;

    private Date createAt;

    private String createBy;

    private Date modifyAt;


}
