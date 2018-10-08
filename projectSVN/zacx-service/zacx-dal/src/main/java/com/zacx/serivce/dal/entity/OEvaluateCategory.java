/*
*
* OEvaluateCategory.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

public class OEvaluateCategory {
    /**
     * 
     */
    private Integer id;

    /**
     * 评价类别名称
     */
    private String categoryName;

    /**
     * 
     */
    private Integer soft;

    /**
     * 1评价大类，2评价标签
     */
    private Integer type;

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
     * 评价类别名称
     * @return category_name 评价类别名称
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 评价类别名称
     * @param categoryName 评价类别名称
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 
     * @return soft 
     */
    public Integer getSoft() {
        return soft;
    }

    /**
     * 
     * @param soft 
     */
    public void setSoft(Integer soft) {
        this.soft = soft;
    }

    /**
     * 1评价大类，2评价标签
     * @return type 1评价大类，2评价标签
     */
    public Integer getType() {
        return type;
    }

    /**
     * 1评价大类，2评价标签
     * @param type 1评价大类，2评价标签
     */
    public void setType(Integer type) {
        this.type = type;
    }
}