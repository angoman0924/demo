package com.zacx.serivce.line.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Created by song on 2018/10/5.
 */
@Data
public class HotzoneResultByLineDTO implements Serializable {
    private static final long serialVersionUID = -816125022250977810L;
    //始点热区
    private List<HotzoneDTO> startSiteHotzongs;
    //终点热区
    private List<HotzoneDTO> endSiteHotzongs;
}
