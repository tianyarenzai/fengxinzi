package com.sysh.web.controller;

import com.sysh.entity.helpSignIn.SignInModel;
import com.sysh.entity.helplog.DiscussDD;
import com.sysh.entity.helplog.HelpLogModel;
import com.sysh.mapper.PositionMapper;
import com.sysh.service.HelpUserService;
import com.sysh.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 帮扶日历，帮扶签到，帮扶日志上传<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping(value = "/help")
public class HelpLogController {
    @Autowired
    private HelpUserService helpUserService;

    /**
     * 查询帮扶日历返回时间集合
     * @param
     * @param
     * @return
     * 需要传递帮扶干部编号，和查询时间，如果不写，为当前时间
     */
    @RequestMapping(value="/time")
    public ResultData PovertyHelpUser(@RequestParam Map<String,Object> map)
    {
        Map<String,Object> mapReturn=new HashMap<>();
        mapReturn.put("Time",helpUserService.findHelpSignIn(map));
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",mapReturn);
    }

    /**
     * 返回日志集合，根据帮扶干部编号查询，包含图片和日志内容,评论
     * @param helpNumber
     * @return
     * 苏积钰
     */
    @RequestMapping(value = "/logId")
    public ResultData HelpLogByHelpNumber(Long helpNumber)
    {
        List<HelpLogModel> list=helpUserService.findHelpLog(helpNumber);
        Map<String,Object> map=new HashMap<>();
        map.put("HelpLogByNum",list);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }
    /**
     * 返回日志集合，不区分帮扶干部，全查
     * @return
     */
    @RequestMapping(value = "/log")
    public ResultData HelpLog()
    {
        List<HelpLogModel> list=helpUserService.findHelpLogAll();
        Map<String,Object> map=new HashMap<>();
        map.put("HelpLog",list);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 点击赞的时候，赞加1
     * @param id
     * @return
     */
    @RequestMapping(value = "/addPraise")
    ResultData insertNumberPraise(String id)
    {
        Integer count=helpUserService.insertHelpLogPraise(id);
        if(count==1)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok");
        }else
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"fail");
        }
    }

    /**
     * 签到信息统计，具体的签到
     * private String  helpTime,helpPosition;//时间，地点
     *  private Double longGitUde,latitude;//经度，纬度
     *  private String helpNumber;
     *  private Long id;//编号
     * @param signInModel
     * @return
     */
    @RequestMapping(value = "/sign")
    ResultData insertSignUp(SignInModel signInModel)
    {
        Integer num=helpUserService.insertPosition(signInModel);
        if(num==1)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
        }
        else
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"fail",0);
        }
    }

    /**
     * 针对日志得评论，进行添加
     * @param discussDD
     * @return
     */
    @RequestMapping(value = "/insertDiscuss")
    ResultData insertDiscuss(DiscussDD discussDD)
    {
        Integer num=helpUserService.insertDiscuss(discussDD);
        if(num==1)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
        }
        else
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"fail",num);
        }
    }
    @RequestMapping(value = "/findName")
    ResultData findHelpName(String helpNumber)
    {
        return helpUserService.findHelpName(helpNumber);
    }
    @RequestMapping(value = "/isSign")
    ResultData isSign(String helpNumber)
    {
        if(helpNumber==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"查询条件不足");
        }
        return helpUserService.isSign(helpNumber);
    }










}
