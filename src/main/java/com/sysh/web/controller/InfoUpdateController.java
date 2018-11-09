package com.sysh.web.controller;

import com.sysh.dto.AB10_AB01Dto;
import com.sysh.dto.PovertyIncomeDto;
import com.sysh.dto.PovertyProduceDto;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.AK11AC08DD;
import com.sysh.entity.VillageNewModel;
import com.sysh.entity.helpmea.*;
import com.sysh.service.InfoUpdateService;
import com.sysh.service.VillageDDService;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 主要接受贫困户信息修改项<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/update")
public class InfoUpdateController {
    @Autowired
    private InfoUpdateService infoUpdateService;

    private Logger log=Logger.getLogger(this.getClass());

    //基本信息修改
    @RequestMapping(value = "/basic")
    public ResultData updateBasicInfo(@RequestParam Map<String ,String > map, AC01Basic ac01Basic)
    {
        //先查询原来的数据，进行比对
        log.info(map.toString());
        log.info(ac01Basic.toString());
        Integer num=infoUpdateService.insertExamine(map,ac01Basic);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    //生产生活
    @RequestMapping(value="/produce")
    public ResultData updatePovertyProduceDto(@RequestParam Map<String,String> map, PovertyProduceDto povertyProduceDto)
    {
        Integer num=infoUpdateService.insertProduce(map,povertyProduceDto);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //上年度收入、患病信息
    @RequestMapping(value = "/income")
    public ResultData updatePovertyIncome(@RequestParam Map<String,String> map, PovertyIncomeDto povertyIncomeDto)
    {
        Integer num=infoUpdateService.insertIncome(map, povertyIncomeDto);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //家庭成员详情修改
    @RequestMapping(value = "/familyInfo")
    public ResultData updatePovertyFamilyInfo(@RequestParam Map<String,String> map, AB10_AB01Dto ab10_ab01Dto)
    {
        log.info(map.toString());
        log.info(ab10_ab01Dto.toString());
        Integer num=infoUpdateService.insertFamilyInfo(map,ab10_ab01Dto);


        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //八个一批

    //易地搬迁详情修改
    @RequestMapping(value = "/relocation")
    ResultData updateImmigrantRelocation(@RequestParam Map<String,String> map, ImmigrantRelocationDD immigrantRelocationDD)
    {
        Integer num=infoUpdateService.insertImmigrantRelocation(map,immigrantRelocationDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    //危房改造详情修改
    @RequestMapping(value = "/reconst")
    ResultData updateReconstDanger(@RequestParam Map<String,String> map, ReconstDangerDD reconstDangerDD)
    {
        Integer num=infoUpdateService.insertReconstDanger(map,reconstDangerDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    //生态扶贫
    @RequestMapping(value = "/ecological")
    ResultData updateEcologicalPoverty(@RequestParam Map<String,String> map, EcologicalPovertyDD ecologicalPovertyDD)
    {
        Integer num=infoUpdateService.insertEcologicalPoverty(map,ecologicalPovertyDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //金融扶贫
    @RequestMapping(value = "/finance")
    ResultData updateFinance(@RequestParam Map<String,String> map, FinanceDD financeDD)
    {
        Integer num=infoUpdateService.insertFinance(map,financeDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //教育扶贫 TODO 目前看到得有可能有多个
    @RequestMapping(value = "/education")
    ResultData updateEducation(@RequestParam Map<String,String> map, EducationDD educationDD)
    {
        Integer num=infoUpdateService.insertEducation(map,educationDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    //健康扶贫
    @RequestMapping(value = "/health")
    ResultData updateHealth(@RequestParam Map<String,String> map, HealthDD healthDD)
    {
        Integer num=infoUpdateService.insertHealth(map,healthDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //兜底保障 （民政）
    @RequestMapping(value = "/bottomGuaranteeCivil")
    ResultData updateBottomGuaranteeCivil(@RequestParam Map<String,String> map, BottomGuaranteeCivilDD bottomGuaranteeCivilDD)
    {
        Integer num=infoUpdateService.insertBottomGuaranteeCivil(map,bottomGuaranteeCivilDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    //兜底保障（残疾）
    @RequestMapping(value = "/disabled")
    ResultData updateBottomDisabled(@RequestParam Map<String,String> map, BottomDisabledDD bottomDisabledDD)
    {
        Integer num=infoUpdateService.insertBottomDisAbled(map,bottomDisabledDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //就业创业
    @RequestMapping(value = "/employment")
    ResultData updateEmployee(@RequestParam Map<String,String> map, EmploymentDD employmentDD)
    {
        Integer num=infoUpdateService.insertEmployee(map,employmentDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }
    //产业扶贫
    @RequestMapping(value = "/idstProjway")
    ResultData updateIdstProjway(@RequestParam Map<String,String> map, IdstProjwayDD idstProjwayDD)
    {
        Integer num=infoUpdateService.insertIdstProjway(map,idstProjwayDD);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    /*//村信息修改
    @RequestMapping(value = "/villageBasic")
    ResultData updateVillage(@RequestParam Map<String,String> map, VillageBasicDto villageBasicDto)
    {
        Integer num=infoUpdateService.insertupdateVillage(map,villageBasicDto);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }*/
    @Autowired
    private VillageDDService villageDDService;
    //村信息修改
    @RequestMapping(value = "/villageBasic")
    ResultData updateVillage(@RequestParam Map<String,String> map, VillageNewModel villageNewModel)
    {
        //Integer num=infoUpdateService.insertupdateVillage(map,villageBasicDto);
        ResultData num=villageDDService.villageUpdate(map,villageNewModel);
        return num;
    }

    //村基础设施的修改
    ResultData updateVillageBasic(@RequestParam Map<String,String> map,VillInfrastDD villInfrastDD)
    {
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,1);
    }
    //帮扶责任人修改
    @RequestMapping(value = "/helpNumber")
    ResultData updateHelpNumberDetail(@RequestParam Map<String,String> map, AK11AC08DD ak11AC08DD)
    {

        ResultData resultData=infoUpdateService.insertHelpNumberDetail(map,ak11AC08DD);
        return resultData;
    }















}
