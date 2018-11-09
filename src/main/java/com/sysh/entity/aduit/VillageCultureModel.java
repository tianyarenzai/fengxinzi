package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageCultureModel implements Serializable {

    private String aad401;



    public VillageCultureModel(String aad401) {
        this.aad401 = aad401;
    }

    public VillageCultureModel() {
        super();
    }

    public String getAad401() {
        return aad401;
    }

    public void setAad401(String aad401) {
        this.aad401 = aad401;
    }

    @Override
    public String toString() {
        return "VillageCultureModel{" +
                "aad401='" + aad401 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageCultureModel that = (VillageCultureModel) o;
        return Objects.equals(aad401, that.aad401);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad401);
    }
}
