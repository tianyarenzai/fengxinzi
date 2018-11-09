package com.sysh.mapper;

import com.sysh.dto.PovertyIncomeDto;
import com.sysh.dto.VillageDto;

import java.math.BigDecimal;

/**
 * ClassName:  <br/>
 * Function: 该贫困户收入信息<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AC07DDMapper {

    PovertyIncomeDto findIncome(Long PoorHouseholds);

    /**
     * 查询人均纯收入
     * @param num
     * @return
     */
    BigDecimal findPersonAverage(Long num);
}
