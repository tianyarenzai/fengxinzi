package com.sysh.web.controller;

import com.sysh.dto.PovertyLoginAfterDto;
import com.sysh.entity.AK11DD;
import com.sysh.entity.aduit.AduitInfo;
import com.sysh.service.AduitService;
import com.sysh.service.HelpUserService;
import com.sysh.service.LoginService;
import com.sysh.util.ResultData;
import com.sysh.util.dingding.DingDingHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 帮扶干部登陆<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/helpUser")
public class HelpUserController {

    private Logger log=Logger.getLogger(this.getClass());
    @Autowired
    private LoginService loginService;
    @Autowired
    private HelpUserService helpUserService;
    @Autowired
    private AduitService aduitService;

    /**
     * 用户登陆
     * @param code
     * @return
     */
    @RequestMapping(value = "/login")
    public ResultData HelpUserLogin(String code){
        //用户验证成功，将用户放入redis数据库
        log.info("进来了钉钉");
        log.info("code是什么"+code);
        //查询对应的贫困户，得到相应的名字，返回，以及轮播图的信息；
        //帮扶干部手机号,免登陆配置
        String userMobile= DingDingHelper.getUserMobile(code);
        //System.out.println("查出来的手机号为多少"+s);
        //String userMobile=null;
        //String userMobile="16619859605";
        List<PovertyLoginAfterDto> name= loginService.Login(userMobile);
        log.info("查询出来的帮扶对象"+name.toString());
        //判断是否为第一书记，驻村队员，队长，显示下半部分
        String helpNumber=loginService.findHelpNumber(userMobile);
        Map<String,Object> map=new HashMap<>();
        map.put("Name",name);
        map.put("helpNumber",helpNumber);
        map.put("isResidency",helpUserService.isResidency(helpNumber));
        //map.put("user",s);
        if(helpUserService.isResidency(helpNumber)==1)
        {
            Long villageNumber=aduitService.findVillage(Long.valueOf(helpNumber));
            if(villageNumber==null)
            {
                map.put("aduitNum",0);
            }else
            {

                List<AduitInfo> aduitNum=aduitService.findToBeAduit2(villageNumber);
                if(aduitNum!=null && !aduitNum.isEmpty())
                {
                    map.put("aduitNum",aduitNum.size());
                }
                else
                {
                    map.put("aduitNum",0);
                }
            }
        }
        log.info("返回的什么东西"+map.toString());
        ResultData data=ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
        return data;
        //return ToJson.toJson(map,callback);
    }


    //我的详情，查询帮扶干部姓名，派出单位，工作职位，队内职务
    //@RequestMapping("/detail")
    ResultData findHelpDetail(String helpNumber)
    {
        AK11DD ak11DD=helpUserService.findAK11(helpNumber);
        if(ak11DD!=null)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",ak11DD);
        }
        else
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"fail",null);
        }
    }
    //我的详情，查询帮扶干部姓名，派出单位，工作职位，队内职务(新)
    @RequestMapping("/detail")
    ResultData helpNumberDetail(@RequestParam Map<String,String> map)
    {
        ResultData resultData=helpUserService.helpNumberDetail(map);
        return resultData;
    }
    @RequestMapping("/update")
    ResultData updateHelpDetail(AK11DD ak11DD)
    {
        if(ak11DD==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        return helpUserService.updateHelpDetail(ak11DD);
    }

    @RequestMapping(value = "/delete")
    public String delete( HttpServletRequest request, HttpServletResponse response){
        return "1";
    }




}
