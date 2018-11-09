package com.sysh.service.impl;

import com.sysh.dto.*;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.AK11AC08DD;
import com.sysh.entity.helpmea.*;
import com.sysh.entity.update.*;
import com.sysh.mapper.*;
import com.sysh.service.*;
import com.sysh.util.DateUtil;
import com.sysh.util.ResultData;
import com.sysh.util.time.TimeUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import static sun.java2d.cmm.ColorTransform.In;

/**
 * ClassName:  <br/>
 * Function: 实现信息的审核预处理，分类存放<br/>
 * date: 2018年06月12日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class InfoUpdateServiceImpl implements InfoUpdateService {

    Logger log=Logger.getLogger(this.getClass());
    @Autowired
    private PovertyDetailsService povertyDetailsService;
    @Autowired
    private Sh01DDMapper sh01DDMapper;
    @Autowired
    private Sh02DDMapper sh02DDMapper;
    @Autowired
    private EqualsService equalsService;
    @Autowired
    private ImmigrantRelocationDDMapper immigrantRelocationDDMapper;
    @Autowired
    private ReconstDangerDDMapper reconstDangerDDMapper;
    @Autowired
    private EcologicalPovertyDDMapper ecologicalPovertyDDMapper;
    @Autowired
    private FinanceDDMapper financeDDMapper;
    @Autowired
    private EducationDDMapper educationDDMapper;
    @Autowired
    private HealthDDMapper healthDDMapper;
    @Autowired
    private BottomGuaranteeCivilDDMapper bottomGuaranteeCivilDDMapper;
    @Autowired
    private BottomDisabledDDMapper bottomDisabledDDMapper;
    @Autowired
    private EmploymentDDMapper employmentDDMapper;
    @Autowired
    private IdstProjwayDDMapper idstProjwayDDMapper;
    @Autowired
    private AB10DDMapper ab10DDMapper;
    @Autowired
    private VillageBasicMapper villageBasicMapper;
    @Autowired
    private PovertyVillageService povertyVillageService;
    @Autowired
    private HelpUserService helpUserService;
    @Autowired
    private HelpDDMapper helpDDMapper;


    /**
     * 添加基础信息审核
     * @param map
     * @return
     */
    @Override
    public synchronized Integer insertExamine(Map<String, String> map,AC01Basic ac01Basic) {

        //从你传入的编号中查找数据库内部的东西，
        AC01Basic ac01Basic1=povertyDetailsService.selectAC01Basic(Long.parseLong(map.get("povertyNumber")));
        //新传上来的ac01Basic
        //通过类的反射机制获得类中的每个属性
        //类中的每个值进行比较
        log.info("插入的数据"+ac01Basic.toString());
        log.info("库中的数据"+ac01Basic1.toString());

        if(ac01Basic.equals(ac01Basic1))
        {
            log.info("两个相等");
            return 0;
        }
        else
        {
            log.info("两个不相等");
            //不同，首先插入一条信息代表新增，
            //PovertyBasicInfoModel povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("povertyNumber")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDate()),"ac01","基础信息");
            Long primaryNumber=equalsService.insertSh01( map,"ac01","基础信息");
            Field fields[]= AC01Basic.class.getDeclaredFields();
            Integer num=equalsService.InsertNotEquals(fields,ac01Basic1,map,primaryNumber);
            return num;


        }
    }

    /**
     * 修改收入信息
     * @param map
     * @param povertyIncomeDto
     * @return
     */
    @Override
    public synchronized Integer insertIncome(Map<String, String> map, PovertyIncomeDto povertyIncomeDto) {
        PovertyIncomeDto povertyIncomeDto1=povertyDetailsService.selectPovertyIncome(Long.parseLong(map.get("povertyNumber")));
        if(povertyIncomeDto.equals(povertyIncomeDto1))
        {
            return 0;
        }
        else
        {
            log.info("不相等");
            Field fields[]= PovertyIncomeDto.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertSh01( map,"ac07","收入信息");
            log.info("已经到达最后一步");

            Integer num=equalsService.InsertNotEquals(fields,povertyIncomeDto1,map,primaryNumber);
            return num;
        }
    }

    /**
     * 添加生产信息
     * @param map
     * @param povertyProduceDto
     * @return
     */
    @Override
    public synchronized Integer insertProduce(Map<String, String> map, PovertyProduceDto povertyProduceDto) {

        PovertyProduceDto povertyProduceDto1=povertyDetailsService.selectPovertyProduce(Long.parseLong(map.get("povertyNumber")));
        if(povertyProduceDto.equals(povertyProduceDto1))
        {
            log.info("相等");
            return 0;
        }
        else
        {
            log.info("不相等");
            Field fields[]= PovertyProduceDto.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertSh01( map,"ac30,ac40,cr17","生产生活");
            log.info("已经到达最后一步");
            Integer num=equalsService.InsertNotEquals(fields,povertyProduceDto1,map,primaryNumber);
            return num;
        }
    }

    /**
     * 家庭成员详情修改
     * @param map
     * @param ab10_ab01Dto
     * @return
     */
    @Override
    public synchronized Integer insertFamilyInfo(Map<String, String> map, AB10_AB01Dto ab10_ab01Dto) {

        //得到的是贫困户编号，要根据证件号码，转化成贫困人口编号
        String s =ab10DDMapper.findAab001(ab10_ab01Dto.getAab004());

        AB10_AB01Dto ab10_ab01Dto1=povertyDetailsService.selectFamilyIfo(Long.parseLong(s));
        if(ab10_ab01Dto.equals(ab10_ab01Dto1))
        {
            log.info("相等");
            return 0;
        }
        else
        {
            log.info("不相等");
            Field fields[]= AB10_AB01Dto.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertSh01( map,"ab10,ab01","家庭成员");
            log.info("已经到达最后一步");
            Integer num=equalsService.InsertNotEquals(fields,ab10_ab01Dto1,map,primaryNumber);
            return num;
        }
    }

    /**
     * 危房改造，根据前端传递得身份证号进行修改，（修改用编号确定唯一）
     * @param map
     * @param immigrantRelocationDD
     * @return
     */
    @Override
    public synchronized Integer insertImmigrantRelocation(Map<String, String> map, ImmigrantRelocationDD immigrantRelocationDD) {

        ImmigrantRelocationDD immigrantRelocationDD1=immigrantRelocationDDMapper.findImmRelocationByID1(String.valueOf(immigrantRelocationDD.getId()));
        if(immigrantRelocationDD1.equals(immigrantRelocationDD))
        {
            //
            return 0;
        }
        else
        {
            Field fields[]= ImmigrantRelocationDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_immigrant_relocation","易地搬迁");
            log.info("插入前的内容"+immigrantRelocationDD1.toString());
            Integer num=equalsService.InsertNotEqualsEight(fields,immigrantRelocationDD1,map,primaryNumber,"tbl_immigrant_relocation");
            return num;
        }
    }

    /**
     * 危房改造
     * @param map
     * @param reconstDangerDD
     * @return
     */
    @Override
    public synchronized Integer insertReconstDanger(Map<String, String> map, ReconstDangerDD reconstDangerDD) {
        ReconstDangerDD reconstDangerDD1=reconstDangerDDMapper.findReconstDangerByID1(String.valueOf(reconstDangerDD.getId()));
        if(reconstDangerDD1.equals(reconstDangerDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= ReconstDangerDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_reconst_danger","危房改造");
            Integer num=equalsService.InsertNotEqualsEight(fields,reconstDangerDD1,map,primaryNumber,"tbl_reconst_danger");
            return num;
        }
    }

    /**
     * 生态扶贫统计表
     * @param map
     * @param ecologicalPovertyDD
     * @return
     */
    @Override
    public synchronized Integer insertEcologicalPoverty(Map<String, String> map, EcologicalPovertyDD ecologicalPovertyDD) {
        EcologicalPovertyDD ecologicalPovertyDD1=ecologicalPovertyDDMapper.findEcologicalPovertyByID1(String.valueOf(ecologicalPovertyDD.getId()));
        if(ecologicalPovertyDD1.equals(ecologicalPovertyDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= EcologicalPovertyDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_ecological_poverty","生态扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,ecologicalPovertyDD1,map,primaryNumber,"tbl_ecological_poverty");
            return num;
        }
    }

    /**
     * 金融扶贫
     * @param map
     * @param financeDD
     * @return
     */
    @Override
    public synchronized Integer insertFinance(Map<String, String> map, FinanceDD financeDD) {

        FinanceDD financeDD1=financeDDMapper.findFinanceByid1(String.valueOf(financeDD.getId()));

        if(financeDD1.equals(financeDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= FinanceDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_finance","金融扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,financeDD1,map,primaryNumber,"tbl_finance");
            return num;
        }



    }

    /**
     * 教育扶贫统计表
     * @param map
     * @param educationDD
     * @return
     */
    @Override
    public synchronized Integer insertEducation(Map<String, String> map, EducationDD educationDD) {
        EducationDD educationDD1=educationDDMapper.findEducationByid1(String.valueOf(educationDD.getId()));
        log.info(""+educationDD.getId());
        if(educationDD1.equals(educationDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= FinanceDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_education","教育扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,educationDD1,map,primaryNumber,"tbl_education");
            return num;
        }
    }

    /**
     * 健康扶贫统计表
     * @param map
     * @param healthDD
     * @return
     */
    @Override
    public synchronized Integer insertHealth(Map<String, String> map, HealthDD healthDD) {

        HealthDD healthDD1=healthDDMapper.findHealthByid1(String.valueOf(healthDD.getId()));

        if(healthDD1.equals(healthDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= HealthDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_health","健康扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,healthDD1,map,primaryNumber,"tbl_health");
            return num;
        }
    }

    /**
     * 兜底保障民政（每个人，单个修改单个的上传）
     * @param map
     * @param bottomGuaranteeCivilDD
     * @return
     */
    @Override
    public synchronized Integer insertBottomGuaranteeCivil(Map<String, String> map, BottomGuaranteeCivilDD bottomGuaranteeCivilDD) {
        BottomGuaranteeCivilDD bottomGuaranteeCivilDD1=bottomGuaranteeCivilDDMapper.findBottomCivilByIdNumber1(String.valueOf(bottomGuaranteeCivilDD.getId()));
            if(bottomGuaranteeCivilDD1.equals(bottomGuaranteeCivilDD))
            {
                return 0;
            }
            else
            {
                Field fields[]= BottomGuaranteeCivilDD.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertEight( map,"tbl_bottom_guarantee_civil","兜底保障");
                Integer num=equalsService.InsertNotEqualsEight(fields,bottomGuaranteeCivilDD1,map,primaryNumber,"tbl_bottom_guarantee_civil");
                return num;
            }
    }

    /**
     * 兜底保障残疾（每个人）
     * @param map
     * @param bottomDisabledDD
     * @return
     */
    @Override
    public synchronized Integer insertBottomDisAbled(Map<String, String> map, BottomDisabledDD bottomDisabledDD) {
       BottomDisabledDD bottomDisabledDD1=bottomDisabledDDMapper.findBottomDisabledByid1(String.valueOf(bottomDisabledDD.getId()));
        if(bottomDisabledDD1.equals(bottomDisabledDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= BottomDisabledDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_bottom_disabled","兜底保障");
            Integer num=equalsService.InsertNotEqualsEight(fields,bottomDisabledDD1,map,primaryNumber,"tbl_bottom_disabled");
            return num;
        }
    }

    /**
     * 就业创业（也是针对每个人）
     * @param map
     * @param employmentDD
     * @return
     */
    @Override
    public synchronized Integer insertEmployee(Map<String, String> map, EmploymentDD employmentDD) {
        EmploymentDD employmentDD1=employmentDDMapper.findEmployByIdNumber1(String.valueOf(employmentDD.getId()));
        if(employmentDD1.equals(employmentDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= EmploymentDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_employment","就业创业");
            Integer num=equalsService.InsertNotEqualsEight(fields,employmentDD1,map,primaryNumber,"tbl_employment");
            return num;
        }
    }

    @Override
    public synchronized Integer insertIdstProjway(Map<String, String> map, IdstProjwayDD idstProjwayDD) {
        IdstProjwayDD idstProjwayDD1=idstProjwayDDMapper.findIdstProjwayByidNumber1(String.valueOf(idstProjwayDD.getId()));
        if(idstProjwayDD1.equals(idstProjwayDD))
        {
            return 0;
        }
        else
        {
            Field fields[]= IdstProjwayDD.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_idst_projway","产业扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,idstProjwayDD1,map,primaryNumber,"tbl_idst_projway");
            return num;
        }
    }

    /**
     * 村信息的修改
     * @param map
     * @param villageBasicDto
     * @return
     */
    @Override
    public synchronized Integer insertupdateVillage(Map<String, String> map, VillageBasicDto villageBasicDto) {

        String aad001=villageBasicMapper.findAad001(map.get("helpNumber"));
        map.put("aad001",aad001);
        VillageBasicDto villageBasicDto1=povertyVillageService.findVillageBasic(Long.parseLong(aad001));
        log.info("从外部接收的map数据"+map.toString());
        log.info("从外部接收的类数据"+villageBasicDto.toString());
        log.info("从内部查询的数据"+villageBasicDto1.toString());
        if(villageBasicDto1.equals(villageBasicDto))
        {
            return 0;
        }
        else
        {
            /*Field fields[]= VillageBasicDto.class.getDeclaredFields();
            Long primaryNumber=equalsService.insertEight( map,"tbl_idst_projway","产业扶贫");
            Integer num=equalsService.InsertNotEqualsEight(fields,idstProjwayDD1,map,primaryNumber,"tbl_idst_projway");
            return num;*/

            //有问题，要修改，先判断是那些指标项
            //String[] s={"aar011","aar012","aad004","aaf031","aad035","aad036","aar101","aar102"};//基本信息
            VillageBasicModel OldvillageBasicModel=new VillageBasicModel(villageBasicDto1.getAar011(),villageBasicDto1.getAar012(),villageBasicDto1.getAad004(),villageBasicDto1.getAaf031(),villageBasicDto1.getAad035(),villageBasicDto1.getAad036(),villageBasicDto1.getAar101(),villageBasicDto1.getAar102());
            VillageBasicModel NewvillageBasicModel=new VillageBasicModel(villageBasicDto.getAar011(),villageBasicDto.getAar012(),villageBasicDto.getAad004(),villageBasicDto.getAaf031(),villageBasicDto.getAad035(),villageBasicDto.getAad036(),villageBasicDto.getAar101(),villageBasicDto.getAar102());
            if(!OldvillageBasicModel.equals(NewvillageBasicModel))
            {
                //不相等，处理
                Field fields[]= VillageBasicModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad01,ad10","基础信息");
                Integer num=equalsService.InsertNotVillage(fields,OldvillageBasicModel,map,primaryNumber);
            }

            VillageLandModel oldVillageLandModel=new VillageLandModel(villageBasicDto1.getAad019(),villageBasicDto1.getAad027(),villageBasicDto1.getAad021(),villageBasicDto1.getAad022(),villageBasicDto1.getAad023(),villageBasicDto1.getAad024(),villageBasicDto1.getAad025());
            VillageLandModel newVillageLandModel=new VillageLandModel(villageBasicDto.getAad019(),villageBasicDto.getAad027(),villageBasicDto.getAad021(),villageBasicDto.getAad022(),villageBasicDto.getAad023(),villageBasicDto.getAad024(),villageBasicDto.getAad025());
            if(!oldVillageLandModel.equals(newVillageLandModel))
            {
                //不相等，处理
                Field fields[]= VillageLandModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","土地信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageLandModel,map,primaryNumber);
            }


            //String[] ss={"aad019","aad027","aad021","aad022","aad023","aad024","aad025"};//土地信息
            VillageIncomeModel oldVillageIncomeModel=new VillageIncomeModel(villageBasicDto1.getAad301(),villageBasicDto1.getAad302());
            VillageIncomeModel newVillageIncomeModel=new VillageIncomeModel(villageBasicDto.getAad301(),villageBasicDto.getAad302());
            if(!oldVillageIncomeModel.equals(newVillageIncomeModel))
            {
                //不相等，处理
                Field fields[]= VillageIncomeModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","收入信息");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageIncomeModel,map,primaryNumber);
            }
            //String[] sss={"aad005","aad006","aad008","aad009","aad012","aad013","aad014","aad015","aad016","aad018"};//人口信息
            //String[] ssss={"aad301","aad302"};//ad10收入信息
            //String[] s5={"aad391","aad392","aad393","aad394","aad371","aad381","aad382","aad383","aad384","aad401","aad412","aad414","aad328","aad311","aad313","aad314","aad323","aad358","aad413"};//十个美丽
            VillageTenModel oldVillageTenModel=new VillageTenModel(villageBasicDto1.getAad391(),villageBasicDto1.getAad392(),villageBasicDto1.getAad393(),villageBasicDto1.getAad394(),villageBasicDto1.getAad371(),villageBasicDto1.getAad381(),villageBasicDto1.getAad382(),villageBasicDto1.getAad383(),villageBasicDto1.getAad384(),villageBasicDto1.getAad401(),villageBasicDto1.getAad412(),villageBasicDto1.getAad414(),villageBasicDto1.getAad328(),villageBasicDto1.getAad311(),villageBasicDto1.getAad313(),villageBasicDto1.getAad314(),villageBasicDto1.getAad323(),villageBasicDto1.getAad358(),villageBasicDto1.getAad413(),villageBasicDto1.getAad331(),villageBasicDto1.getAad332(),villageBasicDto1.getAad361());
            VillageTenModel newVillageTenModel=new VillageTenModel(villageBasicDto.getAad391(),villageBasicDto.getAad392(),villageBasicDto.getAad393(),villageBasicDto.getAad394(),villageBasicDto.getAad371(),villageBasicDto.getAad381(),villageBasicDto.getAad382(),villageBasicDto.getAad383(),villageBasicDto.getAad384(),villageBasicDto.getAad401(),villageBasicDto.getAad412(),villageBasicDto.getAad414(),villageBasicDto.getAad328(),villageBasicDto.getAad311(),villageBasicDto.getAad313(),villageBasicDto.getAad314(),villageBasicDto.getAad323(),villageBasicDto.getAad358(),villageBasicDto.getAad413(),villageBasicDto.getAad331(),villageBasicDto.getAad332(),villageBasicDto.getAad361());
            if(!oldVillageTenModel.equals(newVillageTenModel))
            {
                //不相等，处理
                Field fields[]= VillageTenModel.class.getDeclaredFields();
                Long primaryNumber=equalsService.insertVillage( map,"ad10","十项重点工作");
                Integer num=equalsService.InsertNotVillage(fields,oldVillageTenModel,map,primaryNumber);
            }
            return 1;

        }
    }

    @Override
    public synchronized ResultData  insertHelpNumberDetail(Map<String, String> map, AK11AC08DD newAk11AC08DD) {

        //开始处理一些问题
        //先去查询库中的数据，对比两个对象是否相等
        AK11AC08DD oldAk11AC08DD=(AK11AC08DD) helpUserService.helpNumberDetail(map).getData();
        if(oldAk11AC08DD.equals(newAk11AC08DD))
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"1");
        }
        //两个不，开始处理
        //先插入一条数据，记录本次帮扶责任人的信息采集
        /* Map mapHelpReview=new HashMap();
        mapHelpReview.put("helpNumber",map.get("helpNumber"));
        mapHelpReview.put("updateTime", TimeUtil.dateFormatYYMMDD());
        mapHelpReview.put("povertyNumber",map.get("povertyNumber"));*/
        InsertHelpReview insertHelpReview=new InsertHelpReview("0",map.get("helpNumber"),TimeUtil.dateFormatYYMMDD(),map.get("povertyNumber"));
        Integer num=helpDDMapper.insertHelpReview(insertHelpReview);
        log.info("id的主键是多少"+insertHelpReview.getId());
        Long primary=Long.valueOf(insertHelpReview.getId());
        //开始对比是否相等
        Field fields[]= AK11AC08DD.class.getDeclaredFields();
        //Long primaryNumber=equalsService.insertVillage( map,"ak11,ac08","");
        //处理数据相互之间的问题
        if(num==1)
        {
            Integer insertNum=equalsService.InsertNotHelpNumber(fields,oldAk11AC08DD,map,primary);
            if(insertNum==1)
            {
                return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",1);
            }
        }
        return ResultData.returnResultData(ResultData.DATA_FALSE,"修改失败");
    }

    /*public synchronized Integer insertHelpNumber(AK11AC08DD oldAK11AC08DD,AK11AC08DD newAK11AC08DD,Long primary)
    {
        Map<String,String> map=new HashMap<>();
        map.put("helpReviewId",primary.toString());
        if(!oldAK11AC08DD.getAab002().equals(newAK11AC08DD.getAab002()))
        {
            //添加
            map.put("updateBefore",oldAK11AC08DD.getAab002());
            map.put("updateAfter",newAK11AC08DD.getAab002());
            map.put("updateField","aab002");
            map.put("realName","姓名");
            Integer num=helpDDMapper.insertHelpInfo(map);

        }

        if(oldAK11AC08DD.getAab003()!=null &&!oldAK11AC08DD.getAab003().equals(newAK11AC08DD.getAab003()))
        {
            //添加
            map.put("updateBefore",oldAK11AC08DD.getAab003());
            map.put("updateAfter",newAK11AC08DD.getAab003());
            map.put("updateField","aab003");
            map.put("realName","性别");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAap001().equals(newAK11AC08DD.getAap001()))
        {
            //添加
            map.put("updateBefore",oldAK11AC08DD.getAap001());
            map.put("updateAfter",newAK11AC08DD.getAap001());
            map.put("updateField","aap001");
            map.put("realName","单位名称");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAak888().equals(newAK11AC08DD.getAak888()))
        {
            //添加
            map.put("updateBefore",oldAK11AC08DD.getAak888());
            map.put("updateAfter",newAK11AC08DD.getAak888());
            map.put("updateField","aak888");
            map.put("realName","派出单位职务");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAab004().equals(newAK11AC08DD.getAab004()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAab004());
            map.put("updateAfter",newAK11AC08DD.getAab004());
            map.put("updateField","aab004");
            map.put("realName","证件号码");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAar012().equals(newAK11AC08DD.getAar012()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAar012());
            map.put("updateAfter",newAK11AC08DD.getAar012());
            map.put("updateField","aar012");
            map.put("realName","联系电话");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAak033().equals(newAK11AC08DD.getAak033()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAak033());
            map.put("updateAfter",newAK11AC08DD.getAak033());
            map.put("updateField","aak033");
            map.put("realName","政治面貌");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAak036().equals(newAK11AC08DD.getAak036()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAak036());
            map.put("updateAfter",newAK11AC08DD.getAak036());
            map.put("updateField","aak036");
            map.put("realName","学历");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAak037().equals(newAK11AC08DD.getAak037()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAak037());
            map.put("updateAfter",newAK11AC08DD.getAak037());
            map.put("updateField","aak037");
            map.put("realName","技术特长");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAac029().equals(newAK11AC08DD.getAac029()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAac029());
            map.put("updateAfter",newAK11AC08DD.getAac029());
            map.put("updateField","aac029");
            map.put("realName","户主姓名");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAac001().equals(newAK11AC08DD.getAac001()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAac001());
            map.put("updateAfter",newAK11AC08DD.getAac001());
            map.put("updateField","aac001");
            map.put("realName","户主编号");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAar020().equals(newAK11AC08DD.getAar020()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAar020());
            map.put("updateAfter",newAK11AC08DD.getAar020());
            map.put("updateField","aar020");
            map.put("realName","开始时间");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        if(!oldAK11AC08DD.getAar021().equals(newAK11AC08DD.getAar021()))
        {
            map.put("updateBefore",oldAK11AC08DD.getAar021());
            map.put("updateAfter",newAK11AC08DD.getAar021());
            map.put("updateField","aar021");
            map.put("realName","结束时间");
            Integer num=helpDDMapper.insertHelpInfo(map);
        }
        return 1;
    }*/
}
