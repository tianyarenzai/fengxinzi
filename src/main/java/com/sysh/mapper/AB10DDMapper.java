package com.sysh.mapper;

import com.sysh.dto.FamilyAb10Dto;
import com.sysh.dto.VillageDto;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 该贫困户所在村和上级区县编号<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AB10DDMapper {

    List<FamilyAb10Dto> findFamily(Long num);

    List<String> findFamilyIdNumber(String povertyNumber);
    //根据身份证号，查询贫困人口编号
    String findAab001(String idNumber);

}
