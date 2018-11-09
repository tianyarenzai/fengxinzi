package com.sysh.web.controller;

import com.sysh.mapper.AA10TABLEMapper;
import com.sysh.service.HelpMeasureDDService;
import com.sysh.service.PovertyDetailsService;
import com.sysh.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ClassName:  <br/>
 * Function: 10项帮扶措施的情况<br/>
 * date: 2018年06月23日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8 */
@RestController
@RequestMapping(value = "/measure")
public class HelpMeasureController {
    @Autowired
    private HelpMeasureDDService helpMeasureDDService;


    /**
     * 查询现阶段的帮扶措施信息
     * @param povertyNumber 贫困户编号
     * @return
     */
    @RequestMapping(value = "/poverty")
    ResultData immigrantRelocation(String povertyNumber)
    {
        if(povertyNumber==null)
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"查询条件不存在");
        }

        Set<String> set=helpMeasureDDService.findMeasure(povertyNumber);
        Map<String,Object> map=helpMeasureDDService.findIsExistence(set,povertyNumber);
        //map.put("set",set);

        if(map.size()==0&&map.isEmpty())
        {

            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"查无数据");
        }
        else
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        }
        //return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",set);

    }

    //帮扶措施得修改








    /*//点击相应的帮扶措施进行相应的新录入的表中查询
    @RequestMapping(value = "/relocation")
    ResultData Relocation(String povertyNumber)
    {
        //查询易地搬迁得内容，如果没有就标红，


    }*/




}
