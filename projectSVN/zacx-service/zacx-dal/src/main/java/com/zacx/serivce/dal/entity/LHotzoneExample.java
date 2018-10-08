/*
*
* LHotzoneExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LHotzoneExample {
    /**
     * l_hotzone
     */
    protected String orderByClause;

    /**
     * l_hotzone
     */
    protected boolean distinct;

    /**
     * l_hotzone
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public LHotzoneExample() {
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
     * l_hotzone null
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

        public Criteria andSiteIdIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("site_id =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("site_id >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("site_id <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("site_id in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andRadiusOneIsNull() {
            addCriterion("radius_one is null");
            return (Criteria) this;
        }

        public Criteria andRadiusOneIsNotNull() {
            addCriterion("radius_one is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusOneEqualTo(Integer value) {
            addCriterion("radius_one =", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneNotEqualTo(Integer value) {
            addCriterion("radius_one <>", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneGreaterThan(Integer value) {
            addCriterion("radius_one >", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("radius_one >=", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneLessThan(Integer value) {
            addCriterion("radius_one <", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneLessThanOrEqualTo(Integer value) {
            addCriterion("radius_one <=", value, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneIn(List<Integer> values) {
            addCriterion("radius_one in", values, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneNotIn(List<Integer> values) {
            addCriterion("radius_one not in", values, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneBetween(Integer value1, Integer value2) {
            addCriterion("radius_one between", value1, value2, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andRadiusOneNotBetween(Integer value1, Integer value2) {
            addCriterion("radius_one not between", value1, value2, "radiusOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneIsNull() {
            addCriterion("price_one is null");
            return (Criteria) this;
        }

        public Criteria andPriceOneIsNotNull() {
            addCriterion("price_one is not null");
            return (Criteria) this;
        }

        public Criteria andPriceOneEqualTo(Long value) {
            addCriterion("price_one =", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneNotEqualTo(Long value) {
            addCriterion("price_one <>", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneGreaterThan(Long value) {
            addCriterion("price_one >", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneGreaterThanOrEqualTo(Long value) {
            addCriterion("price_one >=", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneLessThan(Long value) {
            addCriterion("price_one <", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneLessThanOrEqualTo(Long value) {
            addCriterion("price_one <=", value, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneIn(List<Long> values) {
            addCriterion("price_one in", values, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneNotIn(List<Long> values) {
            addCriterion("price_one not in", values, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneBetween(Long value1, Long value2) {
            addCriterion("price_one between", value1, value2, "priceOne");
            return (Criteria) this;
        }

        public Criteria andPriceOneNotBetween(Long value1, Long value2) {
            addCriterion("price_one not between", value1, value2, "priceOne");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoIsNull() {
            addCriterion("radius_two is null");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoIsNotNull() {
            addCriterion("radius_two is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoEqualTo(Integer value) {
            addCriterion("radius_two =", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoNotEqualTo(Integer value) {
            addCriterion("radius_two <>", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoGreaterThan(Integer value) {
            addCriterion("radius_two >", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("radius_two >=", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoLessThan(Integer value) {
            addCriterion("radius_two <", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoLessThanOrEqualTo(Integer value) {
            addCriterion("radius_two <=", value, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoIn(List<Integer> values) {
            addCriterion("radius_two in", values, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoNotIn(List<Integer> values) {
            addCriterion("radius_two not in", values, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoBetween(Integer value1, Integer value2) {
            addCriterion("radius_two between", value1, value2, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("radius_two not between", value1, value2, "radiusTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoIsNull() {
            addCriterion("price_two is null");
            return (Criteria) this;
        }

        public Criteria andPriceTwoIsNotNull() {
            addCriterion("price_two is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTwoEqualTo(Long value) {
            addCriterion("price_two =", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoNotEqualTo(Long value) {
            addCriterion("price_two <>", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoGreaterThan(Long value) {
            addCriterion("price_two >", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoGreaterThanOrEqualTo(Long value) {
            addCriterion("price_two >=", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoLessThan(Long value) {
            addCriterion("price_two <", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoLessThanOrEqualTo(Long value) {
            addCriterion("price_two <=", value, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoIn(List<Long> values) {
            addCriterion("price_two in", values, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoNotIn(List<Long> values) {
            addCriterion("price_two not in", values, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoBetween(Long value1, Long value2) {
            addCriterion("price_two between", value1, value2, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andPriceTwoNotBetween(Long value1, Long value2) {
            addCriterion("price_two not between", value1, value2, "priceTwo");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeIsNull() {
            addCriterion("radius_three is null");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeIsNotNull() {
            addCriterion("radius_three is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeEqualTo(Integer value) {
            addCriterion("radius_three =", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeNotEqualTo(Integer value) {
            addCriterion("radius_three <>", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeGreaterThan(Integer value) {
            addCriterion("radius_three >", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("radius_three >=", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeLessThan(Integer value) {
            addCriterion("radius_three <", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeLessThanOrEqualTo(Integer value) {
            addCriterion("radius_three <=", value, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeIn(List<Integer> values) {
            addCriterion("radius_three in", values, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeNotIn(List<Integer> values) {
            addCriterion("radius_three not in", values, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeBetween(Integer value1, Integer value2) {
            addCriterion("radius_three between", value1, value2, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andRadiusThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("radius_three not between", value1, value2, "radiusThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeIsNull() {
            addCriterion("price_three is null");
            return (Criteria) this;
        }

        public Criteria andPriceThreeIsNotNull() {
            addCriterion("price_three is not null");
            return (Criteria) this;
        }

        public Criteria andPriceThreeEqualTo(Long value) {
            addCriterion("price_three =", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeNotEqualTo(Long value) {
            addCriterion("price_three <>", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeGreaterThan(Long value) {
            addCriterion("price_three >", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeGreaterThanOrEqualTo(Long value) {
            addCriterion("price_three >=", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeLessThan(Long value) {
            addCriterion("price_three <", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeLessThanOrEqualTo(Long value) {
            addCriterion("price_three <=", value, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeIn(List<Long> values) {
            addCriterion("price_three in", values, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeNotIn(List<Long> values) {
            addCriterion("price_three not in", values, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeBetween(Long value1, Long value2) {
            addCriterion("price_three between", value1, value2, "priceThree");
            return (Criteria) this;
        }

        public Criteria andPriceThreeNotBetween(Long value1, Long value2) {
            addCriterion("price_three not between", value1, value2, "priceThree");
            return (Criteria) this;
        }

        public Criteria andIsTemplateIsNull() {
            addCriterion("is_template is null");
            return (Criteria) this;
        }

        public Criteria andIsTemplateIsNotNull() {
            addCriterion("is_template is not null");
            return (Criteria) this;
        }

        public Criteria andIsTemplateEqualTo(Boolean value) {
            addCriterion("is_template =", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateNotEqualTo(Boolean value) {
            addCriterion("is_template <>", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateGreaterThan(Boolean value) {
            addCriterion("is_template >", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_template >=", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateLessThan(Boolean value) {
            addCriterion("is_template <", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_template <=", value, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateIn(List<Boolean> values) {
            addCriterion("is_template in", values, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateNotIn(List<Boolean> values) {
            addCriterion("is_template not in", values, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_template between", value1, value2, "isTemplate");
            return (Criteria) this;
        }

        public Criteria andIsTemplateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_template not between", value1, value2, "isTemplate");
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
     *  * l_hotzone
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * l_hotzone null
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