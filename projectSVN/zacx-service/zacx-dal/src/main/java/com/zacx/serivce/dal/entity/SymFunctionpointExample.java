/*
*
* SymFunctionpointExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.ArrayList;
import java.util.List;

public class SymFunctionpointExample {
    /**
     * sym_functionpoint
     */
    protected String orderByClause;

    /**
     * sym_functionpoint
     */
    protected boolean distinct;

    /**
     * sym_functionpoint
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public SymFunctionpointExample() {
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
     * sym_functionpoint null
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

        public Criteria andFunctionpointidIsNull() {
            addCriterion("FunctionPointId is null");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidIsNotNull() {
            addCriterion("FunctionPointId is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidEqualTo(String value) {
            addCriterion("FunctionPointId =", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidNotEqualTo(String value) {
            addCriterion("FunctionPointId <>", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidGreaterThan(String value) {
            addCriterion("FunctionPointId >", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionPointId >=", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidLessThan(String value) {
            addCriterion("FunctionPointId <", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidLessThanOrEqualTo(String value) {
            addCriterion("FunctionPointId <=", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidLike(String value) {
            addCriterion("FunctionPointId like", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidNotLike(String value) {
            addCriterion("FunctionPointId not like", value, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidIn(List<String> values) {
            addCriterion("FunctionPointId in", values, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidNotIn(List<String> values) {
            addCriterion("FunctionPointId not in", values, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidBetween(String value1, String value2) {
            addCriterion("FunctionPointId between", value1, value2, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andFunctionpointidNotBetween(String value1, String value2) {
            addCriterion("FunctionPointId not between", value1, value2, "functionpointid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`Name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`Name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`Name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`Name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`Name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`Name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`Name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`Name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`Name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`Name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`Name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`Name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`Name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`Name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyIsNull() {
            addCriterion("FunctionKey is null");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyIsNotNull() {
            addCriterion("FunctionKey is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyEqualTo(String value) {
            addCriterion("FunctionKey =", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyNotEqualTo(String value) {
            addCriterion("FunctionKey <>", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyGreaterThan(String value) {
            addCriterion("FunctionKey >", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionKey >=", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyLessThan(String value) {
            addCriterion("FunctionKey <", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyLessThanOrEqualTo(String value) {
            addCriterion("FunctionKey <=", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyLike(String value) {
            addCriterion("FunctionKey like", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyNotLike(String value) {
            addCriterion("FunctionKey not like", value, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyIn(List<String> values) {
            addCriterion("FunctionKey in", values, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyNotIn(List<String> values) {
            addCriterion("FunctionKey not in", values, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyBetween(String value1, String value2) {
            addCriterion("FunctionKey between", value1, value2, "functionkey");
            return (Criteria) this;
        }

        public Criteria andFunctionkeyNotBetween(String value1, String value2) {
            addCriterion("FunctionKey not between", value1, value2, "functionkey");
            return (Criteria) this;
        }

        public Criteria andSitemapidIsNull() {
            addCriterion("SiteMapId is null");
            return (Criteria) this;
        }

        public Criteria andSitemapidIsNotNull() {
            addCriterion("SiteMapId is not null");
            return (Criteria) this;
        }

        public Criteria andSitemapidEqualTo(Integer value) {
            addCriterion("SiteMapId =", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidNotEqualTo(Integer value) {
            addCriterion("SiteMapId <>", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidGreaterThan(Integer value) {
            addCriterion("SiteMapId >", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteMapId >=", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidLessThan(Integer value) {
            addCriterion("SiteMapId <", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidLessThanOrEqualTo(Integer value) {
            addCriterion("SiteMapId <=", value, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidIn(List<Integer> values) {
            addCriterion("SiteMapId in", values, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidNotIn(List<Integer> values) {
            addCriterion("SiteMapId not in", values, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidBetween(Integer value1, Integer value2) {
            addCriterion("SiteMapId between", value1, value2, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSitemapidNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteMapId not between", value1, value2, "sitemapid");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("Sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("Sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("Sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("Sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("Sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("Sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("Sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("Sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("Sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("Sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("Sort not between", value1, value2, "sort");
            return (Criteria) this;
        }
    }

    /**
     *  * sym_functionpoint
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sym_functionpoint null
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