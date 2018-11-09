package com.sysh.mapper;

import com.sysh.entity.VillageNewModel;
import com.sysh.entity.helpmea.VillInfrastDD;

import java.util.Map;

public interface VillageDDMapper {
    /**
     * 依据贫困村编号来进行查询
     * year,aad001
     * @param map
     * @return
     */
    VillageNewModel findVillageDD(Map<String, String> map);

    String findAAd001DD(String aak110);
    //是包村干部或者第一书记
    Integer isFirstOrBaocun(String aak110);
    //赋值给相应的省市县
    Map findName(String aad001);


}