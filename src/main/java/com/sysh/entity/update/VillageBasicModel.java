package com.sysh.entity.update;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 基本信息
 * Created by sjy Cotter on 2018/7/21.
 */

public class VillageBasicModel implements Serializable {

    private String aar011,aar012,aad004,aaf031,aad035,aad036,aar101,aar102;

    public VillageBasicModel(String aar011, String aar012, String aad004, String aaf031, String aad035, String aad036, String aar101, String aar102) {
        this.aar011 = aar011;
        this.aar012 = aar012;
        this.aad004 = aad004;
        this.aaf031 = aaf031;
        this.aad035 = aad035;
        this.aad036 = aad036;
        this.aar101 = aar101;
        this.aar102 = aar102;
    }

    public VillageBasicModel() {
        super();
    }

    public String getAar011() {
        return aar011;
    }

    public void setAar011(String aar011) {
        this.aar011 = aar011;
    }

    public String getAar012() {
        return aar012;
    }

    public void setAar012(String aar012) {
        this.aar012 = aar012;
    }

    public String getAad004() {
        return aad004;
    }

    public void setAad004(String aad004) {
        this.aad004 = aad004;
    }

    public String getAaf031() {
        return aaf031;
    }

    public void setAaf031(String aaf031) {
        this.aaf031 = aaf031;
    }

    public String getAad035() {
        return aad035;
    }

    public void setAad035(String aad035) {
        this.aad035 = aad035;
    }

    public String getAad036() {
        return aad036;
    }

    public void setAad036(String aad036) {
        this.aad036 = aad036;
    }

    public String getAar101() {
        return aar101;
    }

    public void setAar101(String aar101) {
        this.aar101 = aar101;
    }

    public String getAar102() {
        return aar102;
    }

    public void setAar102(String aar102) {
        this.aar102 = aar102;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageBasicModel that = (VillageBasicModel) o;
        return Objects.equals(aar011, that.aar011) &&
                Objects.equals(aar012, that.aar012) &&
                Objects.equals(aad004, that.aad004) &&
                Objects.equals(aaf031, that.aaf031) &&
                Objects.equals(aad035, that.aad035) &&
                Objects.equals(aad036, that.aad036) &&
                Objects.equals(aar101, that.aar101) &&
                Objects.equals(aar102, that.aar102);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aar011, aar012, aad004, aaf031, aad035, aad036, aar101, aar102);
    }

    @Override
    public String toString() {
        return "VillageBasicModel{" +
                "aar011='" + aar011 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", aad004='" + aad004 + '\'' +
                ", aaf031='" + aaf031 + '\'' +
                ", aad035='" + aad035 + '\'' +
                ", aad036='" + aad036 + '\'' +
                ", aar101='" + aar101 + '\'' +
                ", aar102='" + aar102 + '\'' +
                '}';
    }
}
