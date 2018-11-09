package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年08月24日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */

public class InsertHelpReview implements Serializable {

    private String id,helpNumber,updateTime,povertyNumber;

    public InsertHelpReview(String id, String helpNumber, String updateTime, String povertyNumber) {
        this.id = id;
        this.helpNumber = helpNumber;
        this.updateTime = updateTime;
        this.povertyNumber = povertyNumber;
    }

    public InsertHelpReview() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHelpNumber() {
        return helpNumber;
    }

    public void setHelpNumber(String helpNumber) {
        this.helpNumber = helpNumber;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPovertyNumber() {
        return povertyNumber;
    }

    public void setPovertyNumber(String povertyNumber) {
        this.povertyNumber = povertyNumber;
    }

    @Override
    public String toString() {
        return "InsertHelpReview{" +
                "id='" + id + '\'' +
                ", helpNumber='" + helpNumber + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", povertyNumber='" + povertyNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InsertHelpReview that = (InsertHelpReview) o;

        if (!id.equals(that.id)) return false;
        if (!helpNumber.equals(that.helpNumber)) return false;
        if (!updateTime.equals(that.updateTime)) return false;
        return povertyNumber.equals(that.povertyNumber);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + helpNumber.hashCode();
        result = 31 * result + updateTime.hashCode();
        result = 31 * result + povertyNumber.hashCode();
        return result;
    }
}
