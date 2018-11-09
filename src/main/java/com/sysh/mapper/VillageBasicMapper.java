package com.sysh.mapper;

import com.sysh.dto.VillageBasicDto;
import com.sysh.dto.VillageDto;

/**
 * ClassName:  <br/>
 * Function: 村基础设施<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface VillageBasicMapper {

    VillageBasicDto findVIllageBasic(Long villageNumber);
    //根据帮扶干部编号查询村编号
    String findAad001(String helpNumber);

    //String findAad001Name(String helpNumber);

}
