package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageBasicDDModel implements Serializable {
    private String aar011,aaf031,aar012,aad004,aad035,aad038,aad037,aad036;

    public VillageBasicDDModel(String aar011, String aaf031, String aar012, String aad004, String aad035, String aad038, String aad037, String aad036) {
        this.aar011 = aar011;
        this.aaf031 = aaf031;
        this.aar012 = aar012;
        this.aad004 = aad004;
        this.aad035 = aad035;
        this.aad038 = aad038;
        this.aad037 = aad037;
        this.aad036 = aad036;
    }

    public VillageBasicDDModel() {
        super();
    }

    public String getAar011() {
        return aar011;
    }

    public void setAar011(String aar011) {
        this.aar011 = aar011;
    }

    public String getAaf031() {
        return aaf031;
    }

    public void setAaf031(String aaf031) {
        this.aaf031 = aaf031;
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

    public String getAad035() {
        return aad035;
    }

    public void setAad035(String aad035) {
        this.aad035 = aad035;
    }

    public String getAad038() {
        return aad038;
    }

    public void setAad038(String aad038) {
        this.aad038 = aad038;
    }

    public String getAad037() {
        return aad037;
    }

    public void setAad037(String aad037) {
        this.aad037 = aad037;
    }

    public String getAad036() {
        return aad036;
    }

    public void setAad036(String aad036) {
        this.aad036 = aad036;
    }

    @Override
    public String toString() {
        return "VillageBasicModel{" +
                "aar011='" + aar011 + '\'' +
                ", aaf031='" + aaf031 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", aad004='" + aad004 + '\'' +
                ", aad035='" + aad035 + '\'' +
                ", aad038='" + aad038 + '\'' +
                ", aad037='" + aad037 + '\'' +
                ", aad036='" + aad036 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageBasicDDModel that = (VillageBasicDDModel) o;
        return Objects.equals(aar011, that.aar011) &&
                Objects.equals(aaf031, that.aaf031) &&
                Objects.equals(aar012, that.aar012) &&
                Objects.equals(aad004, that.aad004) &&
                Objects.equals(aad035, that.aad035) &&
                Objects.equals(aad038, that.aad038) &&
                Objects.equals(aad037, that.aad037) &&
                Objects.equals(aad036, that.aad036);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aar011, aaf031, aar012, aad004, aad035, aad038, aad037, aad036);
    }
}
