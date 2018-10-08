package com.zacx.serivce.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.MGoodOrderOperateLog;
import com.zacx.serivce.dal.entity.MGoodOrderOperateLogExample;
import com.zacx.serivce.dal.mapper.MGoodOrderOperateLogMapper;
import com.zacx.serivce.mall.api.dto.GoodOrderOperateLogDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;
import com.zacx.serivce.mall.service.GoodsOrderOperateLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by song on 2018/10/7.
 */
@Service
public class GoodsOrderOperateLogServiceImpl implements GoodsOrderOperateLogService {
    @Autowired
    private MGoodOrderOperateLogMapper logMapper;
    @Override
    public int insert(MGoodOrderOperateLog record) throws MallServiceException {
        return logMapper.insertSelective(record);
    }

    @Override
    public int removeByIds(List<Integer> ids) throws MallServiceException {
        MGoodOrderOperateLogExample example=new MGoodOrderOperateLogExample();
        example.createCriteria().andIdIn(ids);
        return logMapper.deleteByExample(example);
    }

    @Override
    public MGoodOrderOperateLog findByPrimaryKey(Integer id) {
        return logMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<MGoodOrderOperateLog> getMGoodsPageInfo(GoodOrderOperateLogDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<MGoodOrderOperateLog> list = logMapper.selectByExample(this.params2example(dto));
        PageInfo<MGoodOrderOperateLog> page=new PageInfo<>(list);
        return page;
    }

    private MGoodOrderOperateLogExample params2example(GoodOrderOperateLogDTO dto){
        MGoodOrderOperateLogExample example=new MGoodOrderOperateLogExample();
        MGoodOrderOperateLogExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getOperateUserId())){
            criteria.andOperateUserIdEqualTo(dto.getOperateUserId());
        }
        if(!ObjectUtils.isNull(dto.getOrderId())){
            criteria.andOrderIdEqualTo(dto.getOrderId());
        }
        if(!ObjectUtils.isNull(dto.getOperatePlatform())){
            criteria.andOperatePlatformEqualTo(dto.getOperatePlatform());
        }

        if(!ObjectUtils.isNull(dto.getOperateUseName())&& StringUtils.isNotBlank(dto.getOperateUseName().trim())){
            criteria.andOperateUseNameLike("%"+dto.getOperateUseName().trim()+"%");
        }

        if(StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }else{
            example.setOrderByClause(" id desc ");
        }
        return example;
    }
}
