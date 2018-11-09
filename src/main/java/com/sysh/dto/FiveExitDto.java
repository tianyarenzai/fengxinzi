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
public class FiveExitDto implements Serializable {
    private String income;//收入情况
    private String IsReachTheStandard;//是否达标
    private String IncomeScore;//分数
    //安全饮水
    private String IsDifficuly;//饮水是否困难
    private String IsSafeWater;//饮水是否安全
    private String IsWater;//是否达标
    private String WaterScore;//分数
    //安全住房
    private String IsSafeHouse;//是否有安全住房
    private String IsReach;//是否达标
    private String HouseScore;//分数
    //无辍学学生
    private String IsStudent;//有无
    private String StudentScore;//分数
    //参加新农合保险
    private String IsJoin;//是否参加
    private String JoinScore;//分数

    public FiveExitDto(String income, String isReachTheStandard, String incomeScore, String isDifficuly, String isSafeWater, String isWater, String waterScore, String isSafeHouse, String isReach, String houseScore, String isStudent, String studentScore, String isJoin, String joinScore) {
        this.income = income;
        IsReachTheStandard = isReachTheStandard;
        IncomeScore = incomeScore;
        IsDifficuly = isDifficuly;
        IsSafeWater = isSafeWater;
        IsWater = isWater;
        WaterScore = waterScore;
        IsSafeHouse = isSafeHouse;
        IsReach = isReach;
        HouseScore = houseScore;
        IsStudent = isStudent;
        StudentScore = studentScore;
        IsJoin = isJoin;
        JoinScore = joinScore;
    }

    public FiveExitDto() {
        super();
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getIsReachTheStandard() {
        return IsReachTheStandard;
    }

    public void setIsReachTheStandard(String isReachTheStandard) {
        IsReachTheStandard = isReachTheStandard;
    }

    public String getIncomeScore() {
        return IncomeScore;
    }

    public void setIncomeScore(String incomeScore) {
        IncomeScore = incomeScore;
    }

    public String getIsDifficuly() {
        return IsDifficuly;
    }

    public void setIsDifficuly(String isDifficuly) {
        IsDifficuly = isDifficuly;
    }

    public String getIsSafeWater() {
        return IsSafeWater;
    }

    public void setIsSafeWater(String isSafeWater) {
        IsSafeWater = isSafeWater;
    }

    public String getIsWater() {
        return IsWater;
    }

    public void setIsWater(String isWater) {
        IsWater = isWater;
    }

    public String getWaterScore() {
        return WaterScore;
    }

    public void setWaterScore(String waterScore) {
        WaterScore = waterScore;
    }

    public String getIsSafeHouse() {
        return IsSafeHouse;
    }

    public void setIsSafeHouse(String isSafeHouse) {
        IsSafeHouse = isSafeHouse;
    }

    public String getIsReach() {
        return IsReach;
    }

    public void setIsReach(String isReach) {
        IsReach = isReach;
    }

    public String getHouseScore() {
        return HouseScore;
    }

    public void setHouseScore(String houseScore) {
        HouseScore = houseScore;
    }

    public String getIsStudent() {
        return IsStudent;
    }

    public void setIsStudent(String isStudent) {
        IsStudent = isStudent;
    }

    public String getStudentScore() {
        return StudentScore;
    }

    public void setStudentScore(String studentScore) {
        StudentScore = studentScore;
    }

    public String getIsJoin() {
        return IsJoin;
    }

    public void setIsJoin(String isJoin) {
        IsJoin = isJoin;
    }

    public String getJoinScore() {
        return JoinScore;
    }

    public void setJoinScore(String joinScore) {
        JoinScore = joinScore;
    }

    @Override
    public String toString() {
        return "FiveExitDto{" +
                "income='" + income + '\'' +
                ", IsReachTheStandard='" + IsReachTheStandard + '\'' +
                ", IncomeScore='" + IncomeScore + '\'' +
                ", IsDifficuly='" + IsDifficuly + '\'' +
                ", IsSafeWater='" + IsSafeWater + '\'' +
                ", IsWater='" + IsWater + '\'' +
                ", WaterScore='" + WaterScore + '\'' +
                ", IsSafeHouse='" + IsSafeHouse + '\'' +
                ", IsReach='" + IsReach + '\'' +
                ", HouseScore='" + HouseScore + '\'' +
                ", IsStudent='" + IsStudent + '\'' +
                ", StudentScore='" + StudentScore + '\'' +
                ", IsJoin='" + IsJoin + '\'' +
                ", JoinScore='" + JoinScore + '\'' +
                '}';
    }
}
