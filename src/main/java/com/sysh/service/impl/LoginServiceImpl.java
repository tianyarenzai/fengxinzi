package com.sysh.service.impl;

import com.sysh.dto.PovertyLoginAfterDto;
import com.sysh.mapper.AC01DtoMapper;
import com.sysh.mapper.AC08DDMapper;
import com.sysh.mapper.HelpUserMapper;
import com.sysh.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class LoginServiceImpl implements LoginService {
    Logger log=Logger.getLogger(this.getClass());

    @Autowired
    private HelpUserMapper helpUserMapper;
    @Autowired
    private AC08DDMapper ac08Mapper;
    @Autowired
    private AC01DtoMapper ac01DtoMapper;


    @Override
    public List<PovertyLoginAfterDto> Login(String userName) {

        List<PovertyLoginAfterDto> list=new ArrayList<>();
        Long HelpNumber=helpUserMapper.findHelpUserNumber(userName);
            log.info(HelpNumber);
        List<Long> PovertyNumber=ac08Mapper.findPovertyNumber(HelpNumber);
        System.out.println(PovertyNumber);
        for(int i=0;i<PovertyNumber.size();i++)
        {
            log.info(ac01DtoMapper.findPovertyUserName(PovertyNumber.get(i)));
            list.add(ac01DtoMapper.findPovertyUserName(PovertyNumber.get(i)));
        }
        return list;
    }

    /**
     * 根据手机号，查询帮扶干部的权力
     * @param mobile
     * @return
     */
    @Override
    public String findHelpNumber(String mobile) {
        return helpUserMapper.findHelpNumber(mobile);
    }
}
