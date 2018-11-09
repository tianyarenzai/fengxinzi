package com.sysh.service;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 字段类型<br/>
 * date: 2018年06月20日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface FieldService {
    //贫困户属性
    List<String> findType(String s);
    List<Map> findTypeHelp(String s);



}
