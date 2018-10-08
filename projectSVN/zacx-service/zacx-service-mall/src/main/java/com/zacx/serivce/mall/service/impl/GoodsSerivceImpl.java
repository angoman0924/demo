package com.zacx.serivce.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.MGoods;
import com.zacx.serivce.dal.entity.MGoodsExample;
import com.zacx.serivce.dal.mapper.MGoodsMapper;
import com.zacx.serivce.mall.api.dto.GoodsDTO;
import com.zacx.serivce.mall.api.exceptions.MallServiceException;
import com.zacx.serivce.mall.service.GoodsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by song on 2018/10/6.
 */
@Service
public class GoodsSerivceImpl implements GoodsSerivce {
    @Autowired
    private MGoodsMapper goodsMapper;
    @Override
    public int insert(MGoods record) throws MallServiceException {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public int update(MGoods record) throws MallServiceException {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByIds(List<Integer> ids, MGoods record) throws MallServiceException {
        MGoodsExample example=new MGoodsExample();
        example.createCriteria().andIdIn(ids);
        return goodsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int removeByIds(List<Integer> ids) throws MallServiceException {
        MGoodsExample example=new MGoodsExample();
        example.createCriteria().andIdIn(ids);
        return goodsMapper.deleteByExample(example);
    }

    @Override
    public MGoods findByPrimaryKey(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<MGoods> getMGoodsPageInfo(GoodsDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<MGoods> list = goodsMapper.selectByExample(this.params2example(dto));
        PageInfo<MGoods> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public MGoodsExample params2example(GoodsDTO dto) {
        MGoodsExample example=new MGoodsExample();
        MGoodsExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getCategory())){
            criteria.andCategoryEqualTo(dto.getCategory());
        }
        if(!ObjectUtils.isNull(dto.getCode())&&StringUtils.isNotBlank(dto.getCode().trim())){
            criteria.andCodeEqualTo(dto.getCode().trim());
        }
        if(!ObjectUtils.isNull(dto.getCreateBy())&&StringUtils.isNotBlank(dto.getCreateBy().trim())){
            criteria.andCreateByLike("%"+dto.getCreateBy().trim()+"%");
        }
        if(!ObjectUtils.isNull(dto.getName())&&StringUtils.isNotBlank(dto.getName().trim())){
            criteria.andNameLike("%"+dto.getName().trim()+"%");
        }
        if(!ObjectUtils.isNull(dto.getStatus())){
            criteria.andStatusEqualTo(dto.getStatus());
        }

        if(StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }
        return example;
    }
}
