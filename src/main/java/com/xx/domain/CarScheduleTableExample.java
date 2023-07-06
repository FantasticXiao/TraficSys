package com.xx.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarScheduleTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CarScheduleTableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andResDriverIsNull() {
            addCriterion("res_driver is null");
            return (Criteria) this;
        }

        public Criteria andResDriverIsNotNull() {
            addCriterion("res_driver is not null");
            return (Criteria) this;
        }

        public Criteria andResDriverEqualTo(String value) {
            addCriterion("res_driver =", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverNotEqualTo(String value) {
            addCriterion("res_driver <>", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverGreaterThan(String value) {
            addCriterion("res_driver >", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverGreaterThanOrEqualTo(String value) {
            addCriterion("res_driver >=", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverLessThan(String value) {
            addCriterion("res_driver <", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverLessThanOrEqualTo(String value) {
            addCriterion("res_driver <=", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverLike(String value) {
            addCriterion("res_driver like", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverNotLike(String value) {
            addCriterion("res_driver not like", value, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverIn(List<String> values) {
            addCriterion("res_driver in", values, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverNotIn(List<String> values) {
            addCriterion("res_driver not in", values, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverBetween(String value1, String value2) {
            addCriterion("res_driver between", value1, value2, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverNotBetween(String value1, String value2) {
            addCriterion("res_driver not between", value1, value2, "resDriver");
            return (Criteria) this;
        }

        public Criteria andResDriverTelIsNull() {
            addCriterion("res_driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andResDriverTelIsNotNull() {
            addCriterion("res_driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andResDriverTelEqualTo(String value) {
            addCriterion("res_driver_tel =", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelNotEqualTo(String value) {
            addCriterion("res_driver_tel <>", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelGreaterThan(String value) {
            addCriterion("res_driver_tel >", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("res_driver_tel >=", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelLessThan(String value) {
            addCriterion("res_driver_tel <", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelLessThanOrEqualTo(String value) {
            addCriterion("res_driver_tel <=", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelLike(String value) {
            addCriterion("res_driver_tel like", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelNotLike(String value) {
            addCriterion("res_driver_tel not like", value, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelIn(List<String> values) {
            addCriterion("res_driver_tel in", values, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelNotIn(List<String> values) {
            addCriterion("res_driver_tel not in", values, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelBetween(String value1, String value2) {
            addCriterion("res_driver_tel between", value1, value2, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andResDriverTelNotBetween(String value1, String value2) {
            addCriterion("res_driver_tel not between", value1, value2, "resDriverTel");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNull() {
            addCriterion("start_address is null");
            return (Criteria) this;
        }

        public Criteria andStartAddressIsNotNull() {
            addCriterion("start_address is not null");
            return (Criteria) this;
        }

        public Criteria andStartAddressEqualTo(String value) {
            addCriterion("start_address =", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotEqualTo(String value) {
            addCriterion("start_address <>", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThan(String value) {
            addCriterion("start_address >", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("start_address >=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThan(String value) {
            addCriterion("start_address <", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLessThanOrEqualTo(String value) {
            addCriterion("start_address <=", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressLike(String value) {
            addCriterion("start_address like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotLike(String value) {
            addCriterion("start_address not like", value, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressIn(List<String> values) {
            addCriterion("start_address in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotIn(List<String> values) {
            addCriterion("start_address not in", values, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressBetween(String value1, String value2) {
            addCriterion("start_address between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andStartAddressNotBetween(String value1, String value2) {
            addCriterion("start_address not between", value1, value2, "startAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressIsNull() {
            addCriterion("end_address is null");
            return (Criteria) this;
        }

        public Criteria andEndAddressIsNotNull() {
            addCriterion("end_address is not null");
            return (Criteria) this;
        }

        public Criteria andEndAddressEqualTo(String value) {
            addCriterion("end_address =", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotEqualTo(String value) {
            addCriterion("end_address <>", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressGreaterThan(String value) {
            addCriterion("end_address >", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("end_address >=", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLessThan(String value) {
            addCriterion("end_address <", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLessThanOrEqualTo(String value) {
            addCriterion("end_address <=", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressLike(String value) {
            addCriterion("end_address like", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotLike(String value) {
            addCriterion("end_address not like", value, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressIn(List<String> values) {
            addCriterion("end_address in", values, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotIn(List<String> values) {
            addCriterion("end_address not in", values, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressBetween(String value1, String value2) {
            addCriterion("end_address between", value1, value2, "endAddress");
            return (Criteria) this;
        }

        public Criteria andEndAddressNotBetween(String value1, String value2) {
            addCriterion("end_address not between", value1, value2, "endAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyIsNull() {
            addCriterion("travel_agency is null");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyIsNotNull() {
            addCriterion("travel_agency is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyEqualTo(String value) {
            addCriterion("travel_agency =", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyNotEqualTo(String value) {
            addCriterion("travel_agency <>", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyGreaterThan(String value) {
            addCriterion("travel_agency >", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("travel_agency >=", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyLessThan(String value) {
            addCriterion("travel_agency <", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyLessThanOrEqualTo(String value) {
            addCriterion("travel_agency <=", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyLike(String value) {
            addCriterion("travel_agency like", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyNotLike(String value) {
            addCriterion("travel_agency not like", value, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyIn(List<String> values) {
            addCriterion("travel_agency in", values, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyNotIn(List<String> values) {
            addCriterion("travel_agency not in", values, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyBetween(String value1, String value2) {
            addCriterion("travel_agency between", value1, value2, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyNotBetween(String value1, String value2) {
            addCriterion("travel_agency not between", value1, value2, "travelAgency");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityIsNull() {
            addCriterion("travel_agency_responsibility is null");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityIsNotNull() {
            addCriterion("travel_agency_responsibility is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityEqualTo(String value) {
            addCriterion("travel_agency_responsibility =", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityNotEqualTo(String value) {
            addCriterion("travel_agency_responsibility <>", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityGreaterThan(String value) {
            addCriterion("travel_agency_responsibility >", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityGreaterThanOrEqualTo(String value) {
            addCriterion("travel_agency_responsibility >=", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityLessThan(String value) {
            addCriterion("travel_agency_responsibility <", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityLessThanOrEqualTo(String value) {
            addCriterion("travel_agency_responsibility <=", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityLike(String value) {
            addCriterion("travel_agency_responsibility like", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityNotLike(String value) {
            addCriterion("travel_agency_responsibility not like", value, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityIn(List<String> values) {
            addCriterion("travel_agency_responsibility in", values, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityNotIn(List<String> values) {
            addCriterion("travel_agency_responsibility not in", values, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityBetween(String value1, String value2) {
            addCriterion("travel_agency_responsibility between", value1, value2, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andTravelAgencyResponsibilityNotBetween(String value1, String value2) {
            addCriterion("travel_agency_responsibility not between", value1, value2, "travelAgencyResponsibility");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDriverIsNull() {
            addCriterion("driver is null");
            return (Criteria) this;
        }

        public Criteria andDriverIsNotNull() {
            addCriterion("driver is not null");
            return (Criteria) this;
        }

        public Criteria andDriverEqualTo(String value) {
            addCriterion("driver =", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotEqualTo(String value) {
            addCriterion("driver <>", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThan(String value) {
            addCriterion("driver >", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverGreaterThanOrEqualTo(String value) {
            addCriterion("driver >=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThan(String value) {
            addCriterion("driver <", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLessThanOrEqualTo(String value) {
            addCriterion("driver <=", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverLike(String value) {
            addCriterion("driver like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotLike(String value) {
            addCriterion("driver not like", value, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverIn(List<String> values) {
            addCriterion("driver in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotIn(List<String> values) {
            addCriterion("driver not in", values, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverBetween(String value1, String value2) {
            addCriterion("driver between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverNotBetween(String value1, String value2) {
            addCriterion("driver not between", value1, value2, "driver");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
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

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderResponseIsNull() {
            addCriterion("order_response is null");
            return (Criteria) this;
        }

        public Criteria andOrderResponseIsNotNull() {
            addCriterion("order_response is not null");
            return (Criteria) this;
        }

        public Criteria andOrderResponseEqualTo(String value) {
            addCriterion("order_response =", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseNotEqualTo(String value) {
            addCriterion("order_response <>", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseGreaterThan(String value) {
            addCriterion("order_response >", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseGreaterThanOrEqualTo(String value) {
            addCriterion("order_response >=", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseLessThan(String value) {
            addCriterion("order_response <", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseLessThanOrEqualTo(String value) {
            addCriterion("order_response <=", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseLike(String value) {
            addCriterion("order_response like", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseNotLike(String value) {
            addCriterion("order_response not like", value, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseIn(List<String> values) {
            addCriterion("order_response in", values, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseNotIn(List<String> values) {
            addCriterion("order_response not in", values, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseBetween(String value1, String value2) {
            addCriterion("order_response between", value1, value2, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andOrderResponseNotBetween(String value1, String value2) {
            addCriterion("order_response not between", value1, value2, "orderResponse");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(String value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(String value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(String value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(String value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(String value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(String value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLike(String value) {
            addCriterion("pay_way like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotLike(String value) {
            addCriterion("pay_way not like", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<String> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<String> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(String value1, String value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(String value1, String value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCarSupplyIsNull() {
            addCriterion("car_supply is null");
            return (Criteria) this;
        }

        public Criteria andCarSupplyIsNotNull() {
            addCriterion("car_supply is not null");
            return (Criteria) this;
        }

        public Criteria andCarSupplyEqualTo(String value) {
            addCriterion("car_supply =", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyNotEqualTo(String value) {
            addCriterion("car_supply <>", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyGreaterThan(String value) {
            addCriterion("car_supply >", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyGreaterThanOrEqualTo(String value) {
            addCriterion("car_supply >=", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyLessThan(String value) {
            addCriterion("car_supply <", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyLessThanOrEqualTo(String value) {
            addCriterion("car_supply <=", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyLike(String value) {
            addCriterion("car_supply like", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyNotLike(String value) {
            addCriterion("car_supply not like", value, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyIn(List<String> values) {
            addCriterion("car_supply in", values, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyNotIn(List<String> values) {
            addCriterion("car_supply not in", values, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyBetween(String value1, String value2) {
            addCriterion("car_supply between", value1, value2, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCarSupplyNotBetween(String value1, String value2) {
            addCriterion("car_supply not between", value1, value2, "carSupply");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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