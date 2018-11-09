package com.sysh.mapper;

import com.sysh.dto.HelpUserAndPovertyDto;
import com.sysh.dto.VillageDto;

/**
 * ClassName:  <br/>
 * Function: 该贫困户所在村和上级区县编号<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AC01AK11Mapper {

    HelpUserAndPovertyDto selectHelpAndPoverty(Long num);
}
