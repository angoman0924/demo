package com.zacx.serivce.mall.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by song on 2018/10/7.
 */
@Data
public class GoodsEntryDTO implements Serializable {
    private static final long serialVersionUID = 2329355939717755212L;
    private Integer id;
    private Integer number;
    private Integer priceIntegral;
}
