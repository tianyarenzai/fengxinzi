package com.sysh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 帮扶责任人的信息展示，后期修改的也用
 * Created by sjy Cotter on 2018/8/23.
 */

public class AK11AC08DD implements Serializable {

    private String aab002,aab003,aap001,aak888,aab004,aar012,aak033,aak036,aak037,aac029,aac001,aar020,aar021;

    public AK11AC08DD(String aab002, String aab003, String aap001, String aak888, String aab004, String aar012, String aak033, String aak036, String aak037, String aac029, String aac001, String aar020, String aar021) {
        this.aab002 = aab002;
        this.aab003 = aab003;
        this.aap001 = aap001;
        this.aak888 = aak888;
        this.aab004 = aab004;
        this.aar012 = aar012;
        this.aak033 = aak033;
        this.aak036 = aak036;
        this.aak037 = aak037;
        this.aac029 = aac029;
        this.aac001 = aac001;
        this.aar020 = aar020;
        this.aar021 = aar021;
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

    public String getAap001() {
        return aap001;
    }

    public void setAap001(String aap001) {
        this.aap001 = aap001;
    }

    public String getAak888() {
        return aak888;
    }

    public void setAak888(String aak888) {
        this.aak888 = aak888;
    }

    public String getAab004() {
        return aab004;
    }

    public void setAab004(String aab004) {
        this.aab004 = aab004;
    }

    public String getAar012() {
        return aar012;
    }

    public void setAar012(String aar012) {
        this.aar012 = aar012;
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

    public String getAak037() {
        return aak037;
    }

    public void setAak037(String aak037) {
        this.aak037 = aak037;
    }

    public String getAac029() {
        return aac029;
    }

    public void setAac029(String aac029) {
        this.aac029 = aac029;
    }

    public String getAac001() {
        return aac001;
    }

    public void setAac001(String aac001) {
        this.aac001 = aac001;
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

    @Override
    public String toString() {
        return "AK11AC08DD{" +
                "aab002='" + aab002 + '\'' +
                ", aab003='" + aab003 + '\'' +
                ", aap001='" + aap001 + '\'' +
                ", aak888='" + aak888 + '\'' +
                ", aab004='" + aab004 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", aak033='" + aak033 + '\'' +
                ", aak036='" + aak036 + '\'' +
                ", aak037='" + aak037 + '\'' +
                ", aac029='" + aac029 + '\'' +
                ", aac001='" + aac001 + '\'' +
                ", aar020='" + aar020 + '\'' +
                ", aar021='" + aar021 + '\'' +
                '}';
    }

    public AK11AC08DD() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AK11AC08DD that = (AK11AC08DD) o;
        return Objects.equals(aab002, that.aab002) &&
                Objects.equals(aab003, that.aab003) &&
                Objects.equals(aap001, that.aap001) &&
                Objects.equals(aak888, that.aak888) &&
                Objects.equals(aab004, that.aab004) &&
                Objects.equals(aar012, that.aar012) &&
                Objects.equals(aak033, that.aak033) &&
                Objects.equals(aak036, that.aak036) &&
                Objects.equals(aak037, that.aak037) &&
                Objects.equals(aac029, that.aac029) &&
                Objects.equals(aac001, that.aac001) &&
                Objects.equals(aar020, that.aar020) &&
                Objects.equals(aar021, that.aar021);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aab002, aab003, aap001, aak888, aab004, aar012, aak033, aak036, aak037, aac029, aac001, aar020, aar021);
    }
}
