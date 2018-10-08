package com.zacx.serivce.order.service.impl;

import com.zacx.core.enums.Code;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.*;
import com.zacx.serivce.dal.mapper.OEvaluateCategoryMapper;
import com.zacx.serivce.dal.mapper.OEvaluateMapper;
import com.zacx.serivce.dal.mapper.OOrderMapper;
import com.zacx.serivce.dal.mapper.OTicketMapper;
import com.zacx.serivce.line.api.SchedulingServiceApi;
import com.zacx.serivce.line.api.dto.SchedulingDTO;
import com.zacx.serivce.order.api.dto.*;
import com.zacx.serivce.order.api.enums.OrderStatusEnum;
import com.zacx.serivce.order.api.enums.TicketStatusEnum;
import com.zacx.serivce.order.api.exceptions.OrderServiceException;
import com.zacx.serivce.order.service.OrderLocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderLocServiceImpl extends BaseOrderLocServiceImpl implements OrderLocService {
    @Autowired
    private SchedulingServiceApi schedulingServiceApi;

    @Autowired
    OOrderMapper oOrderMapper;
    @Autowired
    OTicketMapper oTicketMapper;
    @Autowired
    OEvaluateCategoryMapper oEvaluateCategoryMapper;
    @Autowired
    OEvaluateMapper oEvaluateMapper;

    @Override
    public Boolean scanBoardingCode(BoardingValiDTO boardingValiDTO) {
        if (boardingValiDTO.getCarId() == null || boardingValiDTO.getCarId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未获取到当前车的信息");
        }
        if (boardingValiDTO.getTicketId() == null || boardingValiDTO.getTicketId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请选择票据");
        }
        if (boardingValiDTO.getOrderId() == null || boardingValiDTO.getOrderId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请提供票所在订单信息");
        }
        OTicket tickInfo = oTicketMapper.selectByPrimaryKey(boardingValiDTO.getTicketId());
        if (tickInfo == null || !boardingValiDTO.getOrderId().equals(tickInfo.getOrderId())) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "非法车票信息");
        }
        SchedulingDTO schedulingInfo = schedulingServiceApi.findByPrimaryKey(tickInfo.getSchedulingId());
        if (schedulingInfo == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "车次还未安排，请等待通知");
        }
        if (!boardingValiDTO.getCarId().equals(schedulingInfo.getCarId())) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请确认是否上错车");
        }
        return true;
    }

    @Override
    public String smsBoardingCode(BoardingSmsDTO boardingSmsDTO) {
        if (boardingSmsDTO.getTicketId() == null || boardingSmsDTO.getTicketId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请选择票据");
        }
        if (boardingSmsDTO.getOrderId() == null || boardingSmsDTO.getOrderId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请提供票所在订单信息");
        }
        OTicket ticket = oTicketMapper.selectByPrimaryKey(boardingSmsDTO.getTicketId());
        if (ticket == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "车票不存在或已失效");
        }
        if (!ticket.getOrderId().equals(boardingSmsDTO.getOrderId())) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "非法车票信息");
        }

        //TODO ... 发送短信码
        String valiCode = String.valueOf(System.currentTimeMillis());
        valiCode = valiCode.substring(valiCode.length() - 6);

        OTicket record = new OTicket();
        record.setId(boardingSmsDTO.getTicketId());
        record.setVerificationCode(valiCode);
        record.setModifyAt(new Date());
        record.setModifyBy(boardingSmsDTO.getUserCode());
        oTicketMapper.updateByPrimaryKeySelective(record);

        return valiCode;
    }

    @Override
    public Boolean valiSmsBoardingCode(BoardingSmsValiDTO boardingSmsValiDTO){
        if (boardingSmsValiDTO.getDriverId() == null || boardingSmsValiDTO.getDriverId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未获取到当前车的信息");
        }
        if (boardingSmsValiDTO.getCarId() == null || boardingSmsValiDTO.getCarId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "未获取到当前车的信息");
        }
        if (StringUtils.isBlank(boardingSmsValiDTO.getSmsCode())) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请输入车票短信码");
        }
        SchedulingDTO schedulingDTO = schedulingServiceApi.getSchedulingByCurrentDriver(boardingSmsValiDTO.getDriverId());
        if(schedulingDTO == null){
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请先签到");
        }
        if(boardingSmsValiDTO.getCarId().equals(schedulingDTO.getCarId())){
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "车辆信息不匹配");
        }

        OTicketExample ticketExample = new OTicketExample();
        ticketExample.createCriteria().andSchedulingIdEqualTo(schedulingDTO.getId())
                .andStatusIn(Arrays.asList(TicketStatusEnum.NEW.getCode()))
                .andVerificationCodeEqualTo(boardingSmsValiDTO.getSmsCode());
        int valiCount = oTicketMapper.countByExample(ticketExample);
        if(valiCount == 1){
            return true;
        }
        throw new OrderServiceException(Code.ERROR_ARGUMENT, "验票失败");
    }

    @Override
    public EvaluateCategoryDTO evaluateCategory() {
        List<OEvaluateCategory> catgList = oEvaluateCategoryMapper.selectByExample(new OEvaluateCategoryExample());
        if (catgList != null && !catgList.isEmpty()) {
            EvaluateCategoryDTO catgDTO = new EvaluateCategoryDTO();
            catgDTO.setCatgList(catgList.stream().filter(o -> o.getType() != null && o.getType().equals(1)).map(x -> x.getCategoryName()).collect(Collectors.toList()));
            catgDTO.setLabeLList(catgList.stream().filter(o -> o.getType() != null && o.getType().equals(2)).map(x -> x.getCategoryName()).collect(Collectors.toList()));
            return catgDTO;
        }
        return null;
    }

    @Override
    public Boolean doEvaluate(EvaluateInfoDTO evaluateInfoDTO) {
        if (evaluateInfoDTO.getOrderId() == null || evaluateInfoDTO.getOrderId() <= 0) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "请选择要评价的订单");
        }
        OOrder orderEntity = oOrderMapper.selectByPrimaryKey(evaluateInfoDTO.getOrderId());
        if (orderEntity == null) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "要评价的订单不存在");
        }
        if (!OrderStatusEnum.FINISH.getCode().equals(orderEntity.getStatus())) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "正常乘坐结束的订单才能评价");
        }
        if (orderEntity.getIsEvaluated()) {
            throw new OrderServiceException(Code.ERROR_ARGUMENT, "改订单已评价");
        }

        OEvaluate evaluate = new OEvaluate();
        evaluate.setUserId(evaluateInfoDTO.getUserId());

        //TODO ... 随机生成昵称
        String nickName = String.valueOf(System.currentTimeMillis());
        nickName = nickName.substring(nickName.length() - 10);
        evaluate.setNick(nickName);
        evaluate.setOrderId(evaluateInfoDTO.getOrderId());
        evaluate.setDescription(evaluateInfoDTO.getDescription());
        evaluate.setCreateAt(new Date());

        if (evaluateInfoDTO.getCatgList() != null && !evaluateInfoDTO.getCatgList().isEmpty()) {
            if (evaluateInfoDTO.getCatgList().size() >= 1) {
                //控制器中使用BeanUtils.copyProperties时“catgList”的类型不同，会导致此处“.get(0)”取值异常
                evaluate.setType1Name(evaluateInfoDTO.getCatgList().get(0).getTypeName());
                evaluate.setType1Score(evaluateInfoDTO.getCatgList().get(0).getTypeScore());
            }
            if (evaluateInfoDTO.getCatgList().size() >= 2) {
                evaluate.setType2Name(evaluateInfoDTO.getCatgList().get(1).getTypeName());
                evaluate.setType2Score(evaluateInfoDTO.getCatgList().get(1).getTypeScore());
            }
            if (evaluateInfoDTO.getCatgList().size() >= 3) {
                evaluate.setType3Name(evaluateInfoDTO.getCatgList().get(2).getTypeName());
                evaluate.setType3Score(evaluateInfoDTO.getCatgList().get(2).getTypeScore());
            }
        }
        if (evaluateInfoDTO.getLabeLList() != null && !evaluateInfoDTO.getLabeLList().isEmpty()) {
            evaluate.setLabeLlist(String.join(",", evaluateInfoDTO.getLabeLList()));
        }
        oEvaluateMapper.insert(evaluate);

        //修改订单评论标志
        OOrder uptOrder = new OOrder();
        uptOrder.setId(evaluateInfoDTO.getOrderId());
        uptOrder.setIsEvaluated(true);
        uptOrder.setModifyAt(new Date());
        oOrderMapper.updateByPrimaryKeySelective(uptOrder);

        return true;
    }

}
