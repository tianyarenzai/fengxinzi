package com.sysh.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * ClassName:  <br/>
 * Function: 贫困户生产条件信息表<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class PovertyProduceDto implements Serializable {

    private Long aar040;//分区年度
    private BigDecimal aac301;//耕地面积
    private BigDecimal aac302;//有效浇灌面积
    private BigDecimal aac303;//林地面积
    private BigDecimal aac304;//退耕还林面积
    private BigDecimal aac305;//林果面积
    private BigDecimal aac306;//牧草地面积
    private BigDecimal aac307;//水面面积
    private String aac084;//是否参加农民专业合作社
    private String aac308;//是否通生产用电
    private Long aac315;//与村主干道路
    private String aac316;//入户路类型
    private Long aac317;//住房面积
    private String aac318;//是否危房户
    private String aac319;//有无卫生厕所
    private String aac320;//主要燃料类型
    private String aac322;//危房级别
    private String acr077;//是否有搬迁意愿
    private String acr075;//搬迁方式
    private String aac311;//饮水是否困难
    private String aac312;//饮水是否安全


    public PovertyProduceDto(Long aar040, BigDecimal aac301, BigDecimal aac302, BigDecimal aac303, BigDecimal aac304, BigDecimal aac305, BigDecimal aac306, BigDecimal aac307, String aac084, String aac308, Long aac315, String aac316, Long aac317, String aac318, String aac319, String aac320, String aac322, String acr077, String acr075, String aac311, String aac312) {
        this.aar040 = aar040;
        this.aac301 = aac301;
        this.aac302 = aac302;
        this.aac303 = aac303;
        this.aac304 = aac304;
        this.aac305 = aac305;
        this.aac306 = aac306;
        this.aac307 = aac307;
        this.aac084 = aac084;
        this.aac308 = aac308;
        this.aac315 = aac315;
        this.aac316 = aac316;
        this.aac317 = aac317;
        this.aac318 = aac318;
        this.aac319 = aac319;
        this.aac320 = aac320;
        this.aac322 = aac322;
        this.acr077 = acr077;
        this.acr075 = acr075;
        this.aac311 = aac311;
        this.aac312 = aac312;
    }

    public String getAac311() {
        return aac311;
    }

    public void setAac311(String aac311) {
        this.aac311 = aac311;
    }

    public String getAac312() {
        return aac312;
    }

    public void setAac312(String aac312) {
        this.aac312 = aac312;
    }

    public PovertyProduceDto() {
        super();
    }

    public String getAcr077() {
        return acr077;
    }

    public void setAcr077(String acr077) {
        this.acr077 = acr077;
    }

    public String getAcr075() {
        return acr075;
    }

    public void setAcr075(String acr075) {
        this.acr075 = acr075;
    }

    public Long getAar040() {
        return aar040;
    }

    public void setAar040(Long aar040) {
        this.aar040 = aar040;
    }

    public BigDecimal getAac301() {
        return aac301;
    }

    public void setAac301(BigDecimal aac301) {
        this.aac301 = aac301;
    }

    public BigDecimal getAac302() {
        return aac302;
    }

    public void setAac302(BigDecimal aac302) {
        this.aac302 = aac302;
    }

    public BigDecimal getAac303() {
        return aac303;
    }

    public void setAac303(BigDecimal aac303) {
        this.aac303 = aac303;
    }

    public BigDecimal getAac304() {
        return aac304;
    }

    public void setAac304(BigDecimal aac304) {
        this.aac304 = aac304;
    }

    public BigDecimal getAac305() {
        return aac305;
    }

    public void setAac305(BigDecimal aac305) {
        this.aac305 = aac305;
    }

    public BigDecimal getAac306() {
        return aac306;
    }

    public void setAac306(BigDecimal aac306) {
        this.aac306 = aac306;
    }

    public BigDecimal getAac307() {
        return aac307;
    }

    public void setAac307(BigDecimal aac307) {
        this.aac307 = aac307;
    }

    public String getAac084() {
        return aac084;
    }

    public void setAac084(String aac084) {
        this.aac084 = aac084;
    }

    public String getAac308() {
        return aac308;
    }

    public void setAac308(String aac308) {
        this.aac308 = aac308;
    }

    public Long getAac315() {
        return aac315;
    }

    public void setAac315(Long aac315) {
        this.aac315 = aac315;
    }

    public String getAac316() {
        return aac316;
    }

    public void setAac316(String aac316) {
        this.aac316 = aac316;
    }

    public Long getAac317() {
        return aac317;
    }

    public void setAac317(Long aac317) {
        this.aac317 = aac317;
    }

    public String getAac318() {
        return aac318;
    }

    public void setAac318(String aac318) {
        this.aac318 = aac318;
    }

    public String getAac319() {
        return aac319;
    }

    public void setAac319(String aac319) {
        this.aac319 = aac319;
    }

    public String getAac320() {
        return aac320;
    }

    public void setAac320(String aac320) {
        this.aac320 = aac320;
    }

    public String getAac322() {
        return aac322;
    }

    public void setAac322(String aac322) {
        this.aac322 = aac322;
    }

    @Override
    public String toString() {
        return "PovertyProduceDto{" +
                "aar040=" + aar040 +
                ", aac301=" + aac301 +
                ", aac302=" + aac302 +
                ", aac303=" + aac303 +
                ", aac304=" + aac304 +
                ", aac305=" + aac305 +
                ", aac306=" + aac306 +
                ", aac307=" + aac307 +
                ", aac084='" + aac084 + '\'' +
                ", aac308='" + aac308 + '\'' +
                ", aac315=" + aac315 +
                ", aac316='" + aac316 + '\'' +
                ", aac317=" + aac317 +
                ", aac318='" + aac318 + '\'' +
                ", aac319='" + aac319 + '\'' +
                ", aac320='" + aac320 + '\'' +
                ", aac322='" + aac322 + '\'' +
                ", acr077='" + acr077 + '\'' +
                ", acr075='" + acr075 + '\'' +
                ", aac311='" + aac311 + '\'' +
                ", aac312='" + aac312 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PovertyProduceDto that = (PovertyProduceDto) o;
        return Objects.equals(aar040, that.aar040) &&
                Objects.equals(aac301, that.aac301) &&
                Objects.equals(aac302, that.aac302) &&
                Objects.equals(aac303, that.aac303) &&
                Objects.equals(aac304, that.aac304) &&
                Objects.equals(aac305, that.aac305) &&
                Objects.equals(aac306, that.aac306) &&
                Objects.equals(aac307, that.aac307) &&
                Objects.equals(aac084, that.aac084) &&
                Objects.equals(aac308, that.aac308) &&
                Objects.equals(aac315, that.aac315) &&
                Objects.equals(aac316, that.aac316) &&
                Objects.equals(aac317, that.aac317) &&
                Objects.equals(aac318, that.aac318) &&
                Objects.equals(aac319, that.aac319) &&
                Objects.equals(aac320, that.aac320) &&
                Objects.equals(aac322, that.aac322) &&
                Objects.equals(acr077, that.acr077) &&
                Objects.equals(acr075, that.acr075) &&
                Objects.equals(aac311, that.aac311) &&
                Objects.equals(aac312, that.aac312);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aar040, aac301, aac302, aac303, aac304, aac305, aac306, aac307, aac084, aac308, aac315, aac316, aac317, aac318, aac319, aac320, aac322, acr077, acr075, aac311, aac312);
    }
}
