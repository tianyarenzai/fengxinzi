package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageDangerModel implements Serializable {

    private String aad361;

    public VillageDangerModel() {
        super();
    }

    public VillageDangerModel(String aad361) {
        this.aad361 = aad361;
    }

    public String getAad361() {
        return aad361;
    }

    public void setAad361(String aad361) {
        this.aad361 = aad361;
    }

    @Override
    public String toString() {
        return "VillageDangerModel{" +
                "aad361='" + aad361 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageDangerModel that = (VillageDangerModel) o;
        return Objects.equals(aad361, that.aad361);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad361);
    }
}
