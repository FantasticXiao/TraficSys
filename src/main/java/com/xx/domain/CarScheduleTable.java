package com.xx.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
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

    private Long price;

    private String driver;

    private String driverTel;

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

    /**
     * 行程，用车概述
     */
    private String description;

    private String descriptionFile;

    /**
     * 发票情况
     */
    private String invoiceStatus;

    /**
     * 公务结算单
     */
    private String officialSettlementForm;

    private String officialSettlementFormFile;

    /**
     * 公里数
     */
    private Long kilometerFees;

    private String kilometerFeesFile;

    /**
     * 路桥费
     */
    private Long roadFees;

    private String roadFeesFile;

    /**
     * 停车费
     */
    private Long parkingFees;

    private String parkingFeesFile;

    /**
     * 住宿费
     */
    private Long hotelFees;

    private String hotelFeesFile;

    /**
     * 餐费
     */
    private Long foodFees;

    private String foodFeesFile;

    /**
     * 水费
     */
    private Long waterFees;

    private String waterFeesFile;

    /**
     * 杂费
     */
    private Long otherFees;

    private String otherFeesFile;

    private Long price2;

    /**
     * 是否入账
     */
    private Long accountingFlag;

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionFile() {
        return descriptionFile;
    }

    public void setDescriptionFile(String descriptionFile) {
        this.descriptionFile = descriptionFile;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getOfficialSettlementForm() {
        return officialSettlementForm;
    }

    public void setOfficialSettlementForm(String officialSettlementForm) {
        this.officialSettlementForm = officialSettlementForm;
    }

    public String getOfficialSettlementFormFile() {
        return officialSettlementFormFile;
    }

    public void setOfficialSettlementFormFile(String officialSettlementFormFile) {
        this.officialSettlementFormFile = officialSettlementFormFile;
    }

    public Long getKilometerFees() {
        return kilometerFees;
    }

    public void setKilometerFees(Long kilometerFees) {
        this.kilometerFees = kilometerFees;
    }

    public String getKilometerFeesFile() {
        return kilometerFeesFile;
    }

    public void setKilometerFeesFile(String kilometerFeesFile) {
        this.kilometerFeesFile = kilometerFeesFile;
    }

    public Long getRoadFees() {
        return roadFees;
    }

    public void setRoadFees(Long roadFees) {
        this.roadFees = roadFees;
    }

    public String getRoadFeesFile() {
        return roadFeesFile;
    }

    public void setRoadFeesFile(String roadFeesFile) {
        this.roadFeesFile = roadFeesFile;
    }

    public Long getParkingFees() {
        return parkingFees;
    }

    public void setParkingFees(Long parkingFees) {
        this.parkingFees = parkingFees;
    }

    public String getParkingFeesFile() {
        return parkingFeesFile;
    }

    public void setParkingFeesFile(String parkingFeesFile) {
        this.parkingFeesFile = parkingFeesFile;
    }

    public Long getHotelFees() {
        return hotelFees;
    }

    public void setHotelFees(Long hotelFees) {
        this.hotelFees = hotelFees;
    }

    public String getHotelFeesFile() {
        return hotelFeesFile;
    }

    public void setHotelFeesFile(String hotelFeesFile) {
        this.hotelFeesFile = hotelFeesFile;
    }

    public Long getFoodFees() {
        return foodFees;
    }

    public void setFoodFees(Long foodFees) {
        this.foodFees = foodFees;
    }

    public String getFoodFeesFile() {
        return foodFeesFile;
    }

    public void setFoodFeesFile(String foodFeesFile) {
        this.foodFeesFile = foodFeesFile;
    }

    public Long getWaterFees() {
        return waterFees;
    }

    public void setWaterFees(Long waterFees) {
        this.waterFees = waterFees;
    }

    public String getWaterFeesFile() {
        return waterFeesFile;
    }

    public void setWaterFeesFile(String waterFeesFile) {
        this.waterFeesFile = waterFeesFile;
    }

    public Long getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(Long otherFees) {
        this.otherFees = otherFees;
    }

    public String getOtherFeesFile() {
        return otherFeesFile;
    }

    public void setOtherFeesFile(String otherFeesFile) {
        this.otherFeesFile = otherFeesFile;
    }

    public Long getPrice2() {
        return price2;
    }

    public void setPrice2(Long price2) {
        this.price2 = price2;
    }

    public Long getAccountingFlag() {
        return accountingFlag;
    }

    public void setAccountingFlag(Long accountingFlag) {
        this.accountingFlag = accountingFlag;
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
            && (this.getOrderName() == null ? other.getOrderName() == null : this.getOrderName().equals(other.getOrderName()))
            && (this.getOrderResponse() == null ? other.getOrderResponse() == null : this.getOrderResponse().equals(other.getOrderResponse()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCarSupply() == null ? other.getCarSupply() == null : this.getCarSupply().equals(other.getCarSupply()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDescriptionFile() == null ? other.getDescriptionFile() == null : this.getDescriptionFile().equals(other.getDescriptionFile()))
            && (this.getInvoiceStatus() == null ? other.getInvoiceStatus() == null : this.getInvoiceStatus().equals(other.getInvoiceStatus()))
            && (this.getOfficialSettlementForm() == null ? other.getOfficialSettlementForm() == null : this.getOfficialSettlementForm().equals(other.getOfficialSettlementForm()))
            && (this.getOfficialSettlementFormFile() == null ? other.getOfficialSettlementFormFile() == null : this.getOfficialSettlementFormFile().equals(other.getOfficialSettlementFormFile()))
            && (this.getKilometerFees() == null ? other.getKilometerFees() == null : this.getKilometerFees().equals(other.getKilometerFees()))
            && (this.getKilometerFeesFile() == null ? other.getKilometerFeesFile() == null : this.getKilometerFeesFile().equals(other.getKilometerFeesFile()))
            && (this.getRoadFees() == null ? other.getRoadFees() == null : this.getRoadFees().equals(other.getRoadFees()))
            && (this.getRoadFeesFile() == null ? other.getRoadFeesFile() == null : this.getRoadFeesFile().equals(other.getRoadFeesFile()))
            && (this.getParkingFees() == null ? other.getParkingFees() == null : this.getParkingFees().equals(other.getParkingFees()))
            && (this.getParkingFeesFile() == null ? other.getParkingFeesFile() == null : this.getParkingFeesFile().equals(other.getParkingFeesFile()))
            && (this.getHotelFees() == null ? other.getHotelFees() == null : this.getHotelFees().equals(other.getHotelFees()))
            && (this.getHotelFeesFile() == null ? other.getHotelFeesFile() == null : this.getHotelFeesFile().equals(other.getHotelFeesFile()))
            && (this.getFoodFees() == null ? other.getFoodFees() == null : this.getFoodFees().equals(other.getFoodFees()))
            && (this.getFoodFeesFile() == null ? other.getFoodFeesFile() == null : this.getFoodFeesFile().equals(other.getFoodFeesFile()))
            && (this.getWaterFees() == null ? other.getWaterFees() == null : this.getWaterFees().equals(other.getWaterFees()))
            && (this.getWaterFeesFile() == null ? other.getWaterFeesFile() == null : this.getWaterFeesFile().equals(other.getWaterFeesFile()))
            && (this.getOtherFees() == null ? other.getOtherFees() == null : this.getOtherFees().equals(other.getOtherFees()))
            && (this.getOtherFeesFile() == null ? other.getOtherFeesFile() == null : this.getOtherFeesFile().equals(other.getOtherFeesFile()))
            && (this.getPrice2() == null ? other.getPrice2() == null : this.getPrice2().equals(other.getPrice2()))
            && (this.getAccountingFlag() == null ? other.getAccountingFlag() == null : this.getAccountingFlag().equals(other.getAccountingFlag()));
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
        result = prime * result + ((getOrderName() == null) ? 0 : getOrderName().hashCode());
        result = prime * result + ((getOrderResponse() == null) ? 0 : getOrderResponse().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCarSupply() == null) ? 0 : getCarSupply().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDescriptionFile() == null) ? 0 : getDescriptionFile().hashCode());
        result = prime * result + ((getInvoiceStatus() == null) ? 0 : getInvoiceStatus().hashCode());
        result = prime * result + ((getOfficialSettlementForm() == null) ? 0 : getOfficialSettlementForm().hashCode());
        result = prime * result + ((getOfficialSettlementFormFile() == null) ? 0 : getOfficialSettlementFormFile().hashCode());
        result = prime * result + ((getKilometerFees() == null) ? 0 : getKilometerFees().hashCode());
        result = prime * result + ((getKilometerFeesFile() == null) ? 0 : getKilometerFeesFile().hashCode());
        result = prime * result + ((getRoadFees() == null) ? 0 : getRoadFees().hashCode());
        result = prime * result + ((getRoadFeesFile() == null) ? 0 : getRoadFeesFile().hashCode());
        result = prime * result + ((getParkingFees() == null) ? 0 : getParkingFees().hashCode());
        result = prime * result + ((getParkingFeesFile() == null) ? 0 : getParkingFeesFile().hashCode());
        result = prime * result + ((getHotelFees() == null) ? 0 : getHotelFees().hashCode());
        result = prime * result + ((getHotelFeesFile() == null) ? 0 : getHotelFeesFile().hashCode());
        result = prime * result + ((getFoodFees() == null) ? 0 : getFoodFees().hashCode());
        result = prime * result + ((getFoodFeesFile() == null) ? 0 : getFoodFeesFile().hashCode());
        result = prime * result + ((getWaterFees() == null) ? 0 : getWaterFees().hashCode());
        result = prime * result + ((getWaterFeesFile() == null) ? 0 : getWaterFeesFile().hashCode());
        result = prime * result + ((getOtherFees() == null) ? 0 : getOtherFees().hashCode());
        result = prime * result + ((getOtherFeesFile() == null) ? 0 : getOtherFeesFile().hashCode());
        result = prime * result + ((getPrice2() == null) ? 0 : getPrice2().hashCode());
        result = prime * result + ((getAccountingFlag() == null) ? 0 : getAccountingFlag().hashCode());
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
        sb.append(", orderName=").append(orderName);
        sb.append(", orderResponse=").append(orderResponse);
        sb.append(", payWay=").append(payWay);
        sb.append(", status=").append(status);
        sb.append(", carSupply=").append(carSupply);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append(", descriptionFile=").append(descriptionFile);
        sb.append(", invoiceStatus=").append(invoiceStatus);
        sb.append(", officialSettlementForm=").append(officialSettlementForm);
        sb.append(", officialSettlementFormFile=").append(officialSettlementFormFile);
        sb.append(", kilometerFees=").append(kilometerFees);
        sb.append(", kilometerFeesFile=").append(kilometerFeesFile);
        sb.append(", roadFees=").append(roadFees);
        sb.append(", roadFeesFile=").append(roadFeesFile);
        sb.append(", parkingFees=").append(parkingFees);
        sb.append(", parkingFeesFile=").append(parkingFeesFile);
        sb.append(", hotelFees=").append(hotelFees);
        sb.append(", hotelFeesFile=").append(hotelFeesFile);
        sb.append(", foodFees=").append(foodFees);
        sb.append(", foodFeesFile=").append(foodFeesFile);
        sb.append(", waterFees=").append(waterFees);
        sb.append(", waterFeesFile=").append(waterFeesFile);
        sb.append(", otherFees=").append(otherFees);
        sb.append(", otherFeesFile=").append(otherFeesFile);
        sb.append(", price2=").append(price2);
        sb.append(", accountingFlag=").append(accountingFlag);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}