package com.zacx.serivce.user.service;

import com.zacx.serivce.dal.entity.UMessage;
import com.zacx.serivce.user.api.dto.UserMessageDTO;

import java.util.List;

/**
 * 用户站内消息
 *
 * @author lwg
 * @version 1.0
 * @create 2018-10-07 12:01
 **/
public interface UserMessageService {
    /**
     * 站内消息-新增
     * @return
     */
    Integer insertSelective(UserMessageDTO dto);

    /**
     * 站内消息-修改
     * @return
     */
    Integer updateByPrimaryKeySelective(UserMessageDTO dto);

    /**
     * 站内消息-删除
     * @return
     */
    Integer deleteByPrimaryKey(Integer id);

    /**
     * 站内消息-根据id批量删除
     * @return
     */
    Integer deleteByIds(List<Integer> ids);

    /**
     * 站内消息-根据Key查询
     * @return
     */
    UMessage selectByKey(int id);

    /**
     * 站内消息-列表查询
     * */
    List<UMessage> getUserMessageList(UserMessageDTO dto);
}
