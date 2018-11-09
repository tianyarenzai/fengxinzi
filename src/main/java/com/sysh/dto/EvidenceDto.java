package com.sysh.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by sjy Cotter on 2018/8/16.
 */

public class EvidenceDto implements Serializable {

    private String id,imagePath,helpId;

    public EvidenceDto(String id, String imagePath, String helpId) {
        this.id = id;
        this.imagePath = imagePath;
        this.helpId = helpId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getHelpId() {
        return helpId;
    }

    public void setHelpId(String helpId) {
        this.helpId = helpId;
    }

    @Override
    public String toString() {
        return "EvidenceDto{" +
                "id='" + id + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", helpId='" + helpId + '\'' +
                '}';
    }
}
