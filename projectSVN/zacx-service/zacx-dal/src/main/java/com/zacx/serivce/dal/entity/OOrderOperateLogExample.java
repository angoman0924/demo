/*
*
* OOrderOperateLogExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OOrderOperateLogExample {
    /**
     * o_order_operate_log
     */
    protected String orderByClause;

    /**
     * o_order_operate_log
     */
    protected boolean distinct;

    /**
     * o_order_operate_log
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OOrderOperateLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * o_order_operate_log null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andLogIsNull() {
            addCriterion("log is null");
            return (Criteria) this;
        }

        public Criteria andLogIsNotNull() {
            addCriterion("log is not null");
            return (Criteria) this;
        }

        public Criteria andLogEqualTo(String value) {
            addCriterion("log =", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogNotEqualTo(String value) {
            addCriterion("log <>", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogGreaterThan(String value) {
            addCriterion("log >", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogGreaterThanOrEqualTo(String value) {
            addCriterion("log >=", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogLessThan(String value) {
            addCriterion("log <", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogLessThanOrEqualTo(String value) {
            addCriterion("log <=", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogLike(String value) {
            addCriterion("log like", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogNotLike(String value) {
            addCriterion("log not like", value, "log");
            return (Criteria) this;
        }

        public Criteria andLogIn(List<String> values) {
            addCriterion("log in", values, "log");
            return (Criteria) this;
        }

        public Criteria andLogNotIn(List<String> values) {
            addCriterion("log not in", values, "log");
            return (Criteria) this;
        }

        public Criteria andLogBetween(String value1, String value2) {
            addCriterion("log between", value1, value2, "log");
            return (Criteria) this;
        }

        public Criteria andLogNotBetween(String value1, String value2) {
            addCriterion("log not between", value1, value2, "log");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldIsNull() {
            addCriterion("order_status_old is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldIsNotNull() {
            addCriterion("order_status_old is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldEqualTo(Integer value) {
            addCriterion("order_status_old =", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldNotEqualTo(Integer value) {
            addCriterion("order_status_old <>", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldGreaterThan(Integer value) {
            addCriterion("order_status_old >", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status_old >=", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldLessThan(Integer value) {
            addCriterion("order_status_old <", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldLessThanOrEqualTo(Integer value) {
            addCriterion("order_status_old <=", value, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldIn(List<Integer> values) {
            addCriterion("order_status_old in", values, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldNotIn(List<Integer> values) {
            addCriterion("order_status_old not in", values, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldBetween(Integer value1, Integer value2) {
            addCriterion("order_status_old between", value1, value2, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusOldNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status_old not between", value1, value2, "orderStatusOld");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewIsNull() {
            addCriterion("order_status_new is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewIsNotNull() {
            addCriterion("order_status_new is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewEqualTo(Integer value) {
            addCriterion("order_status_new =", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewNotEqualTo(Integer value) {
            addCriterion("order_status_new <>", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewGreaterThan(Integer value) {
            addCriterion("order_status_new >", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status_new >=", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewLessThan(Integer value) {
            addCriterion("order_status_new <", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewLessThanOrEqualTo(Integer value) {
            addCriterion("order_status_new <=", value, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewIn(List<Integer> values) {
            addCriterion("order_status_new in", values, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewNotIn(List<Integer> values) {
            addCriterion("order_status_new not in", values, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewBetween(Integer value1, Integer value2) {
            addCriterion("order_status_new between", value1, value2, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNewNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status_new not between", value1, value2, "orderStatusNew");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(BigDecimal value) {
            addCriterion("total_cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("total_cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(BigDecimal value) {
            addCriterion("total_cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(BigDecimal value) {
            addCriterion("total_cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<BigDecimal> values) {
            addCriterion("total_cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("total_cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIsNull() {
            addCriterion("extend_info is null");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIsNotNull() {
            addCriterion("extend_info is not null");
            return (Criteria) this;
        }

        public Criteria andExtendInfoEqualTo(String value) {
            addCriterion("extend_info =", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotEqualTo(String value) {
            addCriterion("extend_info <>", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoGreaterThan(String value) {
            addCriterion("extend_info >", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoGreaterThanOrEqualTo(String value) {
            addCriterion("extend_info >=", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLessThan(String value) {
            addCriterion("extend_info <", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLessThanOrEqualTo(String value) {
            addCriterion("extend_info <=", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoLike(String value) {
            addCriterion("extend_info like", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotLike(String value) {
            addCriterion("extend_info not like", value, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoIn(List<String> values) {
            addCriterion("extend_info in", values, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotIn(List<String> values) {
            addCriterion("extend_info not in", values, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoBetween(String value1, String value2) {
            addCriterion("extend_info between", value1, value2, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andExtendInfoNotBetween(String value1, String value2) {
            addCriterion("extend_info not between", value1, value2, "extendInfo");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformIsNull() {
            addCriterion("operate_platform is null");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformIsNotNull() {
            addCriterion("operate_platform is not null");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformEqualTo(Integer value) {
            addCriterion("operate_platform =", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformNotEqualTo(Integer value) {
            addCriterion("operate_platform <>", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformGreaterThan(Integer value) {
            addCriterion("operate_platform >", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_platform >=", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformLessThan(Integer value) {
            addCriterion("operate_platform <", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformLessThanOrEqualTo(Integer value) {
            addCriterion("operate_platform <=", value, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformIn(List<Integer> values) {
            addCriterion("operate_platform in", values, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformNotIn(List<Integer> values) {
            addCriterion("operate_platform not in", values, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformBetween(Integer value1, Integer value2) {
            addCriterion("operate_platform between", value1, value2, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperatePlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_platform not between", value1, value2, "operatePlatform");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNull() {
            addCriterion("operate_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIsNotNull() {
            addCriterion("operate_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdEqualTo(Integer value) {
            addCriterion("operate_user_id =", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotEqualTo(Integer value) {
            addCriterion("operate_user_id <>", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThan(Integer value) {
            addCriterion("operate_user_id >", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operate_user_id >=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThan(Integer value) {
            addCriterion("operate_user_id <", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("operate_user_id <=", value, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdIn(List<Integer> values) {
            addCriterion("operate_user_id in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotIn(List<Integer> values) {
            addCriterion("operate_user_id not in", values, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdBetween(Integer value1, Integer value2) {
            addCriterion("operate_user_id between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operate_user_id not between", value1, value2, "operateUserId");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameIsNull() {
            addCriterion("operate_use_name is null");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameIsNotNull() {
            addCriterion("operate_use_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameEqualTo(String value) {
            addCriterion("operate_use_name =", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameNotEqualTo(String value) {
            addCriterion("operate_use_name <>", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameGreaterThan(String value) {
            addCriterion("operate_use_name >", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameGreaterThanOrEqualTo(String value) {
            addCriterion("operate_use_name >=", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameLessThan(String value) {
            addCriterion("operate_use_name <", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameLessThanOrEqualTo(String value) {
            addCriterion("operate_use_name <=", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameLike(String value) {
            addCriterion("operate_use_name like", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameNotLike(String value) {
            addCriterion("operate_use_name not like", value, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameIn(List<String> values) {
            addCriterion("operate_use_name in", values, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameNotIn(List<String> values) {
            addCriterion("operate_use_name not in", values, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameBetween(String value1, String value2) {
            addCriterion("operate_use_name between", value1, value2, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateUseNameNotBetween(String value1, String value2) {
            addCriterion("operate_use_name not between", value1, value2, "operateUseName");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkIsNull() {
            addCriterion("operate_remark is null");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkIsNotNull() {
            addCriterion("operate_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkEqualTo(String value) {
            addCriterion("operate_remark =", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkNotEqualTo(String value) {
            addCriterion("operate_remark <>", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkGreaterThan(String value) {
            addCriterion("operate_remark >", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("operate_remark >=", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkLessThan(String value) {
            addCriterion("operate_remark <", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkLessThanOrEqualTo(String value) {
            addCriterion("operate_remark <=", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkLike(String value) {
            addCriterion("operate_remark like", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkNotLike(String value) {
            addCriterion("operate_remark not like", value, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkIn(List<String> values) {
            addCriterion("operate_remark in", values, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkNotIn(List<String> values) {
            addCriterion("operate_remark not in", values, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkBetween(String value1, String value2) {
            addCriterion("operate_remark between", value1, value2, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andOperateRemarkNotBetween(String value1, String value2) {
            addCriterion("operate_remark not between", value1, value2, "operateRemark");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }
    }

    /**
     *  * o_order_operate_log
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * o_order_operate_log null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}