package com.zacx.serivce.line.service;

import com.github.pagehelper.PageInfo;
import com.zacx.serivce.dal.entity.LSite;
import com.zacx.serivce.dal.entity.LSiteExample;
import com.zacx.serivce.line.api.dto.SiteDTO;
import com.zacx.serivce.line.api.exceptions.LineServiceException;

import java.util.List;

/**
 * 站点内部服务
 * Created by song on 2018/10/3.
 */
public interface SiteService {
    //写表
    int insert(LSite record) throws LineServiceException;
    //更新
    int update(LSite record) throws LineServiceException;
    //删除
    int removeListByIds(List<Integer> ids,String userCode) throws LineServiceException;
    //根据主键查找
    LSite  findByPrimaryKey(Integer id);
    //分页查询
    PageInfo<LSite> getSitePageInfo(SiteDTO dto);

    //普通查询
    List<LSite> getSiteList(LSiteExample example);

    //参入转换
    LSiteExample params2example(SiteDTO dto);
}
