package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 根据村信息去查户信息<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class PovertyVillageNumberDto implements Serializable {

    private String PovertyNumber;//贫困户编号
    private String PovertyName;//贫困户名称
    private String PovertySex;//贫困户性别
    private String PovertyAge;//贫困户年龄

    public PovertyVillageNumberDto(String povertyNumber, String povertyName, String povertySex, String povertyAge) {
        PovertyNumber = povertyNumber;
        PovertyName = povertyName;
        PovertySex = povertySex;
        PovertyAge = povertyAge;
    }

    public String getPovertyNumber() {
        return PovertyNumber;
    }

    public void setPovertyNumber(String povertyNumber) {
        PovertyNumber = povertyNumber;
    }

    public PovertyVillageNumberDto() {
        super();
    }

    public String getPovertyName() {
        return PovertyName;
    }

    public void setPovertyName(String povertyName) {
        PovertyName = povertyName;
    }

    public String getPovertySex() {
        return PovertySex;
    }

    public void setPovertySex(String povertySex) {
        PovertySex = povertySex;
    }

    public String getPovertyAge() {
        return PovertyAge;
    }

    public void setPovertyAge(String povertyAge) {
        PovertyAge = povertyAge;
    }

    @Override
    public String toString() {
        return "PovertyVillageNumberDto{" +
                "PovertyNumber='" + PovertyNumber + '\'' +
                ", PovertyName='" + PovertyName + '\'' +
                ", PovertySex='" + PovertySex + '\'' +
                ", PovertyAge='" + PovertyAge + '\'' +
                '}';
    }
}
