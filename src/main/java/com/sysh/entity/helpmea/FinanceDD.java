package com.sysh.entity.helpmea;

import java.io.Serializable;
import java.math.BigDecimal;

public class FinanceDD implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.DISTRICT_NAME
     *
     * @mbg.generated
     */
    private String districtName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.TOWN_NAME
     *
     * @mbg.generated
     */
    private String townName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.VILLAGE_NAME
     *
     * @mbg.generated
     */
    private String villageName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.NAME
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.IS_LOAN
     *
     * @mbg.generated
     */
    private String isLoan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.LOAN_USE
     *
     * @mbg.generated
     */
    private String loanUse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.IS_JOIN_CREDITRATING
     *
     * @mbg.generated
     */
    private String isJoinCreditrating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.RATING
     *
     * @mbg.generated
     */
    private String rating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.IS_LOAN_GUARANTEE_INSURANCE
     *
     * @mbg.generated
     */
    private String isLoanGuaranteeInsurance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.LOAN_BANK_NAME
     *
     * @mbg.generated
     */
    private String loanBankName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.TOTAL_LOAN
     *
     * @mbg.generated
     */
    private BigDecimal totalLoan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.LOAN_TIME
     *
     * @mbg.generated
     */
    private String loanTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.ANNUAL_INTEREST_RATE
     *
     * @mbg.generated
     */
    private BigDecimal annualInterestRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.ATTACHED_TO_INTEREST
     *
     * @mbg.generated
     */
    private BigDecimal attachedToInterest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.INTEREST_RATE
     *
     * @mbg.generated
     */
    private BigDecimal interestRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.RISK_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal riskMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.REPAY_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal repayMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.REPAY_TIME
     *
     * @mbg.generated
     */
    private String repayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.OVERDUE_MONEY
     *
     * @mbg.generated
     */
    private BigDecimal overdueMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.OVERDUE_TIME
     *
     * @mbg.generated
     */
    private String overdueTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.REMARKS
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_FINANCE.YEAR_ZONE
     *
     * @mbg.generated
     */
    private Long yearZone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_FINANCE
     *
     * @mbg.generated
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.ID
     *
     * @return the value of TBL_FINANCE.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.ID
     *
     * @param id the value for TBL_FINANCE.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.DISTRICT_NAME
     *
     * @return the value of TBL_FINANCE.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.DISTRICT_NAME
     *
     * @param districtName the value for TBL_FINANCE.DISTRICT_NAME
     *
     * @mbg.generated
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.TOWN_NAME
     *
     * @return the value of TBL_FINANCE.TOWN_NAME
     *
     * @mbg.generated
     */
    public String getTownName() {
        return townName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.TOWN_NAME
     *
     * @param townName the value for TBL_FINANCE.TOWN_NAME
     *
     * @mbg.generated
     */
    public void setTownName(String townName) {
        this.townName = townName == null ? null : townName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.VILLAGE_NAME
     *
     * @return the value of TBL_FINANCE.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.VILLAGE_NAME
     *
     * @param villageName the value for TBL_FINANCE.VILLAGE_NAME
     *
     * @mbg.generated
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName == null ? null : villageName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.NAME
     *
     * @return the value of TBL_FINANCE.NAME
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.NAME
     *
     * @param name the value for TBL_FINANCE.NAME
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.IS_LOAN
     *
     * @return the value of TBL_FINANCE.IS_LOAN
     *
     * @mbg.generated
     */
    public String getIsLoan() {
        return isLoan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.IS_LOAN
     *
     * @param isLoan the value for TBL_FINANCE.IS_LOAN
     *
     * @mbg.generated
     */
    public void setIsLoan(String isLoan) {
        this.isLoan = isLoan == null ? null : isLoan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.LOAN_USE
     *
     * @return the value of TBL_FINANCE.LOAN_USE
     *
     * @mbg.generated
     */
    public String getLoanUse() {
        return loanUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.LOAN_USE
     *
     * @param loanUse the value for TBL_FINANCE.LOAN_USE
     *
     * @mbg.generated
     */
    public void setLoanUse(String loanUse) {
        this.loanUse = loanUse == null ? null : loanUse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.IS_JOIN_CREDITRATING
     *
     * @return the value of TBL_FINANCE.IS_JOIN_CREDITRATING
     *
     * @mbg.generated
     */
    public String getIsJoinCreditrating() {
        return isJoinCreditrating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.IS_JOIN_CREDITRATING
     *
     * @param isJoinCreditrating the value for TBL_FINANCE.IS_JOIN_CREDITRATING
     *
     * @mbg.generated
     */
    public void setIsJoinCreditrating(String isJoinCreditrating) {
        this.isJoinCreditrating = isJoinCreditrating == null ? null : isJoinCreditrating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.RATING
     *
     * @return the value of TBL_FINANCE.RATING
     *
     * @mbg.generated
     */
    public String getRating() {
        return rating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.RATING
     *
     * @param rating the value for TBL_FINANCE.RATING
     *
     * @mbg.generated
     */
    public void setRating(String rating) {
        this.rating = rating == null ? null : rating.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.IS_LOAN_GUARANTEE_INSURANCE
     *
     * @return the value of TBL_FINANCE.IS_LOAN_GUARANTEE_INSURANCE
     *
     * @mbg.generated
     */
    public String getIsLoanGuaranteeInsurance() {
        return isLoanGuaranteeInsurance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.IS_LOAN_GUARANTEE_INSURANCE
     *
     * @param isLoanGuaranteeInsurance the value for TBL_FINANCE.IS_LOAN_GUARANTEE_INSURANCE
     *
     * @mbg.generated
     */
    public void setIsLoanGuaranteeInsurance(String isLoanGuaranteeInsurance) {
        this.isLoanGuaranteeInsurance = isLoanGuaranteeInsurance == null ? null : isLoanGuaranteeInsurance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.LOAN_BANK_NAME
     *
     * @return the value of TBL_FINANCE.LOAN_BANK_NAME
     *
     * @mbg.generated
     */
    public String getLoanBankName() {
        return loanBankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.LOAN_BANK_NAME
     *
     * @param loanBankName the value for TBL_FINANCE.LOAN_BANK_NAME
     *
     * @mbg.generated
     */
    public void setLoanBankName(String loanBankName) {
        this.loanBankName = loanBankName == null ? null : loanBankName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.TOTAL_LOAN
     *
     * @return the value of TBL_FINANCE.TOTAL_LOAN
     *
     * @mbg.generated
     */
    public BigDecimal getTotalLoan() {
        return totalLoan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.TOTAL_LOAN
     *
     * @param totalLoan the value for TBL_FINANCE.TOTAL_LOAN
     *
     * @mbg.generated
     */
    public void setTotalLoan(BigDecimal totalLoan) {
        this.totalLoan = totalLoan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.LOAN_TIME
     *
     * @return the value of TBL_FINANCE.LOAN_TIME
     *
     * @mbg.generated
     */
    public String getLoanTime() {
        return loanTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.LOAN_TIME
     *
     * @param loanTime the value for TBL_FINANCE.LOAN_TIME
     *
     * @mbg.generated
     */
    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime == null ? null : loanTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.ANNUAL_INTEREST_RATE
     *
     * @return the value of TBL_FINANCE.ANNUAL_INTEREST_RATE
     *
     * @mbg.generated
     */
    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.ANNUAL_INTEREST_RATE
     *
     * @param annualInterestRate the value for TBL_FINANCE.ANNUAL_INTEREST_RATE
     *
     * @mbg.generated
     */
    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.ATTACHED_TO_INTEREST
     *
     * @return the value of TBL_FINANCE.ATTACHED_TO_INTEREST
     *
     * @mbg.generated
     */
    public BigDecimal getAttachedToInterest() {
        return attachedToInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.ATTACHED_TO_INTEREST
     *
     * @param attachedToInterest the value for TBL_FINANCE.ATTACHED_TO_INTEREST
     *
     * @mbg.generated
     */
    public void setAttachedToInterest(BigDecimal attachedToInterest) {
        this.attachedToInterest = attachedToInterest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.INTEREST_RATE
     *
     * @return the value of TBL_FINANCE.INTEREST_RATE
     *
     * @mbg.generated
     */
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.INTEREST_RATE
     *
     * @param interestRate the value for TBL_FINANCE.INTEREST_RATE
     *
     * @mbg.generated
     */
    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.RISK_MONEY
     *
     * @return the value of TBL_FINANCE.RISK_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getRiskMoney() {
        return riskMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.RISK_MONEY
     *
     * @param riskMoney the value for TBL_FINANCE.RISK_MONEY
     *
     * @mbg.generated
     */
    public void setRiskMoney(BigDecimal riskMoney) {
        this.riskMoney = riskMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.REPAY_MONEY
     *
     * @return the value of TBL_FINANCE.REPAY_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getRepayMoney() {
        return repayMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.REPAY_MONEY
     *
     * @param repayMoney the value for TBL_FINANCE.REPAY_MONEY
     *
     * @mbg.generated
     */
    public void setRepayMoney(BigDecimal repayMoney) {
        this.repayMoney = repayMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.REPAY_TIME
     *
     * @return the value of TBL_FINANCE.REPAY_TIME
     *
     * @mbg.generated
     */
    public String getRepayTime() {
        return repayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.REPAY_TIME
     *
     * @param repayTime the value for TBL_FINANCE.REPAY_TIME
     *
     * @mbg.generated
     */
    public void setRepayTime(String repayTime) {
        this.repayTime = repayTime == null ? null : repayTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.OVERDUE_MONEY
     *
     * @return the value of TBL_FINANCE.OVERDUE_MONEY
     *
     * @mbg.generated
     */
    public BigDecimal getOverdueMoney() {
        return overdueMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.OVERDUE_MONEY
     *
     * @param overdueMoney the value for TBL_FINANCE.OVERDUE_MONEY
     *
     * @mbg.generated
     */
    public void setOverdueMoney(BigDecimal overdueMoney) {
        this.overdueMoney = overdueMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.OVERDUE_TIME
     *
     * @return the value of TBL_FINANCE.OVERDUE_TIME
     *
     * @mbg.generated
     */
    public String getOverdueTime() {
        return overdueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.OVERDUE_TIME
     *
     * @param overdueTime the value for TBL_FINANCE.OVERDUE_TIME
     *
     * @mbg.generated
     */
    public void setOverdueTime(String overdueTime) {
        this.overdueTime = overdueTime == null ? null : overdueTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.REMARKS
     *
     * @return the value of TBL_FINANCE.REMARKS
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.REMARKS
     *
     * @param remarks the value for TBL_FINANCE.REMARKS
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_FINANCE.YEAR_ZONE
     *
     * @return the value of TBL_FINANCE.YEAR_ZONE
     *
     * @mbg.generated
     */
    public Long getYearZone() {
        return yearZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_FINANCE.YEAR_ZONE
     *
     * @param yearZone the value for TBL_FINANCE.YEAR_ZONE
     *
     * @mbg.generated
     */
    public void setYearZone(Long yearZone) {
        this.yearZone = yearZone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_FINANCE
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
        FinanceDD other = (FinanceDD) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDistrictName() == null ? other.getDistrictName() == null : this.getDistrictName().equals(other.getDistrictName()))
            && (this.getTownName() == null ? other.getTownName() == null : this.getTownName().equals(other.getTownName()))
            && (this.getVillageName() == null ? other.getVillageName() == null : this.getVillageName().equals(other.getVillageName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIsLoan() == null ? other.getIsLoan() == null : this.getIsLoan().equals(other.getIsLoan()))
            && (this.getLoanUse() == null ? other.getLoanUse() == null : this.getLoanUse().equals(other.getLoanUse()))
            && (this.getIsJoinCreditrating() == null ? other.getIsJoinCreditrating() == null : this.getIsJoinCreditrating().equals(other.getIsJoinCreditrating()))
            && (this.getRating() == null ? other.getRating() == null : this.getRating().equals(other.getRating()))
            && (this.getIsLoanGuaranteeInsurance() == null ? other.getIsLoanGuaranteeInsurance() == null : this.getIsLoanGuaranteeInsurance().equals(other.getIsLoanGuaranteeInsurance()))
            && (this.getLoanBankName() == null ? other.getLoanBankName() == null : this.getLoanBankName().equals(other.getLoanBankName()))
            && (this.getTotalLoan() == null ? other.getTotalLoan() == null : this.getTotalLoan().equals(other.getTotalLoan()))
            && (this.getLoanTime() == null ? other.getLoanTime() == null : this.getLoanTime().equals(other.getLoanTime()))
            && (this.getAnnualInterestRate() == null ? other.getAnnualInterestRate() == null : this.getAnnualInterestRate().equals(other.getAnnualInterestRate()))
            && (this.getAttachedToInterest() == null ? other.getAttachedToInterest() == null : this.getAttachedToInterest().equals(other.getAttachedToInterest()))
            && (this.getInterestRate() == null ? other.getInterestRate() == null : this.getInterestRate().equals(other.getInterestRate()))
            && (this.getRiskMoney() == null ? other.getRiskMoney() == null : this.getRiskMoney().equals(other.getRiskMoney()))
            && (this.getRepayMoney() == null ? other.getRepayMoney() == null : this.getRepayMoney().equals(other.getRepayMoney()))
            && (this.getRepayTime() == null ? other.getRepayTime() == null : this.getRepayTime().equals(other.getRepayTime()))
            && (this.getOverdueMoney() == null ? other.getOverdueMoney() == null : this.getOverdueMoney().equals(other.getOverdueMoney()))
            && (this.getOverdueTime() == null ? other.getOverdueTime() == null : this.getOverdueTime().equals(other.getOverdueTime()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getYearZone() == null ? other.getYearZone() == null : this.getYearZone().equals(other.getYearZone()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_FINANCE
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
        result = prime * result + ((getIsLoan() == null) ? 0 : getIsLoan().hashCode());
        result = prime * result + ((getLoanUse() == null) ? 0 : getLoanUse().hashCode());
        result = prime * result + ((getIsJoinCreditrating() == null) ? 0 : getIsJoinCreditrating().hashCode());
        result = prime * result + ((getRating() == null) ? 0 : getRating().hashCode());
        result = prime * result + ((getIsLoanGuaranteeInsurance() == null) ? 0 : getIsLoanGuaranteeInsurance().hashCode());
        result = prime * result + ((getLoanBankName() == null) ? 0 : getLoanBankName().hashCode());
        result = prime * result + ((getTotalLoan() == null) ? 0 : getTotalLoan().hashCode());
        result = prime * result + ((getLoanTime() == null) ? 0 : getLoanTime().hashCode());
        result = prime * result + ((getAnnualInterestRate() == null) ? 0 : getAnnualInterestRate().hashCode());
        result = prime * result + ((getAttachedToInterest() == null) ? 0 : getAttachedToInterest().hashCode());
        result = prime * result + ((getInterestRate() == null) ? 0 : getInterestRate().hashCode());
        result = prime * result + ((getRiskMoney() == null) ? 0 : getRiskMoney().hashCode());
        result = prime * result + ((getRepayMoney() == null) ? 0 : getRepayMoney().hashCode());
        result = prime * result + ((getRepayTime() == null) ? 0 : getRepayTime().hashCode());
        result = prime * result + ((getOverdueMoney() == null) ? 0 : getOverdueMoney().hashCode());
        result = prime * result + ((getOverdueTime() == null) ? 0 : getOverdueTime().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getYearZone() == null) ? 0 : getYearZone().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_FINANCE
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
        sb.append(", isLoan=").append(isLoan);
        sb.append(", loanUse=").append(loanUse);
        sb.append(", isJoinCreditrating=").append(isJoinCreditrating);
        sb.append(", rating=").append(rating);
        sb.append(", isLoanGuaranteeInsurance=").append(isLoanGuaranteeInsurance);
        sb.append(", loanBankName=").append(loanBankName);
        sb.append(", totalLoan=").append(totalLoan);
        sb.append(", loanTime=").append(loanTime);
        sb.append(", annualInterestRate=").append(annualInterestRate);
        sb.append(", attachedToInterest=").append(attachedToInterest);
        sb.append(", interestRate=").append(interestRate);
        sb.append(", riskMoney=").append(riskMoney);
        sb.append(", repayMoney=").append(repayMoney);
        sb.append(", repayTime=").append(repayTime);
        sb.append(", overdueMoney=").append(overdueMoney);
        sb.append(", overdueTime=").append(overdueTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", yearZone=").append(yearZone);
        sb.append("]");
        return sb.toString();
    }
}