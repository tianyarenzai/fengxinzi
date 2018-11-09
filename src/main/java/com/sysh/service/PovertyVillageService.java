package com.sysh.service;

import com.sysh.dto.PovertyVillageNumberDto;
import com.sysh.dto.VillageBasicDto;
import com.sysh.dto.VillageStatisticsDto;
import com.sysh.entity.helpmea.VillInfrastDD;
import com.sysh.util.ResultData;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface PovertyVillageService {

    //查询村基本信息
    VillageBasicDto findVillageBasic(Long num);
    //查询全部的户信息
    List<PovertyVillageNumberDto> findAllPovertyName(Long num);
    //查询该村的基础措施统计情况
    VillInfrastDD findVillageStatisticsByNum(String povertyNumber);
    //根据帮扶干部编号查询贫困村编号
    String findAad001(String helpNumber);

    //查找村得四支队伍信息
    ResultData findFour(String helpNumber);



}
