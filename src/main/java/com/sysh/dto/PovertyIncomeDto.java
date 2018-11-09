package com.sysh.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * ClassName:  <br/>
 * Function: 贫困户收入信息<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class PovertyIncomeDto implements Serializable {

    private BigDecimal aac073;//工资性收入
    private BigDecimal aac071;//生产经营性收入
    private BigDecimal aac072;//财产性收入
    private BigDecimal aac085;//转移性收入;
    private BigDecimal aac076;//计划生育金
    private BigDecimal aac077;//低保金
    private BigDecimal aac086;//五保金
    private BigDecimal aac087;//养老保险金
    private BigDecimal aac078;//生态补偿金
    private BigDecimal aac083;//其他转移性收入
    private BigDecimal aac081;//年收入
    private BigDecimal aac074;//生产经营性支出；
    private BigDecimal aac079;//纯收入
    private BigDecimal aac082;//人均纯收入

    public PovertyIncomeDto(BigDecimal aac073, BigDecimal aac071, BigDecimal aac072, BigDecimal aac085, BigDecimal aac076, BigDecimal aac077, BigDecimal aac086, BigDecimal aac087, BigDecimal aac078, BigDecimal aac083, BigDecimal aac081, BigDecimal aac074, BigDecimal aac079, BigDecimal aac082) {
        this.aac073 = aac073;
        this.aac071 = aac071;
        this.aac072 = aac072;
        this.aac085 = aac085;
        this.aac076 = aac076;
        this.aac077 = aac077;
        this.aac086 = aac086;
        this.aac087 = aac087;
        this.aac078 = aac078;
        this.aac083 = aac083;
        this.aac081 = aac081;
        this.aac074 = aac074;
        this.aac079 = aac079;
        this.aac082 = aac082;
    }

    public PovertyIncomeDto() {
        super();
    }

    public BigDecimal getAac073() {
        return aac073;
    }

    public void setAac073(BigDecimal aac073) {
        this.aac073 = aac073;
    }

    public BigDecimal getAac071() {
        return aac071;
    }

    public void setAac071(BigDecimal aac071) {
        this.aac071 = aac071;
    }

    public BigDecimal getAac072() {
        return aac072;
    }

    public void setAac072(BigDecimal aac072) {
        this.aac072 = aac072;
    }

    public BigDecimal getAac085() {
        return aac085;
    }

    public void setAac085(BigDecimal aac085) {
        this.aac085 = aac085;
    }

    public BigDecimal getAac076() {
        return aac076;
    }

    public void setAac076(BigDecimal aac076) {
        this.aac076 = aac076;
    }

    public BigDecimal getAac077() {
        return aac077;
    }

    public void setAac077(BigDecimal aac077) {
        this.aac077 = aac077;
    }

    public BigDecimal getAac086() {
        return aac086;
    }

    public void setAac086(BigDecimal aac086) {
        this.aac086 = aac086;
    }

    public BigDecimal getAac087() {
        return aac087;
    }

    public void setAac087(BigDecimal aac087) {
        this.aac087 = aac087;
    }

    public BigDecimal getAac078() {
        return aac078;
    }

    public void setAac078(BigDecimal aac078) {
        this.aac078 = aac078;
    }

    public BigDecimal getAac083() {
        return aac083;
    }

    public void setAac083(BigDecimal aac083) {
        this.aac083 = aac083;
    }

    public BigDecimal getAac081() {
        return aac081;
    }

    public void setAac081(BigDecimal aac081) {
        this.aac081 = aac081;
    }

    public BigDecimal getAac074() {
        return aac074;
    }

    public void setAac074(BigDecimal aac074) {
        this.aac074 = aac074;
    }

    public BigDecimal getAac079() {
        return aac079;
    }

    public void setAac079(BigDecimal aac079) {
        this.aac079 = aac079;
    }

    public BigDecimal getAac082() {
        return aac082;
    }

    public void setAac082(BigDecimal aac082) {
        this.aac082 = aac082;
    }

    @Override
    public String toString() {
        return "PovertyIncomeDto{" +
                "aac073=" + aac073 +
                ", aac071=" + aac071 +
                ", aac072=" + aac072 +
                ", aac085=" + aac085 +
                ", aac076=" + aac076 +
                ", aac077=" + aac077 +
                ", aac086=" + aac086 +
                ", aac087=" + aac087 +
                ", aac078=" + aac078 +
                ", aac083=" + aac083 +
                ", aac081=" + aac081 +
                ", aac074=" + aac074 +
                ", aac079=" + aac079 +
                ", aac082=" + aac082 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PovertyIncomeDto that = (PovertyIncomeDto) o;
        return Objects.equals(aac073, that.aac073) &&
                Objects.equals(aac071, that.aac071) &&
                Objects.equals(aac072, that.aac072) &&
                Objects.equals(aac085, that.aac085) &&
                Objects.equals(aac076, that.aac076) &&
                Objects.equals(aac077, that.aac077) &&
                Objects.equals(aac086, that.aac086) &&
                Objects.equals(aac087, that.aac087) &&
                Objects.equals(aac078, that.aac078) &&
                Objects.equals(aac083, that.aac083) &&
                Objects.equals(aac081, that.aac081) &&
                Objects.equals(aac074, that.aac074) &&
                Objects.equals(aac079, that.aac079) &&
                Objects.equals(aac082, that.aac082);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aac073, aac071, aac072, aac085, aac076, aac077, aac086, aac087, aac078, aac083, aac081, aac074, aac079, aac082);
    }
}
