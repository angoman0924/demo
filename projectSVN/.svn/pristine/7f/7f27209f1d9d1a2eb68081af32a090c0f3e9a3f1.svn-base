package com.zacx.serivce.basic.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class MapLocationResult implements Serializable {
    private static final long serialVersionUID = 1L;
    // 区域编码
    private String adCode;
    // 详细地址
    private String address;
    //省
    private String province;
    //市
    private String city;
    //城市code
    private String cityCode;
    /** 国家 */
    private String country;
    /** 区县 */
    private String district;

    public MapLocationResult(String adCode, String address, String province, String city, String cityCode, String country) {
        this.adCode = adCode;
        this.address = address;
        this.province = province;
        this.city = city;
        this.cityCode = cityCode;
        this.country = country;
    }
}