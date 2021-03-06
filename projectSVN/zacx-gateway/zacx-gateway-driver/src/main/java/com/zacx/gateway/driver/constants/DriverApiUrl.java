package com.zacx.gateway.driver.constants;

import com.zacx.core.constants.Constants;

/**
 * URL地址
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-18 14:16
 * @copyright 上海拜米网络科技有限公司
 **/
public interface DriverApiUrl {

    String V1="v1";
    String USER="v1/user";
    String BASE_URI_V1 =  Constants.API+USER;

    String CONTENT_TYPE_JSON="application/json;charset=UTF-8";


    String DEMO="/demo";
    //根据手机号码查询用户
    String MOBILE="/mobile/{mobile}";

    //线路模块
    String LINE_GET_MY_SCHEDULING_INFO="lines/getMySchedulingInfo";
    String LINE_SCHEDULING_MOVE_APPLY="lines/schedulingMoveApply";
    String LINE_DRIVER_SIGN="lines/driverSign";
    String LINE_GET_HOTZONE_BY_LINE="lines/getHotzoneResultByLine";
    String LINE_GET_HOTZONE_INFO_BY_SITEID="lines/getHotzoneInfoBySiteId";
    String LINE_SCHEDULING_COMPLETE_BY_DRIVER="lines/schedulingCompleteByDriver";
    String LINE_GET_SCHEDULING_HISTORY="lines/getSchedulingHistory";
    String LINE_GET_SCHEDULING_SITE_HOTZONE_PASSENGER_INFO="lines/getSchedulingSiteHotzonePassengerInfo";
    String LINE_GET_TICKET_INFO_LIST="lines/getTicketInfoListBy";


    //票相关接口
    String TICKET="v1/ticket";
    String VALI_BOARDING_SMSCODE="valiBoardingSmsCode";


}
