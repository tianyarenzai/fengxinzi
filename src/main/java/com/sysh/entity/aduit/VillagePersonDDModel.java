package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public class VillagePersonDDModel implements Serializable {

    private String aad005,aad006,aad008,aad009,aad010,aad012,aad013,aad014,aad015,aad016,
            aad017,aad018;

    public VillagePersonDDModel(String aad005, String aad006, String aad008, String aad009, String aad010, String aad012, String aad013, String aad014, String aad015, String aad016, String aad017, String aad018) {
        this.aad005 = aad005;
        this.aad006 = aad006;
        this.aad008 = aad008;
        this.aad009 = aad009;
        this.aad010 = aad010;
        this.aad012 = aad012;
        this.aad013 = aad013;
        this.aad014 = aad014;
        this.aad015 = aad015;
        this.aad016 = aad016;
        this.aad017 = aad017;
        this.aad018 = aad018;
    }

    public VillagePersonDDModel() {
        super();
    }

    public String getAad005() {
        return aad005;
    }

    public void setAad005(String aad005) {
        this.aad005 = aad005;
    }

    public String getAad006() {
        return aad006;
    }

    public void setAad006(String aad006) {
        this.aad006 = aad006;
    }

    public String getAad008() {
        return aad008;
    }

    public void setAad008(String aad008) {
        this.aad008 = aad008;
    }

    public String getAad009() {
        return aad009;
    }

    public void setAad009(String aad009) {
        this.aad009 = aad009;
    }

    public String getAad010() {
        return aad010;
    }

    public void setAad010(String aad010) {
        this.aad010 = aad010;
    }

    public String getAad012() {
        return aad012;
    }

    public void setAad012(String aad012) {
        this.aad012 = aad012;
    }

    public String getAad013() {
        return aad013;
    }

    public void setAad013(String aad013) {
        this.aad013 = aad013;
    }

    public String getAad014() {
        return aad014;
    }

    public void setAad014(String aad014) {
        this.aad014 = aad014;
    }

    public String getAad015() {
        return aad015;
    }

    public void setAad015(String aad015) {
        this.aad015 = aad015;
    }

    public String getAad016() {
        return aad016;
    }

    public void setAad016(String aad016) {
        this.aad016 = aad016;
    }

    public String getAad017() {
        return aad017;
    }

    public void setAad017(String aad017) {
        this.aad017 = aad017;
    }

    public String getAad018() {
        return aad018;
    }

    public void setAad018(String aad018) {
        this.aad018 = aad018;
    }

    @Override
    public String toString() {
        return "VillagePersonModel{" +
                "aad005='" + aad005 + '\'' +
                ", aad006='" + aad006 + '\'' +
                ", aad008='" + aad008 + '\'' +
                ", aad009='" + aad009 + '\'' +
                ", aad010='" + aad010 + '\'' +
                ", aad012='" + aad012 + '\'' +
                ", aad013='" + aad013 + '\'' +
                ", aad014='" + aad014 + '\'' +
                ", aad015='" + aad015 + '\'' +
                ", aad016='" + aad016 + '\'' +
                ", aad017='" + aad017 + '\'' +
                ", aad018='" + aad018 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillagePersonDDModel that = (VillagePersonDDModel) o;
        return Objects.equals(aad005, that.aad005) &&
                Objects.equals(aad006, that.aad006) &&
                Objects.equals(aad008, that.aad008) &&
                Objects.equals(aad009, that.aad009) &&
                Objects.equals(aad010, that.aad010) &&
                Objects.equals(aad012, that.aad012) &&
                Objects.equals(aad013, that.aad013) &&
                Objects.equals(aad014, that.aad014) &&
                Objects.equals(aad015, that.aad015) &&
                Objects.equals(aad016, that.aad016) &&
                Objects.equals(aad017, that.aad017) &&
                Objects.equals(aad018, that.aad018);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad005, aad006, aad008, aad009, aad010, aad012, aad013, aad014, aad015, aad016, aad017, aad018);
    }
}
