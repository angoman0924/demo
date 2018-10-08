/*
*
* OOrderExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OOrderExample {
    /**
     * o_order
     */
    protected String orderByClause;

    /**
     * o_order
     */
    protected boolean distinct;

    /**
     * o_order
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OOrderExample() {
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
     * o_order null
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Integer value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Integer value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Integer value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Integer value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Integer> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Integer> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Integer value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Integer value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Integer value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Integer value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Integer value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Integer> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Integer> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Integer value1, Integer value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameIsNull() {
            addCriterion("site_start_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameIsNotNull() {
            addCriterion("site_start_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameEqualTo(String value) {
            addCriterion("site_start_name =", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameNotEqualTo(String value) {
            addCriterion("site_start_name <>", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameGreaterThan(String value) {
            addCriterion("site_start_name >", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_start_name >=", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameLessThan(String value) {
            addCriterion("site_start_name <", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameLessThanOrEqualTo(String value) {
            addCriterion("site_start_name <=", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameLike(String value) {
            addCriterion("site_start_name like", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameNotLike(String value) {
            addCriterion("site_start_name not like", value, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameIn(List<String> values) {
            addCriterion("site_start_name in", values, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameNotIn(List<String> values) {
            addCriterion("site_start_name not in", values, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameBetween(String value1, String value2) {
            addCriterion("site_start_name between", value1, value2, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteStartNameNotBetween(String value1, String value2) {
            addCriterion("site_start_name not between", value1, value2, "siteStartName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameIsNull() {
            addCriterion("site_end_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameIsNotNull() {
            addCriterion("site_end_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameEqualTo(String value) {
            addCriterion("site_end_name =", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameNotEqualTo(String value) {
            addCriterion("site_end_name <>", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameGreaterThan(String value) {
            addCriterion("site_end_name >", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_end_name >=", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameLessThan(String value) {
            addCriterion("site_end_name <", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameLessThanOrEqualTo(String value) {
            addCriterion("site_end_name <=", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameLike(String value) {
            addCriterion("site_end_name like", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameNotLike(String value) {
            addCriterion("site_end_name not like", value, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameIn(List<String> values) {
            addCriterion("site_end_name in", values, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameNotIn(List<String> values) {
            addCriterion("site_end_name not in", values, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameBetween(String value1, String value2) {
            addCriterion("site_end_name between", value1, value2, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSiteEndNameNotBetween(String value1, String value2) {
            addCriterion("site_end_name not between", value1, value2, "siteEndName");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdIsNull() {
            addCriterion("scheduling_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdIsNotNull() {
            addCriterion("scheduling_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdEqualTo(Integer value) {
            addCriterion("scheduling_id =", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotEqualTo(Integer value) {
            addCriterion("scheduling_id <>", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdGreaterThan(Integer value) {
            addCriterion("scheduling_id >", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduling_id >=", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdLessThan(Integer value) {
            addCriterion("scheduling_id <", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdLessThanOrEqualTo(Integer value) {
            addCriterion("scheduling_id <=", value, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdIn(List<Integer> values) {
            addCriterion("scheduling_id in", values, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotIn(List<Integer> values) {
            addCriterion("scheduling_id not in", values, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_id between", value1, value2, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduling_id not between", value1, value2, "schedulingId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(Integer value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(Integer value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(Integer value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(Integer value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<Integer> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<Integer> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(Integer value1, Integer value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIsNull() {
            addCriterion("ticket_number is null");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIsNotNull() {
            addCriterion("ticket_number is not null");
            return (Criteria) this;
        }

        public Criteria andTicketNumberEqualTo(Integer value) {
            addCriterion("ticket_number =", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotEqualTo(Integer value) {
            addCriterion("ticket_number <>", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberGreaterThan(Integer value) {
            addCriterion("ticket_number >", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticket_number >=", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberLessThan(Integer value) {
            addCriterion("ticket_number <", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberLessThanOrEqualTo(Integer value) {
            addCriterion("ticket_number <=", value, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberIn(List<Integer> values) {
            addCriterion("ticket_number in", values, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotIn(List<Integer> values) {
            addCriterion("ticket_number not in", values, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberBetween(Integer value1, Integer value2) {
            addCriterion("ticket_number between", value1, value2, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ticket_number not between", value1, value2, "ticketNumber");
            return (Criteria) this;
        }

        public Criteria andTicketCostIsNull() {
            addCriterion("ticket_cost is null");
            return (Criteria) this;
        }

        public Criteria andTicketCostIsNotNull() {
            addCriterion("ticket_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTicketCostEqualTo(BigDecimal value) {
            addCriterion("ticket_cost =", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotEqualTo(BigDecimal value) {
            addCriterion("ticket_cost <>", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostGreaterThan(BigDecimal value) {
            addCriterion("ticket_cost >", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_cost >=", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostLessThan(BigDecimal value) {
            addCriterion("ticket_cost <", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_cost <=", value, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostIn(List<BigDecimal> values) {
            addCriterion("ticket_cost in", values, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotIn(List<BigDecimal> values) {
            addCriterion("ticket_cost not in", values, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_cost between", value1, value2, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andTicketCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_cost not between", value1, value2, "ticketCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("insurance_cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("insurance_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(BigDecimal value) {
            addCriterion("insurance_cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(BigDecimal value) {
            addCriterion("insurance_cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(BigDecimal value) {
            addCriterion("insurance_cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(BigDecimal value) {
            addCriterion("insurance_cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<BigDecimal> values) {
            addCriterion("insurance_cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<BigDecimal> values) {
            addCriterion("insurance_cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostIsNull() {
            addCriterion("coupon_cost is null");
            return (Criteria) this;
        }

        public Criteria andCouponCostIsNotNull() {
            addCriterion("coupon_cost is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCostEqualTo(BigDecimal value) {
            addCriterion("coupon_cost =", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostNotEqualTo(BigDecimal value) {
            addCriterion("coupon_cost <>", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostGreaterThan(BigDecimal value) {
            addCriterion("coupon_cost >", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_cost >=", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostLessThan(BigDecimal value) {
            addCriterion("coupon_cost <", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_cost <=", value, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostIn(List<BigDecimal> values) {
            addCriterion("coupon_cost in", values, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostNotIn(List<BigDecimal> values) {
            addCriterion("coupon_cost not in", values, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_cost between", value1, value2, "couponCost");
            return (Criteria) this;
        }

        public Criteria andCouponCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_cost not between", value1, value2, "couponCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostIsNull() {
            addCriterion("take_cost is null");
            return (Criteria) this;
        }

        public Criteria andTakeCostIsNotNull() {
            addCriterion("take_cost is not null");
            return (Criteria) this;
        }

        public Criteria andTakeCostEqualTo(BigDecimal value) {
            addCriterion("take_cost =", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostNotEqualTo(BigDecimal value) {
            addCriterion("take_cost <>", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostGreaterThan(BigDecimal value) {
            addCriterion("take_cost >", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("take_cost >=", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostLessThan(BigDecimal value) {
            addCriterion("take_cost <", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("take_cost <=", value, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostIn(List<BigDecimal> values) {
            addCriterion("take_cost in", values, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostNotIn(List<BigDecimal> values) {
            addCriterion("take_cost not in", values, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_cost between", value1, value2, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("take_cost not between", value1, value2, "takeCost");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateIsNull() {
            addCriterion("take_coordinate is null");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateIsNotNull() {
            addCriterion("take_coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateEqualTo(String value) {
            addCriterion("take_coordinate =", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateNotEqualTo(String value) {
            addCriterion("take_coordinate <>", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateGreaterThan(String value) {
            addCriterion("take_coordinate >", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("take_coordinate >=", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateLessThan(String value) {
            addCriterion("take_coordinate <", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateLessThanOrEqualTo(String value) {
            addCriterion("take_coordinate <=", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateLike(String value) {
            addCriterion("take_coordinate like", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateNotLike(String value) {
            addCriterion("take_coordinate not like", value, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateIn(List<String> values) {
            addCriterion("take_coordinate in", values, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateNotIn(List<String> values) {
            addCriterion("take_coordinate not in", values, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateBetween(String value1, String value2) {
            addCriterion("take_coordinate between", value1, value2, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeCoordinateNotBetween(String value1, String value2) {
            addCriterion("take_coordinate not between", value1, value2, "takeCoordinate");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIsNull() {
            addCriterion("take_address is null");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIsNotNull() {
            addCriterion("take_address is not null");
            return (Criteria) this;
        }

        public Criteria andTakeAddressEqualTo(String value) {
            addCriterion("take_address =", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotEqualTo(String value) {
            addCriterion("take_address <>", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressGreaterThan(String value) {
            addCriterion("take_address >", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("take_address >=", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLessThan(String value) {
            addCriterion("take_address <", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLessThanOrEqualTo(String value) {
            addCriterion("take_address <=", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLike(String value) {
            addCriterion("take_address like", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotLike(String value) {
            addCriterion("take_address not like", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIn(List<String> values) {
            addCriterion("take_address in", values, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotIn(List<String> values) {
            addCriterion("take_address not in", values, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressBetween(String value1, String value2) {
            addCriterion("take_address between", value1, value2, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotBetween(String value1, String value2) {
            addCriterion("take_address not between", value1, value2, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andGiveCostIsNull() {
            addCriterion("give_cost is null");
            return (Criteria) this;
        }

        public Criteria andGiveCostIsNotNull() {
            addCriterion("give_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGiveCostEqualTo(BigDecimal value) {
            addCriterion("give_cost =", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostNotEqualTo(BigDecimal value) {
            addCriterion("give_cost <>", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostGreaterThan(BigDecimal value) {
            addCriterion("give_cost >", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("give_cost >=", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostLessThan(BigDecimal value) {
            addCriterion("give_cost <", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("give_cost <=", value, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostIn(List<BigDecimal> values) {
            addCriterion("give_cost in", values, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostNotIn(List<BigDecimal> values) {
            addCriterion("give_cost not in", values, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_cost between", value1, value2, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_cost not between", value1, value2, "giveCost");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateIsNull() {
            addCriterion("give_coordinate is null");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateIsNotNull() {
            addCriterion("give_coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateEqualTo(String value) {
            addCriterion("give_coordinate =", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateNotEqualTo(String value) {
            addCriterion("give_coordinate <>", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateGreaterThan(String value) {
            addCriterion("give_coordinate >", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("give_coordinate >=", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateLessThan(String value) {
            addCriterion("give_coordinate <", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateLessThanOrEqualTo(String value) {
            addCriterion("give_coordinate <=", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateLike(String value) {
            addCriterion("give_coordinate like", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateNotLike(String value) {
            addCriterion("give_coordinate not like", value, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateIn(List<String> values) {
            addCriterion("give_coordinate in", values, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateNotIn(List<String> values) {
            addCriterion("give_coordinate not in", values, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateBetween(String value1, String value2) {
            addCriterion("give_coordinate between", value1, value2, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveCoordinateNotBetween(String value1, String value2) {
            addCriterion("give_coordinate not between", value1, value2, "giveCoordinate");
            return (Criteria) this;
        }

        public Criteria andGiveAddressIsNull() {
            addCriterion("give_address is null");
            return (Criteria) this;
        }

        public Criteria andGiveAddressIsNotNull() {
            addCriterion("give_address is not null");
            return (Criteria) this;
        }

        public Criteria andGiveAddressEqualTo(String value) {
            addCriterion("give_address =", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressNotEqualTo(String value) {
            addCriterion("give_address <>", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressGreaterThan(String value) {
            addCriterion("give_address >", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("give_address >=", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressLessThan(String value) {
            addCriterion("give_address <", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressLessThanOrEqualTo(String value) {
            addCriterion("give_address <=", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressLike(String value) {
            addCriterion("give_address like", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressNotLike(String value) {
            addCriterion("give_address not like", value, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressIn(List<String> values) {
            addCriterion("give_address in", values, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressNotIn(List<String> values) {
            addCriterion("give_address not in", values, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressBetween(String value1, String value2) {
            addCriterion("give_address between", value1, value2, "giveAddress");
            return (Criteria) this;
        }

        public Criteria andGiveAddressNotBetween(String value1, String value2) {
            addCriterion("give_address not between", value1, value2, "giveAddress");
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

        public Criteria andUnpaidCostIsNull() {
            addCriterion("unpaid_cost is null");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostIsNotNull() {
            addCriterion("unpaid_cost is not null");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostEqualTo(BigDecimal value) {
            addCriterion("unpaid_cost =", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostNotEqualTo(BigDecimal value) {
            addCriterion("unpaid_cost <>", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostGreaterThan(BigDecimal value) {
            addCriterion("unpaid_cost >", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unpaid_cost >=", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostLessThan(BigDecimal value) {
            addCriterion("unpaid_cost <", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unpaid_cost <=", value, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostIn(List<BigDecimal> values) {
            addCriterion("unpaid_cost in", values, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostNotIn(List<BigDecimal> values) {
            addCriterion("unpaid_cost not in", values, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpaid_cost between", value1, value2, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andUnpaidCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unpaid_cost not between", value1, value2, "unpaidCost");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andTravelTimeIsNull() {
            addCriterion("travel_time is null");
            return (Criteria) this;
        }

        public Criteria andTravelTimeIsNotNull() {
            addCriterion("travel_time is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTimeEqualTo(Integer value) {
            addCriterion("travel_time =", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeNotEqualTo(Integer value) {
            addCriterion("travel_time <>", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeGreaterThan(Integer value) {
            addCriterion("travel_time >", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_time >=", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeLessThan(Integer value) {
            addCriterion("travel_time <", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("travel_time <=", value, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeIn(List<Integer> values) {
            addCriterion("travel_time in", values, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeNotIn(List<Integer> values) {
            addCriterion("travel_time not in", values, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeBetween(Integer value1, Integer value2) {
            addCriterion("travel_time between", value1, value2, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_time not between", value1, value2, "travelTime");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceIsNull() {
            addCriterion("travel_distance is null");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceIsNotNull() {
            addCriterion("travel_distance is not null");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceEqualTo(Long value) {
            addCriterion("travel_distance =", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceNotEqualTo(Long value) {
            addCriterion("travel_distance <>", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceGreaterThan(Long value) {
            addCriterion("travel_distance >", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceGreaterThanOrEqualTo(Long value) {
            addCriterion("travel_distance >=", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceLessThan(Long value) {
            addCriterion("travel_distance <", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceLessThanOrEqualTo(Long value) {
            addCriterion("travel_distance <=", value, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceIn(List<Long> values) {
            addCriterion("travel_distance in", values, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceNotIn(List<Long> values) {
            addCriterion("travel_distance not in", values, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceBetween(Long value1, Long value2) {
            addCriterion("travel_distance between", value1, value2, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andTravelDistanceNotBetween(Long value1, Long value2) {
            addCriterion("travel_distance not between", value1, value2, "travelDistance");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRelayTypeIsNull() {
            addCriterion("relay_type is null");
            return (Criteria) this;
        }

        public Criteria andRelayTypeIsNotNull() {
            addCriterion("relay_type is not null");
            return (Criteria) this;
        }

        public Criteria andRelayTypeEqualTo(Integer value) {
            addCriterion("relay_type =", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeNotEqualTo(Integer value) {
            addCriterion("relay_type <>", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeGreaterThan(Integer value) {
            addCriterion("relay_type >", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relay_type >=", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeLessThan(Integer value) {
            addCriterion("relay_type <", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("relay_type <=", value, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeIn(List<Integer> values) {
            addCriterion("relay_type in", values, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeNotIn(List<Integer> values) {
            addCriterion("relay_type not in", values, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeBetween(Integer value1, Integer value2) {
            addCriterion("relay_type between", value1, value2, "relayType");
            return (Criteria) this;
        }

        public Criteria andRelayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("relay_type not between", value1, value2, "relayType");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNull() {
            addCriterion("is_self is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfIsNotNull() {
            addCriterion("is_self is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfEqualTo(Boolean value) {
            addCriterion("is_self =", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotEqualTo(Boolean value) {
            addCriterion("is_self <>", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThan(Boolean value) {
            addCriterion("is_self >", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_self >=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThan(Boolean value) {
            addCriterion("is_self <", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfLessThanOrEqualTo(Boolean value) {
            addCriterion("is_self <=", value, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfIn(List<Boolean> values) {
            addCriterion("is_self in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotIn(List<Boolean> values) {
            addCriterion("is_self not in", values, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfBetween(Boolean value1, Boolean value2) {
            addCriterion("is_self between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsSelfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_self not between", value1, value2, "isSelf");
            return (Criteria) this;
        }

        public Criteria andIsChangedIsNull() {
            addCriterion("is_changed is null");
            return (Criteria) this;
        }

        public Criteria andIsChangedIsNotNull() {
            addCriterion("is_changed is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangedEqualTo(Boolean value) {
            addCriterion("is_changed =", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotEqualTo(Boolean value) {
            addCriterion("is_changed <>", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedGreaterThan(Boolean value) {
            addCriterion("is_changed >", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_changed >=", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedLessThan(Boolean value) {
            addCriterion("is_changed <", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_changed <=", value, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedIn(List<Boolean> values) {
            addCriterion("is_changed in", values, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotIn(List<Boolean> values) {
            addCriterion("is_changed not in", values, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_changed between", value1, value2, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsChangedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_changed not between", value1, value2, "isChanged");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedIsNull() {
            addCriterion("is_evaluated is null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedIsNotNull() {
            addCriterion("is_evaluated is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedEqualTo(Boolean value) {
            addCriterion("is_evaluated =", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedNotEqualTo(Boolean value) {
            addCriterion("is_evaluated <>", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedGreaterThan(Boolean value) {
            addCriterion("is_evaluated >", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_evaluated >=", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedLessThan(Boolean value) {
            addCriterion("is_evaluated <", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_evaluated <=", value, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedIn(List<Boolean> values) {
            addCriterion("is_evaluated in", values, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedNotIn(List<Boolean> values) {
            addCriterion("is_evaluated not in", values, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_evaluated between", value1, value2, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andIsEvaluatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_evaluated not between", value1, value2, "isEvaluated");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNull() {
            addCriterion("car_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("car_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("car_type_id =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("car_type_id <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("car_type_id >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type_id >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("car_type_id <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_type_id <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("car_type_id in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("car_type_id not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdIsNull() {
            addCriterion("chartered_car_model_id is null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdIsNotNull() {
            addCriterion("chartered_car_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdEqualTo(Integer value) {
            addCriterion("chartered_car_model_id =", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdNotEqualTo(Integer value) {
            addCriterion("chartered_car_model_id <>", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdGreaterThan(Integer value) {
            addCriterion("chartered_car_model_id >", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chartered_car_model_id >=", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdLessThan(Integer value) {
            addCriterion("chartered_car_model_id <", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("chartered_car_model_id <=", value, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdIn(List<Integer> values) {
            addCriterion("chartered_car_model_id in", values, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdNotIn(List<Integer> values) {
            addCriterion("chartered_car_model_id not in", values, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdBetween(Integer value1, Integer value2) {
            addCriterion("chartered_car_model_id between", value1, value2, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chartered_car_model_id not between", value1, value2, "charteredCarModelId");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandIsNull() {
            addCriterion("chartered_car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandIsNotNull() {
            addCriterion("chartered_car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandEqualTo(Integer value) {
            addCriterion("chartered_car_brand =", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandNotEqualTo(Integer value) {
            addCriterion("chartered_car_brand <>", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandGreaterThan(Integer value) {
            addCriterion("chartered_car_brand >", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("chartered_car_brand >=", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandLessThan(Integer value) {
            addCriterion("chartered_car_brand <", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandLessThanOrEqualTo(Integer value) {
            addCriterion("chartered_car_brand <=", value, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandIn(List<Integer> values) {
            addCriterion("chartered_car_brand in", values, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandNotIn(List<Integer> values) {
            addCriterion("chartered_car_brand not in", values, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandBetween(Integer value1, Integer value2) {
            addCriterion("chartered_car_brand between", value1, value2, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarBrandNotBetween(Integer value1, Integer value2) {
            addCriterion("chartered_car_brand not between", value1, value2, "charteredCarBrand");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIsNull() {
            addCriterion("chartered_car_model is null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIsNotNull() {
            addCriterion("chartered_car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelEqualTo(String value) {
            addCriterion("chartered_car_model =", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelNotEqualTo(String value) {
            addCriterion("chartered_car_model <>", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelGreaterThan(String value) {
            addCriterion("chartered_car_model >", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("chartered_car_model >=", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelLessThan(String value) {
            addCriterion("chartered_car_model <", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelLessThanOrEqualTo(String value) {
            addCriterion("chartered_car_model <=", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelLike(String value) {
            addCriterion("chartered_car_model like", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelNotLike(String value) {
            addCriterion("chartered_car_model not like", value, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelIn(List<String> values) {
            addCriterion("chartered_car_model in", values, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelNotIn(List<String> values) {
            addCriterion("chartered_car_model not in", values, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelBetween(String value1, String value2) {
            addCriterion("chartered_car_model between", value1, value2, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andCharteredCarModelNotBetween(String value1, String value2) {
            addCriterion("chartered_car_model not between", value1, value2, "charteredCarModel");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Integer value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Integer value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Integer value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Integer value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Integer> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Integer> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Integer value1, Integer value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeIsNull() {
            addCriterion("other_platform_plan_code is null");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeIsNotNull() {
            addCriterion("other_platform_plan_code is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeEqualTo(String value) {
            addCriterion("other_platform_plan_code =", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeNotEqualTo(String value) {
            addCriterion("other_platform_plan_code <>", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeGreaterThan(String value) {
            addCriterion("other_platform_plan_code >", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeGreaterThanOrEqualTo(String value) {
            addCriterion("other_platform_plan_code >=", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeLessThan(String value) {
            addCriterion("other_platform_plan_code <", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeLessThanOrEqualTo(String value) {
            addCriterion("other_platform_plan_code <=", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeLike(String value) {
            addCriterion("other_platform_plan_code like", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeNotLike(String value) {
            addCriterion("other_platform_plan_code not like", value, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeIn(List<String> values) {
            addCriterion("other_platform_plan_code in", values, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeNotIn(List<String> values) {
            addCriterion("other_platform_plan_code not in", values, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeBetween(String value1, String value2) {
            addCriterion("other_platform_plan_code between", value1, value2, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformPlanCodeNotBetween(String value1, String value2) {
            addCriterion("other_platform_plan_code not between", value1, value2, "otherPlatformPlanCode");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdIsNull() {
            addCriterion("other_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdIsNotNull() {
            addCriterion("other_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdEqualTo(Integer value) {
            addCriterion("other_platform_id =", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdNotEqualTo(Integer value) {
            addCriterion("other_platform_id <>", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdGreaterThan(Integer value) {
            addCriterion("other_platform_id >", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_platform_id >=", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdLessThan(Integer value) {
            addCriterion("other_platform_id <", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdLessThanOrEqualTo(Integer value) {
            addCriterion("other_platform_id <=", value, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdIn(List<Integer> values) {
            addCriterion("other_platform_id in", values, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdNotIn(List<Integer> values) {
            addCriterion("other_platform_id not in", values, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdBetween(Integer value1, Integer value2) {
            addCriterion("other_platform_id between", value1, value2, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andOtherPlatformIdNotBetween(Integer value1, Integer value2) {
            addCriterion("other_platform_id not between", value1, value2, "otherPlatformId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("is_invoice is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("is_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(Integer value) {
            addCriterion("is_invoice =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(Integer value) {
            addCriterion("is_invoice <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(Integer value) {
            addCriterion("is_invoice >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_invoice >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(Integer value) {
            addCriterion("is_invoice <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("is_invoice <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<Integer> values) {
            addCriterion("is_invoice in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<Integer> values) {
            addCriterion("is_invoice not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("is_invoice not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherIsNull() {
            addCriterion("tax_voucher is null");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherIsNotNull() {
            addCriterion("tax_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherEqualTo(String value) {
            addCriterion("tax_voucher =", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherNotEqualTo(String value) {
            addCriterion("tax_voucher <>", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherGreaterThan(String value) {
            addCriterion("tax_voucher >", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherGreaterThanOrEqualTo(String value) {
            addCriterion("tax_voucher >=", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherLessThan(String value) {
            addCriterion("tax_voucher <", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherLessThanOrEqualTo(String value) {
            addCriterion("tax_voucher <=", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherLike(String value) {
            addCriterion("tax_voucher like", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherNotLike(String value) {
            addCriterion("tax_voucher not like", value, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherIn(List<String> values) {
            addCriterion("tax_voucher in", values, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherNotIn(List<String> values) {
            addCriterion("tax_voucher not in", values, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherBetween(String value1, String value2) {
            addCriterion("tax_voucher between", value1, value2, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxVoucherNotBetween(String value1, String value2) {
            addCriterion("tax_voucher not between", value1, value2, "taxVoucher");
            return (Criteria) this;
        }

        public Criteria andTaxTimeIsNull() {
            addCriterion("tax_time is null");
            return (Criteria) this;
        }

        public Criteria andTaxTimeIsNotNull() {
            addCriterion("tax_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTimeEqualTo(Date value) {
            addCriterion("tax_time =", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeNotEqualTo(Date value) {
            addCriterion("tax_time <>", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeGreaterThan(Date value) {
            addCriterion("tax_time >", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tax_time >=", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeLessThan(Date value) {
            addCriterion("tax_time <", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeLessThanOrEqualTo(Date value) {
            addCriterion("tax_time <=", value, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeIn(List<Date> values) {
            addCriterion("tax_time in", values, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeNotIn(List<Date> values) {
            addCriterion("tax_time not in", values, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeBetween(Date value1, Date value2) {
            addCriterion("tax_time between", value1, value2, "taxTime");
            return (Criteria) this;
        }

        public Criteria andTaxTimeNotBetween(Date value1, Date value2) {
            addCriterion("tax_time not between", value1, value2, "taxTime");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Integer value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Integer value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Integer value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Integer value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Integer> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Integer> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
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

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andModifyAtIsNull() {
            addCriterion("modify_at is null");
            return (Criteria) this;
        }

        public Criteria andModifyAtIsNotNull() {
            addCriterion("modify_at is not null");
            return (Criteria) this;
        }

        public Criteria andModifyAtEqualTo(Date value) {
            addCriterion("modify_at =", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtNotEqualTo(Date value) {
            addCriterion("modify_at <>", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtGreaterThan(Date value) {
            addCriterion("modify_at >", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_at >=", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtLessThan(Date value) {
            addCriterion("modify_at <", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtLessThanOrEqualTo(Date value) {
            addCriterion("modify_at <=", value, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtIn(List<Date> values) {
            addCriterion("modify_at in", values, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtNotIn(List<Date> values) {
            addCriterion("modify_at not in", values, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtBetween(Date value1, Date value2) {
            addCriterion("modify_at between", value1, value2, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyAtNotBetween(Date value1, Date value2) {
            addCriterion("modify_at not between", value1, value2, "modifyAt");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("modify_by is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("modify_by is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(String value) {
            addCriterion("modify_by =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(String value) {
            addCriterion("modify_by <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(String value) {
            addCriterion("modify_by >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(String value) {
            addCriterion("modify_by >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(String value) {
            addCriterion("modify_by <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(String value) {
            addCriterion("modify_by <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLike(String value) {
            addCriterion("modify_by like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotLike(String value) {
            addCriterion("modify_by not like", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<String> values) {
            addCriterion("modify_by in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<String> values) {
            addCriterion("modify_by not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(String value1, String value2) {
            addCriterion("modify_by between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(String value1, String value2) {
            addCriterion("modify_by not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }
    }

    /**
     *  * o_order
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * o_order null
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