package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月09日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class DropOfSchoolDto implements Serializable {

    private String studentStation;//在校生情况
    private String IDNumber;//身份证号

    public DropOfSchoolDto(String studentStation, String IDNumber) {
        this.studentStation = studentStation;
        this.IDNumber = IDNumber;
    }

    public DropOfSchoolDto() {
        super();
    }

    public String getStudentStation() {
        return studentStation;
    }

    public void setStudentStation(String studentStation) {
        this.studentStation = studentStation;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    @Override
    public String toString() {
        return "DropOfSchoolDto{" +
                "studentStation='" + studentStation + '\'' +
                ", IDNumber='" + IDNumber + '\'' +
                '}';
    }
}
