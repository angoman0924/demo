/*
*
* OTicketExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OTicketExample {
    /**
     * o_ticket
     */
    protected String orderByClause;

    /**
     * o_ticket
     */
    protected boolean distinct;

    /**
     * o_ticket
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public OTicketExample() {
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
     * o_ticket null
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

        public Criteria andTicketPriceIsNull() {
            addCriterion("ticket_price is null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIsNotNull() {
            addCriterion("ticket_price is not null");
            return (Criteria) this;
        }

        public Criteria andTicketPriceEqualTo(BigDecimal value) {
            addCriterion("ticket_price =", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotEqualTo(BigDecimal value) {
            addCriterion("ticket_price <>", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThan(BigDecimal value) {
            addCriterion("ticket_price >", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price >=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThan(BigDecimal value) {
            addCriterion("ticket_price <", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ticket_price <=", value, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceIn(List<BigDecimal> values) {
            addCriterion("ticket_price in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotIn(List<BigDecimal> values) {
            addCriterion("ticket_price not in", values, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andTicketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ticket_price not between", value1, value2, "ticketPrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNull() {
            addCriterion("insurance_price is null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIsNotNull() {
            addCriterion("insurance_price is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceEqualTo(BigDecimal value) {
            addCriterion("insurance_price =", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotEqualTo(BigDecimal value) {
            addCriterion("insurance_price <>", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThan(BigDecimal value) {
            addCriterion("insurance_price >", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_price >=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThan(BigDecimal value) {
            addCriterion("insurance_price <", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_price <=", value, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceIn(List<BigDecimal> values) {
            addCriterion("insurance_price in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotIn(List<BigDecimal> values) {
            addCriterion("insurance_price not in", values, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_price between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andInsurancePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_price not between", value1, value2, "insurancePrice");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("sign_date not between", value1, value2, "signDate");
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

        public Criteria andVerificationCodeIsNull() {
            addCriterion("verification_code is null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIsNotNull() {
            addCriterion("verification_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeEqualTo(String value) {
            addCriterion("verification_code =", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotEqualTo(String value) {
            addCriterion("verification_code <>", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThan(String value) {
            addCriterion("verification_code >", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verification_code >=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThan(String value) {
            addCriterion("verification_code <", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLessThanOrEqualTo(String value) {
            addCriterion("verification_code <=", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeLike(String value) {
            addCriterion("verification_code like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotLike(String value) {
            addCriterion("verification_code not like", value, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeIn(List<String> values) {
            addCriterion("verification_code in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotIn(List<String> values) {
            addCriterion("verification_code not in", values, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeBetween(String value1, String value2) {
            addCriterion("verification_code between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andVerificationCodeNotBetween(String value1, String value2) {
            addCriterion("verification_code not between", value1, value2, "verificationCode");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNull() {
            addCriterion("plate_number is null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIsNotNull() {
            addCriterion("plate_number is not null");
            return (Criteria) this;
        }

        public Criteria andPlateNumberEqualTo(String value) {
            addCriterion("plate_number =", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotEqualTo(String value) {
            addCriterion("plate_number <>", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThan(String value) {
            addCriterion("plate_number >", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("plate_number >=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThan(String value) {
            addCriterion("plate_number <", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLessThanOrEqualTo(String value) {
            addCriterion("plate_number <=", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberLike(String value) {
            addCriterion("plate_number like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotLike(String value) {
            addCriterion("plate_number not like", value, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberIn(List<String> values) {
            addCriterion("plate_number in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotIn(List<String> values) {
            addCriterion("plate_number not in", values, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberBetween(String value1, String value2) {
            addCriterion("plate_number between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andPlateNumberNotBetween(String value1, String value2) {
            addCriterion("plate_number not between", value1, value2, "plateNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNull() {
            addCriterion("seat_number is null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIsNotNull() {
            addCriterion("seat_number is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNumberEqualTo(String value) {
            addCriterion("seat_number =", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotEqualTo(String value) {
            addCriterion("seat_number <>", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThan(String value) {
            addCriterion("seat_number >", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThanOrEqualTo(String value) {
            addCriterion("seat_number >=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThan(String value) {
            addCriterion("seat_number <", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThanOrEqualTo(String value) {
            addCriterion("seat_number <=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLike(String value) {
            addCriterion("seat_number like", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotLike(String value) {
            addCriterion("seat_number not like", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIn(List<String> values) {
            addCriterion("seat_number in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotIn(List<String> values) {
            addCriterion("seat_number not in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberBetween(String value1, String value2) {
            addCriterion("seat_number between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotBetween(String value1, String value2) {
            addCriterion("seat_number not between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andIsPickUpIsNull() {
            addCriterion("is_pick_up is null");
            return (Criteria) this;
        }

        public Criteria andIsPickUpIsNotNull() {
            addCriterion("is_pick_up is not null");
            return (Criteria) this;
        }

        public Criteria andIsPickUpEqualTo(Boolean value) {
            addCriterion("is_pick_up =", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpNotEqualTo(Boolean value) {
            addCriterion("is_pick_up <>", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpGreaterThan(Boolean value) {
            addCriterion("is_pick_up >", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_pick_up >=", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpLessThan(Boolean value) {
            addCriterion("is_pick_up <", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpLessThanOrEqualTo(Boolean value) {
            addCriterion("is_pick_up <=", value, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpIn(List<Boolean> values) {
            addCriterion("is_pick_up in", values, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpNotIn(List<Boolean> values) {
            addCriterion("is_pick_up not in", values, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pick_up between", value1, value2, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andIsPickUpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_pick_up not between", value1, value2, "isPickUp");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNull() {
            addCriterion("passenger_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIsNotNull() {
            addCriterion("passenger_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerNameEqualTo(String value) {
            addCriterion("passenger_name =", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotEqualTo(String value) {
            addCriterion("passenger_name <>", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThan(String value) {
            addCriterion("passenger_name >", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_name >=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThan(String value) {
            addCriterion("passenger_name <", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_name <=", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameLike(String value) {
            addCriterion("passenger_name like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotLike(String value) {
            addCriterion("passenger_name not like", value, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameIn(List<String> values) {
            addCriterion("passenger_name in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotIn(List<String> values) {
            addCriterion("passenger_name not in", values, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameBetween(String value1, String value2) {
            addCriterion("passenger_name between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andPassengerNameNotBetween(String value1, String value2) {
            addCriterion("passenger_name not between", value1, value2, "passengerName");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoIsNull() {
            addCriterion("passenger_cardno is null");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoIsNotNull() {
            addCriterion("passenger_cardno is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoEqualTo(String value) {
            addCriterion("passenger_cardno =", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoNotEqualTo(String value) {
            addCriterion("passenger_cardno <>", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoGreaterThan(String value) {
            addCriterion("passenger_cardno >", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_cardno >=", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoLessThan(String value) {
            addCriterion("passenger_cardno <", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoLessThanOrEqualTo(String value) {
            addCriterion("passenger_cardno <=", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoLike(String value) {
            addCriterion("passenger_cardno like", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoNotLike(String value) {
            addCriterion("passenger_cardno not like", value, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoIn(List<String> values) {
            addCriterion("passenger_cardno in", values, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoNotIn(List<String> values) {
            addCriterion("passenger_cardno not in", values, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoBetween(String value1, String value2) {
            addCriterion("passenger_cardno between", value1, value2, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerCardnoNotBetween(String value1, String value2) {
            addCriterion("passenger_cardno not between", value1, value2, "passengerCardno");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNull() {
            addCriterion("passenger_phone is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIsNotNull() {
            addCriterion("passenger_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneEqualTo(String value) {
            addCriterion("passenger_phone =", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotEqualTo(String value) {
            addCriterion("passenger_phone <>", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThan(String value) {
            addCriterion("passenger_phone >", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_phone >=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThan(String value) {
            addCriterion("passenger_phone <", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLessThanOrEqualTo(String value) {
            addCriterion("passenger_phone <=", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneLike(String value) {
            addCriterion("passenger_phone like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotLike(String value) {
            addCriterion("passenger_phone not like", value, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneIn(List<String> values) {
            addCriterion("passenger_phone in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotIn(List<String> values) {
            addCriterion("passenger_phone not in", values, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneBetween(String value1, String value2) {
            addCriterion("passenger_phone between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNotBetween(String value1, String value2) {
            addCriterion("passenger_phone not between", value1, value2, "passengerPhone");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNull() {
            addCriterion("insurance_code is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIsNotNull() {
            addCriterion("insurance_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeEqualTo(String value) {
            addCriterion("insurance_code =", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotEqualTo(String value) {
            addCriterion("insurance_code <>", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThan(String value) {
            addCriterion("insurance_code >", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_code >=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThan(String value) {
            addCriterion("insurance_code <", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLessThanOrEqualTo(String value) {
            addCriterion("insurance_code <=", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeLike(String value) {
            addCriterion("insurance_code like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotLike(String value) {
            addCriterion("insurance_code not like", value, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeIn(List<String> values) {
            addCriterion("insurance_code in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotIn(List<String> values) {
            addCriterion("insurance_code not in", values, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeBetween(String value1, String value2) {
            addCriterion("insurance_code between", value1, value2, "insuranceCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceCodeNotBetween(String value1, String value2) {
            addCriterion("insurance_code not between", value1, value2, "insuranceCode");
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
     *  * o_ticket
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * o_ticket null
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