package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 在这个表里面查名字和性别还有贫困人口编号<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class FamilyAb10Dto implements Serializable{

    private String aab002;//家庭成员名称
    private String aab003;//家庭成员性别
    private String aab005;//家庭成员出生日期
    private String aab001;//家庭成员编号
    private String aab006;//与户主关系

    public FamilyAb10Dto(String aab002, String aab003, String aab005, String aab001, String aab006) {
        this.aab002 = aab002;
        this.aab003 = aab003;
        this.aab005 = aab005;
        this.aab001 = aab001;
        this.aab006 = aab006;
    }

    public FamilyAb10Dto() {
        super();
    }

    public String getAab006() {
        return aab006;
    }

    public void setAab006(String aab006) {
        this.aab006 = aab006;
    }

    public String getAab002() {
        return aab002;
    }

    public void setAab002(String aab002) {
        this.aab002 = aab002;
    }

    public String getAab003() {
        return aab003;
    }

    public void setAab003(String aab003) {
        this.aab003 = aab003;
    }

    public String getAab005() {
        return aab005;
    }

    public void setAab005(String aab005) {
        this.aab005 = aab005;
    }

    public String getAab001() {
        return aab001;
    }

    public void setAab001(String aab001) {
        this.aab001 = aab001;
    }

    @Override
    public String toString() {
        return "FamilyAb10Dto{" +
                "aab002='" + aab002 + '\'' +
                ", aab003='" + aab003 + '\'' +
                ", aab005='" + aab005 + '\'' +
                ", aab001='" + aab001 + '\'' +
                ", aab006='" + aab006 + '\'' +
                '}';
    }
}
