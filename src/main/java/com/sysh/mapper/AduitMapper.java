package com.sysh.mapper;

import com.sysh.entity.aduit.AduitDetailInfo;
import com.sysh.entity.aduit.AduitInfo;
import com.sysh.vo.EvidenceFirstModel;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 审核信息<br/>
 * date: 2018年06月17日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AduitMapper {

    //未审核的信息
    List<AduitInfo> noAduitInfo(Long helpNumber);

    //已审核的信息
    List<AduitInfo> AduitSucess(Long helpNumber);
    List<AduitInfo> EightAduitSucess(Long helpNumber);

    //未通过的信息
    List<AduitInfo> AduitFail(Long helpNumber);
    List<AduitInfo> EightAduitFail(Long helpNumber);
    //查看详情
    List<AduitDetailInfo> findAduitDetailInfo(Long id);//在信息审核过程中的得到的ID查询相应的详细信息
    //第一书记审核
    Integer  updateFirstSecretary(Map map);
    Integer  updateFirstSecretaryEight(Map map);


    //判断是不是第一书记
    Long IsFirstSecretary(Long helpNumber);
    Long IsBaocunSecretary(Long helpNumber);
    //查询该编号下的帮扶单位编号，根据编号查询对应的贫困村编号
    Long findVillageNumber(Long helpNumber);
    //根据村编号，查询村下边的那些贫困户要审核信息
    List<AduitInfo> FirstAduit(Long villageNumber);
    List<AduitInfo> FirstAduit2(Long villageNumber);
    //查询根据ID找出对应的表名
    String findTableName(Long id);

    //测试方法，不知道可行性
    List<String> findTable();
    List<AduitInfo> findAduitInfo(Map<String, String> map);

    //佐证列表查看
    List<EvidenceFirstModel> findEvidenceAduit(Map<String, String> map);
    //佐证详情查看
    List<String> evidenceDDDetail(String id);
    //佐证第一书记初审
    Integer  updateEvidenceFirst(Map<String, String> map);






}
