package com.sysh.entity.helplog;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 图片 路径存储<br/>
 * date: 2018年07月07日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class HelpImageModel implements Serializable {

    private String id,imagePath,logId,helpNumber;

    public HelpImageModel(String id, String imagePath, String logId, String helpNumber) {
        this.id = id;
        this.imagePath = imagePath;
        this.logId = logId;
        this.helpNumber = helpNumber;
    }

    public HelpImageModel() {
        super();
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

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getHelpNumber() {
        return helpNumber;
    }

    public void setHelpNumber(String helpNumber) {
        this.helpNumber = helpNumber;
    }
}
