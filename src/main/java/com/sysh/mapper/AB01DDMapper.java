package com.sysh.mapper;

import com.sysh.dto.FamilyAb10Dto;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 找户主关系<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AB01DDMapper {

   String findFamilyRelation(Long num);

   List<String> IsJoin(Long num);

   Long findIsNotJoin(String povertyNumber);


}
