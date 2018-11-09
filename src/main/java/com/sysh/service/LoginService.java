package com.sysh.service;

import com.sysh.dto.PovertyLoginAfterDto;

import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月05日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface LoginService {

    List<PovertyLoginAfterDto> Login(String userName);
    //根据手机号，判断是否为能查看下面部分的数据
    String findHelpNumber(String mobile);

}
