/*
*
* OEvaluateExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OEvaluateExample {
    /**
     * o_evaluate
     */
    protected String orderByClause;

    /**
     * o_evaluate
     */
    protected boolean distinct;

    /**
     * o_evaluate
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OEvaluateExample() {
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
     * o_evaluate null
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

        public Criteria andNickIsNull() {
            addCriterion("nick is null");
            return (Criteria) this;
        }

        public Criteria andNickIsNotNull() {
            addCriterion("nick is not null");
            return (Criteria) this;
        }

        public Criteria andNickEqualTo(String value) {
            addCriterion("nick =", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotEqualTo(String value) {
            addCriterion("nick <>", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThan(String value) {
            addCriterion("nick >", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickGreaterThanOrEqualTo(String value) {
            addCriterion("nick >=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThan(String value) {
            addCriterion("nick <", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLessThanOrEqualTo(String value) {
            addCriterion("nick <=", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickLike(String value) {
            addCriterion("nick like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotLike(String value) {
            addCriterion("nick not like", value, "nick");
            return (Criteria) this;
        }

        public Criteria andNickIn(List<String> values) {
            addCriterion("nick in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotIn(List<String> values) {
            addCriterion("nick not in", values, "nick");
            return (Criteria) this;
        }

        public Criteria andNickBetween(String value1, String value2) {
            addCriterion("nick between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andNickNotBetween(String value1, String value2) {
            addCriterion("nick not between", value1, value2, "nick");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andType1NameIsNull() {
            addCriterion("type1_name is null");
            return (Criteria) this;
        }

        public Criteria andType1NameIsNotNull() {
            addCriterion("type1_name is not null");
            return (Criteria) this;
        }

        public Criteria andType1NameEqualTo(String value) {
            addCriterion("type1_name =", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameNotEqualTo(String value) {
            addCriterion("type1_name <>", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameGreaterThan(String value) {
            addCriterion("type1_name >", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameGreaterThanOrEqualTo(String value) {
            addCriterion("type1_name >=", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameLessThan(String value) {
            addCriterion("type1_name <", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameLessThanOrEqualTo(String value) {
            addCriterion("type1_name <=", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameLike(String value) {
            addCriterion("type1_name like", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameNotLike(String value) {
            addCriterion("type1_name not like", value, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameIn(List<String> values) {
            addCriterion("type1_name in", values, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameNotIn(List<String> values) {
            addCriterion("type1_name not in", values, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameBetween(String value1, String value2) {
            addCriterion("type1_name between", value1, value2, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1NameNotBetween(String value1, String value2) {
            addCriterion("type1_name not between", value1, value2, "type1Name");
            return (Criteria) this;
        }

        public Criteria andType1ScoreIsNull() {
            addCriterion("type1_score is null");
            return (Criteria) this;
        }

        public Criteria andType1ScoreIsNotNull() {
            addCriterion("type1_score is not null");
            return (Criteria) this;
        }

        public Criteria andType1ScoreEqualTo(Integer value) {
            addCriterion("type1_score =", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreNotEqualTo(Integer value) {
            addCriterion("type1_score <>", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreGreaterThan(Integer value) {
            addCriterion("type1_score >", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("type1_score >=", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreLessThan(Integer value) {
            addCriterion("type1_score <", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("type1_score <=", value, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreIn(List<Integer> values) {
            addCriterion("type1_score in", values, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreNotIn(List<Integer> values) {
            addCriterion("type1_score not in", values, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreBetween(Integer value1, Integer value2) {
            addCriterion("type1_score between", value1, value2, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType1ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("type1_score not between", value1, value2, "type1Score");
            return (Criteria) this;
        }

        public Criteria andType2NameIsNull() {
            addCriterion("type2_name is null");
            return (Criteria) this;
        }

        public Criteria andType2NameIsNotNull() {
            addCriterion("type2_name is not null");
            return (Criteria) this;
        }

        public Criteria andType2NameEqualTo(String value) {
            addCriterion("type2_name =", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameNotEqualTo(String value) {
            addCriterion("type2_name <>", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameGreaterThan(String value) {
            addCriterion("type2_name >", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameGreaterThanOrEqualTo(String value) {
            addCriterion("type2_name >=", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameLessThan(String value) {
            addCriterion("type2_name <", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameLessThanOrEqualTo(String value) {
            addCriterion("type2_name <=", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameLike(String value) {
            addCriterion("type2_name like", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameNotLike(String value) {
            addCriterion("type2_name not like", value, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameIn(List<String> values) {
            addCriterion("type2_name in", values, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameNotIn(List<String> values) {
            addCriterion("type2_name not in", values, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameBetween(String value1, String value2) {
            addCriterion("type2_name between", value1, value2, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2NameNotBetween(String value1, String value2) {
            addCriterion("type2_name not between", value1, value2, "type2Name");
            return (Criteria) this;
        }

        public Criteria andType2ScoreIsNull() {
            addCriterion("type2_score is null");
            return (Criteria) this;
        }

        public Criteria andType2ScoreIsNotNull() {
            addCriterion("type2_score is not null");
            return (Criteria) this;
        }

        public Criteria andType2ScoreEqualTo(Integer value) {
            addCriterion("type2_score =", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreNotEqualTo(Integer value) {
            addCriterion("type2_score <>", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreGreaterThan(Integer value) {
            addCriterion("type2_score >", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("type2_score >=", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreLessThan(Integer value) {
            addCriterion("type2_score <", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("type2_score <=", value, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreIn(List<Integer> values) {
            addCriterion("type2_score in", values, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreNotIn(List<Integer> values) {
            addCriterion("type2_score not in", values, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreBetween(Integer value1, Integer value2) {
            addCriterion("type2_score between", value1, value2, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType2ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("type2_score not between", value1, value2, "type2Score");
            return (Criteria) this;
        }

        public Criteria andType3NameIsNull() {
            addCriterion("type3_name is null");
            return (Criteria) this;
        }

        public Criteria andType3NameIsNotNull() {
            addCriterion("type3_name is not null");
            return (Criteria) this;
        }

        public Criteria andType3NameEqualTo(String value) {
            addCriterion("type3_name =", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameNotEqualTo(String value) {
            addCriterion("type3_name <>", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameGreaterThan(String value) {
            addCriterion("type3_name >", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameGreaterThanOrEqualTo(String value) {
            addCriterion("type3_name >=", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameLessThan(String value) {
            addCriterion("type3_name <", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameLessThanOrEqualTo(String value) {
            addCriterion("type3_name <=", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameLike(String value) {
            addCriterion("type3_name like", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameNotLike(String value) {
            addCriterion("type3_name not like", value, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameIn(List<String> values) {
            addCriterion("type3_name in", values, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameNotIn(List<String> values) {
            addCriterion("type3_name not in", values, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameBetween(String value1, String value2) {
            addCriterion("type3_name between", value1, value2, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3NameNotBetween(String value1, String value2) {
            addCriterion("type3_name not between", value1, value2, "type3Name");
            return (Criteria) this;
        }

        public Criteria andType3ScoreIsNull() {
            addCriterion("type3_score is null");
            return (Criteria) this;
        }

        public Criteria andType3ScoreIsNotNull() {
            addCriterion("type3_score is not null");
            return (Criteria) this;
        }

        public Criteria andType3ScoreEqualTo(Integer value) {
            addCriterion("type3_score =", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreNotEqualTo(Integer value) {
            addCriterion("type3_score <>", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreGreaterThan(Integer value) {
            addCriterion("type3_score >", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("type3_score >=", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreLessThan(Integer value) {
            addCriterion("type3_score <", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreLessThanOrEqualTo(Integer value) {
            addCriterion("type3_score <=", value, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreIn(List<Integer> values) {
            addCriterion("type3_score in", values, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreNotIn(List<Integer> values) {
            addCriterion("type3_score not in", values, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreBetween(Integer value1, Integer value2) {
            addCriterion("type3_score between", value1, value2, "type3Score");
            return (Criteria) this;
        }

        public Criteria andType3ScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("type3_score not between", value1, value2, "type3Score");
            return (Criteria) this;
        }

        public Criteria andLabeLlistIsNull() {
            addCriterion("labe_llist is null");
            return (Criteria) this;
        }

        public Criteria andLabeLlistIsNotNull() {
            addCriterion("labe_llist is not null");
            return (Criteria) this;
        }

        public Criteria andLabeLlistEqualTo(String value) {
            addCriterion("labe_llist =", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistNotEqualTo(String value) {
            addCriterion("labe_llist <>", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistGreaterThan(String value) {
            addCriterion("labe_llist >", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistGreaterThanOrEqualTo(String value) {
            addCriterion("labe_llist >=", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistLessThan(String value) {
            addCriterion("labe_llist <", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistLessThanOrEqualTo(String value) {
            addCriterion("labe_llist <=", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistLike(String value) {
            addCriterion("labe_llist like", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistNotLike(String value) {
            addCriterion("labe_llist not like", value, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistIn(List<String> values) {
            addCriterion("labe_llist in", values, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistNotIn(List<String> values) {
            addCriterion("labe_llist not in", values, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistBetween(String value1, String value2) {
            addCriterion("labe_llist between", value1, value2, "labeLlist");
            return (Criteria) this;
        }

        public Criteria andLabeLlistNotBetween(String value1, String value2) {
            addCriterion("labe_llist not between", value1, value2, "labeLlist");
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
     *  * o_evaluate
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * o_evaluate null
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