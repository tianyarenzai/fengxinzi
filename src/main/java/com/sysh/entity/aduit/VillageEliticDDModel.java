package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageEliticDDModel implements Serializable {

    private String aad358;



    public VillageEliticDDModel(String aad358) {
        this.aad358 = aad358;
    }

    public VillageEliticDDModel() {
        super();
    }

    public String getAad358() {
        return aad358;
    }

    public void setAad358(String aad358) {
        this.aad358 = aad358;
    }

    @Override
    public String toString() {
        return "VillageEliticDDModel{" +
                "aad358='" + aad358 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageEliticDDModel that = (VillageEliticDDModel) o;
        return Objects.equals(aad358, that.aad358);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad358);
    }
}
