package com.sysh.mapper;

import com.sysh.entity.helplog.DiscussDD;
import com.sysh.entity.helplog.HelpImageModel;
import com.sysh.entity.helplog.HelpLogModel;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 查找帮扶干部信息<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface HelpUserMapper {
    /**
     * 通过帮扶干部手机号，查询贫困户信息
     * @param username
     * @return
     */
    Long findHelpUserNumber(String username);

    /**
     * 通过帮扶干部编号，查询日志情况
     * @param helpNumber
     * @return
     */
    List<HelpLogModel> findHelpLogByHelpNum(Long helpNumber);

    /**
     * 通过帮扶日志ID查找对应的ID锁对应的图片路径
     * @param helpLogId
     * @return
     */
    List<String> findImagePath(Long helpLogId);

    /**
     * 添加日志
     * @param helpLogModel
     * @return
     */
    Long insertHelpLog(HelpLogModel helpLogModel);

    /**
     * 查询全部的日志，帮扶圈
     * @return
     */
    List<HelpLogModel> findHelpLogAll();
    //发现村名称，上级编号，去aa11表中查询
    Map findVillageName(String helpNumber);
    //查找帮扶干部编号
    String findHelpNumber(String mobile);
    //帮扶日志赞数加一
    Integer isnertPraise(Map<String, String> map);
    //查找现阶段的所有赞数有多少
    Integer selectByid(String id);
    //是否驻村
    Integer isResidency(String helpNumber);

    /**
     * 根据日志ID,查询对应的评论情况
     * @param logid
     * @return
     */
    List<DiscussDD> findDIscussDDList(Long logid);
    //评论得添加
    Integer insertDiscuss(DiscussDD discussDD);
    //添加图片路径
    Integer insertHelpImage(HelpImageModel helpImageModel);

    //查找帮扶责任人评论的信息
    String findHelpName(String s);

    //判断该村是否含有第一书记
    Integer isFirstAduit(String helpNumber);








}
