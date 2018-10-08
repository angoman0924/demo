package com.zacx.serivce.user.api.dto;

import com.zacx.core.model.api.BaseDTO;
import lombok.Data;

import java.util.Date;

/**
 * 用户站内消息
 *
 * @author lwg
 * @version 1.0
 * @create 2018-10-07 12:01
 **/
@Data
public class UserMessageDTO extends BaseDTO {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private Integer userId;

    /**
     * 消息类型: 1系统消息 2官方公告
     */
    private Integer type;

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
    private Date expirationDate;

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
    private Date createAt;

    /**
     *
     */
    private String createBy;

    /**
     *
     */
    private Date modifyAt;

    /**
     *
     */
    private String modifyBy;

    // region 扩展查询条件字段
    private String userIds;
    private String types;
    private Date expirationDateStart;
    private Date expirationDateEnd;
    private Date createAtStart;
    private Date createAtEnd;
    private Date modifyAtStart;
    private Date modifyAtEnd;
    // endregion
}

