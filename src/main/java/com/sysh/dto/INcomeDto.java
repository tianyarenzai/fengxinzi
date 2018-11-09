package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 五项退出指标<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class INcomeDto implements Serializable {
    private String NetIncome;//纯收入
    private String IsNetIncome;//是否达标
    private String ScoreNetIncome;//分数

    /*private String DropOutSChool;//有无辍学学生

    private String IsSafeWater;//饮水是否安全
    private String IsDifficultyWater;//饮水是否困难
    private String SafeWater;//是否达标
    private String ScoreSafeWater;//分数

    private String IsNotSafePoverty;//是否为危房户
    private String SafeHouse;//安全住房是否达标
    private String SafeHouseScore;//住房分数

    private String joinAab013;//参加新型农村合作医疗
    private String joinAab022;//是否参加大病保险
    private String JoinNcms;//参加新农合是否达标
    private String JoinScore;//分数*/

    public INcomeDto(String netIncome, String isNetIncome, String scoreNetIncome) {
        NetIncome = netIncome;
        IsNetIncome = isNetIncome;
        ScoreNetIncome = scoreNetIncome;
    }

    public INcomeDto() {
        super();
    }

    public String getNetIncome() {
        return NetIncome;
    }

    public void setNetIncome(String netIncome) {
        NetIncome = netIncome;
    }

    public String getIsNetIncome() {
        return IsNetIncome;
    }

    public void setIsNetIncome(String isNetIncome) {
        IsNetIncome = isNetIncome;
    }

    public String getScoreNetIncome() {
        return ScoreNetIncome;
    }

    public void setScoreNetIncome(String scoreNetIncome) {
        ScoreNetIncome = scoreNetIncome;
    }

    @Override
    public String toString() {
        return "FivePovertyDto{" +
                "NetIncome='" + NetIncome + '\'' +
                ", IsNetIncome='" + IsNetIncome + '\'' +
                ", ScoreNetIncome='" + ScoreNetIncome + '\'' +
                '}';
    }
}
