package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * 卫计委部门审核
 * Created by sjy Cotter on 2018/8/20.
 */
public class SocialSecurityWeiModel implements Serializable {

    private String aad311;

    public SocialSecurityWeiModel(String aad311) {
        this.aad311 = aad311;
    }

    public String getAad311() {
        return aad311;
    }

    public void setAad311(String aad311) {
        this.aad311 = aad311;
    }

    public SocialSecurityWeiModel() {
        super();
    }

    @Override
    public String toString() {
        return "SocialSecurityWeiModel{" +
                "aad311='" + aad311 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialSecurityWeiModel that = (SocialSecurityWeiModel) o;
        return Objects.equals(aad311, that.aad311);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aad311);
    }
}
