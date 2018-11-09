package com.sysh.web.controller;

import com.sysh.service.FieldService;
import com.sysh.util.ResultData;
import jdk.internal.org.objectweb.asm.commons.CodeSizeEvaluator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 信息修改过程中有些字段是在数据库已经存在的，要反馈给客户端<br/>
 * date: 2018年06月20日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/field")
public class FieldController {
    @Autowired
    private FieldService fieldService;

    //针对数据库中固定的字段，给前端可选项
    @RequestMapping(value = "/basic")
    ResultData FieldCategory()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"贫困户属性","识别标准","主要致贫原因","其他致贫原因","是否军烈属","是否独生子女户","是否双女户","是否重点对象"};
        String[] key={"povertyType","IdentificationStandard","MajorPovertyCause","OtherPovertyCause","IsMilitaryGenus","IsOneChild","IsDoubleWomen","IsKeyObject"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findType(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    //生产生活信息
    @RequestMapping(value = "/produce")
    ResultData FieldProduce()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"是否通生产用电","是否加入农民合作社","入户路类型","是否通生活用电","饮水是否困难","饮水是否安全","主要燃料类型","有无卫生厕所"};
        String[] key={"IsProductionPower","IsCooperative","TypeOfEntryRoad","IsLivingElectricity","IsDifficultWater","IsSafeWater","MainFuelType","IsSanitaryLatrine"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findType(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    //家庭成员详情信息
    @RequestMapping(value = "/familyField")
    ResultData FieldFamilyInfo()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"证件类型","文化程度","在校生状况","健康状况","劳动能力","政治面貌","是否现役军人","是否低保人员","是否五保人员"};
        String[] key={"DocumentType","DegreeOfEducation","StudentStatus","Health","laborAbility","PoliticalOutlook","IsServicemen","IsLowInsurance","IsFiveGuarantees"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findType(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    @RequestMapping(value = "/village")
    ResultData FieldVillage()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"行政职务级别","村属性","按照发展方向","按照地形地貌","到乡镇是否通沥青（水泥）路","是否通客运班车"};
        String[] key={"aaf031","aad004","aad035","aad036","aad328","aad323"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findType(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 帮扶责任人信息修改
     * @return
     */
    //@RequestMapping(value = "/help")
    ResultData FieldHelp()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"第一书记标志","队长标志","是否驻村队员","性别","隶属关系","政治面貌","行政职务级别","学历","技术特长","驻村工作队副队长","包村干部"};
        String[] key={"aak032","aak031","aak039","aab003","aap004","aak033","aaf031","aak036","aak037","aak666","aak777"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findTypeHelp(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    /**
     * 帮扶责任人信息修改
     * @return
     */
    @RequestMapping(value = "/help")
    ResultData FieldHekpDetail()
    {
        Map<String,Object> map=new HashMap<>();
        String[] s={"性别","政治面貌","学历","技术特长"};
        String[] key={"aab003","aak033","aak036","aak037"};
        for(int i=0;i<s.length;i++)
        {
            map.put(key[i],fieldService.findTypeHelp(s[i]));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }



}
