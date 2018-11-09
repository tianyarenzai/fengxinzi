package com.sysh.mapper;

import com.sysh.dto.AB10_AB01Dto;
import com.sysh.dto.DropOfSchoolDto;
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
public interface AB10AB01Mapper {

    AB10_AB01Dto findFamilyDetailInfo(Long num);

    List<DropOfSchoolDto> findFamilyStudent(Long num);
    //查询6-16岁在校生情况不为空的贫困户家庭成员有多少
    Long findIsStudent(String povertyNumber);

    //查询在校生情况得身份证号
    List<String> findStudentIdNumber(String povertyNumber);


}
