package com.zacx.serivce.order.service.impl;

import com.zacx.core.util.DateUtils;
import com.zacx.core.util.MoneyUtils;
import com.zacx.serivce.dal.entity.OOrder;
import com.zacx.serivce.dal.entity.OOrderOperateLog;
import com.zacx.serivce.dal.mapper.OOrderOperateLogMapper;
import com.zacx.serivce.order.api.dto.OrderBaseDTO;
import com.zacx.serivce.order.api.enums.BusinessTypeEnum;
import com.zacx.serivce.order.api.enums.OrderStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BaseOrderLocServiceImpl {
    @Autowired
    private OOrderOperateLogMapper oOrderOperateLogMapper;

    protected void orderEntityToBaseDTO(OOrder orderEntity, OrderBaseDTO orderBaseDTO) {
        orderBaseDTO.setOrderId(orderEntity.getId());
        orderBaseDTO.setOrderCode(orderEntity.getCode());

        orderBaseDTO.setStartPlace(orderEntity.getSiteStartName());
        orderBaseDTO.setEndPlace(orderEntity.getSiteEndName());
        orderBaseDTO.setStartTime(DateUtils.getFormatStrDate(orderEntity.getStartTime()));
        orderBaseDTO.setCreateAt(DateUtils.getFormatStrDate(orderEntity.getCreateAt()));
        orderBaseDTO.setTotalCost(MoneyUtils.getStrMoney(orderEntity.getTotalCost()));
        orderBaseDTO.setBusinessType(orderEntity.getBusinessType());
        orderBaseDTO.setIsEvaluated(orderEntity.getIsEvaluated());

        //服务描述
        if (BusinessTypeEnum.CHARTERED.getCode().equals(orderEntity.getBusinessType())) {
            if (orderEntity.getIsSelf()) {
                orderBaseDTO.setServiceDesc("自营包车");
            } else {
                orderBaseDTO.setServiceDesc("包车服务");
            }
        } else if (orderEntity.getRelayType() > 0) {
            orderBaseDTO.setServiceDesc("上门接送");
        }
    }

    /**
     * 记录用户操作订单日志
     *
     * @param orderEntity
     * @return
     */
    protected void userOperateOrderLog(OOrder orderEntity, OrderStatusEnum oldStatus, String logStr, String extendInfo) {
        OOrderOperateLog operateLog = new OOrderOperateLog();
        operateLog.setOrderId(orderEntity.getId());
        operateLog.setLog(logStr);
        operateLog.setOrderStatusOld(oldStatus!=null?oldStatus.getCode():0);
        operateLog.setOrderStatusNew(orderEntity.getStatus());
        operateLog.setTotalCost(orderEntity.getTotalCost());
        operateLog.setExtendInfo(extendInfo);
        operateLog.setCreateAt(new Date());
        //1app 2运营（此处可以固定为1，运营是独立项目 ）
        operateLog.setOperatePlatform(1);
        operateLog.setOperateUserId(orderEntity.getUserId());
        operateLog.setOperateUseName(orderEntity.getCreateBy());
        oOrderOperateLogMapper.insert(operateLog);
    }


    /**
     * 记录系统操作订单日志
     *
     * @param orderEntity
     * @return
     */
    protected void sysOperateOrderLog(OOrder orderEntity, OrderStatusEnum oldStatus, String logStr, String extendInfo) {
        OOrderOperateLog operateLog = new OOrderOperateLog();
        operateLog.setOrderId(orderEntity.getId());
        operateLog.setLog(logStr);
        operateLog.setOrderStatusOld(oldStatus!=null?oldStatus.getCode():0);
        operateLog.setOrderStatusNew(orderEntity.getStatus());
        operateLog.setTotalCost(orderEntity.getTotalCost());
        operateLog.setExtendInfo(extendInfo);
        operateLog.setCreateAt(new Date());
        //1app 2运营（此处可以固定为1，运营是独立项目 ）
        operateLog.setOperatePlatform(2);
        operateLog.setOperateUserId(0);
        operateLog.setOperateUseName("system");
        oOrderOperateLogMapper.insert(operateLog);
    }

}
