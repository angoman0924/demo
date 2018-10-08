/*
*
* BIntegral.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class BIntegral {
    /**
     * 
     */
    private Integer id;

    /**
     * 积分类型名称
     */
    private String name;

    /**
     * 积分点数
     */
    private Integer point;

    /**
     * 方向（加或减）: 0减 1加
     */
    private Integer direction;

    /**
     * 
     */
    private String remark;

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
     * 积分类型名称
     * @return name 积分类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 积分类型名称
     * @param name 积分类型名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 积分点数
     * @return point 积分点数
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * 积分点数
     * @param point 积分点数
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * 方向（加或减）: 0减 1加
     * @return direction 方向（加或减）: 0减 1加
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * 方向（加或减）: 0减 1加
     * @param direction 方向（加或减）: 0减 1加
     */
    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    /**
     * 
     * @return remark 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 
     * @param remark 
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}