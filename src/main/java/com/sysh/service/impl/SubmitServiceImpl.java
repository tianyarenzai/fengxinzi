package com.sysh.service.impl;

import com.sysh.mapper.SubmitMapper;
import com.sysh.service.SubmitService;
import com.sysh.util.ResultData;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/23.
 */
@Service
public class SubmitServiceImpl implements SubmitService {
    @Autowired
    private SubmitMapper submitMapper;

    @Override
    public ResultData submitData(Map<String,String> map) {

        if(map.get("helpNumber")==null || map.get("year")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数错误");
        }
        List<Map> list=submitMapper.submitData(map);
        if(list==null )
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"暂无数据");
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",list);
    }

    @Override
    public ResultData submitEight(String helpNumber) {
        if(helpNumber==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        //查找到主要的东西
        List<Map> list=submitMapper.submitEight(helpNumber);
        for(int i=0;i<list.size();i++)
        {
            Map map=list.get(i);
            Map mapUpdate=new HashMap();
            mapUpdate.put("table",map.get("TABLE_NAME"));
            mapUpdate.put("id",map.get("EIGHT_ID"));
            Map mapName=submitMapper.eightName(mapUpdate);
            //得到每一个的信息
            if("tbl_bottom_disabled".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("NAME"));
            }
            else if("tbl_bottom_guarantee_civil".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("POVERTY_NAME"));
            }
            else if("tbl_ecological_poverty".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("POVERTY_NAME"));
            }
            else if("tbl_education".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("NAME"));
            }
            else if("tbl_employment".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("EMPLOY_NAME"));
            }
            else if("tbl_finance".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("NAME"));
            }
            else if("tbl_health".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("NAME"));
            }
            else if("tbl_idst_projway".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("HOLDER_NAME"));
            }
            else if("tbl_immigrant_relocation".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("POVERTY_NAME"));
            }
            else if("tbl_reconst_danger".equals(map.get("TABLE_NAME")))
            {
                map.put("name",mapName.get("POVERTY_NAME"));
            }
        }

        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",list);
    }
}
