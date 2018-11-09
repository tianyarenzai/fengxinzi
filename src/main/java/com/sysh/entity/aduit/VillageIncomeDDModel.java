package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * 村收入信息
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageIncomeDDModel implements Serializable {

    private String aad301,aad302;

    public VillageIncomeDDModel(String aad301, String aad302) {
        this.aad301 = aad301;
        this.aad302 = aad302;
    }

    public VillageIncomeDDModel() {
        super();
    }

    public String getAad301() {
        return aad301;
    }

    public void setAad301(String aad301) {
        this.aad301 = aad301;
    }

    public String getAad302() {
        return aad302;
    }

    public void setAad302(String aad302) {
        this.aad302 = aad302;
    }

    @Override
    public String toString() {
        return "VillageIncomeModel{" +
                "aad301='" + aad301 + '\'' +
                ", aad302='" + aad302 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageIncomeDDModel that = (VillageIncomeDDModel) o;
        return Objects.equals(aad301, that.aad301) &&
                Objects.equals(aad302, that.aad302);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad301, aad302);
    }
}
