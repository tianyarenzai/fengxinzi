package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageLevelModel implements Serializable {

    private String aad328,aad323;

    public VillageLevelModel(String aad328, String aad323) {
        this.aad328 = aad328;
        this.aad323 = aad323;
    }

    public VillageLevelModel() {
        super();
    }

    public String getAad328() {
        return aad328;
    }

    public void setAad328(String aad328) {
        this.aad328 = aad328;
    }

    public String getAad323() {
        return aad323;
    }

    public void setAad323(String aad323) {
        this.aad323 = aad323;
    }

    @Override
    public String toString() {
        return "VillageLevelModel{" +
                "aad328='" + aad328 + '\'' +
                ", aad323='" + aad323 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageLevelModel that = (VillageLevelModel) o;
        return Objects.equals(aad328, that.aad328) &&
                Objects.equals(aad323, that.aad323);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad328, aad323);
    }
}
