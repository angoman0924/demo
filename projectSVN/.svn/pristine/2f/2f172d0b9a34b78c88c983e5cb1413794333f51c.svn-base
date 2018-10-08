package com.zacx.gateway.passenger.dto.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 乘客返回结果类
 * Created by liusi on 2018/10/7.
 */
@Data
@ApiModel(value = "PassengerEnter", description = "乘客参数")
public class PassengerResult {
    @ApiModelProperty(value = "乘客编号，新增时为空")
    private Integer id;

    @ApiModelProperty(value = "关联用户编号")
    private Integer userId;

    @ApiModelProperty(value = "乘客性名")
    private String name;

    @ApiModelProperty(value = "证件类型")
    private Integer cardType;

    @ApiModelProperty(value = "证件号码")
    private String cardNo;

    @ApiModelProperty(value = "乘客类型")
    private Integer personGroup;

    @ApiModelProperty(value = "联系方式")
    private String phone;

    @ApiModelProperty(value = "状态 1可用 0不可用")
    private Integer status;
}
