package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LHotzone;
import com.zacx.serivce.dal.entity.LHotzoneExample;
import com.zacx.serivce.line.api.dto.HotzoneDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 热区内部服务
 * Created by song on 2018/10/3.
 */
public interface HotzoneService {
    //写表
    int insert(LHotzone record) throws LineServiceException;
    //更新
    int update(LHotzone record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids, String userCode) throws LineServiceException;
    //根据主键查找
    LHotzone  findByPrimaryKey(Integer id);
    //分页查询
    PageInfo<LHotzone> getHotzonePageInfo(HotzoneDTO dto);

    List<LHotzone> getLHotzoneList(LHotzoneExample example);

    LHotzoneExample params2example(HotzoneDTO dto);
}
