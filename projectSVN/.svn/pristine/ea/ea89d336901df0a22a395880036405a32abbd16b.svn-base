package com.zacx.serivce.line.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zacx.core.util.ObjectUtils;
import com.zacx.core.util.StringUtils;
import com.zacx.serivce.dal.entity.LHotzone;
import com.zacx.serivce.dal.entity.LHotzoneExample;
import com.zacx.serivce.dal.mapper.LHotzoneMapper;
import com.zacx.serivce.line.api.dto.HotzoneDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;
import com.zacx.serivce.line.service.HotzoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 热区内部服务
 * Created by song on 2018/10/3.
 */
@Service
public class HotzoneServiceImpl implements HotzoneService {
    @Autowired
    private LHotzoneMapper hotzoneMapper;
    @Override
    public int insert(LHotzone record) throws LineServiceException {
        return hotzoneMapper.insertSelective(record);
    }

    @Override
    public int update(LHotzone record) throws LineServiceException {
        return hotzoneMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException {
        LHotzoneExample example=new LHotzoneExample();
        example.createCriteria().andIdIn(ids);
        return hotzoneMapper.deleteByExample(example);
    }

    @Override
    public LHotzone findByPrimaryKey(Integer id) {
        return hotzoneMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<LHotzone> getHotzonePageInfo(HotzoneDTO dto) {
        PageHelper.startPage(dto.getPageIndex(),dto.getPageSize());
        List<LHotzone> list = hotzoneMapper.selectByExample(this.params2example(dto));
        PageInfo<LHotzone> page=new PageInfo<>(list);
        return page;
    }

    @Override
    public List<LHotzone> getLHotzoneList(LHotzoneExample example) {
        return hotzoneMapper.selectByExample(example);
    }

    //region params2example 部分入参
    @Override
    public LHotzoneExample params2example(HotzoneDTO dto){
        LHotzoneExample example=new LHotzoneExample();
        LHotzoneExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isNull(dto.getId())){
            criteria.andIdEqualTo(dto.getId());
        }
        if(!ObjectUtils.isNull(dto.getCreateBy())&& StringUtils.isNotBlank(dto.getCreateBy().trim())){
            criteria.andCreateByLike("%"+dto.getCreateBy().trim()+"%");
        }
        if(!ObjectUtils.isNull(dto.getLineId())){
            criteria.andLineIdEqualTo(dto.getId());
        }
        if(!ObjectUtils.isNull(dto.getSiteId())){
            criteria.andSiteIdEqualTo(dto.getSiteId());
        }

        if(!ObjectUtils.isNull(dto.getSortCase())&&StringUtils.isNotBlank(dto.getSortCase())){
            example.setOrderByClause(dto.getSortCase());
        }

        return example;
    }
    //endregion
}
