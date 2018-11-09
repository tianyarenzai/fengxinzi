package com.sysh.entity.helplog;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 返回的是评论详情<br/>
 * date: 2018年07月04日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class DiscussDD implements Serializable {

    private String id,helpNumber,discussValue,logId;
    //自增长ID,帮扶干部编号，评论内容，日志ID

    public DiscussDD(String id, String helpNumber, String discussValue, String logId) {
        this.id = id;
        this.helpNumber = helpNumber;
        this.discussValue = discussValue;
        this.logId = logId;
    }
    public DiscussDD() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHelpNumber() {
        return helpNumber;
    }

    public void setHelpNumber(String helpNumber) {
        this.helpNumber = helpNumber;
    }

    public String getDiscussValue() {
        return discussValue;
    }

    public void setDiscussValue(String discussValue) {
        this.discussValue = discussValue;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Override
    public String toString() {
        return "DiscussDD{" +
                "id='" + id + '\'' +
                ", helpNumber='" + helpNumber + '\'' +
                ", discussValue='" + discussValue + '\'' +
                ", logId='" + logId + '\'' +
                '}';
    }
}
