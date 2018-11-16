package com.sysh.service.impl;

import com.sysh.entity.VillageNewModel;
import com.sysh.entity.aduit.*;
import com.sysh.entity.helpmea.VillInfrastDD;
import com.sysh.entity.update.VillageBasicModel;
import com.sysh.mapper.*;
import com.sysh.service.AduitService;
import com.sysh.service.EqualsService;
import com.sysh.service.VillageDDService;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 负责村信息管理的所有的信息
 * Created by sjy Cotter on 2018/8/20.
 */
@Service
public class VillageServiceImpl implements VillageDDService {
    @Autowired
    private VillageDDMapper villageDDMapper;
    @Autowired
    private AA10TABLEMapper aa10TABLEMapper;

    @Autowired
    private VillageBasicMapper villageBasicMapper;

    @Autowired
    private EqualsService equalsService;

    @Autowired
    private VillInfrastDDMapper villInfrastDDMapper;

    @Autowired
    private HelpUserMapper helpUserMapper;
    @Autowired
    private AA11DDMapper aa11DDMapper;
    @Autowired
    private AduitService aduitService;

    private Logger log=Logger.getLogger(this.getClass());

    /**
     * 村基础措施的查询展示
     * @param map
     * @return
     */
    @Override
    public ResultData villageBasic(Map<String, String> map) {

        if(map.get("year")==null || map.get("helpNumber")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        //得到帮扶干部编号，查询对应的村编号，根据编号去查询对应的结果值
        String aad001=villageDDMapper.findAAd001DD(map.get("helpNumber"));
        if(aad001==null)
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"false","暂无数据");
        }
        //得到编号后再去查询相应的村信息，与之对应的结果
        Map<String,String> mapVillage=new HashMap<>();
        mapVillage.put("year",map.get("year"));
        mapVillage.put("aad001",aad001);
        VillageNewModel villageDDModel=villageDDMapper.findVillageDD(mapVillage);
        Map<String,Object > mapReturn=new HashMap<>();
        if(villageDDModel==null)
        {
            return ResultData.returnResultData(ResultData.DATA_FALSE,"false");
        }
        else
        {
            //处理一些需要转化的数据
            if(villageDDModel.getAad328()!=null)
            {
                villageDDModel.setAad328(aa10TABLEMapper.isConcrete(villageDDModel.getAad328()));
            }
            if(villageDDModel.getAad323()!=null)
            {
                villageDDModel.setAad323(aa10TABLEMapper.isPassengerBus(villageDDModel.getAad323()));
            }
            if(villageDDModel.getAad004()!=null)
            {
                villageDDModel.setAad004(aa10TABLEMapper.VillageType(villageDDModel.getAad004()));
            }
            if(villageDDModel.getAad035()!=null)
            {
                villageDDModel.setAad035(aa10TABLEMapper.Development(villageDDModel.getAad035()));
            }
            if(villageDDModel.getAad036()!=null)
            {
                villageDDModel.setAad036(aa10TABLEMapper.Landform(villageDDModel.getAad036()));
            }
            if(villageDDModel.getAaf031()!=null)
            {
                villageDDModel.setAaf031(aa10TABLEMapper.Position(villageDDModel.getAaf031()));
            }
            mapReturn.put("PovertyVillageBasic",villageDDModel);
        }
        //判断是否未第一书记或者包村干部，下方展示对应的修改或者不修改
        if(villageDDMapper.isFirstOrBaocun(map.get("helpNumber"))==0)
        {
            mapReturn.put("isUpdate",0);
        }
        else
        {
            //最起码是第一书记或者包村干部
            //再看看是不是包村干部，如果是包村干部，第一书记有没有，没有就能修改，有就不能修改
            if(aduitService.IsBaocunSecretary(Long.valueOf(map.get("helpNumber")))==1L)
            {
                //是包村干部，要看这个村有没有第一书记
                if(aduitService.isFirstAduit(map.get("helpNumber"))>0)
                {
                    //存在第一书记，不用考虑有无审核信息
                    mapReturn.put("isUpdate",0);
                }
                else
                {
                    //没有第一书记，包村干部就可以修改
                    mapReturn.put("isUpdate",1);
                }
            }
            else
            {
                //不是包村干部，直接就是第一书记
                mapReturn.put("isUpdate",1);
            }
        }
        //添加省市县乡村
        Map mapName=villageDDMapper.findName(aad001);
        mapReturn.put("county",mapName);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",mapReturn);
    }

    /**
     * 修改信息，对信息分类存储
     * @param map
     * @param villageDDModel
     * @return
     */
    @Override
    public synchronized ResultData villageUpdate(Map<String, String> map, VillageNewModel villageNewModel) {

        if(map.get("helpNumber")==null || map.get("year")==null ||villageNewModel==null )
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        //根据编号查询对应的村编号
        String aad001=villageBasicMapper.findAad001(map.get("helpNumber"));
        map.put("aad001",aad001);
        Map<String,String> mapVillage=new HashMap<>();
        mapVillage.put("year",map.get("year"));
        mapVillage.put("aad001",aad001);
        VillageNewModel villageDD=villageDDMapper.findVillageDD(mapVillage);
        //以下无效
        /*villageDD.setAad328(aa10TABLEMapper.isConcrete(villageDD.getAad328()));
        villageDD.setAad323(aa10TABLEMapper.isPassengerBus(villageDD.getAad323()));
        villageDD.setAad004(aa10TABLEMapper.VillageType(villageDD.getAad004()));
        villageDD.setAad035(aa10TABLEMapper.Development(villageDD.getAad035()));
        villageDD.setAad036(aa10TABLEMapper.Landform(villageDD.getAad036()));
        villageDD.setAaf031(aa10TABLEMapper.Position(villageDD.getAaf031()));*/
        if(villageDD.getAad328()!=null)
        {
            villageDD.setAad328(aa10TABLEMapper.isConcrete(villageDD.getAad328()));
        }
        if(villageDD.getAad323()!=null)
        {
            villageDD.setAad323(aa10TABLEMapper.isPassengerBus(villageDD.getAad323()));
        }
        if(villageDD.getAad004()!=null)
        {
            villageDD.setAad004(aa10TABLEMapper.VillageType(villageDD.getAad004()));
        }
        if(villageDD.getAad035()!=null)
        {
            villageDD.setAad035(aa10TABLEMapper.Development(villageDD.getAad035()));
        }
        if(villageDD.getAad036()!=null)
        {
            villageDD.setAad036(aa10TABLEMapper.Landform(villageDD.getAad036()));
        }
        if(villageDD.getAaf031()!=null)
        {
            villageDD.setAaf031(aa10TABLEMapper.Position(villageDD.getAaf031()));
        }

        //判断两个是不是相等
        if(villageDD.equals(villageNewModel))
        {
            //相等
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"无修改信息");
        }
        else
        {
            //不相等
            //分类
            //基本信息
            VillageBasicDDModel oldVillageBasicDDModel=new VillageBasicDDModel(villageDD.getAar011(),villageDD.getAaf031(),villageDD.getAar012(),villageDD.getAad004(),villageDD.getAad035(),villageDD.getAad038(),villageDD.getAad037(),villageDD.getAad036());
            VillageBasicDDModel newVillageBasicDDModel=new VillageBasicDDModel(villageNewModel.getAar011(),villageNewModel.getAaf031(),villageNewModel.getAar012(),villageNewModel.getAad004(),villageNewModel.getAad035(),villageNewModel.getAad038(),villageNewModel.getAad037(),villageNewModel.getAad036());
            if(!oldVillageBasicDDModel.equals(newVillageBasicDDModel))
            {
                //不相等，处理
                Field fields[]= VillageBasicDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad01,ad10","基本信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageBasicDDModel,map,primaryNumber);
            }
            //土地信息
            VillageLandDDModel oldVillageLandDDModel=new VillageLandDDModel(villageDD.getAad019(),villageDD.getAad027(),villageDD.getAad021(),villageDD.getAad022(),villageDD.getAad023(),villageDD.getAad024(),villageDD.getAad025());
            VillageLandDDModel newVillageLandDDModel=new VillageLandDDModel(villageNewModel.getAad019(),villageNewModel.getAad027(),villageNewModel.getAad021(),villageNewModel.getAad022(),villageNewModel.getAad023(),villageNewModel.getAad024(),villageNewModel.getAad025());
            if(!oldVillageLandDDModel.equals(newVillageLandDDModel))
            {
                //不相等，处理
                Field fields[]= VillageLandDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","土地信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageLandDDModel,map,primaryNumber);

            }
            //人口信息
            VillagePersonDDModel oldVillagePersonDDModel=new VillagePersonDDModel(villageDD.getAad005(),villageDD.getAad006(),villageDD.getAad008(),villageDD.getAad009(),villageDD.getAad010(),villageDD.getAad012(),villageDD.getAad013(),villageDD.getAad014(),villageDD.getAad015(),villageDD.getAad016(),villageDD.getAad017(),villageDD.getAad018());
            VillagePersonDDModel newVillagePersonDDModel=new VillagePersonDDModel(villageNewModel.getAad005(),villageNewModel.getAad006(),villageNewModel.getAad008(),villageNewModel.getAad009(),villageNewModel.getAad010(),villageNewModel.getAad012(),villageNewModel.getAad013(),villageNewModel.getAad014(),villageNewModel.getAad015(),villageNewModel.getAad016(),villageNewModel.getAad017(),villageNewModel.getAad018());
            if(!oldVillagePersonDDModel.equals(newVillagePersonDDModel))
            {
                //不相等，处理
                Field fields[]= VillagePersonDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad32,ad10","人口信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillagePersonDDModel,map,primaryNumber);

            }
            //收入信息
            VillageIncomeDDModel oldVillageIncomeDDModel=new VillageIncomeDDModel(villageDD.getAad301(),villageDD.getAad302());
            VillageIncomeDDModel newVillageIncomeDDModel=new VillageIncomeDDModel(villageNewModel.getAad301(),villageNewModel.getAad302());
            if(!oldVillageIncomeDDModel.equals(newVillageIncomeDDModel))
            {
                //不相等，处理
                Field fields[]= VillageIncomeDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","收入信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageIncomeDDModel,map,primaryNumber);

            }
            //社会保障信息（卫计）
            SocialSecurityWeiModel oldSocialSecurityWeiModel=new SocialSecurityWeiModel(villageDD.getAad311());
            SocialSecurityWeiModel newSocialSecurityWeiModel=new SocialSecurityWeiModel(villageNewModel.getAad311());
            if(!oldSocialSecurityWeiModel.equals(newSocialSecurityWeiModel))
            {
                //不相等，处理
                Field fields[]= SocialSecurityWeiModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","社会保障信息(卫计)");
                Integer num=equalsService.InsertNotVillage(fields,oldSocialSecurityWeiModel,map,primaryNumber);
            }
            //社会保障信息（人社）
            SocialSecurityRenModel oldSocialSecurityRenModel=new SocialSecurityRenModel(villageDD.getAad313());
            SocialSecurityRenModel newSocialSecurityRenModel=new SocialSecurityRenModel(villageNewModel.getAad313());
            if(!oldSocialSecurityRenModel.equals(newSocialSecurityRenModel))
            {
                //不相等，处理
                Field fields[]= SocialSecurityRenModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","社会保障信息(人社)");
                Integer num=equalsService.InsertNotVillage(fields,oldSocialSecurityRenModel,map,primaryNumber);
            }
            //村级道路通畅
            VillageLevelModel oldVillageLevelModel=new VillageLevelModel(villageDD.getAad328(),villageDD.getAad323());
            VillageLevelModel newVillageLevelModel=new VillageLevelModel(villageNewModel.getAad328(),villageNewModel.getAad323());
            if(!oldVillageLevelModel.equals(newVillageLevelModel))
            {
                //不相等，处理
                Field fields[]= VillageLevelModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","村级道路通畅");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageLevelModel,map,primaryNumber);
            }
            //饮水安全
            VillageWaterDDModel oldVillageWaterDDModel=new VillageWaterDDModel(villageDD.getAad331(),villageDD.getAad332());
            VillageWaterDDModel newVillageWaterDDModel=new VillageWaterDDModel(villageNewModel.getAad331(),villageNewModel.getAad332());
            if(!oldVillageWaterDDModel.equals(newVillageWaterDDModel))
            {
                //不相等，处理
                Field fields[]= VillageWaterDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad32","安全饮水");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageWaterDDModel,map,primaryNumber);
            }
            //农村电力保障
            VillageEliticDDModel oldVillageEliticDDModel=new VillageEliticDDModel(villageDD.getAad358());
            VillageEliticDDModel newVillageEliticDDModel=new VillageEliticDDModel(villageNewModel.getAad358());
            if(!oldVillageEliticDDModel.equals(newVillageEliticDDModel))
            {
                //不相等，处理
                Field fields[]= VillageEliticDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","农村电力保障");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageEliticDDModel,map,primaryNumber);
            }
            //危房改造
            VillageDangerModel oldVillageDangerModel=new VillageDangerModel(villageDD.getAad361());
            VillageDangerModel newVillageDangerModel=new VillageDangerModel(villageNewModel.getAad361());
            if(!oldVillageDangerModel.equals(newVillageDangerModel))
            {
                //不相等，处理
                Field fields[]= VillageDangerModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad32","危房改造");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageDangerModel,map,primaryNumber);
            }
            //特色产业增收
            VillageSpecialModel oldVillageSpecialModel=new VillageSpecialModel(villageDD.getAad371());
            VillageSpecialModel newVillageSpecialModel=new VillageSpecialModel(villageNewModel.getAad371());
            if(!oldVillageSpecialModel.equals(newVillageSpecialModel))
            {
                //不相等，处理
                Field fields[]= VillageSpecialModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","特色产业增收");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageSpecialModel,map,primaryNumber);
            }
            //乡村旅游
            VillageTravelDDModel oldVillageTravelDDModel=new VillageTravelDDModel(villageDD.getAad381(),villageDD.getAad383(),villageDD.getAad382(),villageDD.getAad384());
            VillageTravelDDModel newVillageTravelDDModel=new VillageTravelDDModel(villageNewModel.getAad381(),villageNewModel.getAad383(),villageNewModel.getAad382(),villageNewModel.getAad384());
            if(!oldVillageTravelDDModel.equals(newVillageTravelDDModel))
            {
                //不相等，处理
                Field fields[]= VillageTravelDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","乡村旅游");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageTravelDDModel,map,primaryNumber);
            }
            //卫生和计划生育
            VillageHygieneDDModel oldVillageHygieneDDModel=new VillageHygieneDDModel(villageDD.getAad391(),villageDD.getAad392(),villageDD.getAad393(),villageDD.getAad394());
            VillageHygieneDDModel newVillageHygieneDDModel=new VillageHygieneDDModel(villageNewModel.getAad391(),villageNewModel.getAad392(),villageNewModel.getAad393(),villageNewModel.getAad394());
            if(!oldVillageHygieneDDModel.equals(newVillageHygieneDDModel))
            {
                //不相等，处理
                Field fields[]= VillageHygieneDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","卫生和计划教育");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageHygieneDDModel,map,primaryNumber);
            }
            //文化建设
            VillageCultureModel oldVillageCultureModel=new VillageCultureModel(villageDD.getAad401());
            VillageCultureModel newVillageCultureModel=new VillageCultureModel(villageNewModel.getAad401());
            if(!oldVillageCultureModel.equals(newVillageCultureModel))
            {
                //不相等，处理
                Field fields[]= VillageCultureModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","文化建设");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageCultureModel,map,primaryNumber);
            }
            //贫困村信息化
            VillageInfoDDModel oldVillageInfoDDModel=new VillageInfoDDModel(villageDD.getAad411(),villageDD.getAad413(),villageDD.getAad412(),villageDD.getAad414());
            VillageInfoDDModel newVillageInfoDDModel=new VillageInfoDDModel(villageNewModel.getAad411(),villageNewModel.getAad413(),villageNewModel.getAad412(),villageNewModel.getAad414());
            if(!oldVillageInfoDDModel.equals(newVillageInfoDDModel))
            {
                //不相等，处理
                Field fields[]= VillageInfoDDModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","贫困村信息化");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageInfoDDModel,map,primaryNumber);
            }
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"修改成功",1);

        }

    }

    @Override
    public ResultData villageUpdateBasic(Map<String, String> mapUpdate, VillInfrastDD villInfrastDD) {

        if(mapUpdate.get("helpNumber")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        //先根据帮扶干部编号去查询对应的市县村名称，在进行查询
        Map map =helpUserMapper.findVillageName(mapUpdate.get("helpNumber"));
        //log.info("map里面是个什么东西"+map.toString());
        if(map!=null) {
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
            //查询到新的信息和老的信息进行组合比较查询是否相等
            if(villageStatisticsDto.equals(villInfrastDD))
            {
                //相等
                return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",1);
            }
            else
            {
                //不相等，就要找出不相等的东西来

            }



        }
        return null;
    }

    /**
     * 辅助类，新措施和旧措施的比较，针对不相同的要进行添加按钮
     * @param oldVillInfrastDD
     * @param newVillInfrastDD
     * @return
     */
    public Integer compareNoEqual(VillInfrastDD oldVillInfrastDD,VillInfrastDD newVillInfrastDD)
    {
        if(!oldVillInfrastDD.getId().equals(newVillInfrastDD.getId()))
        {
            //添加

        }
        if(!oldVillInfrastDD.getConsContE().equals(newVillInfrastDD.getConsContE()))
        {

            //添加
        }
        if(!oldVillInfrastDD.getConstrNum().equals(newVillInfrastDD.getConstrNum()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getDistrictName().equals(newVillInfrastDD.getDistrictName()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getTownName().equals(newVillInfrastDD.getTownName()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getVillageName().equals(newVillInfrastDD.getVillageName()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getIsVillRoad().equals(newVillInfrastDD.getIsVillRoad()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getNoaccessMileage().equals(newVillInfrastDD.getNoaccessMileage()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getOilToSandNum().equals(newVillInfrastDD.getOilToSandNum()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getIsOilToSand().equals(newVillInfrastDD.getIsOilToSand()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getIsFocusWater().equals(newVillInfrastDD.getIsFocusWater()))
        {
            //添加
        }
        if(!oldVillInfrastDD.getIsTapWater().equals(newVillInfrastDD.getIsTapWater()))
        {
            //添加
        }
        if(oldVillInfrastDD.getIsNatuProPow().equals(newVillInfrastDD.getIsNatuProPow()))
        {
            //添加
        }
        if(oldVillInfrastDD.getIsPovProPow().equals(newVillInfrastDD.getIsPovProPow()))
        {
            //添加
        }
        if(oldVillInfrastDD.getElectRemarks().equals(newVillInfrastDD.getElectRemarks()))
        {
            //添加
        }
        if(oldVillInfrastDD.getZoneYear().equals(newVillInfrastDD.getZoneYear()))
        {
            //添加
        }

        return 1;

    }
}
