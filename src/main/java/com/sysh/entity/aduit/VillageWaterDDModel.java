package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * 安全饮水
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageWaterDDModel implements Serializable {

    private String aad331,aad332;

    public VillageWaterDDModel(String aad331, String aad332) {
        this.aad331 = aad331;
        this.aad332 = aad332;
    }

    public VillageWaterDDModel() {
        super();
    }

    public String getAad331() {
        return aad331;
    }

    public void setAad331(String aad331) {
        this.aad331 = aad331;
    }

    public String getAad332() {
        return aad332;
    }

    public void setAad332(String aad332) {
        this.aad332 = aad332;
    }

    @Override
    public String toString() {
        return "VillageWaterModel{" +
                "aad331='" + aad331 + '\'' +
                ", aad332='" + aad332 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageWaterDDModel that = (VillageWaterDDModel) o;
        return Objects.equals(aad331, that.aad331) &&
                Objects.equals(aad332, that.aad332);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad331, aad332);
    }
}
