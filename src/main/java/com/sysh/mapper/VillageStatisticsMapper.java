package com.sysh.mapper;

import com.sysh.dto.VillageStatisticsDto;

/**
 * ClassName:  <br/>
 * Function: 村基础设施情况统计表<br/>
 * date: 2018年06月14日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface VillageStatisticsMapper {

    VillageStatisticsDto findVillageStatisticsByVillageNum(Long num);


}
