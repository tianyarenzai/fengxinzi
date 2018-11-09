package com.sysh.entity.helplog;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 帮扶日志查询<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */

public class HelpLogModel implements Serializable {

    private String log,helptime,helpNumber;
    private Long id ,numberPraise,visitingMode;
    private  List<DiscussDD> discussList;
    private List<String> list;

    public HelpLogModel(String log, String helptime, String helpNumber, Long id, Long numberPraise, Long visitingMode, List<String> list) {
        this.log = log;
        this.helptime = helptime;
        this.helpNumber = helpNumber;
        this.id = id;
        this.numberPraise = numberPraise;
        this.visitingMode = visitingMode;
        this.list = list;
    }

    public HelpLogModel(String log, String helptime, String helpNumber, Long numberPraise, Long visitingMode) {
        this.log = log;
        this.helptime = helptime;
        this.helpNumber = helpNumber;
        this.numberPraise = numberPraise;
        this.visitingMode = visitingMode;
    }

    public HelpLogModel(String log, String helptime, String helpNumber, Long id, Long numberPraise, Long visitingMode, List<DiscussDD> discussList, List<String> list) {
        this.log = log;
        this.helptime = helptime;
        this.helpNumber = helpNumber;
        this.id = id;
        this.numberPraise = numberPraise;
        this.visitingMode = visitingMode;
        this.discussList = discussList;
        this.list = list;
    }

    public List<DiscussDD> getDiscussList() {
        return discussList;
    }

    public void setDiscussList(List<DiscussDD> discussList) {
        this.discussList = discussList;
    }

    public String getHelpNumber() {
        return helpNumber;
    }

    public void setHelpNumber(String helpNumber) {
        this.helpNumber = helpNumber;
    }

    public HelpLogModel() {
        super();
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getHelptime() {
        return helptime;
    }

    public void setHelptime(String helptime) {
        this.helptime = helptime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumberPraise() {
        return numberPraise;
    }

    public void setNumberPraise(Long numberPraise) {
        this.numberPraise = numberPraise;
    }

    public Long getVisitingMode() {
        return visitingMode;
    }

    public void setVisitingMode(Long visitingMode) {
        this.visitingMode = visitingMode;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HelpLogModel{" +
                "log='" + log + '\'' +
                ", helptime='" + helptime + '\'' +
                ", helpNumber='" + helpNumber + '\'' +
                ", id=" + id +
                ", numberPraise=" + numberPraise +
                ", visitingMode=" + visitingMode +
                ", discussList=" + discussList +
                ", list=" + list +
                '}';
    }
}
