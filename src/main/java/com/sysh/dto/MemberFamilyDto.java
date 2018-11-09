package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 家庭成员简要信息<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class MemberFamilyDto implements Serializable {

    private String FamilyName;//成员名称
    private String FamilyNumber;//贫困人口编号
    private String FamilyAge;//贫困人口年龄
    private String FamilyRelation;//与户住关系
    private String FamilySex;//性别

    public MemberFamilyDto(String familyName, String familyNumber, String familyAge, String familyRelation, String familySex) {
        FamilyName = familyName;
        FamilyNumber = familyNumber;
        FamilyAge = familyAge;
        FamilyRelation = familyRelation;
        FamilySex = familySex;
    }

    public MemberFamilyDto() {
        super();
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public String getFamilyNumber() {
        return FamilyNumber;
    }

    public void setFamilyNumber(String familyNumber) {
        FamilyNumber = familyNumber;
    }

    public String getFamilyAge() {
        return FamilyAge;
    }

    public void setFamilyAge(String familyAge) {
        FamilyAge = familyAge;
    }

    public String getFamilyRelation() {
        return FamilyRelation;
    }

    public void setFamilyRelation(String familyRelation) {
        FamilyRelation = familyRelation;
    }

    public String getFamilySex() {
        return FamilySex;
    }

    public void setFamilySex(String familySex) {
        FamilySex = familySex;
    }

    @Override
    public String toString() {
        return "MemberFamilyDto{" +
                "FamilyName='" + FamilyName + '\'' +
                ", FamilyNumber='" + FamilyNumber + '\'' +
                ", FamilyAge='" + FamilyAge + '\'' +
                ", FamilyRelation='" + FamilyRelation + '\'' +
                ", FamilySex='" + FamilySex + '\'' +
                '}';
    }
}
