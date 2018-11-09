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
public class UpdateHelpNumberDto implements Serializable {

    private String id, updateBefore,updateAfter,updateField,realName,primary;

    public UpdateHelpNumberDto(String id, String updateBefore, String updateAfter, String updateField, String realName, String primary) {
        this.id = id;
        this.updateBefore = updateBefore;
        this.updateAfter = updateAfter;
        this.updateField = updateField;
        this.realName = realName;
        this.primary = primary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdateBefore() {
        return updateBefore;
    }

    public void setUpdateBefore(String updateBefore) {
        this.updateBefore = updateBefore;
    }

    public String getUpdateAfter() {
        return updateAfter;
    }

    public void setUpdateAfter(String updateAfter) {
        this.updateAfter = updateAfter;
    }

    public String getUpdateField() {
        return updateField;
    }

    public void setUpdateField(String updateField) {
        this.updateField = updateField;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public UpdateHelpNumberDto() {
        super();
    }

    @Override
    public String toString() {
        return "UpdateHelpNumberDto{" +
                "id='" + id + '\'' +
                ", updateBefore='" + updateBefore + '\'' +
                ", updateAfter='" + updateAfter + '\'' +
                ", updateField='" + updateField + '\'' +
                ", realName='" + realName + '\'' +
                ", primary='" + primary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpdateHelpNumberDto that = (UpdateHelpNumberDto) o;

        if (!id.equals(that.id)) return false;
        if (!updateBefore.equals(that.updateBefore)) return false;
        if (!updateAfter.equals(that.updateAfter)) return false;
        if (!updateField.equals(that.updateField)) return false;
        if (!realName.equals(that.realName)) return false;
        return primary.equals(that.primary);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + updateBefore.hashCode();
        result = 31 * result + updateAfter.hashCode();
        result = 31 * result + updateField.hashCode();
        result = 31 * result + realName.hashCode();
        result = 31 * result + primary.hashCode();
        return result;
    }
}
