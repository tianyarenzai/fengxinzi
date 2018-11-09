package com.sysh.mapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 查询村名称<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AA11DDMapper {

   Map<String,Object> findTownName(BigDecimal villageNumber);

   String findVillageName(String s);

}
