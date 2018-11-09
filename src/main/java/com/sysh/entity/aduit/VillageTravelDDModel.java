package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * 乡村旅游
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageTravelDDModel implements Serializable {

    private String aad381,aad383,aad382,aad384;

    public VillageTravelDDModel(String aad381, String aad383, String aad382, String aad384) {
        this.aad381 = aad381;
        this.aad383 = aad383;
        this.aad382 = aad382;
        this.aad384 = aad384;
    }

    public VillageTravelDDModel() {
        super();
    }

    public String getAad381() {
        return aad381;
    }

    public void setAad381(String aad381) {
        this.aad381 = aad381;
    }

    public String getAad383() {
        return aad383;
    }

    public void setAad383(String aad383) {
        this.aad383 = aad383;
    }

    public String getAad382() {
        return aad382;
    }

    public void setAad382(String aad382) {
        this.aad382 = aad382;
    }

    public String getAad384() {
        return aad384;
    }

    public void setAad384(String aad384) {
        this.aad384 = aad384;
    }

    @Override
    public String toString() {
        return "VillageTravelModel{" +
                "aad381='" + aad381 + '\'' +
                ", aad383='" + aad383 + '\'' +
                ", aad382='" + aad382 + '\'' +
                ", aad384='" + aad384 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageTravelDDModel that = (VillageTravelDDModel) o;
        return Objects.equals(aad381, that.aad381) &&
                Objects.equals(aad383, that.aad383) &&
                Objects.equals(aad382, that.aad382) &&
                Objects.equals(aad384, that.aad384);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad381, aad383, aad382, aad384);
    }
}
