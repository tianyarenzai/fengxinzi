package com.sysh.service.impl;

import com.sysh.entity.helpmea.*;
import com.sysh.mapper.*;
import com.sysh.service.HelpMeasureDDService;
import com.sysh.service.PovertyDetailsService;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月23日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class HelpMeasureDDServiceImpl implements HelpMeasureDDService {
    @Autowired
    private ImmigrantRelocationDDMapper irddmapper;
    @Autowired
    private ReconstDangerDDMapper reconstDangerDDMapper;
    @Autowired
    private EcologicalPovertyDDMapper ecologicalPovertyDDMapper;
    @Autowired
    private FinanceDDMapper financeDDMapper;
    @Autowired
    private AC40DDMapper ac40DDMapper;
    @Autowired
    private AC30DingDingMapper ac30DingDingMapper;
    @Autowired
    private AB10AB01Mapper ab10AB01Mapper;
    @Autowired
    private AC01BasicMapper ac01BasicMapper;
    @Autowired
    private ImmigrantRelocationDDMapper immigrantRelocationDDMapper;
    @Autowired
    private AB10DDMapper ab10DDMapper;
    @Autowired
    private EducationDDMapper educationDDMapper;
    @Autowired
    private AB01DDMapper ab01DDMapper;
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

    private Logger log=Logger.getLogger(this.getClass());





    @Autowired
    private PovertyDetailsService povertyDetailsService;

    //根据贫困户编号查询现在的贫困户应该享受那些帮扶措施
    @Override
    public Set<String> findMeasure(String povertyNumber)
    {
        //根据贫困户编号查询相应的贫困户应该享受哪些措施

        Set<String> set=new HashSet<>();
        //判断是否易地搬迁
        Long s=ac40DDMapper.isRelocationIntention(povertyNumber);
        if(s==1L)
        {
            //有搬迁意愿
            set.add("易地搬迁");
        }
        else
        {
            //无搬迁意愿
        }
        //判断是否危房改造
        Long isHouseDanger=ac30DingDingMapper.findHouseDanger(povertyNumber);
        if(isHouseDanger==1)
        {
            //是危房户
            set.add("危房改造");
        }
        else
        {
            //不是危房户
        }
        //判断是否生态扶贫
        BigDecimal ReturningFarmland=ac30DingDingMapper.findReturningFarmland(povertyNumber);
        if(ReturningFarmland.doubleValue()>0)
        {
            //有生态扶贫
            set.add("生态扶贫");
        }
        else
        {
            //无生态扶贫
        }
        //判断是否金融扶贫 TODO 暂时没有数据，先不做

        //判断是否教育扶贫
        //判断该户的家庭成员有无在校生情况
            //先判断6-16岁在校生情况不为空的，也是事需要帮扶的贫困户
        Long count=ab10AB01Mapper.findIsStudent(povertyNumber);
        if(count>0)
        {
            //需要教育扶贫
            set.add("教育扶贫");
        }
        else
        {
            //不需要扶贫
        }


        //理论上来讲是全部都需要健康扶贫，所以不用查询
        set.add("健康扶贫");
        //判断是否享受兜底保障(兜底保障要求五保低保只能享受一个，但是残疾和五保低保可以同时存在)
            //判断是否享受五保，低保
        //先判断健康状况，再根据健康状况决定去查询相应的残疾或者民政
        Long isFivePoverty=ac01BasicMapper.findFivePovertyOrBottomPoverty(povertyNumber);
        if(isFivePoverty!=null)
        {
            //是贫困五保户，或者低保户
            set.add("兜底保障五保低保");
        }
        else
        {
            //不是贫困低保户或者五保户
        }
        Long disableNumber=ac01BasicMapper.findDisable(povertyNumber);
        if(disableNumber>0)
        {
            //家庭成员享受兜底保障残疾
            set.add("兜底保障残疾");
        }
        else
        {
            //家庭成员不享受兜底保障残疾
        }
        //判断是否享受就业创业或者产业扶贫
        Long isLaborAbility=ac01BasicMapper.findLaborAbility(povertyNumber);
        if(isLaborAbility>0)
        {
            //家庭成员有劳动能力，非在校生有人，
            set.add("产业扶贫");
            set.add("就业扶贫");
        }
        else
        {
            //家庭成员中均为无劳动能力，或是在校生，不用销售该政策
        }
        return set;
    }
    //根据易地搬迁身份证号码查询相应的贫困户措施落实情况，并展示


    @Override
    public Map<String,Object> findIsExistence(Set<String> set, String povertyNumber) {

        Map<String,Object> map=new HashMap<>();

        List<String> listString=new ArrayList<>();
        //将贫困户编号转化成身份证号，
        String s=povertyDetailsService.findIdNumberByID(povertyNumber);
        //将每一项都循环出来，享受的
        for (String ss:set
             ) {
            if("易地搬迁".equals(ss))
            {
                //使用身份证号去查询易地搬迁表
                ImmigrantRelocationDD  immigrantRelocationDD=immigrantRelocationDDMapper.findImmRelocationByID(s);
                if(immigrantRelocationDD!=null)
                {
                    map.put("immigrantRelocationDD",immigrantRelocationDD);
                }else
                {
                    map.put("immigrantRelocationDD",0);
                }
                listString.add("immigrantRelocationDD");

            }
            else if("危房改造".equals(ss))
            {
                //使用身份证号去查询危房改造
                ReconstDangerDD reconstDangerDD=reconstDangerDDMapper.findReconstDangerByID(s);
                if(reconstDangerDD!=null)
                {
                    map.put("ReconstDangerDD",reconstDangerDD);
                }
                else
                {
                    map.put("ReconstDangerDD",0);
                }
                listString.add("ReconstDangerDD");

            }
            else if("生态扶贫".equals(ss))
            {
                //使用身份证号去查询生态扶贫
                //如果有的话查询到全部的家庭成员得证件号码，只要有一个，也算落实
                List<String> list=ab10DDMapper.findFamilyIdNumber(povertyNumber);
                List<EcologicalPovertyDD> sumEcological=new ArrayList<>();
                for(int i=0;i<list.size();i++)
                {
                    EcologicalPovertyDD ecologicalPovertyDD=ecologicalPovertyDDMapper.findEcologicalPovertyByID(list.get(i));
                    if(ecologicalPovertyDD!=null)
                    {
                        sumEcological.add(ecologicalPovertyDD);
                    }
                }
                //判断有没有
                if(sumEcological.size()>0)
                {
                    map.put("EcologicalPovertyDD",sumEcological);
                }
                else
                {
                    map.put("EcologicalPovertyDD",0);
                }
                listString.add("EcologicalPovertyDD");
            }
            else if("金融扶贫".equals(ss))
            {
                //使用贷款人姓名去查询，或许不唯一，注意 TODO 待做
                map.put("Finance",0);
                listString.add("Finance");
            }
            else if("教育扶贫".equals(ss))
            {
                //根据家庭成员中在学得人来查询，同样用证件号码
                    //查询家庭成员得在校生情况
                List<String> studentList=ab10AB01Mapper.findStudentIdNumber(povertyNumber);
                map.put("EducationDDNumber",studentList.size());
                List<EducationDD> sumEduction=new ArrayList<>();
                for(int i=0;i<studentList.size();i++)
                {
                    EducationDD educationDD=educationDDMapper.findEducationByid(studentList.get(i));
                    //log.info("教育扶贫的人"+educationDD.toString());
                    if(educationDD!=null)
                    {
                        sumEduction.add(educationDD);
                    }
                }
                if(sumEduction.size()==studentList.size())
                {
                    map.put("EducationDD",sumEduction);
                }
                else
                {
                    map.put("EducationDD",0);
                }
                listString.add("EducationDD");
            }
            else if("健康扶贫".equals(ss))
            {
                //根据编号来查询具体的东西，是否参加
                //先去查询国办那边得数据，是否参加新农合等，如果都参与了，才有具体的信息展示，如果没有，直接显示未实施
                Long countNumber=ab01DDMapper.findIsNotJoin(povertyNumber);
                if(countNumber==0)
                {
                    //都参与了，可以考虑另一张表里面有没有人家了，最少有一人，不用判断为空得可能
                    List<String> familyIdNumberList=ab10DDMapper.findFamilyIdNumber(povertyNumber);
                    //理论上应该全部享受，数量要统一返回处理
                    map.put("HealthDDNumber",familyIdNumberList.size());
                    //得到全部的身份证号，然后挨个去遍历，查看在新录入得表信息中是否存在该家庭成员
                    List<HealthDD> healthList=new ArrayList<>();
                    for(int i=0;i<familyIdNumberList.size();i++)
                    {
                        HealthDD healthDD=healthDDMapper.findHealthByid(familyIdNumberList.get(i));
                        if(healthDD==null)
                        {
                            continue;
                        }
                        healthList.add(healthDD);
                    }
                    //如果全部成员信息均可以找到，就判定为已落实，否则就算未落实
                    if(healthList.size()==familyIdNumberList.size())
                    {
                        map.put("HealthDD",healthList);
                    }
                    else
                    {
                        map.put("HealthDD",0);
                    }

                }else
                {
                    //没参与，直接不考虑了，就算未实施
                    map.put("Health",0);
                }

                listString.add("Health");


            }
            else if("兜底保障五保低保".equals(ss))
            {
                //查询该五保低保得落实情况，这部分是可以和兜底保障残疾合并到一块的
                //已经确定有低保或五保户
                List<BottomGuaranteeCivilDD> bottomGuaranteeCivilDD=bottomGuaranteeCivilDDMapper.findBottomCivil(s);
                if(bottomGuaranteeCivilDD.size()>0)
                {
                    //存在
                    map.put("BottomGuaranteeCivilDD",bottomGuaranteeCivilDD);
                }
                else
                {
                    //不存在
                    map.put("BottomGuaranteeCivilDD",0);
                }
                listString.add("BottomGuaranteeCivilDD");

            }
            else if("兜底保障残疾".equals(ss))
            {
                //查询兜底保障残疾的落实情况
                //已经确定家庭成员有残疾,查看有几人完成
                List<String> disableIdNumber=ac01BasicMapper.findDisableIdNumber(povertyNumber);
                map.put("BottomDisabledDDNumber",disableIdNumber.size());
                List<BottomDisabledDD> disabledDDList=new ArrayList<>();
                for(int i=0;i<disableIdNumber.size();i++)
                {
                    BottomDisabledDD bottomDisabledDD=null;
                    if(disableIdNumber.size()==18)
                    {
                        bottomDisabledDD=bottomDisabledDDMapper.findBottomDisabledByid(disableIdNumber.get(i));
                    }
                    else
                    {
                        bottomDisabledDD=bottomDisabledDDMapper.findBottomDisabledByid(disableIdNumber.get(i).substring(0,18));
                    }
                    disabledDDList.add(bottomDisabledDD);

                }
                if(disabledDDList.size()>0)
                {
                    //存在
                    map.put("BottomDisabledDD",disabledDDList);
                }
                else
                {
                    map.put("BottomDisabledDD",0);
                }
                listString.add("BottomDisabledDD");
            }else if("产业扶贫".equals(ss) ||"就业扶贫".equals(ss))
            {
                //判断贫困户家庭成员在不在这个表中 TODO 未做
                //在不在新表里面，得到贫困户家庭成员详情身份证号码
                List<String> familyIdNumberList=ab10DDMapper.findFamilyIdNumber(povertyNumber);
                map.put("EmploymentOrIndustryNumber",familyIdNumberList.size());
                List<EmploymentDD> employList=new ArrayList<>();
                for(int i=0;i<familyIdNumberList.size();i++)
                {
                    EmploymentDD employmentDD=employmentDDMapper.findEmployByIdNumber(familyIdNumberList.get(i));
                    if(employmentDD!=null)
                    {
                        employList.add(employmentDD);
                    }
                }
                if(employList.size()>0)
                {
                    //家庭成员只要有一个有就业创业，就算实施
                    map.put("EmploymentDD",employList);
                    listString.add("EmploymentDD");
                }else if(employList.size()==0)
                {
                    map.put("EmploymentDD",0);


                    List<IdstProjwayDD> idstProjwayDDList=new ArrayList<>();
                    //家庭成员均没有参与就业创业，再去查询产业扶贫
                    for(int i=0;i<familyIdNumberList.size();i++)
                    {
                        IdstProjwayDD idstProjwayDD=idstProjwayDDMapper.findIdstProjwayByidNumber(familyIdNumberList.get(i));
                        if(idstProjwayDD!=null)
                        {
                            idstProjwayDDList.add(idstProjwayDD);
                        }
                    }
                    if(idstProjwayDDList.size()>0)
                    {
                        //产业扶贫有他，
                        map.put("IdstProjwayDD",idstProjwayDDList);
                    }
                    else
                    {
                        map.put("IdstProjwayDD",0);
                    }
                    listString.add("IdstProjwayDD");
                }
            }
        }
        map.put("listString",listString);
        return map;
    }
}
