package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 结对信息展示<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class HelpUserAndPovertyDto implements Serializable {

    /*private String aac080;//结对编号
    private String aac001;//贫困户编号
    private String aak110;//帮扶干部编号
    private String aar020;//开始时间
    private String aar021;//结束时间
    private String aac029;//贫困户名称
    private String aab002;//帮扶干部名称
    private */
    private String aac080,aac001,aak110,aar020,aar021,aar100,aac029,aab002,aap110,aak039,aak037,aap001,aap004,
            aab004,aak033,aak036,aar012,sex;
    //结对编号，贫困户编号，帮扶责任人编号，开始时间，结束时间，有效标志，户主姓名，帮扶责任人姓名，帮扶单位编号，是否驻村队员，技术特长，单位名称，隶属关系
    //户住证件号码，政治面貌，学历，联系电话


    public HelpUserAndPovertyDto(String aac080, String aac001, String aak110, String aar020, String aar021, String aar100, String aac029, String aab002, String aap110, String aak039, String aak037, String aap001, String aap004, String aab004, String aak033, String aak036, String aar012, String sex) {
        this.aac080 = aac080;
        this.aac001 = aac001;
        this.aak110 = aak110;
        this.aar020 = aar020;
        this.aar021 = aar021;
        this.aar100 = aar100;
        this.aac029 = aac029;
        this.aab002 = aab002;
        this.aap110 = aap110;
        this.aak039 = aak039;
        this.aak037 = aak037;
        this.aap001 = aap001;
        this.aap004 = aap004;
        this.aab004 = aab004;
        this.aak033 = aak033;
        this.aak036 = aak036;
        this.aar012 = aar012;
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public HelpUserAndPovertyDto() {
        super();
    }

    public String getAac080() {
        return aac080;
    }

    public void setAac080(String aac080) {
        this.aac080 = aac080;
    }

    public String getAac001() {
        return aac001;
    }

    public void setAac001(String aac001) {
        this.aac001 = aac001;
    }

    public String getAak110() {
        return aak110;
    }

    public void setAak110(String aak110) {
        this.aak110 = aak110;
    }

    public String getAar020() {
        return aar020;
    }

    public void setAar020(String aar020) {
        this.aar020 = aar020;
    }

    public String getAar021() {
        return aar021;
    }

    public void setAar021(String aar021) {
        this.aar021 = aar021;
    }

    public String getAar100() {
        return aar100;
    }

    public void setAar100(String aar100) {
        this.aar100 = aar100;
    }

    public String getAac029() {
        return aac029;
    }

    public void setAac029(String aac029) {
        this.aac029 = aac029;
    }

    public String getAab002() {
        return aab002;
    }

    public void setAab002(String aab002) {
        this.aab002 = aab002;
    }

    public String getAap110() {
        return aap110;
    }

    public void setAap110(String aap110) {
        this.aap110 = aap110;
    }

    public String getAak039() {
        return aak039;
    }

    public void setAak039(String aak039) {
        this.aak039 = aak039;
    }

    public String getAak037() {
        return aak037;
    }

    public void setAak037(String aak037) {
        this.aak037 = aak037;
    }

    public String getAap001() {
        return aap001;
    }

    public void setAap001(String aap001) {
        this.aap001 = aap001;
    }

    public String getAap004() {
        return aap004;
    }

    public void setAap004(String aap004) {
        this.aap004 = aap004;
    }

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004;
    }

    public String getAak033() {
        return aak033;
    }

    public void setAak033(String aak033) {
        this.aak033 = aak033;
    }

    public String getAak036() {
        return aak036;
    }

    public void setAak036(String aak036) {
        this.aak036 = aak036;
    }

    public String getAar012() {
        return aar012;
    }

    public void setAar012(String aar012) {
        this.aar012 = aar012;
    }

    @Override
    public String toString() {
        return "HelpUserAndPovertyDto{" +
                "aac080='" + aac080 + '\'' +
                ", aac001='" + aac001 + '\'' +
                ", aak110='" + aak110 + '\'' +
                ", aar020='" + aar020 + '\'' +
                ", aar021='" + aar021 + '\'' +
                ", aar100='" + aar100 + '\'' +
                ", aac029='" + aac029 + '\'' +
                ", aab002='" + aab002 + '\'' +
                ", aap110='" + aap110 + '\'' +
                ", aak039='" + aak039 + '\'' +
                ", aak037='" + aak037 + '\'' +
                ", aap001='" + aap001 + '\'' +
                ", aap004='" + aap004 + '\'' +
                ", aab004='" + aab004 + '\'' +
                ", aak033='" + aak033 + '\'' +
                ", aak036='" + aak036 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
