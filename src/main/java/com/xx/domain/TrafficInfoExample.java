package com.xx.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TrafficInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TrafficInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPassengerCapacityIsNull() {
            addCriterion("passenger_capacity is null");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityIsNotNull() {
            addCriterion("passenger_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityEqualTo(Integer value) {
            addCriterion("passenger_capacity =", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityNotEqualTo(Integer value) {
            addCriterion("passenger_capacity <>", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityGreaterThan(Integer value) {
            addCriterion("passenger_capacity >", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_capacity >=", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityLessThan(Integer value) {
            addCriterion("passenger_capacity <", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_capacity <=", value, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityIn(List<Integer> values) {
            addCriterion("passenger_capacity in", values, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityNotIn(List<Integer> values) {
            addCriterion("passenger_capacity not in", values, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityBetween(Integer value1, Integer value2) {
            addCriterion("passenger_capacity between", value1, value2, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andPassengerCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_capacity not between", value1, value2, "passengerCapacity");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNull() {
            addCriterion("buy_date is null");
            return (Criteria) this;
        }

        public Criteria andBuyDateIsNotNull() {
            addCriterion("buy_date is not null");
            return (Criteria) this;
        }

        public Criteria andBuyDateEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date =", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date <>", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("buy_date >", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date >=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThan(Date value) {
            addCriterionForJDBCDate("buy_date <", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("buy_date <=", value, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateIn(List<Date> values) {
            addCriterionForJDBCDate("buy_date in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("buy_date not in", values, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_date between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andBuyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("buy_date not between", value1, value2, "buyDate");
            return (Criteria) this;
        }

        public Criteria andMileageIsNull() {
            addCriterion("mileage is null");
            return (Criteria) this;
        }

        public Criteria andMileageIsNotNull() {
            addCriterion("mileage is not null");
            return (Criteria) this;
        }

        public Criteria andMileageEqualTo(Integer value) {
            addCriterion("mileage =", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotEqualTo(Integer value) {
            addCriterion("mileage <>", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThan(Integer value) {
            addCriterion("mileage >", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("mileage >=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThan(Integer value) {
            addCriterion("mileage <", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageLessThanOrEqualTo(Integer value) {
            addCriterion("mileage <=", value, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageIn(List<Integer> values) {
            addCriterion("mileage in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotIn(List<Integer> values) {
            addCriterion("mileage not in", values, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageBetween(Integer value1, Integer value2) {
            addCriterion("mileage between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("mileage not between", value1, value2, "mileage");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andOperateNumberIsNull() {
            addCriterion("operate_number is null");
            return (Criteria) this;
        }

        public Criteria andOperateNumberIsNotNull() {
            addCriterion("operate_number is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNumberEqualTo(String value) {
            addCriterion("operate_number =", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberNotEqualTo(String value) {
            addCriterion("operate_number <>", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberGreaterThan(String value) {
            addCriterion("operate_number >", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("operate_number >=", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberLessThan(String value) {
            addCriterion("operate_number <", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberLessThanOrEqualTo(String value) {
            addCriterion("operate_number <=", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberLike(String value) {
            addCriterion("operate_number like", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberNotLike(String value) {
            addCriterion("operate_number not like", value, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberIn(List<String> values) {
            addCriterion("operate_number in", values, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberNotIn(List<String> values) {
            addCriterion("operate_number not in", values, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberBetween(String value1, String value2) {
            addCriterion("operate_number between", value1, value2, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andOperateNumberNotBetween(String value1, String value2) {
            addCriterion("operate_number not between", value1, value2, "operateNumber");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIsNull() {
            addCriterion("traffic_level is null");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIsNotNull() {
            addCriterion("traffic_level is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelEqualTo(String value) {
            addCriterion("traffic_level =", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotEqualTo(String value) {
            addCriterion("traffic_level <>", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelGreaterThan(String value) {
            addCriterion("traffic_level >", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_level >=", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLessThan(String value) {
            addCriterion("traffic_level <", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLessThanOrEqualTo(String value) {
            addCriterion("traffic_level <=", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelLike(String value) {
            addCriterion("traffic_level like", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotLike(String value) {
            addCriterion("traffic_level not like", value, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelIn(List<String> values) {
            addCriterion("traffic_level in", values, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotIn(List<String> values) {
            addCriterion("traffic_level not in", values, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelBetween(String value1, String value2) {
            addCriterion("traffic_level between", value1, value2, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficLevelNotBetween(String value1, String value2) {
            addCriterion("traffic_level not between", value1, value2, "trafficLevel");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerIsNull() {
            addCriterion("traffic_owner is null");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerIsNotNull() {
            addCriterion("traffic_owner is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerEqualTo(String value) {
            addCriterion("traffic_owner =", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerNotEqualTo(String value) {
            addCriterion("traffic_owner <>", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerGreaterThan(String value) {
            addCriterion("traffic_owner >", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("traffic_owner >=", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerLessThan(String value) {
            addCriterion("traffic_owner <", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerLessThanOrEqualTo(String value) {
            addCriterion("traffic_owner <=", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerLike(String value) {
            addCriterion("traffic_owner like", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerNotLike(String value) {
            addCriterion("traffic_owner not like", value, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerIn(List<String> values) {
            addCriterion("traffic_owner in", values, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerNotIn(List<String> values) {
            addCriterion("traffic_owner not in", values, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerBetween(String value1, String value2) {
            addCriterion("traffic_owner between", value1, value2, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andTrafficOwnerNotBetween(String value1, String value2) {
            addCriterion("traffic_owner not between", value1, value2, "trafficOwner");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIsNull() {
            addCriterion("owner_tel is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIsNotNull() {
            addCriterion("owner_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTelEqualTo(String value) {
            addCriterion("owner_tel =", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotEqualTo(String value) {
            addCriterion("owner_tel <>", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelGreaterThan(String value) {
            addCriterion("owner_tel >", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelGreaterThanOrEqualTo(String value) {
            addCriterion("owner_tel >=", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLessThan(String value) {
            addCriterion("owner_tel <", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLessThanOrEqualTo(String value) {
            addCriterion("owner_tel <=", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelLike(String value) {
            addCriterion("owner_tel like", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotLike(String value) {
            addCriterion("owner_tel not like", value, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelIn(List<String> values) {
            addCriterion("owner_tel in", values, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotIn(List<String> values) {
            addCriterion("owner_tel not in", values, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelBetween(String value1, String value2) {
            addCriterion("owner_tel between", value1, value2, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andOwnerTelNotBetween(String value1, String value2) {
            addCriterion("owner_tel not between", value1, value2, "ownerTel");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIsNull() {
            addCriterion("driving_license is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIsNotNull() {
            addCriterion("driving_license is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license =", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license <>", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseGreaterThan(Date value) {
            addCriterionForJDBCDate("driving_license >", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license >=", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseLessThan(Date value) {
            addCriterionForJDBCDate("driving_license <", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license <=", value, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license in", values, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license not in", values, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license between", value1, value2, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license not between", value1, value2, "drivingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseIsNull() {
            addCriterion("trading_license is null");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseIsNotNull() {
            addCriterion("trading_license is not null");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseEqualTo(Date value) {
            addCriterionForJDBCDate("trading_license =", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseNotEqualTo(Date value) {
            addCriterionForJDBCDate("trading_license <>", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseGreaterThan(Date value) {
            addCriterionForJDBCDate("trading_license >", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trading_license >=", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseLessThan(Date value) {
            addCriterionForJDBCDate("trading_license <", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trading_license <=", value, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseIn(List<Date> values) {
            addCriterionForJDBCDate("trading_license in", values, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseNotIn(List<Date> values) {
            addCriterionForJDBCDate("trading_license not in", values, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trading_license between", value1, value2, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andTradingLicenseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trading_license not between", value1, value2, "tradingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseIsNull() {
            addCriterion("operating_license is null");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseIsNotNull() {
            addCriterion("operating_license is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseEqualTo(Date value) {
            addCriterionForJDBCDate("operating_license =", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseNotEqualTo(Date value) {
            addCriterionForJDBCDate("operating_license <>", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseGreaterThan(Date value) {
            addCriterionForJDBCDate("operating_license >", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operating_license >=", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseLessThan(Date value) {
            addCriterionForJDBCDate("operating_license <", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("operating_license <=", value, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseIn(List<Date> values) {
            addCriterionForJDBCDate("operating_license in", values, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseNotIn(List<Date> values) {
            addCriterionForJDBCDate("operating_license not in", values, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operating_license between", value1, value2, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andOperatingLicenseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("operating_license not between", value1, value2, "operatingLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseIsNull() {
            addCriterion("approval_license is null");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseIsNotNull() {
            addCriterion("approval_license is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseEqualTo(Date value) {
            addCriterionForJDBCDate("approval_license =", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseNotEqualTo(Date value) {
            addCriterionForJDBCDate("approval_license <>", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseGreaterThan(Date value) {
            addCriterionForJDBCDate("approval_license >", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_license >=", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseLessThan(Date value) {
            addCriterionForJDBCDate("approval_license <", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("approval_license <=", value, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseIn(List<Date> values) {
            addCriterionForJDBCDate("approval_license in", values, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseNotIn(List<Date> values) {
            addCriterionForJDBCDate("approval_license not in", values, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_license between", value1, value2, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andApprovalLicenseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("approval_license not between", value1, value2, "approvalLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseIsNull() {
            addCriterion("evaluation_license is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseIsNotNull() {
            addCriterion("evaluation_license is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_license =", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseNotEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_license <>", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseGreaterThan(Date value) {
            addCriterionForJDBCDate("evaluation_license >", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_license >=", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseLessThan(Date value) {
            addCriterionForJDBCDate("evaluation_license <", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("evaluation_license <=", value, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseIn(List<Date> values) {
            addCriterionForJDBCDate("evaluation_license in", values, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseNotIn(List<Date> values) {
            addCriterionForJDBCDate("evaluation_license not in", values, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluation_license between", value1, value2, "evaluationLicense");
            return (Criteria) this;
        }

        public Criteria andEvaluationLicenseNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("evaluation_license not between", value1, value2, "evaluationLicense");
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
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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