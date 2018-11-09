package com.sysh.service.impl;

import com.sysh.dto.UpdateHelpNumberDto;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.update.PovertyBasicInfoModel;
import com.sysh.entity.update.Sh02Model;
import com.sysh.mapper.AB10DDMapper;
import com.sysh.mapper.HelpDDMapper;
import com.sysh.mapper.Sh01DDMapper;
import com.sysh.mapper.Sh02DDMapper;
import com.sysh.service.EqualsService;
import com.sysh.util.DateUtil;
import com.sysh.util.MapUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月15日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class EqualsServiceImpl implements EqualsService {

    private Logger log=Logger.getLogger(this.getClass());
    @Autowired
    private Sh02DDMapper sh02DDMapper;
    @Autowired
    private Sh01DDMapper sh01DDMapper;
    @Autowired
    private AB10DDMapper ab10DDMapper;


    public synchronized   Integer InsertNotEquals(Field fields[],Object o, Map<String ,String> map, Long primaryNumber )
    {

        log.info("传入参数是否有值"+o.toString());
        log.info("传入map值"+map.toString());
        Integer num=0;

        //通过反射机制得到查到的东西然后和相应的东西判断哪里不同
        //Field fields[]= AC01Basic.class.getDeclaredFields();
        String[] name=new String[fields.length];
        Object[] value=new Object[fields.length];
        log.info("查看类的长度"+value.length);
        try {
            Field.setAccessible(fields, true);
            for (int j = 0; j < name.length; j++) {
                name[j] = fields[j].getName();//得到名称
                value[j] = fields[j].get(o);//cHis 是实体类名称//得到名称对应的值
                log.info("现阶段的库中"+value[j]);
                if(value[j]==null)
                {
                    if(map.get(name[j])!=null)
                    {

                        log.info("添加sh02===============================value=null,map!=null+++++++++"+map.get(name[j]));
                        num=sh02DDMapper.insertSh02(new Sh02Model(name[j],"未填",map.get(name[j]),primaryNumber,0L));
                    }
                    else
                    {
                        continue;
                    }
                }else
                {
                    //if(map.get(name[j]).equals())
                    if(map.get(name[j])!=null)
                    {

                        if(String.valueOf(value[j]).equals(map.get(name[j])))
                        {
                            continue;
                        }
                        else
                        {

                                num=sh02DDMapper.insertSh02(new Sh02Model(name[j],value[j].toString(),map.get(name[j]),primaryNumber,0L));

                        }
                    }
                    else
                    {
                        num=sh02DDMapper.insertSh02(new Sh02Model(name[j],value[j].toString(),"未填",primaryNumber,0L));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return num;
    }
    public synchronized   Integer InsertNotEqualsEight(Field fields[],Object o, Map<String ,String> map, Long primaryNumber,String table )
    {

        log.info("传入参数是否有值"+o.toString());
        log.info("传入map值"+map.toString());

        //通过反射机制得到查到的东西然后和相应的东西判断哪里不同
        //Field fields[]= AC01Basic.class.getDeclaredFields();
        String[] name=new String[fields.length];
        Object[] value=new Object[fields.length];
        log.info("查看类的长度"+value.length);
        try {
            Field.setAccessible(fields, true);
            for (int j = 0; j < name.length; j++) {
                name[j] = fields[j].getName();//得到名称
                value[j] = fields[j].get(o);//cHis 是实体类名称//得到名称对应的值
                log.info("现阶段的库中"+value[j]);
                if(value[j]==null)
                {
                    if(map.get(name[j])!=null)
                    {
                        log.info("添加sh02===============================value=null,map!=null");
                        Map<String,String> mapField=new HashMap<>();
                        mapField.put("tableName",table.toLowerCase());
                        mapField.put("field",name[j]);
                        String s=sh02DDMapper.findFieldName(mapField);
                        sh02DDMapper.insertEight(new Sh02Model(name[j],"未填",map.get(name[j]),s,primaryNumber,0L));
                    }
                    else
                    {
                        continue;
                    }
                }else
                {
                    //if(map.get(name[j]).equals())
                    if(String.valueOf(value[j]).equals(map.get(name[j])))
                    {
                        continue;
                    }
                    else
                    {
                        log.info("添加sh02===============================value!=null");
                        log.info("那个为空"+name[j]+"value"+value[j].toString()+"map.get"+map.get(name[j])+"primartyNumber"+primaryNumber);
                        if(map.get(name[j])!=null)
                        {
                            Map<String,String> mapField=new HashMap<>();
                            mapField.put("tableName",table.toLowerCase());
                            mapField.put("field",name[j]);
                            String s=sh02DDMapper.findFieldName(mapField);
                            log.info("realName是什么"+s);
                            log.info("field是什么"+name[j]);
                            sh02DDMapper.insertEight(new Sh02Model(name[j],value[j].toString(),map.get(name[j]),s,primaryNumber,0L));
                        }
                        else
                        {
                            Map<String,String> mapField=new HashMap<>();
                            mapField.put("tableName",table.toLowerCase());
                            mapField.put("field",name[j]);
                            String s=sh02DDMapper.findFieldName(mapField);
                            sh02DDMapper.insertEight(new Sh02Model(name[j],value[j].toString(),"未填",s,primaryNumber,0L));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }

    @Override
    public synchronized Integer InsertNotVillage(Field[] fields, Object o, Map<String, String> map, Long primaryNumber) {

        log.info("传入参数是否有值"+o.toString());
        log.info("传入map值"+map.toString());

        //通过反射机制得到查到的东西然后和相应的东西判断哪里不同
        //Field fields[]= AC01Basic.class.getDeclaredFields();
        String[] name=new String[fields.length];
        Object[] value=new Object[fields.length];
        log.info("查看类的长度"+value.length);
        try {
            Field.setAccessible(fields, true);
            for (int j = 0; j < name.length; j++) {
                name[j] = fields[j].getName();//得到名称
                value[j] = fields[j].get(o);//cHis 是实体类名称//得到名称对应的值
                log.info("现阶段的库中"+value[j]);
                if(value[j]==null)
                {
                    if(map.get(name[j])!=null)
                    {
                        log.info("添加sh02===============================value=null,map!=null");
                        sh02DDMapper.insertVillage(new Sh02Model(name[j],"未填",map.get(name[j]), MapUtil.villageBasic().get(name[j]),primaryNumber,0L));
                    }
                    else
                    {
                        continue;
                    }
                }else
                {
                    //if(map.get(name[j]).equals())
                    if(String.valueOf(value[j]).equals(map.get(name[j])))
                    {
                        continue;
                    }
                    else
                    {
                        log.info("添加sh02===============================value!=null");
                        log.info("那个为空"+name[j]+"value"+value[j].toString()+"map.get"+map.get(name[j])+"primartyNumber"+primaryNumber);
                        if(map.get(name[j])!=null)
                        {
                            log.info("field是什么"+name[j]);
                            sh02DDMapper.insertVillage(new Sh02Model(name[j],value[j].toString(),map.get(name[j]),MapUtil.villageBasic().get(name[j]),primaryNumber,0L));
                        }
                        else
                        {
                            sh02DDMapper.insertVillage(new Sh02Model(name[j],value[j].toString(),"未填",MapUtil.villageBasic().get(name[j]),primaryNumber,0L));
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }
    @Autowired
    private HelpDDMapper helpDDMapper;
    @Override
    public synchronized Integer InsertNotHelpNumber(Field[] fields, Object o, Map<String, String> map, Long primaryNumber) {

        log.info("传入参数是否有值"+o.toString());
        log.info("传入map值"+map.toString());

        //通过反射机制得到查到的东西然后和相应的东西判断哪里不同
        //Field fields[]= AC01Basic.class.getDeclaredFields();
        String[] name=new String[fields.length];
        Object[] value=new Object[fields.length];
        log.info("查看类的长度"+value.length);
        try {
            Field.setAccessible(fields, true);
            for (int j = 0; j < name.length; j++) {
                name[j] = fields[j].getName();//得到名称
                value[j] = fields[j].get(o);//cHis 是实体类名称//得到名称对应的值
                log.info("现阶段的库中"+value[j]);
                if(value[j]==null)
                {
                    if(map.get(name[j])!=null)
                    {
                        log.info("添加sh02===============================value=null,map!=null");
                        helpDDMapper.insertHelpInfo(new UpdateHelpNumberDto("0","未填",map.get(name[j]),name[j],MapUtil.mapHelp().get(name[j]),primaryNumber.toString()));
                    }
                    else
                    {
                        continue;
                    }
                }else
                {
                    //if(map.get(name[j]).equals())
                    if(String.valueOf(value[j]).equals(map.get(name[j])))
                    {
                        continue;
                    }
                    else
                    {
                        log.info("添加sh02===============================value!=null");
                        log.info("那个为空"+name[j]+"value"+value[j].toString()+"map.get"+map.get(name[j])+"primartyNumber"+primaryNumber);
                        if(map.get(name[j])!=null)
                        {
                            log.info("field是什么"+name[j]);
                            //sh02DDMapper.insertVillage(new Sh02Model(name[j],value[j].toString(),map.get(name[j]),MapUtil.villageBasic().get(name[j]),primaryNumber,0L));
                            helpDDMapper.insertHelpInfo(new UpdateHelpNumberDto("0",value[j].toString(),map.get(name[j]),name[j],MapUtil.mapHelp().get(name[j]),primaryNumber.toString()));
                        }
                        else
                        {
                            //sh02DDMapper.insertVillage(new Sh02Model(name[j],value[j].toString(),"未填",MapUtil.villageBasic().get(name[j]),primaryNumber,0L));
                            helpDDMapper.insertHelpInfo(new UpdateHelpNumberDto("0",value[j].toString(),"未填",name[j],MapUtil.mapHelp().get(name[j]),primaryNumber.toString()));

                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 1;
    }

    public synchronized Long insertSh01(Map<String,String> map, String tableName, String modifyType)
    {
        log.info("两个不相等");
        //不同，首先插入一条信息代表新增，
        PovertyBasicInfoModel povertyBasicInfoModel=null;
        if("ab10,ab01".equals(tableName))
        {
            //出现的是家庭成员的信息，要去查询相应的贫困人口编号
            String s=ab10DDMapper.findAab001(map.get("aab004"));
            povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("povertyNumber")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDateSecond()),tableName,modifyType,s);
        }else
        {
            povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("povertyNumber")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDateSecond()),tableName,modifyType);
        }
        //TODO 新增的审核信息
        sh01DDMapper.insertSh01(povertyBasicInfoModel);
        log.info("新增之后的主键值"+povertyBasicInfoModel.getId());


        return povertyBasicInfoModel.getId();
    }
    /*public Long insertSh01(Map<String,String> map,String tableName,String modifyType)
    {
        log.info("两个不相等");
        //不同，首先插入一条信息代表新增，
        if("ab10,ab01".equals(tableName))
        {

        }
        PovertyBasicInfoModel povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("povertyNumber")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDateSecond()),tableName,modifyType);
        //TODO 新增的审核信息
        sh01DDMapper.insertSh01(povertyBasicInfoModel);
        log.info("新增之后的主键值"+povertyBasicInfoModel.getId());


        return povertyBasicInfoModel.getId();
    }*/
    public synchronized Long insertEight(Map<String,String> map,String tableName,String modifyType)
    {
        log.info("两个不相等");
        //不同，首先插入一条信息代表新增，
        PovertyBasicInfoModel povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("id")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDateSecond()),tableName,modifyType);
        //TODO 新增的审核信息
        sh01DDMapper.insertEight(povertyBasicInfoModel);
        log.info("新增之后的主键值"+povertyBasicInfoModel.getId());


        return povertyBasicInfoModel.getId();
    }
    public synchronized Long insertVillage(Map<String,String> map,String tableName,String modifyType)
    {
        log.info("两个不相等");
        //不同，首先插入一条信息代表新增，
        PovertyBasicInfoModel povertyBasicInfoModel =new PovertyBasicInfoModel(Long.valueOf(map.get("aad001")),Long.valueOf(map.get("helpNumber")),String.valueOf(DateUtil.NowDateSecond()),tableName,modifyType);
        //TODO 新增的审核信息
        sh01DDMapper.insertVillage(povertyBasicInfoModel);
        log.info("新增之后的主键值"+povertyBasicInfoModel.getId());


        return povertyBasicInfoModel.getId();
    }

}
