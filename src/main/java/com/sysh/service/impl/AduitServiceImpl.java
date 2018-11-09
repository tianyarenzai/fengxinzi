package com.sysh.service.impl;

import com.sysh.Enum.EvidenceEnum;
import com.sysh.entity.AC01Basic;
import com.sysh.entity.MeasureFieldDD;
import com.sysh.entity.aduit.AduitDetailInfo;
import com.sysh.entity.aduit.AduitInfo;
import com.sysh.mapper.*;
import com.sysh.service.AduitService;
import com.sysh.util.ResultData;
import com.sysh.util.UnicodeUtil;
import com.sysh.vo.EvidenceFirstModel;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * ClassName:  <br/>
 * Function: 信息审核<br/>
 * date: 2018年06月17日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class AduitServiceImpl implements AduitService {

    Logger log=Logger.getLogger(this.getClass());
    @Autowired
    private AduitMapper aduitMapper;
    @Autowired
    private AC01BasicMapper ac01BasicMapper;
    @Autowired
    private AA10TABLEMapper aa10TABLEMapper;
    @Autowired
    private MeasureFieldDDMapper fieldDDMapper;
    @Autowired
    private InfoDetailDDMapper infoDetailDDMapper;
    @Autowired
    private HelpUserMapper helpUserMapper;

    /**
     * 查询该帮扶干部下的审核信息，已通过的未通过的
     * @param helpNumber
     * @return
     */
    @Override
    public Map<String,List<AduitInfo>> findHelpAduit(Long helpNumber) {
        Map<String,List<AduitInfo>> map=new HashMap<>();
        //List<AduitInfo> listNo=aduitMapper.noAduitInfo(helpNumber);
        List<AduitInfo> listSucess=aduitMapper.AduitSucess(helpNumber);
        //帮扶措施审核成功的信息
        listSucess.addAll(aduitMapper.EightAduitSucess(helpNumber));
        List<AduitInfo> listFail=aduitMapper.AduitFail(helpNumber);
        //帮扶措施审核失败的信息
        listFail.addAll(aduitMapper.EightAduitFail(helpNumber));
        //map.put("listNo",HelpInsertName(listNo));
        map.put("listSucess",HelpInsertName(listSucess));
        map.put("listFail",HelpInsertName(listFail));
        return map;
    }

    /**
     * 辅助类，主要解决根据编号找出名称，显示再界面
     * @param list
     * @return
     */
    public List<AduitInfo> HelpInsertName(List<AduitInfo> list)
    {
        if(list.size()>0)
        {
            for(int i=0;i<list.size();i++)
            {



                Long m=Long.valueOf(list.get(i).getAac001());
                list.get(i).setAac001(ac01BasicMapper.findPovertyNameByNum(m));
            }
            return list;
        }
        else
        {
            return null;
        }
    }
    /**
     * 查询现阶段的修改字段针对单一属性的修改，基本信息还是收入信息，查询详情
     * @param id
     * @return
     */
    /*@Override
    public List<AduitDetailInfo> findDetailInfoAduit(Long id) {

        List<AduitDetailInfo> list=aduitMapper.findAduitDetailInfo(id);
        //判断是帮扶措施吗，是还要去查询新的字段，看是否能更改，
        //先判断表名是哪个，直接再对应的表中查询，解释字段就可以
        String tableName=aduitMapper.findTableName(id);
        //得到的编号信息修改内容，究竟是那个字段修改了，要注意查看
        log.info(tableName);
        List<MeasureFieldDD> fieldList=fieldDDMapper.findMeassureField(tableName);
        if(fieldList.size()==0)
        {

            for(int i=0;i<list.size();i++)
            {
                //查询具体指标项原因改变要转化为大写，数据库存放的为大写
                String s=aa10TABLEMapper.findFieldName(list.get(i).getInfoName().toUpperCase());
                list.get(i).setInfoName(s);
            }
            return list;
        }
        else
        {
            //首先判定要展示的内容是帮扶措施，就在对应的表中查询
            for(int i=0;i<list.size();i++)
            {
                //修改的字段有几个，就处理几个的问题，不用考虑别的
                for(int j=0;j<fieldList.size();j++)
                {

                    log.info("那些数据修改了"+ list.get(i).getInfoName());
                    if(list.get(i).getInfoName().equals(fieldList.get(j).getDdName()))
                    {
                        //可以判定是相等的字段
                        //就给list里面添加
                        log.info("那些数据修改了"+ list.get(i).getInfoName());
                        log.info("与之对应的数据是什么"+fieldList.get(i).getDdName());
                        list.get(i).setInfoName(fieldList.get(j).getDdValue());
                    }
                }

            }
            return list;
        }
    }*/

    /**
     * 添加的信息审核的内容必须要做好所有的准备
     * @param id
     * @return
     */
    //public List<AduitDetailInfo> HelpfindDetailInfoAduit(Long id) {
    public List<AduitDetailInfo> findDetailInfoAduit(Long id,String m) {

        String tableName=null;
        try {
            m   =   java.net.URLDecoder.decode(m,   "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        //m= UnicodeUtil.unicodetoString(m);
        List<AduitDetailInfo> detail=null;
        if("兜底保障".equals(m)||"易地搬迁".equals(m)||"危房改造".equals(m)||"生态扶贫".equals(m)||"教育扶贫".equals(m)||"健康扶贫".equals(m)||"就业创业".equals(m)||"产业扶贫".equals(m))
        {
            //Map<String,String> map=new HashMap<>();
            //map.put("id",id.toString());
            //map.put("modifyType",m);
            return  infoDetailDDMapper.findEightDetail(id);

        }
        else
        {
           tableName=infoDetailDDMapper.findTableName(id);
            detail=aduitMapper.findAduitDetailInfo(id);
        }


        if(tableName==null || detail==null)
        {
            return null;
        }

        //先判断是那个里面的信息审核
        List<MeasureFieldDD> fieldList=fieldDDMapper.findMeassureField(tableName);
        log.info("++++++++++++我看看这个字段++++++++++++++++++++=="+fieldList.toString());
        if(fieldList.size()==0)
        {

            //Map<String,String> map=new HashMap<>();
            /*map.put("tableName",tableName);
            map.put("id",id.toString());*/
            //detail.clear();
            /*List<AduitDetailInfo> list=infoDetailDDMapper.findDetail(map);*/
            Map<String,String> mapUpdate=new HashMap<>();

            List<AduitDetailInfo> list=new ArrayList<>();
            //PovertyAduitDetailModel povertyAduitDetailModel=(PovertyAduitDetailModel)infoList.get(i);
            //是否存在","，如果存在就进行分割，如果没有就跳过
            if(tableName.contains(","))
            {

                String[] s=tableName.split(",");
                //不确定会分割成多少份，所以现在的问题就是将拆分成数组，挨个循环

                for(int j=0;j<s.length;j++)
                {
                    mapUpdate.put("tableName",s[j].toUpperCase());
                    mapUpdate.put("id",id.toString());
                    //得到查询出来的结果，发现注解为空，continue;
                    log.info("s[j]的值"+s[j].toUpperCase());
                    log.info("id的值"+id.toString());
                    List<AduitDetailInfo> temp=infoDetailDDMapper.findDetail(mapUpdate);

                    //使用iterator迭代器的方式
                    Iterator<AduitDetailInfo> it=  temp.iterator();
                    while (it.hasNext())
                    {
                        AduitDetailInfo updateInfoDetailModel=it.next();
                        if(updateInfoDetailModel.getInfoName()==null)
                        {
                            it.remove();
                        }
                    }
                    list.addAll(temp);
                }
                //去除重复
                HashSet h=new HashSet(list);
                list.clear();
                list.addAll(h);
                return list;
                /*povertyAduitDetailModel.setList(list);*/
            }
            else
            {
                mapUpdate.put("tableName",tableName.toUpperCase());
                mapUpdate.put("id",id.toString());
                list.addAll(infoDetailDDMapper.findDetail(mapUpdate));
               // povertyAduitDetailModel.setList(list);
                return list;
            }
        }
        else
        {
            //首先判定要展示的内容是帮扶措施，就在对应的表中查询
            for(int i=0;i<detail.size();i++)
            {
                //修改的字段有几个，就处理几个的问题，不用考虑别的
                for(int j=0;j<fieldList.size();j++)
                {

                    log.info("那些数据修改了"+ detail.get(i).getInfoName());
                    if(detail.get(i).getInfoName().equals(fieldList.get(j).getDdName()))
                    {
                        //可以判定是相等的字段
                        //就给list里面添加
                        log.info("那些数据修改了"+ detail.get(i).getInfoName());
                        log.info("与之对应的数据是什么"+fieldList.get(i).getDdName());
                        detail.get(i).setInfoName(fieldList.get(j).getDdValue());
                    }
                }

            }
            return detail;
        }


    }

    /**
     * 验证该帮扶干部是不是第一书记
     * @param helpNumber 帮扶干部ID
     * @return
     */
    @Override
    public Long IsFirstSecretary(Long helpNumber) {
        return aduitMapper.IsFirstSecretary(helpNumber);
    }
    /**
     * 验证该帮扶干部是不是包村干部
     * @param helpNumber 帮扶干部ID
     * @return
     */
    @Override
    public Long IsBaocunSecretary(Long helpNumber) {
        return aduitMapper.IsBaocunSecretary(helpNumber);
    }

    /**
     * 根据贫困村编号，得到待审核信息
     * @param villageNumber
     * @return
     */
    @Override
    public List<AduitInfo> findToBeAduit(Long villageNumber) {
        List<AduitInfo> list=aduitMapper.FirstAduit(villageNumber);
        //帮扶措施的审核内容


        list=HelpInsertName(list);
        return list;
    }
    //另一个版本，
    @Override
    public List<AduitInfo> findToBeAduit2(Long villageNumber) {
        List<AduitInfo> list=new ArrayList<>();
        if(aduitMapper.FirstAduit2(villageNumber)!=null && !aduitMapper.FirstAduit2(villageNumber).isEmpty())
        {
            list.addAll(aduitMapper.FirstAduit2(villageNumber));
            list=HelpInsertName(list);
        }
        //这个是要处理一下的，得到具体的
        //先查询数据库中需要第一书记审核的内容
        List<String> list2=aduitMapper.findTable();//明确数据库中还有多少没有审核
        if(list2.size()==0&&list2.isEmpty())
        {
            //数据库中没有要审核的信息，直接返回null
            return list;
        }
        else
        {
            //至少证明数据库中有要审核的信息
            for(int i=0;i<list2.size();i++)
            {
                Map<String,String> map=new HashMap<>();
                map.put("table",list2.get(i).toLowerCase());
                map.put("upTable",list2.get(i).toUpperCase());
                map.put("year","201712");

                map.put("village",villageNumber.toString());
                log.info("村编号++++++++++++++++++++++++++++++++++==="+villageNumber.toString());
                log.info("表名称++++++++++++++++++++++++++++++++++==="+list2.get(i));
                if(aduitMapper.findAduitInfo(map).size()==0 && aduitMapper.findAduitInfo(map).isEmpty())
                {
                    //集合为空不做任何处理
                    continue;
                }
                else
                {
                    log.info("查出来的东西"+aduitMapper.findAduitInfo(map));
                    //list.addAll(aduitMapper.findAduitInfo(map));
                    if(aduitMapper.findAduitInfo(map)==null)
                    {
                        return list;
                    }
                    else
                    {
                        list.addAll(aduitMapper.findAduitInfo(map));
                    }
                    log.info("++++++++++++查询来的集合++++++++++++"+list.toString());
                }
                log.info("循环执行"+i+"次");
            }
        }
        Comparator comparator=Collections.reverseOrder();
        Collections.sort(list,comparator);
        return list;
        //帮扶措施的审核内容



        /*list=HelpInsertName(list);
        return list;*/
    }

    /**
     * 验证是否为由第一书记
     * @param helpNumber
     * @return
     */
    @Override
    public Integer isFirstAduit(String helpNumber) {
        return helpUserMapper.isFirstAduit(helpNumber);
    }

    /**
     * 根据第一书记，得到相应的行政村编号
     * @param helpNumber
     * @return
     */
    @Override
    public Long findVillage(Long helpNumber) {
        return aduitMapper.findVillageNumber(helpNumber);
    }

    /**
     * 根据修改编号，进行审核(区别对待帮扶措施和贫困户信息审核)
     * @param dataId
     * @return
     */
    @Override
    public synchronized Integer aduitInfo(String dataId,String m,String first) {
        Map map=new HashMap();
        map.put("dataId",dataId);
        map.put("first",first);
        try {
            m   =   java.net.URLDecoder.decode(m,   "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        if("兜底保障".equals(m)||"易地搬迁".equals(m)||"危房改造".equals(m)||"生态扶贫".equals(m)||"教育扶贫".equals(m)||"健康扶贫".equals(m)||"就业创业".equals(m)||"产业扶贫".equals(m))
        {
            //需要去八个一批表中信息审核通过


            map.put("first",first);
            return aduitMapper.updateFirstSecretaryEight(map);
        }
        else
        {

            return aduitMapper.updateFirstSecretary(map);
        }
    }

    /**
     * 根据year和帮扶干部编号查询相应的要审核信息，然后返回
     * @param map
     * @return
     */
    @Override
    public List<EvidenceFirstModel> firstAduit(Map<String,String> map) {

        //根据帮扶干部编号查询对应的审核信息
        List<EvidenceFirstModel> list=aduitMapper.findEvidenceAduit(map);
        if(list!=null && list.size()>0)
        {
            for(int i=0;i<list.size();i++)
            {
                //处理每一个类别
                list.get(i).setImageType(EvidenceEnum.mapEvidence.get(list.get(i).getImageType()));
            }
        }
        //处理完成，可以返回
        return list;
    }
    //佐证的详情，图片查看

    @Override
    public ResultData evidenceDetail(String id) {
        if(id==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        //保证参数的传递
        List<String> list=aduitMapper.evidenceDDDetail(id);
        if(list==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"暂无数据");
        }
        Map<String,Object> map=new HashMap<>();
        map.put("detail",list);
        map.put("id",id);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",map);
    }

    /**
     * 第一书记或者包村干部初审信息
     * @param map
     * @return
     */
    @Override
    public synchronized ResultData evidenceAduitFirst(Map<String, String> map) {

        if(map.get("id")==null ||map.get("type")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        Integer num=aduitMapper.updateEvidenceFirst(map);
        if("1".equals(map.get("type")) && num==1)
        {
            //确认审核已经通过
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"审核成功");
        }
        else if("4".equals(map.get("type")) && num==1)
        {
            //确认审核已经通过
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"审核成功");
        }
        else
        {
            //审核不通过
            return ResultData.returnResultData(ResultData.DATA_FALSE,"审核失败");
        }

    }
}
