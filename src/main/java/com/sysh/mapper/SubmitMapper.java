package com.sysh.mapper;

import com.sysh.dto.AB10_AB01Dto;
import com.sysh.dto.DropOfSchoolDto;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 查询当前帮扶干部编号上传的贫困户信息<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface SubmitMapper {

    List<Map> submitData(Map<String, String> map);

    List<Map> submitEight(String helpNumber);

    Map eightName(Map map);




}
