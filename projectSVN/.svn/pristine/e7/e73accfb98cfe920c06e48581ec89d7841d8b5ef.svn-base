package com.zacx.core.model.api;

import com.zacx.core.constants.Constants;

import java.io.Serializable;

/**
 * 
 * Created by song on 2018/10/2.
 */
public class BaseDTO implements Serializable {
    private static final long serialVersionUID = -3818084760000509546L;

    /**
     * 页号
     */
    private Integer pageIndex;
    /**
     * 条数
     */
    private Integer pageSize;

    /**
     * 排序条件（不能完全依赖前端传递的信息）
     */
    private String sortCase;

    public Integer getPageIndex() {
        return null!=pageIndex?pageIndex: Constants.PAGE_INDEX;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return null!=pageSize?pageSize:Constants.PAGE_SIZE;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortCase() {
        return null!=sortCase&&!"".equals(sortCase)?sortCase:"";
    }

    public void setSortCase(String sortCase) {
        this.sortCase = sortCase;
    }
}
