package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillageInfoDDModel implements Serializable {

    private String aad411,aad413,aad412,aad414;

    public VillageInfoDDModel() {
        super();
    }

    public VillageInfoDDModel(String aad411, String aad413, String aad412, String aad414) {
        this.aad411 = aad411;
        this.aad413 = aad413;
        this.aad412 = aad412;
        this.aad414 = aad414;
    }

    public String getAad411() {
        return aad411;
    }

    public void setAad411(String aad411) {
        this.aad411 = aad411;
    }

    public String getAad413() {
        return aad413;
    }

    public void setAad413(String aad413) {
        this.aad413 = aad413;
    }

    public String getAad412() {
        return aad412;
    }

    public void setAad412(String aad412) {
        this.aad412 = aad412;
    }

    public String getAad414() {
        return aad414;
    }

    public void setAad414(String aad414) {
        this.aad414 = aad414;
    }

    @Override
    public String toString() {
        return "VillageInfoModel{" +
                "aad411='" + aad411 + '\'' +
                ", aad413='" + aad413 + '\'' +
                ", aad412='" + aad412 + '\'' +
                ", aad414='" + aad414 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageInfoDDModel that = (VillageInfoDDModel) o;
        return Objects.equals(aad411, that.aad411) &&
                Objects.equals(aad413, that.aad413) &&
                Objects.equals(aad412, that.aad412) &&
                Objects.equals(aad414, that.aad414);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad411, aad413, aad412, aad414);
    }
}
