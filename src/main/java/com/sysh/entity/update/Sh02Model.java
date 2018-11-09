package com.sysh.entity.update;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 具体的指标项修改情况<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class Sh02Model implements Serializable {

    private String sh005,sh006,sh007,realName;
    private Long sh01_id,id;


    public Sh02Model(String sh005, String sh006, String sh007, String realName, Long sh01_id, Long id) {
        this.sh005 = sh005;
        this.sh006 = sh006;
        this.sh007 = sh007;
        this.realName = realName;
        this.sh01_id = sh01_id;
        this.id = id;
    }
    public Sh02Model(String sh005, String sh006, String sh007, Long sh01_id, Long id) {
        this.sh005 = sh005;
        this.sh006 = sh006;
        this.sh007 = sh007;
        this.sh01_id = sh01_id;
        this.id = id;
    }



    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Sh02Model() {
        super();
    }

    public String getSh005() {
        return sh005;
    }

    public void setSh005(String sh005) {
        this.sh005 = sh005;
    }

    public String getSh006() {
        return sh006;
    }

    public void setSh006(String sh006) {
        this.sh006 = sh006;
    }

    public String getSh007() {
        return sh007;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSh007(String sh007) {
        this.sh007 = sh007;
    }

    public Long getSh01_id() {
        return sh01_id;
    }

    public void setSh01_id(Long sh01_id) {
        this.sh01_id = sh01_id;
    }

    @Override
    public String toString() {
        return "Sh02Model{" +
                "sh005='" + sh005 + '\'' +
                ", sh006='" + sh006 + '\'' +
                ", sh007='" + sh007 + '\'' +
                ", sh01_id=" + sh01_id +
                ", id=" + id +
                '}';
    }
}
