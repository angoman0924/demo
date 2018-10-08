package com.zacx.serivce.user.api;

import com.zacx.serivce.user.api.dto.UserMessageDTO;

import java.util.List;

/**
 * API接口：用户站内消息
 *
 * @author lwg
 * @version 1.0
 * @create 2018-10-07 12:01
 **/
public interface UserMessageApi {

    /**
     * 新增
     * @return
     */
    Integer insertSelective(UserMessageDTO dto);

    /**
     * 修改
     * @return
     */
    Integer updateByPrimaryKeySelective(UserMessageDTO dto);

    /**
     * 删除
     * @return
     */
    Integer deleteByPrimaryKey(Integer id);

     /**
     * 根据id批量删除
     * @return
     */
    Integer deleteByIds(List<Integer> ids);

    /**
     * 站内消息-根据Key查询
     * */
    UserMessageDTO selectByKey(int id);

    /**
     * 获取用户站内消息列表
     */
    List<UserMessageDTO> getMessageList(UserMessageDTO dto);
}
