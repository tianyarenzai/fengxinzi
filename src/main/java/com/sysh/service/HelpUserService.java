package com.sysh.service;

import com.sun.javafx.collections.MappingChange;
import com.sysh.entity.AK11DD;
import com.sysh.entity.helpSignIn.SignInModel;
import com.sysh.entity.helplog.DiscussDD;
import com.sysh.entity.helplog.HelpImageModel;
import com.sysh.entity.helplog.HelpLogModel;
import com.sysh.util.ResultData;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 帮扶干部得情况，帮扶里程，帮扶日历，帮扶圈等信息<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface HelpUserService {

    //帮扶干部帮扶日历，帮扶日志上传时间
    List<String>  findHelpSignIn(Map<String, Object> map);
    //该帮扶干部的日志
    List<HelpLogModel> findHelpLog(Long helpNumber);
    //先添加日志，然后将日志照片传递到另外的表中，返回主键就可以
    Long insertHelpLog(Map<String, Object> map);
    //查看全部的日志，帮扶圈详情
    List<HelpLogModel> findHelpLogAll();
    //添加签到信息，地理位置的经纬度，时间，地点。
    Integer insertPosition(SignInModel signInModel);
    //发现帮扶干部详情
    AK11DD findAK11(String helpNumber);
    //日志赞数加1
    Integer insertHelpLogPraise(String id);
    //判断是否驻村队员
    Integer isResidency(String helpNumber);
    //评论添加
    Integer insertDiscuss(DiscussDD discussDD);

    ResultData findHelpName(String s);
    //修改帮扶责任人修改
    ResultData updateHelpDetail(AK11DD ak11DD);

    ResultData isSign(String helpNumber);

    ResultData helpNumberDetail(Map<String, String> map);



}
