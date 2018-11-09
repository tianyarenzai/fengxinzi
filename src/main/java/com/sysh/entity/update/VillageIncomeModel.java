package com.sysh.entity.update;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 收入信息
 * Created by sjy Cotter on 2018/7/21.
 */

public class VillageIncomeModel implements Serializable {

    private String aad301,aad302;

    public VillageIncomeModel(String aad301, String aad302) {
        this.aad301 = aad301;
        this.aad302 = aad302;
    }

    public VillageIncomeModel() {
        super();
    }

    public String getAad302() {
        return aad302;
    }

    public void setAad302(String aad302) {
        this.aad302 = aad302;
    }

    public String getAad301() {
        return aad301;
    }

    public void setAad301(String aad301) {
        this.aad301 = aad301;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageIncomeModel that = (VillageIncomeModel) o;
        return Objects.equals(aad301, that.aad301) &&
                Objects.equals(aad302, that.aad302);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad301, aad302);
    }

    @Override
    public String toString() {
        return "VillageIncomeModel{" +
                "aad301='" + aad301 + '\'' +
                ", aad302='" + aad302 + '\'' +
                '}';
    }
}
