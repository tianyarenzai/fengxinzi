package com.sysh.service;

import com.sysh.dto.*;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.AC01Part;
import com.sysh.entity.AK11DD;
import com.sysh.entity.helpmea.ImmigrantRelocationDD;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 点击眼睛按钮出现的详情<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface PovertyDetailsService {

     AC01Part selectAll(Long num);

     AC01Basic selectAC01Basic(Long num);

     PovertyIncomeDto selectPovertyIncome(Long num);

     PovertyProduceDto selectPovertyProduce(Long num);

     FiveExitDto selectFivePoverty(Long num);

     List<FamilyAb10Dto> selectFamily(Long num);

     AB10_AB01Dto selectFamilyIfo(Long num);

     AK11DD selectAC01AK11(Long num);

     String findIdNumberByID(String id);

     ImmigrantRelocationDD findImmigrantRelocation(String IdNumber);

     List<HealthFamilyDto> findHealth(String povertyNumber);


}
