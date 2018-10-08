package com.zacx.gateway.base.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @classDesc: 功能描述:(通用分页请求对象对象)
 * @author: 顾理想
 * @createTime: 2017年05月10日 15:50
 * @version: v1.0
 *
 */
@ApiModel(value = "Page", description = "分页查询参数")
public abstract class Page {
    @ApiModelProperty(value = "当前第几页", dataType = "int")
    protected int pageNumber = 0;// 当前第几页
    @ApiModelProperty(value = "每页显示多少条", dataType = "int")
    protected int pageSize = 10;// 每页显示多少条数据




    /**
     * @methodDesc: 功能描述:(这个是mybatis sql的参数)
     * @author: 顾理想
     * @createTime 2017年05月11日 21:05
     * @returnType
     *
     */
    @JsonIgnore
    public int getStartIndex() {
        if (pageNumber <= 0) {
            return 0;
        }
        return (pageNumber - 1) * pageSize;
    }

    /**
     * @methodDesc: 功能描述:(这个是给客户端的)
     * @author: 顾理想
     * @createTime 2017年05月11日 21:06
     * @returnType
     *
     */
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Page{");
        sb.append(", pageNumber=").append(pageNumber);
        sb.append(", pageSize=").append(pageSize);
        sb.append('}');
        return sb.toString();
    }
}
