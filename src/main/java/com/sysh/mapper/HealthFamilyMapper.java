package com.sysh.mapper;

import com.sysh.dto.HealthFamilyDto;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年07月01日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface HealthFamilyMapper {

    List<HealthFamilyDto> findHealthFamily(String povertyNumber);
}
