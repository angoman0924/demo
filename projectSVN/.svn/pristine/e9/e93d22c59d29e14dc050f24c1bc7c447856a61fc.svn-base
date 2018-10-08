package com.zacx.gateway.passenger.dto.user;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

/**
 * @author  : lwg
 * @version : 1.0
 * @desc    : 用户站内消息查询条件
 * @date    : 2018/10/7
 */
@Data
@ApiModel(value = "UMessageEnterInfo", description = "用户站内消息查询请求类")
public class UMessageEnter {
    /**
     *
     */
    private Integer userId;
    private String userIds;

    /**
     * 消息类型: 1系统消息 2官方公告
     */
        private Integer type;
        private String types;

    /**
     * 标题
     */
    private String title;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 过期时间
     */
    private Date expirationDateStart;
    private Date expirationDateEnd;

    /**
     * 阅读标记: 0未阅 1已阅
     */
    private Boolean isRead;

    /**
     * 删除标记: 0未删除 1已删除
     */
    private Boolean isDelete;

    /**
     *
     */
    private Date createAtStart;
    private Date createAtEnd;

    /**
     *
     */
    private String createBy;

    /**
     *
     */
    private Date modifyAtStart;
    private Date modifyAtEnd;

    /**
     *
     */
    private String modifyBy;
}
