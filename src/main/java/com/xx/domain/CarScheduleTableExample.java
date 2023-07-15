package com.xx.domain;

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

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
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

        public Criteria andDescriptionFileIsNull() {
            addCriterion("description_file is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileIsNotNull() {
            addCriterion("description_file is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileEqualTo(String value) {
            addCriterion("description_file =", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileNotEqualTo(String value) {
            addCriterion("description_file <>", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileGreaterThan(String value) {
            addCriterion("description_file >", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileGreaterThanOrEqualTo(String value) {
            addCriterion("description_file >=", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileLessThan(String value) {
            addCriterion("description_file <", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileLessThanOrEqualTo(String value) {
            addCriterion("description_file <=", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileLike(String value) {
            addCriterion("description_file like", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileNotLike(String value) {
            addCriterion("description_file not like", value, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileIn(List<String> values) {
            addCriterion("description_file in", values, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileNotIn(List<String> values) {
            addCriterion("description_file not in", values, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileBetween(String value1, String value2) {
            addCriterion("description_file between", value1, value2, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andDescriptionFileNotBetween(String value1, String value2) {
            addCriterion("description_file not between", value1, value2, "descriptionFile");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("invoice_status =", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("invoice_status <>", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("invoice_status >", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_status >=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("invoice_status <", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("invoice_status <=", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusLike(String value) {
            addCriterion("invoice_status like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("invoice_status not like", value, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("invoice_status in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("invoice_status not in", values, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("invoice_status between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("invoice_status not between", value1, value2, "invoiceStatus");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormIsNull() {
            addCriterion("official_settlement_form is null");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormIsNotNull() {
            addCriterion("official_settlement_form is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormEqualTo(String value) {
            addCriterion("official_settlement_form =", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormNotEqualTo(String value) {
            addCriterion("official_settlement_form <>", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormGreaterThan(String value) {
            addCriterion("official_settlement_form >", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormGreaterThanOrEqualTo(String value) {
            addCriterion("official_settlement_form >=", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormLessThan(String value) {
            addCriterion("official_settlement_form <", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormLessThanOrEqualTo(String value) {
            addCriterion("official_settlement_form <=", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormLike(String value) {
            addCriterion("official_settlement_form like", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormNotLike(String value) {
            addCriterion("official_settlement_form not like", value, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormIn(List<String> values) {
            addCriterion("official_settlement_form in", values, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormNotIn(List<String> values) {
            addCriterion("official_settlement_form not in", values, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormBetween(String value1, String value2) {
            addCriterion("official_settlement_form between", value1, value2, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormNotBetween(String value1, String value2) {
            addCriterion("official_settlement_form not between", value1, value2, "officialSettlementForm");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileIsNull() {
            addCriterion("official_settlement_form_file is null");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileIsNotNull() {
            addCriterion("official_settlement_form_file is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileEqualTo(String value) {
            addCriterion("official_settlement_form_file =", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileNotEqualTo(String value) {
            addCriterion("official_settlement_form_file <>", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileGreaterThan(String value) {
            addCriterion("official_settlement_form_file >", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileGreaterThanOrEqualTo(String value) {
            addCriterion("official_settlement_form_file >=", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileLessThan(String value) {
            addCriterion("official_settlement_form_file <", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileLessThanOrEqualTo(String value) {
            addCriterion("official_settlement_form_file <=", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileLike(String value) {
            addCriterion("official_settlement_form_file like", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileNotLike(String value) {
            addCriterion("official_settlement_form_file not like", value, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileIn(List<String> values) {
            addCriterion("official_settlement_form_file in", values, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileNotIn(List<String> values) {
            addCriterion("official_settlement_form_file not in", values, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileBetween(String value1, String value2) {
            addCriterion("official_settlement_form_file between", value1, value2, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andOfficialSettlementFormFileNotBetween(String value1, String value2) {
            addCriterion("official_settlement_form_file not between", value1, value2, "officialSettlementFormFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesIsNull() {
            addCriterion("kilometer_fees is null");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesIsNotNull() {
            addCriterion("kilometer_fees is not null");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesEqualTo(Long value) {
            addCriterion("kilometer_fees =", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesNotEqualTo(Long value) {
            addCriterion("kilometer_fees <>", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesGreaterThan(Long value) {
            addCriterion("kilometer_fees >", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("kilometer_fees >=", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesLessThan(Long value) {
            addCriterion("kilometer_fees <", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesLessThanOrEqualTo(Long value) {
            addCriterion("kilometer_fees <=", value, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesIn(List<Long> values) {
            addCriterion("kilometer_fees in", values, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesNotIn(List<Long> values) {
            addCriterion("kilometer_fees not in", values, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesBetween(Long value1, Long value2) {
            addCriterion("kilometer_fees between", value1, value2, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesNotBetween(Long value1, Long value2) {
            addCriterion("kilometer_fees not between", value1, value2, "kilometerFees");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileIsNull() {
            addCriterion("kilometer_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileIsNotNull() {
            addCriterion("kilometer_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileEqualTo(String value) {
            addCriterion("kilometer_fees_file =", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileNotEqualTo(String value) {
            addCriterion("kilometer_fees_file <>", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileGreaterThan(String value) {
            addCriterion("kilometer_fees_file >", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("kilometer_fees_file >=", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileLessThan(String value) {
            addCriterion("kilometer_fees_file <", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileLessThanOrEqualTo(String value) {
            addCriterion("kilometer_fees_file <=", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileLike(String value) {
            addCriterion("kilometer_fees_file like", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileNotLike(String value) {
            addCriterion("kilometer_fees_file not like", value, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileIn(List<String> values) {
            addCriterion("kilometer_fees_file in", values, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileNotIn(List<String> values) {
            addCriterion("kilometer_fees_file not in", values, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileBetween(String value1, String value2) {
            addCriterion("kilometer_fees_file between", value1, value2, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andKilometerFeesFileNotBetween(String value1, String value2) {
            addCriterion("kilometer_fees_file not between", value1, value2, "kilometerFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesIsNull() {
            addCriterion("road_fees is null");
            return (Criteria) this;
        }

        public Criteria andRoadFeesIsNotNull() {
            addCriterion("road_fees is not null");
            return (Criteria) this;
        }

        public Criteria andRoadFeesEqualTo(Long value) {
            addCriterion("road_fees =", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesNotEqualTo(Long value) {
            addCriterion("road_fees <>", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesGreaterThan(Long value) {
            addCriterion("road_fees >", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("road_fees >=", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesLessThan(Long value) {
            addCriterion("road_fees <", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesLessThanOrEqualTo(Long value) {
            addCriterion("road_fees <=", value, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesIn(List<Long> values) {
            addCriterion("road_fees in", values, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesNotIn(List<Long> values) {
            addCriterion("road_fees not in", values, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesBetween(Long value1, Long value2) {
            addCriterion("road_fees between", value1, value2, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesNotBetween(Long value1, Long value2) {
            addCriterion("road_fees not between", value1, value2, "roadFees");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileIsNull() {
            addCriterion("road_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileIsNotNull() {
            addCriterion("road_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileEqualTo(String value) {
            addCriterion("road_fees_file =", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileNotEqualTo(String value) {
            addCriterion("road_fees_file <>", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileGreaterThan(String value) {
            addCriterion("road_fees_file >", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("road_fees_file >=", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileLessThan(String value) {
            addCriterion("road_fees_file <", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileLessThanOrEqualTo(String value) {
            addCriterion("road_fees_file <=", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileLike(String value) {
            addCriterion("road_fees_file like", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileNotLike(String value) {
            addCriterion("road_fees_file not like", value, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileIn(List<String> values) {
            addCriterion("road_fees_file in", values, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileNotIn(List<String> values) {
            addCriterion("road_fees_file not in", values, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileBetween(String value1, String value2) {
            addCriterion("road_fees_file between", value1, value2, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andRoadFeesFileNotBetween(String value1, String value2) {
            addCriterion("road_fees_file not between", value1, value2, "roadFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesIsNull() {
            addCriterion("parking_fees is null");
            return (Criteria) this;
        }

        public Criteria andParkingFeesIsNotNull() {
            addCriterion("parking_fees is not null");
            return (Criteria) this;
        }

        public Criteria andParkingFeesEqualTo(Long value) {
            addCriterion("parking_fees =", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesNotEqualTo(Long value) {
            addCriterion("parking_fees <>", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesGreaterThan(Long value) {
            addCriterion("parking_fees >", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("parking_fees >=", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesLessThan(Long value) {
            addCriterion("parking_fees <", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesLessThanOrEqualTo(Long value) {
            addCriterion("parking_fees <=", value, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesIn(List<Long> values) {
            addCriterion("parking_fees in", values, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesNotIn(List<Long> values) {
            addCriterion("parking_fees not in", values, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesBetween(Long value1, Long value2) {
            addCriterion("parking_fees between", value1, value2, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesNotBetween(Long value1, Long value2) {
            addCriterion("parking_fees not between", value1, value2, "parkingFees");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileIsNull() {
            addCriterion("parking_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileIsNotNull() {
            addCriterion("parking_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileEqualTo(String value) {
            addCriterion("parking_fees_file =", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileNotEqualTo(String value) {
            addCriterion("parking_fees_file <>", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileGreaterThan(String value) {
            addCriterion("parking_fees_file >", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("parking_fees_file >=", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileLessThan(String value) {
            addCriterion("parking_fees_file <", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileLessThanOrEqualTo(String value) {
            addCriterion("parking_fees_file <=", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileLike(String value) {
            addCriterion("parking_fees_file like", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileNotLike(String value) {
            addCriterion("parking_fees_file not like", value, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileIn(List<String> values) {
            addCriterion("parking_fees_file in", values, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileNotIn(List<String> values) {
            addCriterion("parking_fees_file not in", values, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileBetween(String value1, String value2) {
            addCriterion("parking_fees_file between", value1, value2, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andParkingFeesFileNotBetween(String value1, String value2) {
            addCriterion("parking_fees_file not between", value1, value2, "parkingFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesIsNull() {
            addCriterion("hotel_fees is null");
            return (Criteria) this;
        }

        public Criteria andHotelFeesIsNotNull() {
            addCriterion("hotel_fees is not null");
            return (Criteria) this;
        }

        public Criteria andHotelFeesEqualTo(Long value) {
            addCriterion("hotel_fees =", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesNotEqualTo(Long value) {
            addCriterion("hotel_fees <>", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesGreaterThan(Long value) {
            addCriterion("hotel_fees >", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("hotel_fees >=", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesLessThan(Long value) {
            addCriterion("hotel_fees <", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesLessThanOrEqualTo(Long value) {
            addCriterion("hotel_fees <=", value, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesIn(List<Long> values) {
            addCriterion("hotel_fees in", values, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesNotIn(List<Long> values) {
            addCriterion("hotel_fees not in", values, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesBetween(Long value1, Long value2) {
            addCriterion("hotel_fees between", value1, value2, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesNotBetween(Long value1, Long value2) {
            addCriterion("hotel_fees not between", value1, value2, "hotelFees");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileIsNull() {
            addCriterion("hotel_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileIsNotNull() {
            addCriterion("hotel_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileEqualTo(String value) {
            addCriterion("hotel_fees_file =", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileNotEqualTo(String value) {
            addCriterion("hotel_fees_file <>", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileGreaterThan(String value) {
            addCriterion("hotel_fees_file >", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_fees_file >=", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileLessThan(String value) {
            addCriterion("hotel_fees_file <", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileLessThanOrEqualTo(String value) {
            addCriterion("hotel_fees_file <=", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileLike(String value) {
            addCriterion("hotel_fees_file like", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileNotLike(String value) {
            addCriterion("hotel_fees_file not like", value, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileIn(List<String> values) {
            addCriterion("hotel_fees_file in", values, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileNotIn(List<String> values) {
            addCriterion("hotel_fees_file not in", values, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileBetween(String value1, String value2) {
            addCriterion("hotel_fees_file between", value1, value2, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andHotelFeesFileNotBetween(String value1, String value2) {
            addCriterion("hotel_fees_file not between", value1, value2, "hotelFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesIsNull() {
            addCriterion("food_fees is null");
            return (Criteria) this;
        }

        public Criteria andFoodFeesIsNotNull() {
            addCriterion("food_fees is not null");
            return (Criteria) this;
        }

        public Criteria andFoodFeesEqualTo(Long value) {
            addCriterion("food_fees =", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesNotEqualTo(Long value) {
            addCriterion("food_fees <>", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesGreaterThan(Long value) {
            addCriterion("food_fees >", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("food_fees >=", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesLessThan(Long value) {
            addCriterion("food_fees <", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesLessThanOrEqualTo(Long value) {
            addCriterion("food_fees <=", value, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesIn(List<Long> values) {
            addCriterion("food_fees in", values, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesNotIn(List<Long> values) {
            addCriterion("food_fees not in", values, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesBetween(Long value1, Long value2) {
            addCriterion("food_fees between", value1, value2, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesNotBetween(Long value1, Long value2) {
            addCriterion("food_fees not between", value1, value2, "foodFees");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileIsNull() {
            addCriterion("food_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileIsNotNull() {
            addCriterion("food_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileEqualTo(String value) {
            addCriterion("food_fees_file =", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileNotEqualTo(String value) {
            addCriterion("food_fees_file <>", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileGreaterThan(String value) {
            addCriterion("food_fees_file >", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("food_fees_file >=", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileLessThan(String value) {
            addCriterion("food_fees_file <", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileLessThanOrEqualTo(String value) {
            addCriterion("food_fees_file <=", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileLike(String value) {
            addCriterion("food_fees_file like", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileNotLike(String value) {
            addCriterion("food_fees_file not like", value, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileIn(List<String> values) {
            addCriterion("food_fees_file in", values, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileNotIn(List<String> values) {
            addCriterion("food_fees_file not in", values, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileBetween(String value1, String value2) {
            addCriterion("food_fees_file between", value1, value2, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andFoodFeesFileNotBetween(String value1, String value2) {
            addCriterion("food_fees_file not between", value1, value2, "foodFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesIsNull() {
            addCriterion("water_fees is null");
            return (Criteria) this;
        }

        public Criteria andWaterFeesIsNotNull() {
            addCriterion("water_fees is not null");
            return (Criteria) this;
        }

        public Criteria andWaterFeesEqualTo(Long value) {
            addCriterion("water_fees =", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesNotEqualTo(Long value) {
            addCriterion("water_fees <>", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesGreaterThan(Long value) {
            addCriterion("water_fees >", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("water_fees >=", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesLessThan(Long value) {
            addCriterion("water_fees <", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesLessThanOrEqualTo(Long value) {
            addCriterion("water_fees <=", value, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesIn(List<Long> values) {
            addCriterion("water_fees in", values, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesNotIn(List<Long> values) {
            addCriterion("water_fees not in", values, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesBetween(Long value1, Long value2) {
            addCriterion("water_fees between", value1, value2, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesNotBetween(Long value1, Long value2) {
            addCriterion("water_fees not between", value1, value2, "waterFees");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileIsNull() {
            addCriterion("water_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileIsNotNull() {
            addCriterion("water_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileEqualTo(String value) {
            addCriterion("water_fees_file =", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileNotEqualTo(String value) {
            addCriterion("water_fees_file <>", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileGreaterThan(String value) {
            addCriterion("water_fees_file >", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("water_fees_file >=", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileLessThan(String value) {
            addCriterion("water_fees_file <", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileLessThanOrEqualTo(String value) {
            addCriterion("water_fees_file <=", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileLike(String value) {
            addCriterion("water_fees_file like", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileNotLike(String value) {
            addCriterion("water_fees_file not like", value, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileIn(List<String> values) {
            addCriterion("water_fees_file in", values, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileNotIn(List<String> values) {
            addCriterion("water_fees_file not in", values, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileBetween(String value1, String value2) {
            addCriterion("water_fees_file between", value1, value2, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andWaterFeesFileNotBetween(String value1, String value2) {
            addCriterion("water_fees_file not between", value1, value2, "waterFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesIsNull() {
            addCriterion("other_fees is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeesIsNotNull() {
            addCriterion("other_fees is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeesEqualTo(Long value) {
            addCriterion("other_fees =", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesNotEqualTo(Long value) {
            addCriterion("other_fees <>", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesGreaterThan(Long value) {
            addCriterion("other_fees >", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesGreaterThanOrEqualTo(Long value) {
            addCriterion("other_fees >=", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesLessThan(Long value) {
            addCriterion("other_fees <", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesLessThanOrEqualTo(Long value) {
            addCriterion("other_fees <=", value, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesIn(List<Long> values) {
            addCriterion("other_fees in", values, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesNotIn(List<Long> values) {
            addCriterion("other_fees not in", values, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesBetween(Long value1, Long value2) {
            addCriterion("other_fees between", value1, value2, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesNotBetween(Long value1, Long value2) {
            addCriterion("other_fees not between", value1, value2, "otherFees");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileIsNull() {
            addCriterion("other_fees_file is null");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileIsNotNull() {
            addCriterion("other_fees_file is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileEqualTo(String value) {
            addCriterion("other_fees_file =", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileNotEqualTo(String value) {
            addCriterion("other_fees_file <>", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileGreaterThan(String value) {
            addCriterion("other_fees_file >", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileGreaterThanOrEqualTo(String value) {
            addCriterion("other_fees_file >=", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileLessThan(String value) {
            addCriterion("other_fees_file <", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileLessThanOrEqualTo(String value) {
            addCriterion("other_fees_file <=", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileLike(String value) {
            addCriterion("other_fees_file like", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileNotLike(String value) {
            addCriterion("other_fees_file not like", value, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileIn(List<String> values) {
            addCriterion("other_fees_file in", values, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileNotIn(List<String> values) {
            addCriterion("other_fees_file not in", values, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileBetween(String value1, String value2) {
            addCriterion("other_fees_file between", value1, value2, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andOtherFeesFileNotBetween(String value1, String value2) {
            addCriterion("other_fees_file not between", value1, value2, "otherFeesFile");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNull() {
            addCriterion("price2 is null");
            return (Criteria) this;
        }

        public Criteria andPrice2IsNotNull() {
            addCriterion("price2 is not null");
            return (Criteria) this;
        }

        public Criteria andPrice2EqualTo(Long value) {
            addCriterion("price2 =", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotEqualTo(Long value) {
            addCriterion("price2 <>", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThan(Long value) {
            addCriterion("price2 >", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2GreaterThanOrEqualTo(Long value) {
            addCriterion("price2 >=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThan(Long value) {
            addCriterion("price2 <", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2LessThanOrEqualTo(Long value) {
            addCriterion("price2 <=", value, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2In(List<Long> values) {
            addCriterion("price2 in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotIn(List<Long> values) {
            addCriterion("price2 not in", values, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2Between(Long value1, Long value2) {
            addCriterion("price2 between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andPrice2NotBetween(Long value1, Long value2) {
            addCriterion("price2 not between", value1, value2, "price2");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagIsNull() {
            addCriterion("accounting_flag is null");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagIsNotNull() {
            addCriterion("accounting_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagEqualTo(Long value) {
            addCriterion("accounting_flag =", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagNotEqualTo(Long value) {
            addCriterion("accounting_flag <>", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagGreaterThan(Long value) {
            addCriterion("accounting_flag >", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagGreaterThanOrEqualTo(Long value) {
            addCriterion("accounting_flag >=", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagLessThan(Long value) {
            addCriterion("accounting_flag <", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagLessThanOrEqualTo(Long value) {
            addCriterion("accounting_flag <=", value, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagIn(List<Long> values) {
            addCriterion("accounting_flag in", values, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagNotIn(List<Long> values) {
            addCriterion("accounting_flag not in", values, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagBetween(Long value1, Long value2) {
            addCriterion("accounting_flag between", value1, value2, "accountingFlag");
            return (Criteria) this;
        }

        public Criteria andAccountingFlagNotBetween(Long value1, Long value2) {
            addCriterion("accounting_flag not between", value1, value2, "accountingFlag");
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