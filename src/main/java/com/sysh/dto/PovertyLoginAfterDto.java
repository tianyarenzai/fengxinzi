package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function:用户登陆成功之后的返回数据<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class PovertyLoginAfterDto implements Serializable{

    private Long povertyNumber;
    private String povertyName;

    public PovertyLoginAfterDto(Long povertyNumber, String povertyName) {
        this.povertyNumber = povertyNumber;
        this.povertyName = povertyName;
    }

    public PovertyLoginAfterDto() {
        super();
    }

    public Long getPovertyNumber() {
        return povertyNumber;
    }

    public void setPovertyNumber(Long povertyNumber) {
        this.povertyNumber = povertyNumber;
    }

    public String getPovertyName() {
        return povertyName;
    }

    public void setPovertyName(String povertyName) {
        this.povertyName = povertyName;
    }

    @Override
    public String toString() {
        return "PovertyLoginAfterDto{" +
                "povertyNumber=" + povertyNumber +
                ", povertyName='" + povertyName + '\'' +
                '}';
    }
}
