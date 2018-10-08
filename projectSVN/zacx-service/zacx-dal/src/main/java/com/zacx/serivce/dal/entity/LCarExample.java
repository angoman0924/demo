/*
*
* LCarExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LCarExample {
    /**
     * l_car
     */
    protected String orderByClause;

    /**
     * l_car
     */
    protected boolean distinct;

    /**
     * l_car
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public LCarExample() {
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
     * l_car null
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

        public Criteria andLicensePlateIsNull() {
            addCriterion("license_plate is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNotNull() {
            addCriterion("license_plate is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateEqualTo(String value) {
            addCriterion("license_plate =", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotEqualTo(String value) {
            addCriterion("license_plate <>", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThan(String value) {
            addCriterion("license_plate >", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate >=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThan(String value) {
            addCriterion("license_plate <", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThanOrEqualTo(String value) {
            addCriterion("license_plate <=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLike(String value) {
            addCriterion("license_plate like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotLike(String value) {
            addCriterion("license_plate not like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIn(List<String> values) {
            addCriterion("license_plate in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotIn(List<String> values) {
            addCriterion("license_plate not in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateBetween(String value1, String value2) {
            addCriterion("license_plate between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotBetween(String value1, String value2) {
            addCriterion("license_plate not between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
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

        public Criteria andSeatNumberEqualTo(Integer value) {
            addCriterion("seat_number =", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotEqualTo(Integer value) {
            addCriterion("seat_number <>", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThan(Integer value) {
            addCriterion("seat_number >", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_number >=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThan(Integer value) {
            addCriterion("seat_number <", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberLessThanOrEqualTo(Integer value) {
            addCriterion("seat_number <=", value, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberIn(List<Integer> values) {
            addCriterion("seat_number in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotIn(List<Integer> values) {
            addCriterion("seat_number not in", values, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberBetween(Integer value1, Integer value2) {
            addCriterion("seat_number between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andSeatNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_number not between", value1, value2, "seatNumber");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNull() {
            addCriterion("image_small is null");
            return (Criteria) this;
        }

        public Criteria andImageSmallIsNotNull() {
            addCriterion("image_small is not null");
            return (Criteria) this;
        }

        public Criteria andImageSmallEqualTo(String value) {
            addCriterion("image_small =", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotEqualTo(String value) {
            addCriterion("image_small <>", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThan(String value) {
            addCriterion("image_small >", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallGreaterThanOrEqualTo(String value) {
            addCriterion("image_small >=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThan(String value) {
            addCriterion("image_small <", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLessThanOrEqualTo(String value) {
            addCriterion("image_small <=", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallLike(String value) {
            addCriterion("image_small like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotLike(String value) {
            addCriterion("image_small not like", value, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallIn(List<String> values) {
            addCriterion("image_small in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotIn(List<String> values) {
            addCriterion("image_small not in", values, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallBetween(String value1, String value2) {
            addCriterion("image_small between", value1, value2, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageSmallNotBetween(String value1, String value2) {
            addCriterion("image_small not between", value1, value2, "imageSmall");
            return (Criteria) this;
        }

        public Criteria andImageBigIsNull() {
            addCriterion("image_big is null");
            return (Criteria) this;
        }

        public Criteria andImageBigIsNotNull() {
            addCriterion("image_big is not null");
            return (Criteria) this;
        }

        public Criteria andImageBigEqualTo(String value) {
            addCriterion("image_big =", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotEqualTo(String value) {
            addCriterion("image_big <>", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigGreaterThan(String value) {
            addCriterion("image_big >", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigGreaterThanOrEqualTo(String value) {
            addCriterion("image_big >=", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLessThan(String value) {
            addCriterion("image_big <", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLessThanOrEqualTo(String value) {
            addCriterion("image_big <=", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigLike(String value) {
            addCriterion("image_big like", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotLike(String value) {
            addCriterion("image_big not like", value, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigIn(List<String> values) {
            addCriterion("image_big in", values, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotIn(List<String> values) {
            addCriterion("image_big not in", values, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigBetween(String value1, String value2) {
            addCriterion("image_big between", value1, value2, "imageBig");
            return (Criteria) this;
        }

        public Criteria andImageBigNotBetween(String value1, String value2) {
            addCriterion("image_big not between", value1, value2, "imageBig");
            return (Criteria) this;
        }

        public Criteria andGroupNamesIsNull() {
            addCriterion("group_names is null");
            return (Criteria) this;
        }

        public Criteria andGroupNamesIsNotNull() {
            addCriterion("group_names is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNamesEqualTo(String value) {
            addCriterion("group_names =", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesNotEqualTo(String value) {
            addCriterion("group_names <>", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesGreaterThan(String value) {
            addCriterion("group_names >", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesGreaterThanOrEqualTo(String value) {
            addCriterion("group_names >=", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesLessThan(String value) {
            addCriterion("group_names <", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesLessThanOrEqualTo(String value) {
            addCriterion("group_names <=", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesLike(String value) {
            addCriterion("group_names like", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesNotLike(String value) {
            addCriterion("group_names not like", value, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesIn(List<String> values) {
            addCriterion("group_names in", values, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesNotIn(List<String> values) {
            addCriterion("group_names not in", values, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesBetween(String value1, String value2) {
            addCriterion("group_names between", value1, value2, "groupNames");
            return (Criteria) this;
        }

        public Criteria andGroupNamesNotBetween(String value1, String value2) {
            addCriterion("group_names not between", value1, value2, "groupNames");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("operation_type is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("operation_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Integer value) {
            addCriterion("operation_type =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Integer value) {
            addCriterion("operation_type <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Integer value) {
            addCriterion("operation_type >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_type >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Integer value) {
            addCriterion("operation_type <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("operation_type <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Integer> values) {
            addCriterion("operation_type in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Integer> values) {
            addCriterion("operation_type not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Integer value1, Integer value2) {
            addCriterion("operation_type between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_type not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creation_date is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creation_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterion("creation_date =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterion("creation_date <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterion("creation_date >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_date >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterion("creation_date <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterion("creation_date <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterion("creation_date in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterion("creation_date not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterion("creation_date between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterion("creation_date not between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNull() {
            addCriterion("join_date is null");
            return (Criteria) this;
        }

        public Criteria andJoinDateIsNotNull() {
            addCriterion("join_date is not null");
            return (Criteria) this;
        }

        public Criteria andJoinDateEqualTo(Date value) {
            addCriterion("join_date =", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotEqualTo(Date value) {
            addCriterion("join_date <>", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThan(Date value) {
            addCriterion("join_date >", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("join_date >=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThan(Date value) {
            addCriterion("join_date <", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateLessThanOrEqualTo(Date value) {
            addCriterion("join_date <=", value, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateIn(List<Date> values) {
            addCriterion("join_date in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotIn(List<Date> values) {
            addCriterion("join_date not in", values, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateBetween(Date value1, Date value2) {
            addCriterion("join_date between", value1, value2, "joinDate");
            return (Criteria) this;
        }

        public Criteria andJoinDateNotBetween(Date value1, Date value2) {
            addCriterion("join_date not between", value1, value2, "joinDate");
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
     *  * l_car
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * l_car null
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