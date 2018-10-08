/*
*
* SymManagerExample.java
* Copyright(C) 2018-2020 上海拜米网络科技有限公司
* @date 2018-10-07
*/
package com.zacx.serivce.dal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SymManagerExample {
    /**
     * sym_manager
     */
    protected String orderByClause;

    /**
     * sym_manager
     */
    protected boolean distinct;

    /**
     * sym_manager
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbggenerated
     */
    public SymManagerExample() {
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
     * sym_manager null
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

        public Criteria andManageridIsNull() {
            addCriterion("ManagerId is null");
            return (Criteria) this;
        }

        public Criteria andManageridIsNotNull() {
            addCriterion("ManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andManageridEqualTo(String value) {
            addCriterion("ManagerId =", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotEqualTo(String value) {
            addCriterion("ManagerId <>", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThan(String value) {
            addCriterion("ManagerId >", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerId >=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThan(String value) {
            addCriterion("ManagerId <", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLessThanOrEqualTo(String value) {
            addCriterion("ManagerId <=", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridLike(String value) {
            addCriterion("ManagerId like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotLike(String value) {
            addCriterion("ManagerId not like", value, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridIn(List<String> values) {
            addCriterion("ManagerId in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotIn(List<String> values) {
            addCriterion("ManagerId not in", values, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridBetween(String value1, String value2) {
            addCriterion("ManagerId between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManageridNotBetween(String value1, String value2) {
            addCriterion("ManagerId not between", value1, value2, "managerid");
            return (Criteria) this;
        }

        public Criteria andManagernoIsNull() {
            addCriterion("ManagerNo is null");
            return (Criteria) this;
        }

        public Criteria andManagernoIsNotNull() {
            addCriterion("ManagerNo is not null");
            return (Criteria) this;
        }

        public Criteria andManagernoEqualTo(String value) {
            addCriterion("ManagerNo =", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoNotEqualTo(String value) {
            addCriterion("ManagerNo <>", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoGreaterThan(String value) {
            addCriterion("ManagerNo >", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoGreaterThanOrEqualTo(String value) {
            addCriterion("ManagerNo >=", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoLessThan(String value) {
            addCriterion("ManagerNo <", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoLessThanOrEqualTo(String value) {
            addCriterion("ManagerNo <=", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoLike(String value) {
            addCriterion("ManagerNo like", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoNotLike(String value) {
            addCriterion("ManagerNo not like", value, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoIn(List<String> values) {
            addCriterion("ManagerNo in", values, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoNotIn(List<String> values) {
            addCriterion("ManagerNo not in", values, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoBetween(String value1, String value2) {
            addCriterion("ManagerNo between", value1, value2, "managerno");
            return (Criteria) this;
        }

        public Criteria andManagernoNotBetween(String value1, String value2) {
            addCriterion("ManagerNo not between", value1, value2, "managerno");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LoginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LoginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`Password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`Password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`Password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`Password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`Password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`Password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`Password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`Password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`Password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`Password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`Password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`Password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`Password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`Password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordformatIsNull() {
            addCriterion("PasswordFormat is null");
            return (Criteria) this;
        }

        public Criteria andPasswordformatIsNotNull() {
            addCriterion("PasswordFormat is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordformatEqualTo(Integer value) {
            addCriterion("PasswordFormat =", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatNotEqualTo(Integer value) {
            addCriterion("PasswordFormat <>", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatGreaterThan(Integer value) {
            addCriterion("PasswordFormat >", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatGreaterThanOrEqualTo(Integer value) {
            addCriterion("PasswordFormat >=", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatLessThan(Integer value) {
            addCriterion("PasswordFormat <", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatLessThanOrEqualTo(Integer value) {
            addCriterion("PasswordFormat <=", value, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatIn(List<Integer> values) {
            addCriterion("PasswordFormat in", values, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatNotIn(List<Integer> values) {
            addCriterion("PasswordFormat not in", values, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatBetween(Integer value1, Integer value2) {
            addCriterion("PasswordFormat between", value1, value2, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordformatNotBetween(Integer value1, Integer value2) {
            addCriterion("PasswordFormat not between", value1, value2, "passwordformat");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNull() {
            addCriterion("PasswordSalt is null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIsNotNull() {
            addCriterion("PasswordSalt is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltEqualTo(String value) {
            addCriterion("PasswordSalt =", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotEqualTo(String value) {
            addCriterion("PasswordSalt <>", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThan(String value) {
            addCriterion("PasswordSalt >", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltGreaterThanOrEqualTo(String value) {
            addCriterion("PasswordSalt >=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThan(String value) {
            addCriterion("PasswordSalt <", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLessThanOrEqualTo(String value) {
            addCriterion("PasswordSalt <=", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltLike(String value) {
            addCriterion("PasswordSalt like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotLike(String value) {
            addCriterion("PasswordSalt not like", value, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltIn(List<String> values) {
            addCriterion("PasswordSalt in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotIn(List<String> values) {
            addCriterion("PasswordSalt not in", values, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltBetween(String value1, String value2) {
            addCriterion("PasswordSalt between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andPasswordsaltNotBetween(String value1, String value2) {
            addCriterion("PasswordSalt not between", value1, value2, "passwordsalt");
            return (Criteria) this;
        }

        public Criteria andIslockedoutIsNull() {
            addCriterion("IsLockedOut is null");
            return (Criteria) this;
        }

        public Criteria andIslockedoutIsNotNull() {
            addCriterion("IsLockedOut is not null");
            return (Criteria) this;
        }

        public Criteria andIslockedoutEqualTo(Byte value) {
            addCriterion("IsLockedOut =", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutNotEqualTo(Byte value) {
            addCriterion("IsLockedOut <>", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutGreaterThan(Byte value) {
            addCriterion("IsLockedOut >", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsLockedOut >=", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutLessThan(Byte value) {
            addCriterion("IsLockedOut <", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutLessThanOrEqualTo(Byte value) {
            addCriterion("IsLockedOut <=", value, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutIn(List<Byte> values) {
            addCriterion("IsLockedOut in", values, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutNotIn(List<Byte> values) {
            addCriterion("IsLockedOut not in", values, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutBetween(Byte value1, Byte value2) {
            addCriterion("IsLockedOut between", value1, value2, "islockedout");
            return (Criteria) this;
        }

        public Criteria andIslockedoutNotBetween(Byte value1, Byte value2) {
            addCriterion("IsLockedOut not between", value1, value2, "islockedout");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("LastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("LastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(Date value) {
            addCriterion("LastLoginDate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(Date value) {
            addCriterion("LastLoginDate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(Date value) {
            addCriterion("LastLoginDate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginDate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(Date value) {
            addCriterion("LastLoginDate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginDate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<Date> values) {
            addCriterion("LastLoginDate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<Date> values) {
            addCriterion("LastLoginDate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(Date value1, Date value2) {
            addCriterion("LastLoginDate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginDate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateIsNull() {
            addCriterion("LastPasswordChangedDate is null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateIsNotNull() {
            addCriterion("LastPasswordChangedDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate =", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateNotEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate <>", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateGreaterThan(Date value) {
            addCriterion("LastPasswordChangedDate >", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate >=", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateLessThan(Date value) {
            addCriterion("LastPasswordChangedDate <", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateLessThanOrEqualTo(Date value) {
            addCriterion("LastPasswordChangedDate <=", value, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateIn(List<Date> values) {
            addCriterion("LastPasswordChangedDate in", values, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateNotIn(List<Date> values) {
            addCriterion("LastPasswordChangedDate not in", values, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateBetween(Date value1, Date value2) {
            addCriterion("LastPasswordChangedDate between", value1, value2, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastpasswordchangeddateNotBetween(Date value1, Date value2) {
            addCriterion("LastPasswordChangedDate not between", value1, value2, "lastpasswordchangeddate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateIsNull() {
            addCriterion("LastLockoutDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateIsNotNull() {
            addCriterion("LastLockoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateEqualTo(Date value) {
            addCriterion("LastLockoutDate =", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateNotEqualTo(Date value) {
            addCriterion("LastLockoutDate <>", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateGreaterThan(Date value) {
            addCriterion("LastLockoutDate >", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLockoutDate >=", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateLessThan(Date value) {
            addCriterion("LastLockoutDate <", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateLessThanOrEqualTo(Date value) {
            addCriterion("LastLockoutDate <=", value, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateIn(List<Date> values) {
            addCriterion("LastLockoutDate in", values, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateNotIn(List<Date> values) {
            addCriterion("LastLockoutDate not in", values, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateBetween(Date value1, Date value2) {
            addCriterion("LastLockoutDate between", value1, value2, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlockoutdateNotBetween(Date value1, Date value2) {
            addCriterion("LastLockoutDate not between", value1, value2, "lastlockoutdate");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNull() {
            addCriterion("CreatedOn is null");
            return (Criteria) this;
        }

        public Criteria andCreatedonIsNotNull() {
            addCriterion("CreatedOn is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedonEqualTo(Date value) {
            addCriterion("CreatedOn =", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotEqualTo(Date value) {
            addCriterion("CreatedOn <>", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThan(Date value) {
            addCriterion("CreatedOn >", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedOn >=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThan(Date value) {
            addCriterion("CreatedOn <", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonLessThanOrEqualTo(Date value) {
            addCriterion("CreatedOn <=", value, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonIn(List<Date> values) {
            addCriterion("CreatedOn in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotIn(List<Date> values) {
            addCriterion("CreatedOn not in", values, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonBetween(Date value1, Date value2) {
            addCriterion("CreatedOn between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedonNotBetween(Date value1, Date value2) {
            addCriterion("CreatedOn not between", value1, value2, "createdon");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("CreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("CreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(String value) {
            addCriterion("CreatedBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(String value) {
            addCriterion("CreatedBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(String value) {
            addCriterion("CreatedBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(String value) {
            addCriterion("CreatedBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(String value) {
            addCriterion("CreatedBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLike(String value) {
            addCriterion("CreatedBy like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotLike(String value) {
            addCriterion("CreatedBy not like", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<String> values) {
            addCriterion("CreatedBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<String> values) {
            addCriterion("CreatedBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(String value1, String value2) {
            addCriterion("CreatedBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(String value1, String value2) {
            addCriterion("CreatedBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsapprovedIsNull() {
            addCriterion("IsApproved is null");
            return (Criteria) this;
        }

        public Criteria andIsapprovedIsNotNull() {
            addCriterion("IsApproved is not null");
            return (Criteria) this;
        }

        public Criteria andIsapprovedEqualTo(Byte value) {
            addCriterion("IsApproved =", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedNotEqualTo(Byte value) {
            addCriterion("IsApproved <>", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedGreaterThan(Byte value) {
            addCriterion("IsApproved >", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsApproved >=", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedLessThan(Byte value) {
            addCriterion("IsApproved <", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedLessThanOrEqualTo(Byte value) {
            addCriterion("IsApproved <=", value, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedIn(List<Byte> values) {
            addCriterion("IsApproved in", values, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedNotIn(List<Byte> values) {
            addCriterion("IsApproved not in", values, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedBetween(Byte value1, Byte value2) {
            addCriterion("IsApproved between", value1, value2, "isapproved");
            return (Criteria) this;
        }

        public Criteria andIsapprovedNotBetween(Byte value1, Byte value2) {
            addCriterion("IsApproved not between", value1, value2, "isapproved");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameIsNull() {
            addCriterion("MnemonicName is null");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameIsNotNull() {
            addCriterion("MnemonicName is not null");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameEqualTo(String value) {
            addCriterion("MnemonicName =", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameNotEqualTo(String value) {
            addCriterion("MnemonicName <>", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameGreaterThan(String value) {
            addCriterion("MnemonicName >", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameGreaterThanOrEqualTo(String value) {
            addCriterion("MnemonicName >=", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameLessThan(String value) {
            addCriterion("MnemonicName <", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameLessThanOrEqualTo(String value) {
            addCriterion("MnemonicName <=", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameLike(String value) {
            addCriterion("MnemonicName like", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameNotLike(String value) {
            addCriterion("MnemonicName not like", value, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameIn(List<String> values) {
            addCriterion("MnemonicName in", values, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameNotIn(List<String> values) {
            addCriterion("MnemonicName not in", values, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameBetween(String value1, String value2) {
            addCriterion("MnemonicName between", value1, value2, "mnemonicname");
            return (Criteria) this;
        }

        public Criteria andMnemonicnameNotBetween(String value1, String value2) {
            addCriterion("MnemonicName not between", value1, value2, "mnemonicname");
            return (Criteria) this;
        }
    }

    /**
     *  * sym_manager
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * sym_manager null
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