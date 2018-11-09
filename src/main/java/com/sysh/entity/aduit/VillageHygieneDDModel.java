package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageHygieneDDModel implements Serializable {

    private String aad391,aad392,aad393,aad394;

    public VillageHygieneDDModel(String aad391, String aad392, String aad393, String aad394) {
        this.aad391 = aad391;
        this.aad392 = aad392;
        this.aad393 = aad393;
        this.aad394 = aad394;
    }

    public VillageHygieneDDModel() {
        super();
    }

    public String getAad391() {
        return aad391;
    }

    public void setAad391(String aad391) {
        this.aad391 = aad391;
    }

    public String getAad392() {
        return aad392;
    }

    public void setAad392(String aad392) {
        this.aad392 = aad392;
    }

    public String getAad393() {
        return aad393;
    }

    public void setAad393(String aad393) {
        this.aad393 = aad393;
    }

    public String getAad394() {
        return aad394;
    }

    public void setAad394(String aad394) {
        this.aad394 = aad394;
    }

    @Override
    public String toString() {
        return "VillageHygieneModel{" +
                "aad391='" + aad391 + '\'' +
                ", aad392='" + aad392 + '\'' +
                ", aad393='" + aad393 + '\'' +
                ", aad394='" + aad394 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageHygieneDDModel that = (VillageHygieneDDModel) o;
        return Objects.equals(aad391, that.aad391) &&
                Objects.equals(aad392, that.aad392) &&
                Objects.equals(aad393, that.aad393) &&
                Objects.equals(aad394, that.aad394);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad391, aad392, aad393, aad394);
    }
}
