package com.sysh.service.impl;

import com.sysh.dto.EvidenceDto;
import com.sysh.entity.helplog.HelpImageModel;
import com.sysh.mapper.EvidenceMapper;
import com.sysh.service.EvidenceService;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/7.
 */
@Service
public class EvidenceServiceImpl implements EvidenceService {
    @Autowired
    private EvidenceMapper evidenceMapper;

    private Logger log=Logger.getLogger(this.getClass());

    public static final String EVIDENCEPATH="http://117.39.29.85:8888/evidence/";

    @Override
    public synchronized ResultData insertEvidence(Map map) {

        Integer num=evidenceMapper.insertEvidence(map);
        Long primary=(Long)map.get("id");
        log.info("primary是什么值啊"+primary);
        List<String> list=(List<String>) map.get("imageList");
        log.info("得到的集合路径"+list.toString());
        Integer count=0;
        for(int i=0;i<list.size();i++)
        {
            Integer insertNum=evidenceMapper.insertImagePath(new EvidenceDto("0",EVIDENCEPATH+list.get(i),primary.toString()));
            log.info("添加成功了没"+insertNum);
            count++;
        }
        if(count==list.size())
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",1);
        }
        else
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"false",0);
        }

    }
}
