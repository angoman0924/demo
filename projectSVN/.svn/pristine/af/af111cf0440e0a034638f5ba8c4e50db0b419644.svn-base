package com.zacx.serivce.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.MGoodOrder;
import com.zacx.serivce.dal.entity.MGoodOrderDetail;
import com.zacx.serivce.dal.entity.MGoodOrderDetailExample;
import com.zacx.serivce.dal.entity.MGoodOrderExample;
import com.zacx.serivce.dal.entity.ext.MGoodOrderDetailExt;
import com.zacx.serivce.dal.mapper.MGoodOrderDetailMapper;
import com.zacx.serivce.dal.mapper.MGoodOrderMapperExt;
import com.zacx.serivce.dal.model.QueryGoodsOrderCondition;
import com.zacx.serivce.mall.api.dto.GoodsOrderDTO;
import com.zacx.serivce.mall.api.dto.QueryGoodsOrderConditionDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;
import com.zacx.serivce.mall.service.GoodsOrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class GoodsOrderServiceImpl implements GoodsOrderService {
    @Autowired
    private MGoodOrderMapperExt orderMapper;
    @Autowired
    private MGoodOrderDetailMapper detailMapper;
    @Override
    public Integer insert(MGoodOrder record) throws MallServiceException {
        orderMapper.insertSelective(record);
        return record.getId();
    }

    @Override
    public int insertDetail(MGoodOrderDetail record) throws MallServiceException {
        return detailMapper.insertSelective(record);
    }

    @Override
    public int update(MGoodOrder record) throws MallServiceException {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateDetail(MGoodOrderDetail record) throws MallServiceException {
        return detailMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByIds(List<Integer> ids, MGoodOrder record) throws MallServiceException {
        MGoodOrderExample example=new MGoodOrderExample();
        example.createCriteria().andIdIn(ids);
        return orderMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int removeByIds(List<Integer> ids) throws MallServiceException {
        //1.订单详情
        MGoodOrderDetailExample detailExample=new MGoodOrderDetailExample();
        detailExample.createCriteria().andOrderIdIn(ids);
        detailMapper.deleteByExample(detailExample);
        //2.订单
        MGoodOrderExample example=new MGoodOrderExample();
        example.createCriteria().andIdIn(ids);
        return orderMapper.deleteByExample(example);
    }

    @Override
    public int removeDetailByIds(List<Integer> ids) throws MallServiceException {
        MGoodOrderDetailExample example=new MGoodOrderDetailExample();
        example.createCriteria().andIdIn(ids);
        return detailMapper.deleteByExample(example);
    }

    @Override
    public int removeDetailByDetailIds(List<Integer> ids) throws MallServiceException {
        MGoodOrderDetailExample example=new MGoodOrderDetailExample();
        example.createCriteria().andIdIn(ids);
        return detailMapper.deleteByExample(example);
    }

    @Override
    public MGoodOrder findByPrimaryKey(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public MGoodOrderDetail findDtailByPrimaryKey(Integer id) {
        return detailMapper.selectByPrimaryKey(id);
    }

    @Override
    public MGoodOrder findByCode(String code) {
        MGoodOrderExample example=new MGoodOrderExample();
        example.createCriteria().andCodeEqualTo(code);
        example.setOrderByClause(" id desc ");
        List<MGoodOrder> mGoodOrders = orderMapper.selectByExample(example);
        if(null!=mGoodOrders&&!mGoodOrders.isEmpty()){
            return mGoodOrders.get(0);
        }
        return null;
    }

    @Override
    public PageInfo<MGoodOrder> getMGoodOrderPageInfo(GoodsOrderDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<MGoodOrder> list = orderMapper.selectByExample(this.params2example(dto));
        PageInfo<MGoodOrder> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public List<MGoodOrderDetailExt> getMGoodOrderDetailList(QueryGoodsOrderConditionDTO dto) {
        QueryGoodsOrderCondition condition=new QueryGoodsOrderCondition();
        BeanUtils.copyProperties(dto,condition);
        List<MGoodOrderDetailExt> mGoodOrderDetailExtList = orderMapper.getMGoodOrderDetailExtList(condition);
        return mGoodOrderDetailExtList;
    }

    @Override
    public MGoodOrderExample params2example(GoodsOrderDTO dto) {
        MGoodOrderExample example=new MGoodOrderExample();
        MGoodOrderExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getUserId())){
            criteria.andUserIdEqualTo(dto.getUserId());
        }
        if(!ObjectUtils.isNull(dto.getStatus())){
            criteria.andStatusEqualTo(dto.getStatus());
        }
        if(!ObjectUtils.isNull(dto.getCode())&& StringUtils.isNotBlank(dto.getCode().trim())){
            criteria.andCodeEqualTo(dto.getCode().trim());
        }

        if(StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }else{
            example.setOrderByClause(" id desc ");
        }

        return example;
    }
}
