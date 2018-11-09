package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * 人社部门审核
 * Created by sjy Cotter on 2018/8/20.
 */
public class SocialSecurityRenModel implements Serializable {

    private String aad313;

    public SocialSecurityRenModel(String aad313) {
        this.aad313 = aad313;
    }

    public String getAad313() {
        return aad313;
    }

    public void setAad313(String aad313) {
        this.aad313 = aad313;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialSecurityRenModel that = (SocialSecurityRenModel) o;
        return Objects.equals(aad313, that.aad313);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad313);
    }

    @Override
    public String toString() {
        return "SocialSecurityRenModel{" +
                "aad313='" + aad313 + '\'' +
                '}';
    }
}
