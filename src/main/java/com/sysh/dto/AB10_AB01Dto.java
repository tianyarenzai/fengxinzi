package com.sysh.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName:  <br/>
 * Function: 两表联查，确定家庭成员详细信息<br/>
 * date: 2018年06月09日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class AB10_AB01Dto implements Serializable {

    private String aab002;//姓名
    private String aab003;//性别
    private String aab018;//证件类型
    private String aab004;//证件号码
    private String aab005;//出生日期
    private String aab007;//民族
    private String aab031;//联系电话
    private String aab008;//文化程度
    private String aab009;//在校生状况
    private String aab010;//劳动技能
    private String aab017;//健康状况
    private String aab019;//是否现役军人
    private String aak033;//政治面貌
    private String aab030;//是否享受低保
    private String aab013;//是否参加新型农村合作医疗
    private String aab014;//是否参加新型弄vu你养老保险
    private String aab021;//是否参加城镇职工基本养老保险
    private String aab022;//是否参加大病保险
    private String aab006;//与户主关系

    public AB10_AB01Dto(String aab002, String aab003, String aab018, String aab004, String aab005, String aab007, String aab031, String aab008, String aab009, String aab010, String aab017, String aab019, String aak033, String aab030, String aab013, String aab014, String aab021, String aab022, String aab006) {
        this.aab002 = aab002;
        this.aab003 = aab003;
        this.aab018 = aab018;
        this.aab004 = aab004;
        this.aab005 = aab005;
        this.aab007 = aab007;
        this.aab031 = aab031;
        this.aab008 = aab008;
        this.aab009 = aab009;
        this.aab010 = aab010;
        this.aab017 = aab017;
        this.aab019 = aab019;
        this.aak033 = aak033;
        this.aab030 = aab030;
        this.aab013 = aab013;
        this.aab014 = aab014;
        this.aab021 = aab021;
        this.aab022 = aab022;
        this.aab006 = aab006;
    }

    public AB10_AB01Dto() {
        super();
    }

    public String getAab002() {
        return aab002;
    }

    public void setAab002(String aab002) {
        this.aab002 = aab002;
    }

    public String getAab003() {
        return aab003;
    }

    public void setAab003(String aab003) {
        this.aab003 = aab003;
    }

    public String getAab018() {
        return aab018;
    }

    public void setAab018(String aab018) {
        this.aab018 = aab018;
    }

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004;
    }

    public String getAab005() {
        return aab005;
    }

    public void setAab005(String aab005) {
        this.aab005 = aab005;
    }

    public String getAab007() {
        return aab007;
    }

    public void setAab007(String aab007) {
        this.aab007 = aab007;
    }

    public String getAab031() {
        return aab031;
    }

    public void setAab031(String aab031) {
        this.aab031 = aab031;
    }

    public String getAab008() {
        return aab008;
    }

    public void setAab008(String aab008) {
        this.aab008 = aab008;
    }

    public String getAab009() {
        return aab009;
    }

    public void setAab009(String aab009) {
        this.aab009 = aab009;
    }

    public String getAab010() {
        return aab010;
    }

    public void setAab010(String aab010) {
        this.aab010 = aab010;
    }

    public String getAab017() {
        return aab017;
    }

    public void setAab017(String aab017) {
        this.aab017 = aab017;
    }

    public String getAab019() {
        return aab019;
    }

    public void setAab019(String aab019) {
        this.aab019 = aab019;
    }

    public String getAak033() {
        return aak033;
    }

    public void setAak033(String aak033) {
        this.aak033 = aak033;
    }

    public String getAab030() {
        return aab030;
    }

    public void setAab030(String aab030) {
        this.aab030 = aab030;
    }

    public String getAab013() {
        return aab013;
    }

    public void setAab013(String aab013) {
        this.aab013 = aab013;
    }

    public String getAab014() {
        return aab014;
    }

    public void setAab014(String aab014) {
        this.aab014 = aab014;
    }

    public String getAab021() {
        return aab021;
    }

    public void setAab021(String aab021) {
        this.aab021 = aab021;
    }

    public String getAab022() {
        return aab022;
    }

    public void setAab022(String aab022) {
        this.aab022 = aab022;
    }

    public String getAab006() {
        return aab006;
    }

    public void setAab006(String aab006) {
        this.aab006 = aab006;
    }

    @Override
    public String toString() {
        return "AB10_AB01Dto{" +
                "aab002='" + aab002 + '\'' +
                ", aab003='" + aab003 + '\'' +
                ", aab018='" + aab018 + '\'' +
                ", aab004='" + aab004 + '\'' +
                ", aab005='" + aab005 + '\'' +
                ", aab007='" + aab007 + '\'' +
                ", aab031='" + aab031 + '\'' +
                ", aab008='" + aab008 + '\'' +
                ", aab009='" + aab009 + '\'' +
                ", aab010='" + aab010 + '\'' +
                ", aab017='" + aab017 + '\'' +
                ", aab019='" + aab019 + '\'' +
                ", aak033='" + aak033 + '\'' +
                ", aab030='" + aab030 + '\'' +
                ", aab013='" + aab013 + '\'' +
                ", aab014='" + aab014 + '\'' +
                ", aab021='" + aab021 + '\'' +
                ", aab022='" + aab022 + '\'' +
                ", aab006='" + aab006 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AB10_AB01Dto that = (AB10_AB01Dto) o;
        return Objects.equals(aab002, that.aab002) &&
                Objects.equals(aab003, that.aab003) &&
                Objects.equals(aab018, that.aab018) &&
                Objects.equals(aab004, that.aab004) &&
                Objects.equals(aab005, that.aab005) &&
                Objects.equals(aab007, that.aab007) &&
                Objects.equals(aab031, that.aab031) &&
                Objects.equals(aab008, that.aab008) &&
                Objects.equals(aab009, that.aab009) &&
                Objects.equals(aab010, that.aab010) &&
                Objects.equals(aab017, that.aab017) &&
                Objects.equals(aab019, that.aab019) &&
                Objects.equals(aak033, that.aak033) &&
                Objects.equals(aab030, that.aab030) &&
                Objects.equals(aab013, that.aab013) &&
                Objects.equals(aab014, that.aab014) &&
                Objects.equals(aab021, that.aab021) &&
                Objects.equals(aab022, that.aab022) &&
                Objects.equals(aab006, that.aab006);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aab002, aab003, aab018, aab004, aab005, aab007, aab031, aab008, aab009, aab010, aab017, aab019, aak033, aab030, aab013, aab014, aab021, aab022, aab006);
    }
}
