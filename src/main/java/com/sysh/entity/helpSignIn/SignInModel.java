package com.sysh.entity.helpSignIn;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ClassName:  <br/>
 * Function: 签到信息<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */

public class SignInModel implements Serializable {

    private String  helpTime,helpPosition;//时间，地点
    private String longGitUde,latitude;//经度，纬度
    private String helpNumber;
    private Long id;//编号

    public SignInModel(Long id, String helpTime, String helpPosition, String longGitUde, String latitude, String helpNumber) {
        this.id = id;
        this.helpTime = helpTime;
        this.helpPosition = helpPosition;
        this.longGitUde = longGitUde;
        this.latitude = latitude;
        this.helpNumber = helpNumber;
    }

    public SignInModel(String helpTime, String helpNumber) {
        this.helpTime = helpTime;
        this.helpNumber = helpNumber;
    }

    public SignInModel() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHelpTime() {
        return helpTime;
    }

    public void setHelpTime(String helpTime) {
        this.helpTime = helpTime;
    }

    public String getHelpPosition() {
        return helpPosition;
    }

    public void setHelpPosition(String helpPosition) {
        this.helpPosition = helpPosition;
    }

    public String getLongGitUde() {
        return longGitUde;
    }

    public void setLongGitUde(String longGitUde) {
        this.longGitUde = longGitUde;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getHelpNumber() {
        return helpNumber;
    }

    public void setHelpNumber(String helpNumber) {
        this.helpNumber = helpNumber;
    }

    @Override
    public String toString() {
        return "SignInModel{" +
                "id='" + id + '\'' +
                ", helpTime='" + helpTime + '\'' +
                ", helpPosition='" + helpPosition + '\'' +
                ", longGitUde=" + longGitUde +
                ", latitude=" + latitude +
                ", helpNumber='" + helpNumber + '\'' +
                '}';
    }
}
