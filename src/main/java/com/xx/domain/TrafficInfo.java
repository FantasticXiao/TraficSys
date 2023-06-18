package com.xx.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * traffic_info
 * @author 
 */
public class TrafficInfo implements Serializable {
    private Integer id;

    private String brand;

    private String model;

    private String color;

    private Integer passengerCapacity;

    private String carType;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date buyDate;

    private Integer mileage;

    private Integer driverId;

    private String carNumber;

    private String businessScope;

    private String operateNumber;

    private String sign;

    private String trafficLevel;

    private String trafficOwner;

    private String ownerTel;

    /**
     * 行驶证年检有效期

     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date drivingLicense;

    /**
     * 营运证年检有效期

     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date tradingLicense;

    /**
     * 营运代理证换证期限

     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date operatingLicense;

    /**
     * 核准证经营期限
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date approvalLicense;

    /**
     * 车评年检有效期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date evaluationLicense;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getOperateNumber() {
        return operateNumber;
    }

    public void setOperateNumber(String operateNumber) {
        this.operateNumber = operateNumber;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTrafficLevel() {
        return trafficLevel;
    }

    public void setTrafficLevel(String trafficLevel) {
        this.trafficLevel = trafficLevel;
    }

    public String getTrafficOwner() {
        return trafficOwner;
    }

    public void setTrafficOwner(String trafficOwner) {
        this.trafficOwner = trafficOwner;
    }

    public String getOwnerTel() {
        return ownerTel;
    }

    public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }

    public Date getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(Date drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Date getTradingLicense() {
        return tradingLicense;
    }

    public void setTradingLicense(Date tradingLicense) {
        this.tradingLicense = tradingLicense;
    }

    public Date getOperatingLicense() {
        return operatingLicense;
    }

    public void setOperatingLicense(Date operatingLicense) {
        this.operatingLicense = operatingLicense;
    }

    public Date getApprovalLicense() {
        return approvalLicense;
    }

    public void setApprovalLicense(Date approvalLicense) {
        this.approvalLicense = approvalLicense;
    }

    public Date getEvaluationLicense() {
        return evaluationLicense;
    }

    public void setEvaluationLicense(Date evaluationLicense) {
        this.evaluationLicense = evaluationLicense;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        TrafficInfo other = (TrafficInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getModel() == null ? other.getModel() == null : this.getModel().equals(other.getModel()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getPassengerCapacity() == null ? other.getPassengerCapacity() == null : this.getPassengerCapacity().equals(other.getPassengerCapacity()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getBuyDate() == null ? other.getBuyDate() == null : this.getBuyDate().equals(other.getBuyDate()))
            && (this.getMileage() == null ? other.getMileage() == null : this.getMileage().equals(other.getMileage()))
            && (this.getDriverId() == null ? other.getDriverId() == null : this.getDriverId().equals(other.getDriverId()))
            && (this.getCarNumber() == null ? other.getCarNumber() == null : this.getCarNumber().equals(other.getCarNumber()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getOperateNumber() == null ? other.getOperateNumber() == null : this.getOperateNumber().equals(other.getOperateNumber()))
            && (this.getSign() == null ? other.getSign() == null : this.getSign().equals(other.getSign()))
            && (this.getTrafficLevel() == null ? other.getTrafficLevel() == null : this.getTrafficLevel().equals(other.getTrafficLevel()))
            && (this.getTrafficOwner() == null ? other.getTrafficOwner() == null : this.getTrafficOwner().equals(other.getTrafficOwner()))
            && (this.getOwnerTel() == null ? other.getOwnerTel() == null : this.getOwnerTel().equals(other.getOwnerTel()))
            && (this.getDrivingLicense() == null ? other.getDrivingLicense() == null : this.getDrivingLicense().equals(other.getDrivingLicense()))
            && (this.getTradingLicense() == null ? other.getTradingLicense() == null : this.getTradingLicense().equals(other.getTradingLicense()))
            && (this.getOperatingLicense() == null ? other.getOperatingLicense() == null : this.getOperatingLicense().equals(other.getOperatingLicense()))
            && (this.getApprovalLicense() == null ? other.getApprovalLicense() == null : this.getApprovalLicense().equals(other.getApprovalLicense()))
            && (this.getEvaluationLicense() == null ? other.getEvaluationLicense() == null : this.getEvaluationLicense().equals(other.getEvaluationLicense()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getModel() == null) ? 0 : getModel().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getPassengerCapacity() == null) ? 0 : getPassengerCapacity().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getBuyDate() == null) ? 0 : getBuyDate().hashCode());
        result = prime * result + ((getMileage() == null) ? 0 : getMileage().hashCode());
        result = prime * result + ((getDriverId() == null) ? 0 : getDriverId().hashCode());
        result = prime * result + ((getCarNumber() == null) ? 0 : getCarNumber().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getOperateNumber() == null) ? 0 : getOperateNumber().hashCode());
        result = prime * result + ((getSign() == null) ? 0 : getSign().hashCode());
        result = prime * result + ((getTrafficLevel() == null) ? 0 : getTrafficLevel().hashCode());
        result = prime * result + ((getTrafficOwner() == null) ? 0 : getTrafficOwner().hashCode());
        result = prime * result + ((getOwnerTel() == null) ? 0 : getOwnerTel().hashCode());
        result = prime * result + ((getDrivingLicense() == null) ? 0 : getDrivingLicense().hashCode());
        result = prime * result + ((getTradingLicense() == null) ? 0 : getTradingLicense().hashCode());
        result = prime * result + ((getOperatingLicense() == null) ? 0 : getOperatingLicense().hashCode());
        result = prime * result + ((getApprovalLicense() == null) ? 0 : getApprovalLicense().hashCode());
        result = prime * result + ((getEvaluationLicense() == null) ? 0 : getEvaluationLicense().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brand=").append(brand);
        sb.append(", model=").append(model);
        sb.append(", color=").append(color);
        sb.append(", passengerCapacity=").append(passengerCapacity);
        sb.append(", carType=").append(carType);
        sb.append(", buyDate=").append(buyDate);
        sb.append(", mileage=").append(mileage);
        sb.append(", driverId=").append(driverId);
        sb.append(", carNumber=").append(carNumber);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", operateNumber=").append(operateNumber);
        sb.append(", sign=").append(sign);
        sb.append(", trafficLevel=").append(trafficLevel);
        sb.append(", trafficOwner=").append(trafficOwner);
        sb.append(", ownerTel=").append(ownerTel);
        sb.append(", drivingLicense=").append(drivingLicense);
        sb.append(", tradingLicense=").append(tradingLicense);
        sb.append(", operatingLicense=").append(operatingLicense);
        sb.append(", approvalLicense=").append(approvalLicense);
        sb.append(", evaluationLicense=").append(evaluationLicense);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}