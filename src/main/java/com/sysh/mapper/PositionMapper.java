package com.sysh.mapper;

import com.sysh.entity.helpSignIn.SignInModel;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 签到统计，查询<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface PositionMapper {
    //根据帮扶干部编号查询对应的签到时间信息
    List<String> findPosition(Map<String, Object> map);

    Integer insertPosition(SignInModel signInModel);

    Integer IsPosition(SignInModel signInModel);
}
