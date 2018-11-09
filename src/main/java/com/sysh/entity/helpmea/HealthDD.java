package com.sysh.entity.helpmea;

import java.io.Serializable;
import java.math.BigDecimal;

public class HealthDD implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.DISTRICT_NAME
     *
     * @mbg.generated
     */
    private String districtName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.TOWN_NAME
     *
     * @mbg.generated
     */
    private String townName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.VILLAGE_NAME
     *
     * @mbg.generated
     */
    private String villageName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.SEX
     *
     * @mbg.generated
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.ID_NUMBER
     *
     * @mbg.generated
     */
    private String idNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.RELATION_HOUSEHOLD
     *
     * @mbg.generated
     */
    private String relationHousehold;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.HOUSEHOLD_NAME
     *
     * @mbg.generated
     */
    private String householdName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.IS_JOIN_NCMS
     *
     * @mbg.generated
     */
    private String isJoinNcms;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.IS_JOIN_INSURANCE
     *
     * @mbg.generated
     */
    private String isJoinInsurance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.IS_MAJOR_DISEASES
     *
     * @mbg.generated
     */
    private String isMajorDiseases;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.IS_CHRONIC_DISEASE
     *
     * @mbg.generated
     */
    private String isChronicDisease;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.IS_CONTRACT
     *
     * @mbg.generated
     */
    private String isContract;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.FOLLOW_UP_TIMES
     *
     * @mbg.generated
     */
    private Long followUpTimes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.THIS_SUBTOTAL
     *
     * @mbg.generated
     */
    private BigDecimal thisSubtotal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.TOTAL_HOSPITAL
     *
     * @mbg.generated
     */
    private BigDecimal totalHospital;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.NCMS_NUMBER
     *
     * @mbg.generated
     */
    private BigDecimal ncmsNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.TOTAL_INSURANCE
     *
     * @mbg.generated
     */
    private BigDecimal totalInsurance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.MEDICAL_ASSISTANCE
     *
     * @mbg.generated
     */
    private BigDecimal medicalAssistance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.GOVERNMENT_BOTTOM
     *
     * @mbg.generated
     */
    private BigDecimal governmentBottom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.ACTUAL_REIMBURSEMENT_RATIO
     *
     * @mbg.generated
     */
    private BigDecimal actualReimbursementRatio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.COMMERCIAL_PROPORTION
     *
     * @mbg.generated
     */
    private BigDecimal commercialProportion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.OTHER
     *
     * @mbg.generated
     */
    private BigDecimal other;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_HEALTH.ZONE_YEAR
     *
     * @mbg.generated
     */
    private Long zoneYear;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_HEALTH
     *
     * @mbg.generated
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.ID
     *
     * @return the value of TBL_HEALTH.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.ID
     *
     * @param id the value for TBL_HEALTH.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.DISTRICT_NAME
     *
     * @return the value of TBL_HEALTH.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.DISTRICT_NAME
     *
     * @param districtName the value for TBL_HEALTH.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.TOWN_NAME
     *
     * @return the value of TBL_HEALTH.TOWN_NAME
     *
     * @mbg.generated
     */
    public String getTownName() {
        return townName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.TOWN_NAME
     *
     * @param townName the value for TBL_HEALTH.TOWN_NAME
     *
     * @mbg.generated
     */
    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.VILLAGE_NAME
     *
     * @return the value of TBL_HEALTH.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.VILLAGE_NAME
     *
     * @param villageName the value for TBL_HEALTH.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.NAME
     *
     * @return the value of TBL_HEALTH.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.NAME
     *
     * @param name the value for TBL_HEALTH.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.SEX
     *
     * @return the value of TBL_HEALTH.SEX
     *
     * @mbg.generated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.SEX
     *
     * @param sex the value for TBL_HEALTH.SEX
     *
     * @mbg.generated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.ID_NUMBER
     *
     * @return the value of TBL_HEALTH.ID_NUMBER
     *
     * @mbg.generated
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.ID_NUMBER
     *
     * @param idNumber the value for TBL_HEALTH.ID_NUMBER
     *
     * @mbg.generated
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.RELATION_HOUSEHOLD
     *
     * @return the value of TBL_HEALTH.RELATION_HOUSEHOLD
     *
     * @mbg.generated
     */
    public String getRelationHousehold() {
        return relationHousehold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.RELATION_HOUSEHOLD
     *
     * @param relationHousehold the value for TBL_HEALTH.RELATION_HOUSEHOLD
     *
     * @mbg.generated
     */
    public void setRelationHousehold(String relationHousehold) {
        this.relationHousehold = relationHousehold == null ? null : relationHousehold.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.HOUSEHOLD_NAME
     *
     * @return the value of TBL_HEALTH.HOUSEHOLD_NAME
     *
     * @mbg.generated
     */
    public String getHouseholdName() {
        return householdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.HOUSEHOLD_NAME
     *
     * @param householdName the value for TBL_HEALTH.HOUSEHOLD_NAME
     *
     * @mbg.generated
     */
    public void setHouseholdName(String householdName) {
        this.householdName = householdName == null ? null : householdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.IS_JOIN_NCMS
     *
     * @return the value of TBL_HEALTH.IS_JOIN_NCMS
     *
     * @mbg.generated
     */
    public String getIsJoinNcms() {
        return isJoinNcms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.IS_JOIN_NCMS
     *
     * @param isJoinNcms the value for TBL_HEALTH.IS_JOIN_NCMS
     *
     * @mbg.generated
     */
    public void setIsJoinNcms(String isJoinNcms) {
        this.isJoinNcms = isJoinNcms == null ? null : isJoinNcms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.IS_JOIN_INSURANCE
     *
     * @return the value of TBL_HEALTH.IS_JOIN_INSURANCE
     *
     * @mbg.generated
     */
    public String getIsJoinInsurance() {
        return isJoinInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.IS_JOIN_INSURANCE
     *
     * @param isJoinInsurance the value for TBL_HEALTH.IS_JOIN_INSURANCE
     *
     * @mbg.generated
     */
    public void setIsJoinInsurance(String isJoinInsurance) {
        this.isJoinInsurance = isJoinInsurance == null ? null : isJoinInsurance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.IS_MAJOR_DISEASES
     *
     * @return the value of TBL_HEALTH.IS_MAJOR_DISEASES
     *
     * @mbg.generated
     */
    public String getIsMajorDiseases() {
        return isMajorDiseases;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.IS_MAJOR_DISEASES
     *
     * @param isMajorDiseases the value for TBL_HEALTH.IS_MAJOR_DISEASES
     *
     * @mbg.generated
     */
    public void setIsMajorDiseases(String isMajorDiseases) {
        this.isMajorDiseases = isMajorDiseases == null ? null : isMajorDiseases.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.IS_CHRONIC_DISEASE
     *
     * @return the value of TBL_HEALTH.IS_CHRONIC_DISEASE
     *
     * @mbg.generated
     */
    public String getIsChronicDisease() {
        return isChronicDisease;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.IS_CHRONIC_DISEASE
     *
     * @param isChronicDisease the value for TBL_HEALTH.IS_CHRONIC_DISEASE
     *
     * @mbg.generated
     */
    public void setIsChronicDisease(String isChronicDisease) {
        this.isChronicDisease = isChronicDisease == null ? null : isChronicDisease.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.IS_CONTRACT
     *
     * @return the value of TBL_HEALTH.IS_CONTRACT
     *
     * @mbg.generated
     */
    public String getIsContract() {
        return isContract;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.IS_CONTRACT
     *
     * @param isContract the value for TBL_HEALTH.IS_CONTRACT
     *
     * @mbg.generated
     */
    public void setIsContract(String isContract) {
        this.isContract = isContract == null ? null : isContract.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.FOLLOW_UP_TIMES
     *
     * @return the value of TBL_HEALTH.FOLLOW_UP_TIMES
     *
     * @mbg.generated
     */
    public Long getFollowUpTimes() {
        return followUpTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.FOLLOW_UP_TIMES
     *
     * @param followUpTimes the value for TBL_HEALTH.FOLLOW_UP_TIMES
     *
     * @mbg.generated
     */
    public void setFollowUpTimes(Long followUpTimes) {
        this.followUpTimes = followUpTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.THIS_SUBTOTAL
     *
     * @return the value of TBL_HEALTH.THIS_SUBTOTAL
     *
     * @mbg.generated
     */
    public BigDecimal getThisSubtotal() {
        return thisSubtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.THIS_SUBTOTAL
     *
     * @param thisSubtotal the value for TBL_HEALTH.THIS_SUBTOTAL
     *
     * @mbg.generated
     */
    public void setThisSubtotal(BigDecimal thisSubtotal) {
        this.thisSubtotal = thisSubtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.TOTAL_HOSPITAL
     *
     * @return the value of TBL_HEALTH.TOTAL_HOSPITAL
     *
     * @mbg.generated
     */
    public BigDecimal getTotalHospital() {
        return totalHospital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.TOTAL_HOSPITAL
     *
     * @param totalHospital the value for TBL_HEALTH.TOTAL_HOSPITAL
     *
     * @mbg.generated
     */
    public void setTotalHospital(BigDecimal totalHospital) {
        this.totalHospital = totalHospital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.NCMS_NUMBER
     *
     * @return the value of TBL_HEALTH.NCMS_NUMBER
     *
     * @mbg.generated
     */
    public BigDecimal getNcmsNumber() {
        return ncmsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.NCMS_NUMBER
     *
     * @param ncmsNumber the value for TBL_HEALTH.NCMS_NUMBER
     *
     * @mbg.generated
     */
    public void setNcmsNumber(BigDecimal ncmsNumber) {
        this.ncmsNumber = ncmsNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.TOTAL_INSURANCE
     *
     * @return the value of TBL_HEALTH.TOTAL_INSURANCE
     *
     * @mbg.generated
     */
    public BigDecimal getTotalInsurance() {
        return totalInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.TOTAL_INSURANCE
     *
     * @param totalInsurance the value for TBL_HEALTH.TOTAL_INSURANCE
     *
     * @mbg.generated
     */
    public void setTotalInsurance(BigDecimal totalInsurance) {
        this.totalInsurance = totalInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.MEDICAL_ASSISTANCE
     *
     * @return the value of TBL_HEALTH.MEDICAL_ASSISTANCE
     *
     * @mbg.generated
     */
    public BigDecimal getMedicalAssistance() {
        return medicalAssistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.MEDICAL_ASSISTANCE
     *
     * @param medicalAssistance the value for TBL_HEALTH.MEDICAL_ASSISTANCE
     *
     * @mbg.generated
     */
    public void setMedicalAssistance(BigDecimal medicalAssistance) {
        this.medicalAssistance = medicalAssistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.GOVERNMENT_BOTTOM
     *
     * @return the value of TBL_HEALTH.GOVERNMENT_BOTTOM
     *
     * @mbg.generated
     */
    public BigDecimal getGovernmentBottom() {
        return governmentBottom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.GOVERNMENT_BOTTOM
     *
     * @param governmentBottom the value for TBL_HEALTH.GOVERNMENT_BOTTOM
     *
     * @mbg.generated
     */
    public void setGovernmentBottom(BigDecimal governmentBottom) {
        this.governmentBottom = governmentBottom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.ACTUAL_REIMBURSEMENT_RATIO
     *
     * @return the value of TBL_HEALTH.ACTUAL_REIMBURSEMENT_RATIO
     *
     * @mbg.generated
     */
    public BigDecimal getActualReimbursementRatio() {
        return actualReimbursementRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.ACTUAL_REIMBURSEMENT_RATIO
     *
     * @param actualReimbursementRatio the value for TBL_HEALTH.ACTUAL_REIMBURSEMENT_RATIO
     *
     * @mbg.generated
     */
    public void setActualReimbursementRatio(BigDecimal actualReimbursementRatio) {
        this.actualReimbursementRatio = actualReimbursementRatio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.COMMERCIAL_PROPORTION
     *
     * @return the value of TBL_HEALTH.COMMERCIAL_PROPORTION
     *
     * @mbg.generated
     */
    public BigDecimal getCommercialProportion() {
        return commercialProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.COMMERCIAL_PROPORTION
     *
     * @param commercialProportion the value for TBL_HEALTH.COMMERCIAL_PROPORTION
     *
     * @mbg.generated
     */
    public void setCommercialProportion(BigDecimal commercialProportion) {
        this.commercialProportion = commercialProportion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.OTHER
     *
     * @return the value of TBL_HEALTH.OTHER
     *
     * @mbg.generated
     */
    public BigDecimal getOther() {
        return other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.OTHER
     *
     * @param other the value for TBL_HEALTH.OTHER
     *
     * @mbg.generated
     */
    public void setOther(BigDecimal other) {
        this.other = other;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_HEALTH.ZONE_YEAR
     *
     * @return the value of TBL_HEALTH.ZONE_YEAR
     *
     * @mbg.generated
     */
    public Long getZoneYear() {
        return zoneYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_HEALTH.ZONE_YEAR
     *
     * @param zoneYear the value for TBL_HEALTH.ZONE_YEAR
     *
     * @mbg.generated
     */
    public void setZoneYear(Long zoneYear) {
        this.zoneYear = zoneYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_HEALTH
     *
     * @mbg.generated
     */
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
        HealthDD other = (HealthDD) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDistrictName() == null ? other.getDistrictName() == null : this.getDistrictName().equals(other.getDistrictName()))
            && (this.getTownName() == null ? other.getTownName() == null : this.getTownName().equals(other.getTownName()))
            && (this.getVillageName() == null ? other.getVillageName() == null : this.getVillageName().equals(other.getVillageName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getRelationHousehold() == null ? other.getRelationHousehold() == null : this.getRelationHousehold().equals(other.getRelationHousehold()))
            && (this.getHouseholdName() == null ? other.getHouseholdName() == null : this.getHouseholdName().equals(other.getHouseholdName()))
            && (this.getIsJoinNcms() == null ? other.getIsJoinNcms() == null : this.getIsJoinNcms().equals(other.getIsJoinNcms()))
            && (this.getIsJoinInsurance() == null ? other.getIsJoinInsurance() == null : this.getIsJoinInsurance().equals(other.getIsJoinInsurance()))
            && (this.getIsMajorDiseases() == null ? other.getIsMajorDiseases() == null : this.getIsMajorDiseases().equals(other.getIsMajorDiseases()))
            && (this.getIsChronicDisease() == null ? other.getIsChronicDisease() == null : this.getIsChronicDisease().equals(other.getIsChronicDisease()))
            && (this.getIsContract() == null ? other.getIsContract() == null : this.getIsContract().equals(other.getIsContract()))
            && (this.getFollowUpTimes() == null ? other.getFollowUpTimes() == null : this.getFollowUpTimes().equals(other.getFollowUpTimes()))
            && (this.getThisSubtotal() == null ? other.getThisSubtotal() == null : this.getThisSubtotal().equals(other.getThisSubtotal()))
            && (this.getTotalHospital() == null ? other.getTotalHospital() == null : this.getTotalHospital().equals(other.getTotalHospital()))
            && (this.getNcmsNumber() == null ? other.getNcmsNumber() == null : this.getNcmsNumber().equals(other.getNcmsNumber()))
            && (this.getTotalInsurance() == null ? other.getTotalInsurance() == null : this.getTotalInsurance().equals(other.getTotalInsurance()))
            && (this.getMedicalAssistance() == null ? other.getMedicalAssistance() == null : this.getMedicalAssistance().equals(other.getMedicalAssistance()))
            && (this.getGovernmentBottom() == null ? other.getGovernmentBottom() == null : this.getGovernmentBottom().equals(other.getGovernmentBottom()))
            && (this.getActualReimbursementRatio() == null ? other.getActualReimbursementRatio() == null : this.getActualReimbursementRatio().equals(other.getActualReimbursementRatio()))
            && (this.getCommercialProportion() == null ? other.getCommercialProportion() == null : this.getCommercialProportion().equals(other.getCommercialProportion()))
            && (this.getOther() == null ? other.getOther() == null : this.getOther().equals(other.getOther()))
            && (this.getZoneYear() == null ? other.getZoneYear() == null : this.getZoneYear().equals(other.getZoneYear()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_HEALTH
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDistrictName() == null) ? 0 : getDistrictName().hashCode());
        result = prime * result + ((getTownName() == null) ? 0 : getTownName().hashCode());
        result = prime * result + ((getVillageName() == null) ? 0 : getVillageName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getRelationHousehold() == null) ? 0 : getRelationHousehold().hashCode());
        result = prime * result + ((getHouseholdName() == null) ? 0 : getHouseholdName().hashCode());
        result = prime * result + ((getIsJoinNcms() == null) ? 0 : getIsJoinNcms().hashCode());
        result = prime * result + ((getIsJoinInsurance() == null) ? 0 : getIsJoinInsurance().hashCode());
        result = prime * result + ((getIsMajorDiseases() == null) ? 0 : getIsMajorDiseases().hashCode());
        result = prime * result + ((getIsChronicDisease() == null) ? 0 : getIsChronicDisease().hashCode());
        result = prime * result + ((getIsContract() == null) ? 0 : getIsContract().hashCode());
        result = prime * result + ((getFollowUpTimes() == null) ? 0 : getFollowUpTimes().hashCode());
        result = prime * result + ((getThisSubtotal() == null) ? 0 : getThisSubtotal().hashCode());
        result = prime * result + ((getTotalHospital() == null) ? 0 : getTotalHospital().hashCode());
        result = prime * result + ((getNcmsNumber() == null) ? 0 : getNcmsNumber().hashCode());
        result = prime * result + ((getTotalInsurance() == null) ? 0 : getTotalInsurance().hashCode());
        result = prime * result + ((getMedicalAssistance() == null) ? 0 : getMedicalAssistance().hashCode());
        result = prime * result + ((getGovernmentBottom() == null) ? 0 : getGovernmentBottom().hashCode());
        result = prime * result + ((getActualReimbursementRatio() == null) ? 0 : getActualReimbursementRatio().hashCode());
        result = prime * result + ((getCommercialProportion() == null) ? 0 : getCommercialProportion().hashCode());
        result = prime * result + ((getOther() == null) ? 0 : getOther().hashCode());
        result = prime * result + ((getZoneYear() == null) ? 0 : getZoneYear().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_HEALTH
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
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", relationHousehold=").append(relationHousehold);
        sb.append(", householdName=").append(householdName);
        sb.append(", isJoinNcms=").append(isJoinNcms);
        sb.append(", isJoinInsurance=").append(isJoinInsurance);
        sb.append(", isMajorDiseases=").append(isMajorDiseases);
        sb.append(", isChronicDisease=").append(isChronicDisease);
        sb.append(", isContract=").append(isContract);
        sb.append(", followUpTimes=").append(followUpTimes);
        sb.append(", thisSubtotal=").append(thisSubtotal);
        sb.append(", totalHospital=").append(totalHospital);
        sb.append(", ncmsNumber=").append(ncmsNumber);
        sb.append(", totalInsurance=").append(totalInsurance);
        sb.append(", medicalAssistance=").append(medicalAssistance);
        sb.append(", governmentBottom=").append(governmentBottom);
        sb.append(", actualReimbursementRatio=").append(actualReimbursementRatio);
        sb.append(", commercialProportion=").append(commercialProportion);
        sb.append(", other=").append(other);
        sb.append(", zoneYear=").append(zoneYear);
        sb.append("]");
        return sb.toString();
    }
}