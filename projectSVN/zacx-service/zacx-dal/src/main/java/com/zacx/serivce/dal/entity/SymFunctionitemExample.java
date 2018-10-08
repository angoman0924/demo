/*
*
* SymFunctionitemExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.ArrayList;
import java.util.List;

public class SymFunctionitemExample {
    /**
     * sym_functionitem
     */
    protected String orderByClause;

    /**
     * sym_functionitem
     */
    protected boolean distinct;

    /**
     * sym_functionitem
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public SymFunctionitemExample() {
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
     * sym_functionitem null
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

        public Criteria andFunctionitemidIsNull() {
            addCriterion("FunctionItemId is null");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidIsNotNull() {
            addCriterion("FunctionItemId is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidEqualTo(String value) {
            addCriterion("FunctionItemId =", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidNotEqualTo(String value) {
            addCriterion("FunctionItemId <>", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidGreaterThan(String value) {
            addCriterion("FunctionItemId >", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionItemId >=", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidLessThan(String value) {
            addCriterion("FunctionItemId <", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidLessThanOrEqualTo(String value) {
            addCriterion("FunctionItemId <=", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidLike(String value) {
            addCriterion("FunctionItemId like", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidNotLike(String value) {
            addCriterion("FunctionItemId not like", value, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidIn(List<String> values) {
            addCriterion("FunctionItemId in", values, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidNotIn(List<String> values) {
            addCriterion("FunctionItemId not in", values, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidBetween(String value1, String value2) {
            addCriterion("FunctionItemId between", value1, value2, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionitemidNotBetween(String value1, String value2) {
            addCriterion("FunctionItemId not between", value1, value2, "functionitemid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNull() {
            addCriterion("FunctionId is null");
            return (Criteria) this;
        }

        public Criteria andFunctionidIsNotNull() {
            addCriterion("FunctionId is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionidEqualTo(String value) {
            addCriterion("FunctionId =", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotEqualTo(String value) {
            addCriterion("FunctionId <>", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThan(String value) {
            addCriterion("FunctionId >", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionId >=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThan(String value) {
            addCriterion("FunctionId <", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLessThanOrEqualTo(String value) {
            addCriterion("FunctionId <=", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidLike(String value) {
            addCriterion("FunctionId like", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotLike(String value) {
            addCriterion("FunctionId not like", value, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidIn(List<String> values) {
            addCriterion("FunctionId in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotIn(List<String> values) {
            addCriterion("FunctionId not in", values, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidBetween(String value1, String value2) {
            addCriterion("FunctionId between", value1, value2, "functionid");
            return (Criteria) this;
        }

        public Criteria andFunctionidNotBetween(String value1, String value2) {
            addCriterion("FunctionId not between", value1, value2, "functionid");
            return (Criteria) this;
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
    }

    /**
     *  * sym_functionitem
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sym_functionitem null
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