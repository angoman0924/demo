/*
*
* OOrder2InsuranceExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OOrder2InsuranceExample {
    /**
     * o_order2insurance
     */
    protected String orderByClause;

    /**
     * o_order2insurance
     */
    protected boolean distinct;

    /**
     * o_order2insurance
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OOrder2InsuranceExample() {
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
     * o_order2insurance null
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

        public Criteria andInsuranceIdIsNull() {
            addCriterion("insurance_id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("insurance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Integer value) {
            addCriterion("insurance_id =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Integer value) {
            addCriterion("insurance_id <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(Integer value) {
            addCriterion("insurance_id >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance_id >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Integer value) {
            addCriterion("insurance_id <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Integer value) {
            addCriterion("insurance_id <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Integer> values) {
            addCriterion("insurance_id in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Integer> values) {
            addCriterion("insurance_id not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Integer value1, Integer value2) {
            addCriterion("insurance_id between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance_id not between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("insurance_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("insurance_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("insurance_name =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("insurance_name <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("insurance_name >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_name >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("insurance_name <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_name <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("insurance_name like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("insurance_name not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("insurance_name in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("insurance_name not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("insurance_name between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("insurance_name not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumIsNull() {
            addCriterion("insurance_premium is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumIsNotNull() {
            addCriterion("insurance_premium is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumEqualTo(BigDecimal value) {
            addCriterion("insurance_premium =", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumNotEqualTo(BigDecimal value) {
            addCriterion("insurance_premium <>", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumGreaterThan(BigDecimal value) {
            addCriterion("insurance_premium >", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_premium >=", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumLessThan(BigDecimal value) {
            addCriterion("insurance_premium <", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_premium <=", value, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumIn(List<BigDecimal> values) {
            addCriterion("insurance_premium in", values, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumNotIn(List<BigDecimal> values) {
            addCriterion("insurance_premium not in", values, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_premium between", value1, value2, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andInsurancePremiumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_premium not between", value1, value2, "insurancePremium");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }
    }

    /**
     *  * o_order2insurance
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * o_order2insurance null
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