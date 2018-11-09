package com.sysh.web.controller;

import com.sysh.entity.helpmea.VillInfrastDD;
import com.sysh.service.AduitService;
import com.sysh.service.PovertyVillageService;
import com.sysh.service.VillageDDService;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/village")
public class PovertyVillageController {
    @Autowired
    private PovertyVillageService povertyVillageService;
    @Autowired
    private AduitService aduitService;

    private Logger log=Logger.getLogger(this.getClass());
/*
    *//**
     * 查找村的基本信息
     * @param
     * @param callback
     * @return
     *//*
    @RequestMapping(value = "/basic")
    public ResultData VillageBasic(String helpNumber,String callback)
    {
        //Long num=Long.parseLong(povertyNumber);
        //先将贫困村编号通过帮扶干部编号查找到
        String aad001=povertyVillageService.findAad001(helpNumber);
        log.info("村编号"+aad001);
        if(aad001==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"数据不存在",null);
        }
        else
        {
            Map<String,Object> map=new HashMap<>();
            map.put("PovertyVillageBasic",povertyVillageService.findVillageBasic(Long.parseLong(aad001)));
            if(aduitService.IsFirstSecretary(Long.valueOf(helpNumber))==1L || aduitService.IsBaocunSecretary(Long.valueOf(helpNumber))==1L)
            {
                map.put("isUpdate",1);
            }
            else
            {
                map.put("isUpdate",0);
            }
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        }
    }*/
    @Autowired
    private VillageDDService villageDDService;
    /**
     * 查找村的基本信息
     * @param
     * @param
     * @return
     */
    @RequestMapping(value = "/basic")
    public ResultData VillageBasic(@RequestParam Map<String,String> map)
    {
        return villageDDService.villageBasic(map);
    }

    /**
     * 查找村的贫困户情况
     * @param
     * @param callback
     * @return
     */
    @RequestMapping(value = "/household")
    public ResultData VillagePovertyHousehold(String helpNumber,String callback)
    {
        String aad001=povertyVillageService.findAad001(helpNumber);
        if(aad001==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"数据不存在",null);
        }
        else
        {
            Map<String,Object> map=new HashMap<>();
            map.put("PovertyVillageHousehold",povertyVillageService.findAllPovertyName(Long.parseLong(aad001)));
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        }


    }

    /**
     * 查找村的基础设施情况统计表
     * @param helpNumber
     * @param callback
     * @return
     */
    @RequestMapping(value = "/statistics")
    public ResultData VillageStatistics(String helpNumber,String callback)
    {
        //Long num=Long.parseLong(villageNumber);
        //根据帮扶干部编号，查询对应的帮扶贫困村编号helpNumber
        Map<String,Object> map=new HashMap<>();
        //得到驻村工作队得编号，查询到对应的贫困村信息，（区县名称，镇街名称，村组名称）
        VillInfrastDD v =povertyVillageService.findVillageStatisticsByNum(helpNumber);
        if(v==null)
        {
           return ResultData.returnResultData(ResultData.DATA_MISS,"数据不存在");
        }else
        {
            map.put("PovertyVillageStatistics",v);
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        }
    }
    @RequestMapping("/four")
    public ResultData VillageFour(String helpNumber)
    {
        if(helpNumber==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"查无数据");
        }
        //查询四支队伍得数据
        return povertyVillageService.findFour(helpNumber);

    }


}
