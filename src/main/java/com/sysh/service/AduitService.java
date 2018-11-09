package com.sysh.service;

import com.sysh.entity.aduit.AduitDetailInfo;
import com.sysh.entity.aduit.AduitInfo;
import com.sysh.util.ResultData;
import com.sysh.vo.EvidenceFirstModel;

import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 信息审核<br/>
 * date: 2018年06月16日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public interface AduitService {

    Map<String,List<AduitInfo>> findHelpAduit(Long helpNumber);

    List<AduitDetailInfo> findDetailInfoAduit(Long id, String m);//这个ID代表的是根据存入信息的ID来判断具体在某一次修改的指标项是什么

    //判断这个帮扶干部是不是第一书记
    Long IsFirstSecretary(Long helpNumber);
    //判断这个帮扶干部是不是第一书记
    Long IsBaocunSecretary(Long helpNumber);

    //根据第一书记所在村组编号判断待审核信息
    List<AduitInfo> findToBeAduit(Long villageNumber);
    //根据第一书记所在村组编号判断待审核信息
    List<AduitInfo> findToBeAduit2(Long villageNumber);

    //是否为第一书记
    Integer isFirstAduit(String helpNumber);

    //查询先极端的行政村编号，并进行遍历，进入下一阶段
    Long findVillage(Long helpNumber);

    //根据dataID来审核信息的变更情况
    Integer aduitInfo(String dataId, String s, String first);

    //判断有无佐证审核信息
    List<EvidenceFirstModel> firstAduit(Map<String, String> map);
    //查看佐证的详情
    ResultData evidenceDetail(String id);
    //审核佐证信息
    ResultData evidenceAduitFirst(Map<String, String> map);


}
