package com.sysh.mapper;

import com.sysh.entity.AC01Basic;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AC01BasicMapper {

    AC01Basic findPovertyBasic(Long num);

    String findPovertyNameByNum(Long povertyNum);

    //根据编号查询是不是对应的低保户或者五保户
    Long findFivePovertyOrBottomPoverty(String povertyNumber);
    //查询该户下是否有残疾，有残疾的兜底保障也要残疾
    Long findDisable(String povertyNumber);

    List<String> findDisableIdNumber(String povertyNumber);

    //查询该户下是否有劳动能力，非在校生
    Long findLaborAbility(String povertyNumber);



}
