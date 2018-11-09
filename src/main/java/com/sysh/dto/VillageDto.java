package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 家庭住址信息，和上级编号<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class VillageDto implements Serializable {

    private String aar009;
    private String aaa113;

    public VillageDto(String aar009, String aaa113) {
        this.aar009 = aar009;
        this.aaa113 = aaa113;
    }

    public VillageDto() {
        super();
    }

    public String getAar009() {
        return aar009;
    }

    public void setAar009(String aar009) {
        this.aar009 = aar009;
    }

    public String getAaa113() {
        return aaa113;
    }

    public void setAaa113(String aaa113) {
        this.aaa113 = aaa113;
    }

    @Override
    public String toString() {
        return "VillageDto{" +
                "aar009='" + aar009 + '\'' +
                ", aaa113='" + aaa113 + '\'' +
                '}';
    }
}
