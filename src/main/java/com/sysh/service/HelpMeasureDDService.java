package com.sysh.service;

import com.sysh.util.ResultData;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:  <br/>
 * Function: 易地搬迁信息情况统计表<br/>
 * date: 2018年06月23日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface HelpMeasureDDService {
    //查询展示得字段，通过身份证号来查询,钉钉这边查询出十项帮扶措施的结果
    //先返回那些是该贫困户可以享受的字段
     Set<String> findMeasure(String povertyNumber);

    //判断再新录入的表中，那些措施已经在册中

     Map<String,Object> findIsExistence(Set<String> set, String povertyNumber);
}
