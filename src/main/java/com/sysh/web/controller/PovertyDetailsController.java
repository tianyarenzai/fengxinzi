package com.sysh.web.controller;

import com.sysh.dto.AB10_AB01Dto;
import com.sysh.entity.AC01Part;
import com.sysh.service.PovertyDetailsService;
import com.sysh.util.ResultData;
import com.sysh.util.ToJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function:贫困户详细信息<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/poverty")
public class PovertyDetailsController {
    @Autowired
    private PovertyDetailsService povertyDetailsService;

    /**
     * 点击眼睛详情看页面
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/detail")
    public ResultData povertyDetail(String povertyNumber,String callback)
    {
        // 致贫原因
        //  户编号，户住证件号，家庭地址，联系方式
        AC01Part ac01=povertyDetailsService.selectAll(Long.parseLong(povertyNumber));
        Map<String,Object> map=new HashMap<>();
        map.put("POVERTYDETAIL",ac01);
        //return ToJson.toJson(map,callback);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 基本信息查询
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/basic")
    public ResultData povertyBasicDetail(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("Ac01Basic",povertyDetailsService.selectAC01Basic(num));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        //return ToJson.toJson(map,callback);
    }

    /**
     * 收入查询,患病查询
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/income")
    public ResultData povertyIncome(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("Ac07Income",povertyDetailsService.selectPovertyIncome(num));
        map.put("Health",povertyDetailsService.findHealth(povertyNumber));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
       // return ToJson.toJson(map,callback);
    }

    /**
     * 五项指标
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/Alleviation")
    public ResultData povertyAlleviation(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("FiveExit",povertyDetailsService.selectFivePoverty(num));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 家庭成员信息概要
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/familyInfo")
    public ResultData FamilyInfo(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("FamilyInfo",povertyDetailsService.selectFamily(num));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 家庭成员详情
     * @param povertyNumber
     * @param callback
     * @return
     */

    @RequestMapping(value="/fInfo")
    public ResultData FamilyDetailInfo(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        AB10_AB01Dto ab10_ab01Dto=povertyDetailsService.selectFamilyIfo(num);
        map.put("FamilyDetailInfo",ab10_ab01Dto);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 生产生活
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value="/Produce")
    public ResultData PovertyProduce(String povertyNumber,String callback)
    {
        Long num=Long.parseLong(povertyNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("PovertyProduce",povertyDetailsService.selectPovertyProduce(num));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 帮扶干部结对信息
     * @param povertyNumber
     * @param callback
     * @return
     */
    @RequestMapping(value="/HelpUser")
    public ResultData PovertyHelpUser(String helpNumber,String callback)
    {
        Long num=Long.parseLong(helpNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("PovertyHelp",povertyDetailsService.selectAC01AK11(num));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }





}
