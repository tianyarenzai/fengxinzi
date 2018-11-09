package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageLandDDModel implements Serializable {

    private String aad019,aad027,aad021,aad022,aad023,aad024,aad025;

    public VillageLandDDModel(String aad019, String aad027, String aad021, String aad022, String aad023, String aad024, String aad025) {
        this.aad019 = aad019;
        this.aad027 = aad027;
        this.aad021 = aad021;
        this.aad022 = aad022;
        this.aad023 = aad023;
        this.aad024 = aad024;
        this.aad025 = aad025;
    }

    public VillageLandDDModel() {
        super();
    }

    public String getAad019() {
        return aad019;
    }

    public void setAad019(String aad019) {
        this.aad019 = aad019;
    }

    public String getAad027() {
        return aad027;
    }

    public void setAad027(String aad027) {
        this.aad027 = aad027;
    }

    public String getAad021() {
        return aad021;
    }

    public void setAad021(String aad021) {
        this.aad021 = aad021;
    }

    public String getAad022() {
        return aad022;
    }

    public void setAad022(String aad022) {
        this.aad022 = aad022;
    }

    public String getAad023() {
        return aad023;
    }

    public void setAad023(String aad023) {
        this.aad023 = aad023;
    }

    public String getAad024() {
        return aad024;
    }

    public void setAad024(String aad024) {
        this.aad024 = aad024;
    }

    public String getAad025() {
        return aad025;
    }

    public void setAad025(String aad025) {
        this.aad025 = aad025;
    }

    @Override
    public String toString() {
        return "VillageLandModel{" +
                "aad019='" + aad019 + '\'' +
                ", aad027='" + aad027 + '\'' +
                ", aad021='" + aad021 + '\'' +
                ", aad022='" + aad022 + '\'' +
                ", aad023='" + aad023 + '\'' +
                ", aad024='" + aad024 + '\'' +
                ", aad025='" + aad025 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageLandDDModel that = (VillageLandDDModel) o;
        return Objects.equals(aad019, that.aad019) &&
                Objects.equals(aad027, that.aad027) &&
                Objects.equals(aad021, that.aad021) &&
                Objects.equals(aad022, that.aad022) &&
                Objects.equals(aad023, that.aad023) &&
                Objects.equals(aad024, that.aad024) &&
                Objects.equals(aad025, that.aad025);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad019, aad027, aad021, aad022, aad023, aad024, aad025);
    }
}
