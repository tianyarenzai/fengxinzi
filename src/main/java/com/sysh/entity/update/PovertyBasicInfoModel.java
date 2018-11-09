package com.sysh.entity.update;

import lombok.Data;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 基本信息的预审核<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */

public class PovertyBasicInfoModel implements Serializable {
        private Long aac001 ,aak110,id,sh002,sh003,sh004;
        private String time,tableName,modifyType,idNumber;


    public PovertyBasicInfoModel(Long aac001, Long aak110, Long id, Long sh002, Long sh003, Long sh004, String time, String tableName, String modifyType) {
        this.aac001 = aac001;
        this.aak110 = aak110;
        this.id = id;
        this.sh002 = sh002;
        this.sh003 = sh003;
        this.sh004 = sh004;
        this.time = time;
        this.tableName = tableName;
        this.modifyType = modifyType;
    }

    public PovertyBasicInfoModel(Long aac001, Long aak110, String time, String tableName, String modifyType) {
        this.aac001 = aac001;
        this.aak110 = aak110;
        this.time = time;
        this.tableName = tableName;
        this.modifyType = modifyType;
    }

    public PovertyBasicInfoModel(Long aac001, Long aak110, String time, String tableName, String modifyType, String idNumber) {
        this.aac001 = aac001;
        this.aak110 = aak110;
        this.time = time;
        this.tableName = tableName;
        this.modifyType = modifyType;
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getModifyType() {
        return modifyType;
    }

    public void setModifyType(String modifyType) {
        this.modifyType = modifyType;
    }

    public PovertyBasicInfoModel() {
        super();
    }

    public Long getAac001() {
        return aac001;
    }

    public void setAac001(Long aac001) {
        this.aac001 = aac001;
    }

    public Long getAak110() {
        return aak110;
    }

    public void setAak110(Long aak110) {
        this.aak110 = aak110;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSh002() {
        return sh002;
    }

    public void setSh002(Long sh002) {
        this.sh002 = sh002;
    }

    public Long getSh003() {
        return sh003;
    }

    public void setSh003(Long sh003) {
        this.sh003 = sh003;
    }

    public Long getSh004() {
        return sh004;
    }

    public void setSh004(Long sh004) {
        this.sh004 = sh004;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PovertyBasicInfoModel{" +
                "aac001=" + aac001 +
                ", aak110=" + aak110 +
                ", id=" + id +
                ", sh002=" + sh002 +
                ", sh003=" + sh003 +
                ", sh004=" + sh004 +
                ", time='" + time + '\'' +
                ", tableName='" + tableName + '\'' +
                ", modifyType='" + modifyType + '\'' +
                '}';
    }
}
