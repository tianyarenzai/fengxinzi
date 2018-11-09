package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 行政村情况统计表<br/>
 * date: 2018年06月14日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class VillageStatisticsDto implements Serializable {

    private String aad001;//贫困村编号
    private String IsVillRoad;//村组道路是否通畅
    private String IsOilToSand;//是否油返砂
    private Double Mileage;//未通里程
    private String OilToSandMileage;//油返砂里程
    private String IsFocusWater;//是否在集中供水
    private String IsTapWater;//是否通自来水
    private String ContrustionContentNumber;//人饮和灌溉设施建设内容
    private String IsNaturalElectric;//是否自然村是有生产用电
    private String IsPovertyElectric;//是否贫困户生产生活
    private String ContrustionContentElectric;//用电情况基础设施

    public VillageStatisticsDto(String aad001, String isVillRoad, String isOilToSand, Double mileage, String oilToSandMileage, String isFocusWater, String isTapWater, String contrustionContentNumber, String isNaturalElectric, String isPovertyElectric, String contrustionContentElectric) {
        this.aad001 = aad001;
        IsVillRoad = isVillRoad;
        IsOilToSand = isOilToSand;
        Mileage = mileage;
        OilToSandMileage = oilToSandMileage;
        IsFocusWater = isFocusWater;
        IsTapWater = isTapWater;
        ContrustionContentNumber = contrustionContentNumber;
        IsNaturalElectric = isNaturalElectric;
        IsPovertyElectric = isPovertyElectric;
        ContrustionContentElectric = contrustionContentElectric;
    }

    public String getAad001() {
        return aad001;
    }

    public void setAad001(String aad001) {
        this.aad001 = aad001;
    }

    public VillageStatisticsDto() {
        super();
    }

    public String getIsVillRoad() {
        return IsVillRoad;
    }

    public void setIsVillRoad(String isVillRoad) {
        IsVillRoad = isVillRoad;
    }

    public String getIsOilToSand() {
        return IsOilToSand;
    }

    public void setIsOilToSand(String isOilToSand) {
        IsOilToSand = isOilToSand;
    }

    public Double getMileage() {
        return Mileage;
    }

    public void setMileage(Double mileage) {
        Mileage = mileage;
    }

    public String getOilToSandMileage() {
        return OilToSandMileage;
    }

    public void setOilToSandMileage(String oilToSandMileage) {
        OilToSandMileage = oilToSandMileage;
    }

    public String getIsFocusWater() {
        return IsFocusWater;
    }

    public void setIsFocusWater(String isFocusWater) {
        IsFocusWater = isFocusWater;
    }

    public String getIsTapWater() {
        return IsTapWater;
    }

    public void setIsTapWater(String isTapWater) {
        IsTapWater = isTapWater;
    }

    public String getContrustionContentNumber() {
        return ContrustionContentNumber;
    }

    public void setContrustionContentNumber(String contrustionContentNumber) {
        ContrustionContentNumber = contrustionContentNumber;
    }

    public String getIsNaturalElectric() {
        return IsNaturalElectric;
    }

    public void setIsNaturalElectric(String isNaturalElectric) {
        IsNaturalElectric = isNaturalElectric;
    }

    public String getIsPovertyElectric() {
        return IsPovertyElectric;
    }

    public void setIsPovertyElectric(String isPovertyElectric) {
        IsPovertyElectric = isPovertyElectric;
    }

    public String getContrustionContentElectric() {
        return ContrustionContentElectric;
    }

    public void setContrustionContentElectric(String contrustionContentElectric) {
        ContrustionContentElectric = contrustionContentElectric;
    }

    @Override
    public String toString() {
        return "VillageStatisticsDto{" +
                "aad001='" + aad001 + '\'' +
                ", IsVillRoad='" + IsVillRoad + '\'' +
                ", IsOilToSand='" + IsOilToSand + '\'' +
                ", Mileage=" + Mileage +
                ", OilToSandMileage='" + OilToSandMileage + '\'' +
                ", IsFocusWater='" + IsFocusWater + '\'' +
                ", IsTapWater='" + IsTapWater + '\'' +
                ", ContrustionContentNumber='" + ContrustionContentNumber + '\'' +
                ", IsNaturalElectric='" + IsNaturalElectric + '\'' +
                ", IsPovertyElectric='" + IsPovertyElectric + '\'' +
                ", ContrustionContentElectric='" + ContrustionContentElectric + '\'' +
                '}';
    }
}
