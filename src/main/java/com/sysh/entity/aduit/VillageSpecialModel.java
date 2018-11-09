package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageSpecialModel implements Serializable {

    private String aad371;

    public VillageSpecialModel(String aad371) {
        this.aad371 = aad371;
    }

    public VillageSpecialModel() {
        super();
    }

    public String getAad371() {
        return aad371;
    }

    public void setAad371(String aad371) {
        this.aad371 = aad371;
    }

    @Override
    public String toString() {
        return "VillageSpecialModel{" +
                "aad371='" + aad371 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageSpecialModel that = (VillageSpecialModel) o;
        return Objects.equals(aad371, that.aad371);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad371);
    }
}
