package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 家庭成员详情信息<br/>
 * date: 2018年07月01日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class HealthFamilyDto implements Serializable {

    private String familyName;//家庭成员名称
    private String DiseasedInformation;//患病信息

    public HealthFamilyDto(String familyName, String diseasedInformation) {
        this.familyName = familyName;
        DiseasedInformation = diseasedInformation;
    }

    public HealthFamilyDto() {
        super();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDiseasedInformation() {
        return DiseasedInformation;
    }

    public void setDiseasedInformation(String diseasedInformation) {
        DiseasedInformation = diseasedInformation;
    }

    @Override
    public String toString() {
        return "HealthFamilyDto{" +
                "familyName='" + familyName + '\'' +
                ", DiseasedInformation='" + DiseasedInformation + '\'' +
                '}';
    }
}
