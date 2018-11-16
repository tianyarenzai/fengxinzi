package com.sysh.web.controller;

import com.sysh.entity.aduit.AduitDetailInfo;
import com.sysh.service.AduitService;
import com.sysh.service.PovertyVillageService;
import com.sysh.util.ResultData;
import com.sysh.vo.EvidenceFirstModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 信息审核<br/>
 * date: 2018年06月16日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/aduit")
public class InfoAduitController {

    private Logger log=Logger.getLogger(this.getClass());

    @Autowired
    private AduitService aduitService;
    @Autowired
    private PovertyVillageService povertyVillageService;

    //查询是否为第一书记，是就有审核信息，不是，就没有审核信息，只有待审核信息
    //帮扶干部查看自己的信息审核到哪一步了，查询到的是未审核信息和已通过审核,根据是否为第一书记
    @RequestMapping(value = "/help")
    public ResultData HelpAduit(Long helpNumber)
    {
        if(helpNumber==null)
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"查询条件不足");
        }
        //首先根据帮扶干部编号查询他帮了几个贫困户得到List
        Map<String,Object> map=new HashMap<>();
        //判断是否为第一书记,还是包村干部
        log.info("刚进来");
        if(aduitService.IsFirstSecretary(helpNumber)==1L | aduitService.IsBaocunSecretary(helpNumber)==1L)//选判断谁能看到的问题
        {
            if(aduitService.IsBaocunSecretary(helpNumber)==1L)
            {
                //判断这个村有没有第一书记，有就无审核信息，无就有审核信息
                if(aduitService.isFirstAduit(helpNumber.toString())>0)
                {
                    //存在第一书记，不用考虑有无审核信息
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无待审核信息",map);
                }

                //没有第一书记，包村干部最大
                if(aduitService.findHelpAduit(helpNumber)==null)
                {
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无提交信息");
                }
                map.put("FirstSecretaryNormal",aduitService.findHelpAduit(helpNumber));
                Long villageNumber=aduitService.findVillage(helpNumber);
                if(aduitService.findToBeAduit2(villageNumber)==null)
                {
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无待审核信息",map);
                }
                log.info("要审核的信息"+aduitService.findToBeAduit2(villageNumber));
                map.put("FirstSecretaryAduit",aduitService.findToBeAduit2(villageNumber));
                //查询该帮扶干部的所帮的村
                //根据村编号，去判断村中的贫困户和帮扶干部提交的贫困户信息吻合之后的信息
            }
            else
            {
                //不是包村干部。直接就是查询
                if(aduitService.findHelpAduit(helpNumber)==null)
                {
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无提交信息");
                }
                map.put("FirstSecretaryNormal",aduitService.findHelpAduit(helpNumber));
                Long villageNumber=aduitService.findVillage(helpNumber);
                if(villageNumber==null)
                {
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无审核信息");
                }
                if(aduitService.findToBeAduit2(villageNumber)==null)
                {
                    return ResultData.returnResultData(ResultData.DATA_FALSE,"无待审核信息",map);
                }
                log.info("要审核的信息"+aduitService.findToBeAduit2(villageNumber));
                map.put("FirstSecretaryAduit",aduitService.findToBeAduit2(villageNumber));
            }
        }
        else
        {
            //不是第一书记，单查询这些未审核和已审核的信息
            map.put("FirstSecretaryNormal",aduitService.findHelpAduit(helpNumber));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    //第一书记所属村查找该村提交的贫困户信息
    /**
     * 根据用户点击相应的贫困户的类型不一致，显示相应的类型被修改内容，在展示界面点击详情得到实际情况
     * @param id
     * @return
     */
    @RequestMapping(value = "/detail")
    ResultData HelpAduitDetail(Long id,String modifyType)
    {
        List<AduitDetailInfo> list=aduitService.findDetailInfoAduit(id,modifyType);
        Map<String,List<AduitDetailInfo>> map=new HashMap<>();
        map.put("AduitDetail",list);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    //信息审核一次审核一个模块，类似基础信息一次审核一次
    @RequestMapping(value = "/aduitId")
    ResultData HelpAduit(String dataId,String type,String first)
    {

        //八个一批信息审核
        //贫困户信息审核
        Integer count=aduitService.aduitInfo(dataId,type,first);
        if(count==1)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok");
        }
        else
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"fail");
        }
    }
    //佐证的查看，审核，和点击详情
    //第一书记（包村干部）查看
    @RequestMapping(value = "/evidence/select")
    ResultData evidenceFirstSelect(@RequestParam Map<String,String> map)
    {

        if(map.get("helpNumber")==null || map.get("year")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        log.info("map里面的值"+map.toString());
        log.info("是不是第一书记"+aduitService.IsFirstSecretary(Long.valueOf(map.get("helpNumber"))));
        log.info("是不是包村干部"+aduitService.IsBaocunSecretary(Long.valueOf(map.get("helpNumber"))));
        //先判断是第一书记还是包村干部，如果有第一书记，就没与包村干部什么事
        if(aduitService.IsFirstSecretary(Long.valueOf(map.get("helpNumber")))==1L | aduitService.IsBaocunSecretary(Long.valueOf(map.get("helpNumber")))==1L)//选判断谁能看到的问题
        {
            //现在可以肯定事包村干部或者第一书记，再判断这个村有没有第一书记
            if(aduitService.IsBaocunSecretary(Long.valueOf(map.get("helpNumber")))==1L)
            {
                //判断这个村有没有第一书记，有就无审核信息，无就有审核信息
                /*ResultData list=povertyVillageService.findFour(map.get("helpNumber"));
                Map mapFour= (Map) list.getData();*/
                if(aduitService.isFirstAduit(map.get("helpNumber"))>0)
                {
                    //存在第一书记，不用考虑有无审核信息
                    return ResultData.returnResultData(ResultData.DATA_MISS,"无待审核信息");
                }
                //没第一书记，有审核信息
                //先看有没有审核信息
                if(aduitService.firstAduit(map).size()==0)
                {
                    //无审核作证信息
                    return ResultData.returnResultData(ResultData.DATA_MISS,"无审核信息");
                }
                List<EvidenceFirstModel> listAduit=aduitService.firstAduit(map);
                return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",listAduit);
            }
            else
            {
                //不是包村干部。直接查询
                if(aduitService.firstAduit(map).size()==0)
                {
                    //无审核作证信息
                    return ResultData.returnResultData(ResultData.DATA_MISS,"无审核信息");
                }
                List<EvidenceFirstModel> listAduit=aduitService.firstAduit(map);
                return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",listAduit);

            }
        }
        return ResultData.returnResultData(ResultData.DATA_MISS,"无审核信息");
    }
    //查看详情
    @RequestMapping("/evidence/detail")
    ResultData EvidenceDetail(String id)
    {
        return aduitService.evidenceDetail(id);
    }

    /**
     * 审核信息，第一书记初审作证信息
     * @param map，id,type
     * @return
     */
    //审核信息
    @RequestMapping(value = "/evidence/first")
    ResultData EvidenceAduitFirst(@RequestParam Map<String,String> map)
    {
        return aduitService.evidenceAduitFirst(map);
        //return ResultData.returnResultData(ResultData.RESULT_SUCCESS,1);
    }


}
