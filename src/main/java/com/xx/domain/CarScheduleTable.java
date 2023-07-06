package com.xx.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * car_schedule_table
 * @author 
 */
public class CarScheduleTable implements Serializable {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;

    private String carNumber;

    private Integer passengerCapacity;

    private String resDriver;

    private String resDriverTel;

    private String startAddress;

    private String endAddress;

    private String travelAgency;

    private String travelAgencyResponsibility;

    private BigDecimal price;

    private String driver;

    private String driverTel;

    /**
     * 行程
     */
    private String description;

    /**
     * 订单编号
     */
    private String orderName;

    /**
     * 订单负责人
     */
    private String orderResponse;

    /**
     * 支付方式
     */
    private String payWay;

    /**
     * 收款状态
     */
    private String status;

    private String carSupply;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getResDriver() {
        return resDriver;
    }

    public void setResDriver(String resDriver) {
        this.resDriver = resDriver;
    }

    public String getResDriverTel() {
        return resDriverTel;
    }

    public void setResDriverTel(String resDriverTel) {
        this.resDriverTel = resDriverTel;
    }

    public String getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    public String getEndAddress() {
        return endAddress;
    }

    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    public String getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(String travelAgency) {
        this.travelAgency = travelAgency;
    }

    public String getTravelAgencyResponsibility() {
        return travelAgencyResponsibility;
    }

    public void setTravelAgencyResponsibility(String travelAgencyResponsibility) {
        this.travelAgencyResponsibility = travelAgencyResponsibility;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderResponse() {
        return orderResponse;
    }

    public void setOrderResponse(String orderResponse) {
        this.orderResponse = orderResponse;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarSupply() {
        return carSupply;
    }

    public void setCarSupply(String carSupply) {
        this.carSupply = carSupply;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CarScheduleTable other = (CarScheduleTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCarNumber() == null ? other.getCarNumber() == null : this.getCarNumber().equals(other.getCarNumber()))
            && (this.getPassengerCapacity() == null ? other.getPassengerCapacity() == null : this.getPassengerCapacity().equals(other.getPassengerCapacity()))
            && (this.getResDriver() == null ? other.getResDriver() == null : this.getResDriver().equals(other.getResDriver()))
            && (this.getResDriverTel() == null ? other.getResDriverTel() == null : this.getResDriverTel().equals(other.getResDriverTel()))
            && (this.getStartAddress() == null ? other.getStartAddress() == null : this.getStartAddress().equals(other.getStartAddress()))
            && (this.getEndAddress() == null ? other.getEndAddress() == null : this.getEndAddress().equals(other.getEndAddress()))
            && (this.getTravelAgency() == null ? other.getTravelAgency() == null : this.getTravelAgency().equals(other.getTravelAgency()))
            && (this.getTravelAgencyResponsibility() == null ? other.getTravelAgencyResponsibility() == null : this.getTravelAgencyResponsibility().equals(other.getTravelAgencyResponsibility()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getDriver() == null ? other.getDriver() == null : this.getDriver().equals(other.getDriver()))
            && (this.getDriverTel() == null ? other.getDriverTel() == null : this.getDriverTel().equals(other.getDriverTel()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderResponse() == null ? other.getOrderResponse() == null : this.getOrderResponse().equals(other.getOrderResponse()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCarSupply() == null ? other.getCarSupply() == null : this.getCarSupply().equals(other.getCarSupply()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCarNumber() == null) ? 0 : getCarNumber().hashCode());
        result = prime * result + ((getPassengerCapacity() == null) ? 0 : getPassengerCapacity().hashCode());
        result = prime * result + ((getResDriver() == null) ? 0 : getResDriver().hashCode());
        result = prime * result + ((getResDriverTel() == null) ? 0 : getResDriverTel().hashCode());
        result = prime * result + ((getStartAddress() == null) ? 0 : getStartAddress().hashCode());
        result = prime * result + ((getEndAddress() == null) ? 0 : getEndAddress().hashCode());
        result = prime * result + ((getTravelAgency() == null) ? 0 : getTravelAgency().hashCode());
        result = prime * result + ((getTravelAgencyResponsibility() == null) ? 0 : getTravelAgencyResponsibility().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getDriver() == null) ? 0 : getDriver().hashCode());
        result = prime * result + ((getDriverTel() == null) ? 0 : getDriverTel().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderResponse() == null) ? 0 : getOrderResponse().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCarSupply() == null) ? 0 : getCarSupply().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", passengerCapacity=").append(passengerCapacity);
        sb.append(", resDriver=").append(resDriver);
        sb.append(", resDriverTel=").append(resDriverTel);
        sb.append(", startAddress=").append(startAddress);
        sb.append(", endAddress=").append(endAddress);
        sb.append(", travelAgency=").append(travelAgency);
        sb.append(", travelAgencyResponsibility=").append(travelAgencyResponsibility);
        sb.append(", price=").append(price);
        sb.append(", driver=").append(driver);
        sb.append(", driverTel=").append(driverTel);
        sb.append(", description=").append(description);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderResponse=").append(orderResponse);
        sb.append(", payWay=").append(payWay);
        sb.append(", status=").append(status);
        sb.append(", carSupply=").append(carSupply);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}