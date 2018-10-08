package com.zacx.serivce.line.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 站点、热区、乘客
 * Created by song on 2018/10/6.
 */
@Data
public class SiteHotzonePassengerDTO implements Serializable {
    private static final long serialVersionUID = 1130711305742470201L;
    //站点信息
    private SiteDTO site;
    //热区信息
    private List<HotzoneDTO> hotzones;
    //车票信息
    private List<TicketInfoDTO> passengers;
}
