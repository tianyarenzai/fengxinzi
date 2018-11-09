package com.sysh.service;

import com.sysh.dto.AB10_AB01Dto;
import com.sysh.dto.PovertyIncomeDto;
import com.sysh.dto.PovertyProduceDto;
import com.sysh.dto.VillageBasicDto;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.AK11AC08DD;
import com.sysh.entity.helpmea.*;
import com.sysh.util.ResultData;

import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 信息修改<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface InfoUpdateService {

    //查询不同信息，并进行存储
    Integer insertExamine(Map<String, String> map, AC01Basic ac01Basic);
    //修改生产信息
    Integer insertProduce(Map<String, String> map, PovertyProduceDto povertyProduceDto);
    //修改收入信息
    Integer insertIncome(Map<String, String> map, PovertyIncomeDto povertyIncomeDto);
    //修改家庭成员信息
    Integer insertFamilyInfo(Map<String, String> map, AB10_AB01Dto ab10_ab01Dto);
    //易地搬迁
    Integer insertImmigrantRelocation(Map<String, String> map, ImmigrantRelocationDD immigrantRelocationDD);
    //危房改造
    Integer insertReconstDanger(Map<String, String> map, ReconstDangerDD reconstDangerDD);
    //生态扶贫
    Integer  insertEcologicalPoverty(Map<String, String> map, EcologicalPovertyDD ecologicalPovertyDD);
    //金融扶贫
    Integer insertFinance(Map<String, String> map, FinanceDD financeDD);
    //教育扶贫
    Integer insertEducation(Map<String, String> map, EducationDD educationDD);
    //健康扶贫
    Integer insertHealth(Map<String, String> map, HealthDD healthDD);
    //兜底保障民政
    Integer insertBottomGuaranteeCivil(Map<String, String> map, BottomGuaranteeCivilDD bottomGuaranteeCivilDD);
    //兜底保障残疾
    Integer insertBottomDisAbled(Map<String, String> map, BottomDisabledDD bottomDisabledDD);
    //就业创业
    Integer insertEmployee(Map<String, String> map, EmploymentDD employmentDD);
    //产业扶贫
    Integer insertIdstProjway(Map<String, String> map, IdstProjwayDD idstProjwayDD);
    //村信息修改
    Integer insertupdateVillage(Map<String, String> map, VillageBasicDto villageBasicDto);
    //帮扶责任人修改
    ResultData insertHelpNumberDetail(Map<String, String> map, AK11AC08DD ak11AC08DD);


}
