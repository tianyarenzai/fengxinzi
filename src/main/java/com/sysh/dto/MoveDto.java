package com.sysh.dto;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 搬迁方式，是否搬迁<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class MoveDto implements Serializable {
    private String MoveMethod;
    private String IsMove;

    public MoveDto(String moveMethod, String isMove) {
        MoveMethod = moveMethod;
        IsMove = isMove;
    }

    public MoveDto() {
        super();
    }

    public String getMoveMethod() {
        return MoveMethod;
    }

    public void setMoveMethod(String moveMethod) {
        MoveMethod = moveMethod;
    }

    public String getIsMove() {
        return IsMove;
    }

    public void setIsMove(String isMove) {
        IsMove = isMove;
    }

    @Override
    public String toString() {
        return "MoveDto{" +
                "MoveMethod='" + MoveMethod + '\'' +
                ", IsMove='" + IsMove + '\'' +
                '}';
    }
}
