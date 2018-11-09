package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 安全饮水和安全住房情况<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class SafeWaterAndSafeHOuseDto implements Serializable {

    private String aac311;
    private String aac312;
    private String aac318;

    public SafeWaterAndSafeHOuseDto(String aac311, String aac312, String aac318) {
        this.aac311 = aac311;
        this.aac312 = aac312;
        this.aac318 = aac318;
    }

    public SafeWaterAndSafeHOuseDto() {
        super();
    }

    public String getAac311() {
        return aac311;
    }

    public void setAac311(String aac311) {
        this.aac311 = aac311;
    }

    public String getAac312() {
        return aac312;
    }

    public void setAac312(String aac312) {
        this.aac312 = aac312;
    }

    public String getAac318() {
        return aac318;
    }

    public void setAac318(String aac318) {
        this.aac318 = aac318;
    }

    @Override
    public String toString() {
        return "SafeWaterAndSafeHOuseDto{" +
                "aac311='" + aac311 + '\'' +
                ", aac312='" + aac312 + '\'' +
                ", aac318='" + aac318 + '\'' +
                '}';
    }
}
