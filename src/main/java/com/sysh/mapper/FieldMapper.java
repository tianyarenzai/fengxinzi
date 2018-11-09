package com.sysh.mapper;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月20日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface FieldMapper {

    //查询属性
    List<String> findField(String s);
    List<Map> findFieldHelp(String s);




}
