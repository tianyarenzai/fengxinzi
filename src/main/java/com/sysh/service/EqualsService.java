package com.sysh.service;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月15日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface EqualsService {

    Integer InsertNotEquals(Field fields[], Object o, Map<String, String> map, Long primaryNumber);
    Integer InsertNotEqualsEight(Field fields[], Object o, Map<String, String> map, Long primaryNumber, String s);
    Integer InsertNotVillage(Field fields[], Object o, Map<String, String> map, Long primaryNumber);
    Integer InsertNotHelpNumber(Field fields[], Object o, Map<String, String> map, Long primaryNumber);

    Long insertSh01(Map<String, String> map, String tableName, String modifyType);
    Long insertEight(Map<String, String> map, String tableName, String modifyType);
    Long insertVillage(Map<String, String> map, String tableName, String modifyType);


}
