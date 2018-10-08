package com.zacx.serivce.line.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 车票信息list
 * Created by song on 2018/10/6.
 */
@Data
public class TicketInfoListDTO implements Serializable {
    private List<TicketInfoDTO> list;
}
