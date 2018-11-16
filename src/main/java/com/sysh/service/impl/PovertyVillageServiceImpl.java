package com.sysh.service.impl;

import com.sysh.dto.PovertyVillageNumberDto;
import com.sysh.dto.VillageBasicDto;
import com.sysh.entity.AC01Part;
import com.sysh.entity.AK11DD;
import com.sysh.entity.helpmea.VillInfrastDD;
import com.sysh.mapper.*;
import com.sysh.service.PovertyVillageService;
import com.sysh.util.DateUtil;
import com.sysh.util.ResultData;
import com.sysh.util.VillageBasicUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 村信息service<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class PovertyVillageServiceImpl implements PovertyVillageService {

    private Logger log = Logger.getLogger(this.getClass());

    @Autowired
    private VillageBasicMapper villageBasicMapper;
    @Autowired
    private AA10TABLEMapper aa10TABLEMapper;
    @Autowired
    private AC01DtoMapper ac01DtoMapper;
    @Autowired
    private VillInfrastDDMapper villInfrastDDMapper;
    @Autowired
    private HelpUserMapper helpUserMapper;
    @Autowired
    private AA11DDMapper aa11DDMapper;
    @Autowired
    private AK11DDMapper ak11DDMapper;

    /**
     * 村基本信息
     *
     * @param num
     * @return
     */
    @Override
    public VillageBasicDto findVillageBasic(Long num) {

        VillageBasicDto villageBasicDto = villageBasicMapper.findVIllageBasic(num);
        if (villageBasicDto != null) {

            //职务级别
            if (villageBasicDto.getAaf031() != null) {
                villageBasicDto.setAaf031(aa10TABLEMapper.Position(villageBasicDto.getAaf031()));
            }
            //村属性
            if (villageBasicDto.getAad004() != null) {
                villageBasicDto.setAad004(aa10TABLEMapper.VillageType(villageBasicDto.getAad004()));
            }
            //发展方向
            if (villageBasicDto.getAad035() != null) {
                villageBasicDto.setAad035(aa10TABLEMapper.Development(villageBasicDto.getAad035()));
            }
            //地形地貌属性
            if (villageBasicDto.getAad036() != null) {
                villageBasicDto.setAad036(aa10TABLEMapper.Landform(villageBasicDto.getAad036()));
            }
            //到乡镇是否同水泥路
            villageBasicDto.setAad328(VillageBasicUtil.PassageWay(villageBasicDto.getAad328()));
            //是否通客运班车
            villageBasicDto.setAad323(VillageBasicUtil.IsShuttleBus(villageBasicDto.getAad323()));

            return villageBasicDto;
        }
        return null;
    }

    /**
     * 通过村查找贫困户的信息
     *
     * @param num
     * @return
     */
    @Override
    public List<PovertyVillageNumberDto> findAllPovertyName(Long num) {

        List<AC01Part> list = ac01DtoMapper.selectPovertyName(num);
        List<PovertyVillageNumberDto> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            PovertyVillageNumberDto povertyVillageNumberDto = new PovertyVillageNumberDto();
            //先截取年龄和性别项

            String s = list.get(i).getAac031().substring(6, 17);
            povertyVillageNumberDto.setPovertyNumber(String.valueOf(list.get(i).getAac001()));
            povertyVillageNumberDto.setPovertyName(list.get(i).getAac029());
            povertyVillageNumberDto.setPovertyAge(String.valueOf(DateUtil.age(s)));
            log.info("最后一个的性别" + VillageBasicUtil.IsSex(s));
            log.info("最后一个的性别的编号" + s);
            povertyVillageNumberDto.setPovertySex(VillageBasicUtil.IsSex(s));
            list2.add(povertyVillageNumberDto);
        }
        return list2;
    }

    /**
     * 村基础信息统计表
     *
     * @param
     * @return
     */
    @Override
    public VillInfrastDD findVillageStatisticsByNum(String helpNumber) {
        //先根据帮扶干部编号去查询对应的市县村名称，在进行查询
        Map map = helpUserMapper.findVillageName(helpNumber);
        //log.info("map里面是个什么东西"+map.toString());
        if (map != null) {
            Map<String, Object> townName = aa11DDMapper.findTownName((BigDecimal) map.get("AAA113"));
            Map<String, Object> distinctName = aa11DDMapper.findTownName((BigDecimal) townName.get("AAA113"));

            Map<String, String> map1 = new HashMap<>();
            System.out.println((String) map.get("AAR009"));
            map1.put("villageName", (String) map.get("AAR009"));
            map1.put("townName", townName.get("AAR009").toString());
            map1.put("distinctName", distinctName.get("AAR009").toString());
            System.out.println(map1.toString());
            //System.out.println(map.get("AAA113"));
            //根据得到得贫困村查询上级名称，来组合查询
            // System.out.println(map.get("aaa113").toString());
            VillInfrastDD villageStatisticsDto = villInfrastDDMapper.findByHelpNumber(map1);
            if (villageStatisticsDto != null) {
                return villageStatisticsDto;
            }
            return null;

        }
        else {
            return null;
        }


    }

    @Override
    public String findAad001(String helpNumber) {
        return villageBasicMapper.findAad001(helpNumber);
    }

    /**
     * 查询四支队伍得详细信息
     *
     * @param helpNumber
     * @return
     */
    @Override
    public ResultData findFour(String helpNumber) {

        List<AK11DD> findFour = ak11DDMapper.findFour(helpNumber);
        List<AK11DD> leader = new ArrayList<>();
        List<AK11DD> fuLeader = new ArrayList<>();
        List<AK11DD> first = new ArrayList<>();
        List<AK11DD> team = new ArrayList<>();

        if (findFour == null) {
            return ResultData.returnResultData(ResultData.DATA_MISS, "查无数据");
        }
        //数据不为空
        //处理数据
        for (int i = 0; i < findFour.size(); i++) {
            AK11DD ak11DD = findFour.get(i);
            //判断是不是队长，第一书记，副队长，工作队员
            if (ak11DD.getAak031() != null && "1".equals(ak11DD.getAak031())) {
                leader.add(ak11DD);
            }
            //第一书记
            else if (ak11DD.getAak032() != null && "1".equals(ak11DD.getAak032())) {
                first.add(ak11DD);
            }
            //包村干部
            else if (ak11DD.getAak777() != null && "1".equals(ak11DD.getAak777())) {
                first.add(ak11DD);
            }
            //副队长
            else if (ak11DD.getAak666() != null && "1".equals(ak11DD.getAak666())) {
                fuLeader.add(ak11DD);
            }
            else {
                team.add(ak11DD);
            }
        }
        Map map = new HashMap();
        map.put("leader", leader);
        map.put("first", first);
        map.put("fuLeader", fuLeader);
        map.put("team", team);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS, "ok", map);
    }
}
