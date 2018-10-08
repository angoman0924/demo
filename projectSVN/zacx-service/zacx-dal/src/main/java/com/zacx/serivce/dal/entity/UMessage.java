/*
*
* UMessage.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.Date;

public class UMessage {
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

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return user_id 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 消息类型: 1系统消息 2官方公告
     * @return type 消息类型: 1系统消息 2官方公告
     */
    public Integer getType() {
        return type;
    }

    /**
     * 消息类型: 1系统消息 2官方公告
     * @param type 消息类型: 1系统消息 2官方公告
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 标题
     * @return title 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 标题
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 消息内容
     * @return content 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 消息内容
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 过期时间
     * @return expiration_date 过期时间
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * 过期时间
     * @param expirationDate 过期时间
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * 阅读标记: 0未阅 1已阅
     * @return is_read 阅读标记: 0未阅 1已阅
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * 阅读标记: 0未阅 1已阅
     * @param isRead 阅读标记: 0未阅 1已阅
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * 删除标记: 0未删除 1已删除
     * @return is_delete 删除标记: 0未删除 1已删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 删除标记: 0未删除 1已删除
     * @param isDelete 删除标记: 0未删除 1已删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 
     * @return create_at 
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 
     * @param createAt 
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 
     * @return create_by 
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 
     * @param createBy 
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 
     * @return modify_at 
     */
    public Date getModifyAt() {
        return modifyAt;
    }

    /**
     * 
     * @param modifyAt 
     */
    public void setModifyAt(Date modifyAt) {
        this.modifyAt = modifyAt;
    }

    /**
     * 
     * @return modify_by 
     */
    public String getModifyBy() {
        return modifyBy;
    }

    /**
     * 
     * @param modifyBy 
     */
    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }
}