package com.sysh.entity.helpmea;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class VillInfrastDD implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.DISTRICT_NAME
     *
     * @mbg.generated
     */
    private String districtName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.TOWN_NAME
     *
     * @mbg.generated
     */
    private String townName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.VILLAGE_NAME
     *
     * @mbg.generated
     */
    private String villageName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_VILL_ROAD
     *
     * @mbg.generated
     */
    private String isVillRoad;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.NOACCESS_MILEAGE
     *
     * @mbg.generated
     */
    private BigDecimal noaccessMileage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_OIL_TO_SAND
     *
     * @mbg.generated
     */
    private String isOilToSand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.OIL_TO_SAND_NUM
     *
     * @mbg.generated
     */
    private BigDecimal oilToSandNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_FOCUS_WATER
     *
     * @mbg.generated
     */
    private String isFocusWater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_TAP_WATER
     *
     * @mbg.generated
     */
    private String isTapWater;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.CONSTR_NUM
     *
     * @mbg.generated
     */
    private String constrNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_NATU_PRO_POW
     *
     * @mbg.generated
     */
    private String isNatuProPow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.IS_POV_PRO_POW
     *
     * @mbg.generated
     */
    private String isPovProPow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.CONS_CONT_E
     *
     * @mbg.generated
     */
    private String consContE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.ELECT_REMARKS
     *
     * @mbg.generated
     */
    private String electRemarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_VILL_INFRAST.ZONE_YEAR
     *
     * @mbg.generated
     */
    private Long zoneYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_VILL_INFRAST
     *
     * @mbg.generated
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.ID
     *
     * @return the value of TBL_VILL_INFRAST.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.ID
     *
     * @param id the value for TBL_VILL_INFRAST.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.DISTRICT_NAME
     *
     * @return the value of TBL_VILL_INFRAST.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.DISTRICT_NAME
     *
     * @param districtName the value for TBL_VILL_INFRAST.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.TOWN_NAME
     *
     * @return the value of TBL_VILL_INFRAST.TOWN_NAME
     *
     * @mbg.generated
     */
    public String getTownName() {
        return townName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.TOWN_NAME
     *
     * @param townName the value for TBL_VILL_INFRAST.TOWN_NAME
     *
     * @mbg.generated
     */
    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.VILLAGE_NAME
     *
     * @return the value of TBL_VILL_INFRAST.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.VILLAGE_NAME
     *
     * @param villageName the value for TBL_VILL_INFRAST.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_VILL_ROAD
     *
     * @return the value of TBL_VILL_INFRAST.IS_VILL_ROAD
     *
     * @mbg.generated
     */
    public String getIsVillRoad() {
        return isVillRoad;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_VILL_ROAD
     *
     * @param isVillRoad the value for TBL_VILL_INFRAST.IS_VILL_ROAD
     *
     * @mbg.generated
     */
    public void setIsVillRoad(String isVillRoad) {
        this.isVillRoad = isVillRoad == null ? null : isVillRoad.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.NOACCESS_MILEAGE
     *
     * @return the value of TBL_VILL_INFRAST.NOACCESS_MILEAGE
     *
     * @mbg.generated
     */
    public BigDecimal getNoaccessMileage() {
        return noaccessMileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.NOACCESS_MILEAGE
     *
     * @param noaccessMileage the value for TBL_VILL_INFRAST.NOACCESS_MILEAGE
     *
     * @mbg.generated
     */
    public void setNoaccessMileage(BigDecimal noaccessMileage) {
        this.noaccessMileage = noaccessMileage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_OIL_TO_SAND
     *
     * @return the value of TBL_VILL_INFRAST.IS_OIL_TO_SAND
     *
     * @mbg.generated
     */
    public String getIsOilToSand() {
        return isOilToSand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_OIL_TO_SAND
     *
     * @param isOilToSand the value for TBL_VILL_INFRAST.IS_OIL_TO_SAND
     *
     * @mbg.generated
     */
    public void setIsOilToSand(String isOilToSand) {
        this.isOilToSand = isOilToSand == null ? null : isOilToSand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.OIL_TO_SAND_NUM
     *
     * @return the value of TBL_VILL_INFRAST.OIL_TO_SAND_NUM
     *
     * @mbg.generated
     */
    public BigDecimal getOilToSandNum() {
        return oilToSandNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.OIL_TO_SAND_NUM
     *
     * @param oilToSandNum the value for TBL_VILL_INFRAST.OIL_TO_SAND_NUM
     *
     * @mbg.generated
     */
    public void setOilToSandNum(BigDecimal oilToSandNum) {
        this.oilToSandNum = oilToSandNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_FOCUS_WATER
     *
     * @return the value of TBL_VILL_INFRAST.IS_FOCUS_WATER
     *
     * @mbg.generated
     */
    public String getIsFocusWater() {
        return isFocusWater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_FOCUS_WATER
     *
     * @param isFocusWater the value for TBL_VILL_INFRAST.IS_FOCUS_WATER
     *
     * @mbg.generated
     */
    public void setIsFocusWater(String isFocusWater) {
        this.isFocusWater = isFocusWater == null ? null : isFocusWater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_TAP_WATER
     *
     * @return the value of TBL_VILL_INFRAST.IS_TAP_WATER
     *
     * @mbg.generated
     */
    public String getIsTapWater() {
        return isTapWater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_TAP_WATER
     *
     * @param isTapWater the value for TBL_VILL_INFRAST.IS_TAP_WATER
     *
     * @mbg.generated
     */
    public void setIsTapWater(String isTapWater) {
        this.isTapWater = isTapWater == null ? null : isTapWater.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.CONSTR_NUM
     *
     * @return the value of TBL_VILL_INFRAST.CONSTR_NUM
     *
     * @mbg.generated
     */
    public String getConstrNum() {
        return constrNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.CONSTR_NUM
     *
     * @param constrNum the value for TBL_VILL_INFRAST.CONSTR_NUM
     *
     * @mbg.generated
     */
    public void setConstrNum(String constrNum) {
        this.constrNum = constrNum == null ? null : constrNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_NATU_PRO_POW
     *
     * @return the value of TBL_VILL_INFRAST.IS_NATU_PRO_POW
     *
     * @mbg.generated
     */
    public String getIsNatuProPow() {
        return isNatuProPow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_NATU_PRO_POW
     *
     * @param isNatuProPow the value for TBL_VILL_INFRAST.IS_NATU_PRO_POW
     *
     * @mbg.generated
     */
    public void setIsNatuProPow(String isNatuProPow) {
        this.isNatuProPow = isNatuProPow == null ? null : isNatuProPow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.IS_POV_PRO_POW
     *
     * @return the value of TBL_VILL_INFRAST.IS_POV_PRO_POW
     *
     * @mbg.generated
     */
    public String getIsPovProPow() {
        return isPovProPow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.IS_POV_PRO_POW
     *
     * @param isPovProPow the value for TBL_VILL_INFRAST.IS_POV_PRO_POW
     *
     * @mbg.generated
     */
    public void setIsPovProPow(String isPovProPow) {
        this.isPovProPow = isPovProPow == null ? null : isPovProPow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.CONS_CONT_E
     *
     * @return the value of TBL_VILL_INFRAST.CONS_CONT_E
     *
     * @mbg.generated
     */
    public String getConsContE() {
        return consContE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.CONS_CONT_E
     *
     * @param consContE the value for TBL_VILL_INFRAST.CONS_CONT_E
     *
     * @mbg.generated
     */
    public void setConsContE(String consContE) {
        this.consContE = consContE == null ? null : consContE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.ELECT_REMARKS
     *
     * @return the value of TBL_VILL_INFRAST.ELECT_REMARKS
     *
     * @mbg.generated
     */
    public String getElectRemarks() {
        return electRemarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.ELECT_REMARKS
     *
     * @param electRemarks the value for TBL_VILL_INFRAST.ELECT_REMARKS
     *
     * @mbg.generated
     */
    public void setElectRemarks(String electRemarks) {
        this.electRemarks = electRemarks == null ? null : electRemarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_VILL_INFRAST.ZONE_YEAR
     *
     * @return the value of TBL_VILL_INFRAST.ZONE_YEAR
     *
     * @mbg.generated
     */
    public Long getZoneYear() {
        return zoneYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_VILL_INFRAST.ZONE_YEAR
     *
     * @param zoneYear the value for TBL_VILL_INFRAST.ZONE_YEAR
     *
     * @mbg.generated
     */
    public void setZoneYear(Long zoneYear) {
        this.zoneYear = zoneYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_VILL_INFRAST
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillInfrastDD that = (VillInfrastDD) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(districtName, that.districtName) &&
                Objects.equals(townName, that.townName) &&
                Objects.equals(villageName, that.villageName) &&
                Objects.equals(isVillRoad, that.isVillRoad) &&
                Objects.equals(noaccessMileage, that.noaccessMileage) &&
                Objects.equals(isOilToSand, that.isOilToSand) &&
                Objects.equals(oilToSandNum, that.oilToSandNum) &&
                Objects.equals(isFocusWater, that.isFocusWater) &&
                Objects.equals(isTapWater, that.isTapWater) &&
                Objects.equals(constrNum, that.constrNum) &&
                Objects.equals(isNatuProPow, that.isNatuProPow) &&
                Objects.equals(isPovProPow, that.isPovProPow) &&
                Objects.equals(consContE, that.consContE) &&
                Objects.equals(electRemarks, that.electRemarks) &&
                Objects.equals(zoneYear, that.zoneYear);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, districtName, townName, villageName, isVillRoad, noaccessMileage, isOilToSand, oilToSandNum, isFocusWater, isTapWater, constrNum, isNatuProPow, isPovProPow, consContE, electRemarks, zoneYear);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_VILL_INFRAST
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", districtName=").append(districtName);
        sb.append(", townName=").append(townName);
        sb.append(", villageName=").append(villageName);
        sb.append(", isVillRoad=").append(isVillRoad);
        sb.append(", noaccessMileage=").append(noaccessMileage);
        sb.append(", isOilToSand=").append(isOilToSand);
        sb.append(", oilToSandNum=").append(oilToSandNum);
        sb.append(", isFocusWater=").append(isFocusWater);
        sb.append(", isTapWater=").append(isTapWater);
        sb.append(", constrNum=").append(constrNum);
        sb.append(", isNatuProPow=").append(isNatuProPow);
        sb.append(", isPovProPow=").append(isPovProPow);
        sb.append(", consContE=").append(consContE);
        sb.append(", electRemarks=").append(electRemarks);
        sb.append(", zoneYear=").append(zoneYear);
        sb.append("]");
        return sb.toString();
    }
}