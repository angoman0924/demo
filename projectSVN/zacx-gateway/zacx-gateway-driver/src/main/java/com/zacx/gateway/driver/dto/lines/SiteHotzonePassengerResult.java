package com.zacx.gateway.driver.dto.lines;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * Created by song on 2018/10/6.
 */
@Data
@ApiModel(value = "SiteHotzonePassengerResult", description = "站点热区乘客响应类")
public class SiteHotzonePassengerResult {
    //站点信息
    private SiteResult site;
    //热区信息
    private List<HotzoneResult> hotzones;
    //乘客信息
    private List<PassengerResult> passengers;
}
