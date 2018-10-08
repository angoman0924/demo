package com.zacx.gateway.passenger.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 乘客信息
 * @author: kiting
 * @date: 2018年10月04日 17:30
 * @version: 1.0
 * @copyright: 上海拜米网络科技有限公司
 **/
@Data
@ApiModel(value = "PassengerInfo", description = "乘客信息")
public class PassengerInfo {

    @ApiModelProperty(value = "姓名", dataType = "String")
    private String name;

    @ApiModelProperty(value = "手机号", dataType = "String")
    private String phone;

    @ApiModelProperty(value = "证件号", dataType = "String")
    private String cardNo;

    //证件类型: 1身份证 2驾驶证 3军官证 4护照 5其他
    @ApiModelProperty(value = "证件类型", dataType = "String")
    private String cardType;

}
