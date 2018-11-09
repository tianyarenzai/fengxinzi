package com.sysh.mapper;

/**
 * ClassName:  <br/>
 * Function: ac40表<br/>
 * date: 2018年06月24日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AC40DDMapper {

    //查询贫困户搬迁意愿
    Long isRelocationIntention(String povertyNumber);

}
