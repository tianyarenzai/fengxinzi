package com.sysh.service;

import com.sysh.dto.VillageBasicDto;
import com.sysh.entity.VillageNewModel;
import com.sysh.entity.helpmea.VillInfrastDD;
import com.sysh.util.ResultData;

import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/20.
 */
public interface VillageDDService {

    ResultData villageBasic(Map<String, String> map);

    ResultData villageUpdate(Map<String, String> map, VillageNewModel villageDDModel);

    ResultData villageUpdateBasic(Map<String, String> map, VillInfrastDD villInfrastDD);

}
