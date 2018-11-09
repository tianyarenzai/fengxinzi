package com.sysh.service.impl;

import com.sysh.dto.*;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.AC01Part;
import com.sysh.entity.AK11DD;
import com.sysh.entity.helpmea.ImmigrantRelocationDD;
import com.sysh.mapper.*;
import com.sysh.service.PovertyDetailsService;
import com.sysh.util.DateUtil;
import com.sysh.util.IDNumberUtil;
import com.sysh.util.PovertyDetailUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.net.IDN;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:  <br/>
 * Function: 详情页<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class PovertyDetailsServiceImpl implements PovertyDetailsService {
    @Autowired
    private AC01DtoMapper ac01Mapper;
    @Autowired
    private AA10TABLEMapper aa10TABLEMapper;
    @Autowired
    private AC01BasicMapper ac01BasicMapper;
    @Autowired
    private AC07DDMapper ac07Mapper;
    @Autowired
    private AC30DingDingMapper ac30Mapper;
    @Autowired
    private AF02DDMapper af02Mapper;
    @Autowired
    private AB10DDMapper ab10Mapper;
    @Autowired
    private AB01DDMapper ab01Mapper;
    @Autowired
    private AB10AB01Mapper ab10_ab01Mapper;
    @Autowired
    private AC01AK11Mapper ac01AK11Mapper;
    @Autowired
    private ImmigrantRelocationDDMapper immigrantRelocationDDMapper;
    @Autowired
    private AA11DDMapper aa11DDMapper;
    @Autowired
    private HealthFamilyMapper healthFamilyMapper;
    @Autowired
    private AK11DDMapper ak11DDMapper;

    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * 查询贫困户收入情况
     *
     * @param num
     * @return
     */
    @Override
    public PovertyIncomeDto selectPovertyIncome(Long num) {

        return ac07Mapper.findIncome(num);
    }

    /**
     * 五项退出指标达标情况
     *
     * @param num
     * @return
     */
    @Override
    public FiveExitDto selectFivePoverty(Long num) {

        FiveExitDto fiveExitDto = new FiveExitDto();
        //查询收入情况
        Long s = ac07Mapper.findPersonAverage(num).longValue();

        if (s > 3070) {
            //收入达标
            fiveExitDto.setIncome(String.valueOf(s));
            fiveExitDto.setIncomeScore("20");
            fiveExitDto.setIsReachTheStandard("已达标");
        } else {
            fiveExitDto.setIncome(String.valueOf(s));
            fiveExitDto.setIncomeScore("0");
            fiveExitDto.setIsReachTheStandard("未达标");
        }


        //安全饮水和安全住房
        SafeWaterAndSafeHOuseDto swasg = ac30Mapper.findSafeWater(num);

        if ("0".equals(swasg.getAac311()) && "1".equals(swasg.getAac312())) {
            fiveExitDto.setIsDifficuly("否");
            fiveExitDto.setIsSafeWater("是");
            fiveExitDto.setIsWater("有");
            fiveExitDto.setWaterScore("20");
        } else {
            if ("1".equals(swasg.getAac311())) {
                fiveExitDto.setIsDifficuly("否");
            } else {
                fiveExitDto.setIsDifficuly("是");
            }
            if ("1".equals(swasg.getAac312())) {
                fiveExitDto.setIsSafeWater("是");
            } else {
                fiveExitDto.setIsSafeWater("否");
            }
            fiveExitDto.setIsWater("无");
            fiveExitDto.setWaterScore("0");
        }
        //安全住房
        if ("0".equals(swasg.getAac318())) {
            System.out.println(swasg.getAac318());
            fiveExitDto.setIsSafeHouse("否");
            fiveExitDto.setIsReach("否");
            fiveExitDto.setHouseScore("20");
        } else {
            fiveExitDto.setIsSafeHouse("是");
            fiveExitDto.setIsReach("是");
            fiveExitDto.setHouseScore("0");
        }


        //家庭成员是否参加新农合
        List<String> list = ab01Mapper.IsJoin(num);
        Boolean flag = true;

        for (int i = 0; i < list.size(); i++) {
            if ("0".equals(list.get(i))) {
                flag = false;


                break;
            } else {
                flag = true;
            }
        }
        if (flag == true) {
            fiveExitDto.setIsJoin("是");
            fiveExitDto.setJoinScore("20");
        } else {
            fiveExitDto.setIsJoin("否");
            fiveExitDto.setJoinScore("0");
        }

        //有无辍学学生
        List<DropOfSchoolDto> student = ab10_ab01Mapper.findFamilyStudent(num);
        //得到当前时间
        Long now = DateUtil.NowDate();
        Long max = now - 60000;
        Long min = now - 160000;
        log.info("查询到的家庭成员人数" + student.size());

        for (int i = 0; i < student.size(); i++) {
            log.info("进入循环");
            log.info(student.size());
            if ("".equals(student.get(i).getStudentStation()) || student.get(i).getStudentStation() == null) {

                log.info("有为空");
                String IDnumber = student.get(i).getIDNumber().substring(6, 14);
                if (Long.valueOf(IDnumber) > min && Long.valueOf(IDnumber) < max) {
                    log.info("在范围内");
                    fiveExitDto.setIsStudent("有");
                    fiveExitDto.setStudentScore("0");
                } else {
                    log.info("不在范围");
                    fiveExitDto.setIsStudent("无");
                    fiveExitDto.setStudentScore("20");
                }
            } else {
                log.info("不为空");
                fiveExitDto.setIsStudent("无");
                fiveExitDto.setStudentScore("20");
            }
        }


        return fiveExitDto;
    }

    /**
     * 家庭成员信息(日期需要更改)
     *
     * @param num
     * @return
     */
    @Override
    public List<FamilyAb10Dto> selectFamily(Long num) {
        List<FamilyAb10Dto> list = ab10Mapper.findFamily(num);
        for (int i = 0; i < list.size(); i++) {
            FamilyAb10Dto count = list.get(i);
            count.setAab003(PovertyDetailUtil.ISSex(count.getAab003()));
            count.setAab005(String.valueOf(DateUtil.age(count.getAab005())));
            String s = aa10TABLEMapper.FamilyRelation(ab01Mapper.findFamilyRelation(Long.parseLong(count.getAab001())));
            count.setAab006(s);
        }
        return list;
    }

    /**
     * 帮扶结对信息
     *
     * @param num
     * @return
     */
    @Override
    public AK11DD selectAC01AK11(Long num) {

        /*HelpUserAndPovertyDto hUAPD = ac01AK11Mapper.selectHelpAndPoverty(num);
        if (hUAPD.getAar100() != null) {
            hUAPD.setAar100(PovertyDetailUtil.IsEffective(hUAPD.getAar100()));//有效标志
        }
        //是否驻村队员
        if (hUAPD.getAak039() != null) {
            hUAPD.setAak039(PovertyDetailUtil.IsVillageTeam(hUAPD.getAak039()));
        }
        //技术特长
        if (hUAPD.getAak037() != null) {
            hUAPD.setAak037(aa10TABLEMapper.SelectTechnicalExpertise(hUAPD.getAak037()));
        }
        //隶属关系
        if (hUAPD.getAap004() != null) {
            hUAPD.setAap004(aa10TABLEMapper.findAffiliation(hUAPD.getAap004()));
        }
        //政治面貌
        if (hUAPD.getAak033() != null) {
            hUAPD.setAak033(aa10TABLEMapper.PoliticalOutlook(hUAPD.getAak033()));
        }
        //学历
        if (hUAPD.getAak036() != null) {
            hUAPD.setAak036(aa10TABLEMapper.findEducation(hUAPD.getAak036()));
        }
        //性别,根据证件号码解决
        if (hUAPD.getAab004() != null) {
            String s = IDNumberUtil.IsIdNumber(hUAPD.getAab004());
            hUAPD.setSex(IDNumberUtil.sex(s));
        }*/
        //贫困户编号查询帮扶干部编号
        AK11DD ak11DD=ak11DDMapper.findAk11DD(num.toString());
        if(ak11DD.getAak032()==null ||"0".equals(ak11DD.getAak032()))
        {
            ak11DD.setAak032("否");
        }
        else
        {
            ak11DD.setAak032("是");
        }
        //是否为队长
        if(ak11DD.getAak031()==null|| "0".equals(ak11DD.getAak031()))
        {
            ak11DD.setAak031("否");
        }
        else
        {
            ak11DD.setAak031("是");
        }
        //是否驻村队员
        if(ak11DD.getAak039()==null||"0".equals(ak11DD.getAak039()))
        {
            ak11DD.setAak039("否");
        }
        else
        {
            ak11DD.setAak039("是");
        }
        if(ak11DD.getAab003()!=null)
        {
            if("0".equals(ak11DD.getAab003()))
            {
                ak11DD.setAab003("女");
            }
            else
            {
                ak11DD.setAab003("男");
            }
        }

        //隶属关系
        if(ak11DD.getAap004()!=null)
        {
            ak11DD.setAap004(aa10TABLEMapper.findAffiliation(ak11DD.getAap004()));
        }
        //政治面貌
        if(ak11DD.getAak033()!=null)
        {
            ak11DD.setAak033(aa10TABLEMapper.PoliticalOutlook(ak11DD.getAak033()));
        }
        //职务级别
        if(ak11DD.getAaf031()!=null)
        {
            ak11DD.setAaf031(aa10TABLEMapper.Position(ak11DD.getAaf031()));
        }
        //学历
        if(ak11DD.getAak036()!=null)
        {
            ak11DD.setAak036(aa10TABLEMapper.findEducation(ak11DD.getAak036()));
        }
        //技术特长
        if(ak11DD.getAak037()!=null)
        {
            ak11DD.setAak037(aa10TABLEMapper.SelectTechnicalExpertise(ak11DD.getAak037()));
        }

        return ak11DD;


    }

    /**
     * 贫困户生产条件信息
     *
     * @param num
     * @return
     */
    @Override
    public PovertyProduceDto selectPovertyProduce(Long num) {

        PovertyProduceDto povertyProduceDto = ac30Mapper.findPoduce(num);
        //是否加入农民专业合作社
        if (povertyProduceDto.getAac084() != null) {
            povertyProduceDto.setAac084(PovertyDetailUtil.IsJoinRuralCoOperatives(povertyProduceDto.getAac084()));
        }
        //是否通生产用电
        if (povertyProduceDto.getAac308() != null) {
            povertyProduceDto.setAac308(PovertyDetailUtil.IsHydroelectricPower(povertyProduceDto.getAac308()));
        }
        //入户路类型
        if (povertyProduceDto.getAac316() != null) {
            povertyProduceDto.setAac316(aa10TABLEMapper.TypeEntryRoad(povertyProduceDto.getAac316()));
        }
        //是否危房户
        if (povertyProduceDto.getAac318() != null) {
            povertyProduceDto.setAac318(PovertyDetailUtil.IsHOuseDanger(povertyProduceDto.getAac318()));
        }
        //饮水是否困难
        if (povertyProduceDto.getAac311() != null) {
            povertyProduceDto.setAac311(PovertyDetailUtil.IsDifficult(povertyProduceDto.getAac311()));
        }
        //饮水是否安全
        if (povertyProduceDto.getAac312() != null) {
            povertyProduceDto.setAac312(PovertyDetailUtil.IsSafeWater(povertyProduceDto.getAac312()));
        }
        //有无卫生厕所
        if (povertyProduceDto.getAac319() != null) {
            povertyProduceDto.setAac319(aa10TABLEMapper.IsToilet(povertyProduceDto.getAac319()));
        }
        //主要燃料类型
        if (povertyProduceDto.getAac320() != null) {
            povertyProduceDto.setAac320(aa10TABLEMapper.majorFuelType(povertyProduceDto.getAac320()));
        }
        //危房级别
        if (povertyProduceDto.getAac322() != null) {
            povertyProduceDto.setAac322(aa10TABLEMapper.CrisisLevel(povertyProduceDto.getAac322()));
        }
        if (af02Mapper.findMove(num) != null) {
            if (af02Mapper.findMove(num).getIsMove() != null) {
                povertyProduceDto.setAcr077(PovertyDetailUtil.IsMove(af02Mapper.findMove(num).getIsMove()));
            }
            if (af02Mapper.findMove(num).getMoveMethod() != null) {
                povertyProduceDto.setAcr075(aa10TABLEMapper.MoveMethod(af02Mapper.findMove(num).getMoveMethod()));
            }
        }
        return povertyProduceDto;
    }
    /**
     * 查询贫困户基本信息表点击详情的页面
     *
     * @param num
     * @return
     */
    @Override
    public AC01Basic selectAC01Basic(Long num) {

        AC01Basic ac01Basic = ac01BasicMapper.findPovertyBasic(num);

        //主要致贫原因更改
        if (ac01Basic.getAac007() != null) {
            String s = aa10TABLEMapper.findMajorCause(ac01Basic.getAac007());
            ac01Basic.setAac007(s);
        }
        //识别标准
        if (ac01Basic.getAac005() != null) {
            String ss = aa10TABLEMapper.findIdentificationStandard(ac01Basic.getAac005());
            ac01Basic.setAac005(ss);
        }
        //贫困户属性
        if (ac01Basic.getAac006() != null) {
            String sss = aa10TABLEMapper.findPovertyTypeName(ac01Basic.getAac006());
            ac01Basic.setAac006(sss);
        }

        //脱贫标志
        if (ac01Basic.getAar010() != null) {
            String s4 = aa10TABLEMapper.findSignsOfPovertyRelief(ac01Basic.getAar010());
            ac01Basic.setAar010(s4);
        }

        //其他致贫原因
        if (ac01Basic.getAac008() != null) {
            String s5 = aa10TABLEMapper.findOtherCause(ac01Basic.getAac008());
            ac01Basic.setAac008(s5);
        }
        //是否军烈属
        if (ac01Basic.getAac012() != null) {
            ac01Basic.setAac012(PovertyDetailUtil.IsMilitaryGenus(ac01Basic.getAac012()));
        }
        //是否独生子女户
        if (ac01Basic.getAac013() != null) {
            ac01Basic.setAac013(PovertyDetailUtil.IsOneChild(ac01Basic.getAac013()));
        }
        //是否双女户
        if (ac01Basic.getAac014() != null) {
            ac01Basic.setAac014(PovertyDetailUtil.IsTwoGirl(ac01Basic.getAac014()));
        }
        //是否重点对象
        if (ac01Basic.getAac015() != null) {
            String s6 = aa10TABLEMapper.IsMajorObject(ac01Basic.getAac015());
            ac01Basic.setAac015(s6);
        }
        log.info("aad001"+ac01Basic.getAad001());
        if (ac01Basic.getAad001() != null) {
            String s7 = aa11DDMapper.findVillageName(ac01Basic.getAad001().toString());
            ac01Basic.setAad001(s7);
        }
        return ac01Basic;
    }
    /**
     * 查询贫困户的基本信息表
     *
     * @param num
     * @return
     */
    @Override
    public AC01Part selectAll(Long num) {
        //信息仍是编码，需要转码
        AC01Part ac01 = ac01Mapper.selectAll(num);
        ac01.setAac007(aa10TABLEMapper.findMajorCause(ac01.getAac007()));
        ac01.setAac006(aa10TABLEMapper.findPovertyTypeName(ac01.getAac006()));
        ac01.setAad001(ac01Mapper.findAdress(String.valueOf(ac01.getAac001())));
        /*System.out.println("ac01test" + ac01.getAad001());
        if (ac01.getAad001()!= null) {
            ac01.setAad001(aa11DDMapper.findVillageName(ac01.getAar001()));
        }*/
        //ac01.setAar001(ss.getAar009()+"  "+s.getAar009());
        return ac01;
    }

    /**
     * 家庭成员详情
     *
     * @param num
     * @return
     */
    @Override
    public AB10_AB01Dto selectFamilyIfo(Long num) {

        AB10_AB01Dto ab10_ab01Dto = ab10_ab01Mapper.findFamilyDetailInfo(num);
        //性别更改
        if (ab10_ab01Dto.getAab003() != null) {
            ab10_ab01Dto.setAab003(PovertyDetailUtil.ISSex(ab10_ab01Dto.getAab003()));
        }
        //证件类型
        if (ab10_ab01Dto.getAab018() != null) {
            ab10_ab01Dto.setAab018(aa10TABLEMapper.DocumentType(ab10_ab01Dto.getAab018()));
        }
        //年龄
        if (ab10_ab01Dto.getAab005() != null) {
            ab10_ab01Dto.setAab005(String.valueOf(DateUtil.age(ab10_ab01Dto.getAab005())));
        }
        //民族
        if (ab10_ab01Dto.getAab007() != null) {
            ab10_ab01Dto.setAab007(aa10TABLEMapper.Nation(ab10_ab01Dto.getAab007()));
        }
        //文化程度
        if (ab10_ab01Dto.getAab008() != null) {
            ab10_ab01Dto.setAab008(aa10TABLEMapper.DegreeOfEducation(ab10_ab01Dto.getAab008()));
        }
        //在校生状况
        if (ab10_ab01Dto.getAab009() != null) {
            ab10_ab01Dto.setAab009(aa10TABLEMapper.StudentStatus(ab10_ab01Dto.getAab009()));
        }
        //劳动能力
        if (ab10_ab01Dto.getAab010() != null) {
            ab10_ab01Dto.setAab010(aa10TABLEMapper.LaborSkills(ab10_ab01Dto.getAab010()));
        }
        //健康状况
        if (ab10_ab01Dto.getAab017() != null) {
            ab10_ab01Dto.setAab017(aa10TABLEMapper.Healthy(ab10_ab01Dto.getAab017()));
        }
        //是否现役军人
        if (ab10_ab01Dto.getAab019() != null) {
            ab10_ab01Dto.setAab019(PovertyDetailUtil.IsServicemen(ab10_ab01Dto.getAab019()));
        }
        //政治面貌
        if (ab10_ab01Dto.getAak033() != null) {
            ab10_ab01Dto.setAak033(aa10TABLEMapper.PoliticalOutlook(ab10_ab01Dto.getAak033()));
        }
        //是否享受低保
        if (ab10_ab01Dto.getAab030() != null) {
            ab10_ab01Dto.setAab030(PovertyDetailUtil.IsLowInsurance(ab10_ab01Dto.getAab030()));
        }
        //是否参加新型农村合作医疗
        if (ab10_ab01Dto.getAab013() != null) {
            ab10_ab01Dto.setAab013(PovertyDetailUtil.IsJoinRuralCooperativeMedicalCare(ab10_ab01Dto.getAab013()));
        }
        //是否参加新型农村社会养老保险（城乡居民社会养老保险）
        if (ab10_ab01Dto.getAab014() != null) {
            ab10_ab01Dto.setAab014(PovertyDetailUtil.IsRuralSocialEndowmentInsurance(ab10_ab01Dto.getAab014()));
        }
        //是否参加城镇职工基本养老保险
        if (ab10_ab01Dto.getAab021() != null) {
            ab10_ab01Dto.setAab021(PovertyDetailUtil.IsRuralSocialEndowmentInsurance(ab10_ab01Dto.getAab021()));
        }
        //是否参加大病保险
        if (ab10_ab01Dto.getAab022() != null) {
            ab10_ab01Dto.setAab022(PovertyDetailUtil.IsCriticalIllnessInsurance(ab10_ab01Dto.getAab022()));
        }
        //与户主关系
        if(ab10_ab01Dto.getAab006()!=null)
        {
            ab10_ab01Dto.setAab006(aa10TABLEMapper.FamilyRelation(ab10_ab01Dto.getAab006()));
        }

        return ab10_ab01Dto;
    }

    /**
     * 通过贫困户编号，查找相应的身份证编号，去查询帮扶措施的具体情况
     *
     * @param id
     * @return
     */
    @Override
    public String findIdNumberByID(String id) {

        String s = aa10TABLEMapper.findIdNumber(id);
        return s;
    }

    @Override
    public ImmigrantRelocationDD findImmigrantRelocation(String IdNumber) {
        ImmigrantRelocationDD immigrantRelocationDD = immigrantRelocationDDMapper.findImmRelocationByID(IdNumber);
        return immigrantRelocationDD;
    }

    /**
     * 查询患病信息表
     * @param povertyNumber
     * @return
     */
    @Override
    public List<HealthFamilyDto> findHealth(String povertyNumber) {
        List<HealthFamilyDto> list= healthFamilyMapper.findHealthFamily(povertyNumber);
        if(list.size()==0 && list.isEmpty())
        {
            return null;
        }
        for(int i=0;i<list.size();i++)
        {
            //将患病信息转化成汉字
            list.get(i).setDiseasedInformation(aa10TABLEMapper.Healthy(list.get(i).getDiseasedInformation()));
        }
        return list;
    }
}
