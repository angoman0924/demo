package com.zacx.gateway.passenger.constants;

/**
 * URL地址
 *
 * @author gulx
 * @version 1.0
 * @create 2018-09-18 14:16
 * @copyright 上海拜米网络科技有限公司
 **/
public interface OrderApiUrl extends PassengerApiUrl {

    //订单模块V1
    String V1_ORDER = "v1/order/";

    //计算班次订单金额
    String COMP_PLAN_ORDER_PRICE = "compPlanOrderPrice";

    //计算包车订单金额
    String COMP_CHARTERED_ORDER_PRICE = "compCharteredOrderPrice";

    //新增班次订单
    String ADD_PLAN_ORDER = "addPlanOrder";

    //新增包车订单
    String ADD_CHARTERED_ORDER = "addCharteredOrder";

    //订单支付详细
    String PAY_DETAIL = "payDetail";

    //订单支付
    String DO_PAY = "doPay";

    //订单取消详细
    String CHANGE_DETAIL = "changeDetail";

    //订单取消
    String DO_CHANGE = "doChange";

    //订单列表
    String ORDER_LIST = "list";

    //订单详情
    String ORDER_DETAIL = "detail";

    //扫码上车
    String SCAN_BOARDING_CODE = "scanBoardingCode";

    //短信码上车
    String SMS_BOARDING_CODE = "smsBoardingCode";

    //评价类型列表
    String EVALUATE_CATEGORIES = "evaluateCategories";

    //提交评价
    String DO_EVALUATE = "doEvaluate";


}