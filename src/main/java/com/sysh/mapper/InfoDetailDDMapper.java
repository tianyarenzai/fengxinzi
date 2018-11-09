package com.sysh.mapper;

import com.sysh.dto.FamilyAb10Dto;
import com.sysh.entity.aduit.AduitDetailInfo;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 信息审核的详情<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface InfoDetailDDMapper {

    List<AduitDetailInfo> findDetail(Map<String, String> map);

    String findTableName(Long id);
    List<AduitDetailInfo> findEightDetail(Long id);

}
