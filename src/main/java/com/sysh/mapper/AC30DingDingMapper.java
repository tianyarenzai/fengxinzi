package com.sysh.mapper;

import com.sysh.dto.PovertyProduceDto;
import com.sysh.dto.SafeWaterAndSafeHOuseDto;
import com.sysh.dto.VillageDto;

import java.math.BigDecimal;

/**
 * ClassName:  <br/>
 * Function: 该贫困户所在村和上级区县编号<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AC30DingDingMapper {

    PovertyProduceDto findPoduce(Long num);
    SafeWaterAndSafeHOuseDto findSafeWater(Long num);
    //是否为危房户
    Long findHouseDanger(String povertyNumber);

    //退耕还林面积大于0
    BigDecimal findReturningFarmland(String povertyNumber);

}
