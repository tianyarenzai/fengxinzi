package com.sysh.service.impl;

import com.sysh.entity.AK11AC08DD;
import com.sysh.entity.AK11DD;
import com.sysh.entity.helpSignIn.SignInModel;
import com.sysh.entity.helplog.DiscussDD;
import com.sysh.entity.helplog.HelpImageModel;
import com.sysh.entity.helplog.HelpLogModel;
import com.sysh.mapper.AA10TABLEMapper;
import com.sysh.mapper.AK11DDMapper;
import com.sysh.mapper.HelpUserMapper;
import com.sysh.mapper.PositionMapper;
import com.sysh.service.HelpUserService;
import com.sysh.util.DateUtil;
import com.sysh.util.PovertyDetailUtil;
import com.sysh.util.ResultData;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月11日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
@Service
public class HelpUserServiceImpl implements HelpUserService {

    Logger log=Logger.getLogger(this.getClass());
    //TODo 生产环境下的真实路径
    public static final String HTTPPATH="http://117.39.29.85:8888/img/";

    @Autowired
    private PositionMapper positionMapper;
    @Autowired
    private HelpUserMapper helpUserMapper;
    @Autowired
    private AK11DDMapper ak11DDMapper;
    @Autowired
    private AA10TABLEMapper aa10TABLEMapper;
    /**
     * 根据帮扶干部编号得到签到时间得List,需要传入的参数分别为帮扶责任人编号和年月进行模糊查询
     * @param map
     * @return 20180613
     */
    @Override
    public List<String> findHelpSignIn(Map<String,Object> map) {
        //根据编号进行查找，帮扶责任人上传日志，签到得时间
        if(map.get("data")==null)
        {
            map.put("data", DateUtil.NowDateMonth());
        }

        List<String> list=positionMapper.findPosition(map);
        return list;
    }

    /**
     * 帮扶日志添加日志，将信息添加完后，再将id传递给图片得外键
     * @param map
     * @return
     */
    @Override
    public synchronized Long  insertHelpLog(Map<String,Object> map) {

        HelpLogModel helpLogModel=new HelpLogModel((String)map.get("helpLog"),(String)map.get("helpTime"),(String)map.get("helpNumber"),0L,Long.parseLong((String)map.get("visitingMode")));
        Long num=helpUserMapper.insertHelpLog(helpLogModel);
        Long primaryHelpLog=helpLogModel.getId();//得到当前信息的ID

        //存储图片得路径，图片路径全部存进数据库
        //TODo 存储图片路径
        List<String> list=(List<String>) map.get("imageList");
        log.info("看看文件路径有几个"+list.toString());
        Integer count=0;
        for(int i=0;i<list.size();i++)
        {
            Integer insertNum=helpUserMapper.insertHelpImage(new HelpImageModel("0",HTTPPATH+list.get(i),primaryHelpLog.toString(),(String)map.get("helpNumber")));
            log.info("添加成功了没"+insertNum);
        }
        return num;
    }
    /**
     * 查询帮扶日志的详细情况，自己上传的，
     * @param helpNumber
     * @return
     */
    @Override
    public List<HelpLogModel> findHelpLog(Long helpNumber) {
        List<HelpLogModel> list=helpUserMapper.findHelpLogByHelpNum(helpNumber);
        //将帮扶日志的帮扶干部编号，处理成帮扶干部姓名
        log.info(list.toString());
        //for循环返回日志内容和图片路径
        if(list.size()==0)
        {
            return null;
        }
        else
        {
            for (HelpLogModel h: list
                    ) {
                    log.info(h.toString());
                    String s=ak11DDMapper.findAk11Name(h.getHelpNumber());
                    h.setHelpNumber(s);
                    h.setList(helpUserMapper.findImagePath(h.getId().longValue()));
                    List<DiscussDD> discussDDList=helpUserMapper.findDIscussDDList(h.getId());
                    //将所有的评论人员的编号更改为姓名
                    for(int i=0;i<discussDDList.size();i++)
                    {
                        discussDDList.get(i).setHelpNumber(ak11DDMapper.findAk11Name(discussDDList.get(i).getHelpNumber()));
                    }
                    h.setDiscussList(discussDDList);
            }
            return list;
        }

    }

    /**
     * 查询全部的帮扶日志，不用输入编号
     * @return
     */
    @Override
    public List<HelpLogModel> findHelpLogAll() {

        List<HelpLogModel> list=helpUserMapper.findHelpLogAll();
        //log.info("全查出来有多少"+list.size());
        if(list.size()==0)
        {
            return null;
        }else
        {
            for (HelpLogModel h:list
                    ) {
                String s=ak11DDMapper.findAk11Name(h.getHelpNumber());
                h.setHelpNumber(s);
                h.setList(helpUserMapper.findImagePath(h.getId().longValue()));
                //h.setDiscussList(helpUserMapper.findDIscussDDList(h.getId()));
                List<DiscussDD> discussDDList=helpUserMapper.findDIscussDDList(h.getId());
                //将所有的评论人员的编号更改为姓名
                for(int i=0;i<discussDDList.size();i++)
                {
                    discussDDList.get(i).setHelpNumber(ak11DDMapper.findAk11Name(discussDDList.get(i).getHelpNumber()));
                }
                h.setDiscussList(discussDDList);
                //log.info(h.toString());
            }
            return list;
        }
    }
    /**
     * 签到信息的增加，
     * @param signInModel
     * @return
     */
    @Override
    public synchronized Integer insertPosition(SignInModel signInModel) {
        Integer num=0;
        //将当前时间获取到，并传入类中
        signInModel.setHelpTime(DateUtil.NowDate().toString());
        //先去查询库里面有没有这个签到信息，当前时间，如果有，就返回已签到信息，
        if(positionMapper.IsPosition(signInModel)==0)
        {
            return positionMapper.insertPosition(signInModel);
        }
        else
        {
            return 1;
        }
    }

    /**
     * 查询帮扶责任人的具体详情
     * @param povertyNumber
     * @return
     */
    @Override
    public AK11DD findAK11(String helpNumber) {
        AK11DD ak11DD= ak11DDMapper.findAk11DD(helpNumber);
        if(ak11DD.getAaf031()!=null)
        {
            ak11DD.setAaf031(aa10TABLEMapper.Position(ak11DD.getAaf031()));
        }
        if("1".equals(ak11DD.getAak031()))
        {
            //队长标志
            ak11DD.setAak031("是");
        }
        else
        {
            ak11DD.setAak031("否");
        }
        if("1".equals(ak11DD.getAak032()))
        {
            ak11DD.setAak032("是");
        }
        else
        {
            ak11DD.setAak032("否");
        }
        if("1".equals(ak11DD.getAak039()))
        {
            ak11DD.setAak039("是");
        }
        else
        {
            ak11DD.setAak039("否");
        }
        return ak11DD;

    }

    /**
     * 添加赞数
     * @param id
     * @return
     */
    @Override
    public synchronized Integer insertHelpLogPraise(String id) {
        Integer praiseNum=helpUserMapper.selectByid(id);
        Integer num=praiseNum+1;
        Map<String,String> map=new HashMap<>();
        map.put("id",id);
        map.put("number",num.toString());
        return helpUserMapper.isnertPraise(map);
    }

    /**
     * 是否驻村
     * @param helpNumber
     * @return
     */
    @Override
    public Integer isResidency(String helpNumber) {
        return helpUserMapper.isResidency(helpNumber);
    }

    @Override
    public synchronized Integer insertDiscuss(DiscussDD discussDD) {
        return helpUserMapper.insertDiscuss(discussDD);
    }

    /**
     * 查询要评论得人的姓名
     * @param s
     * @return
     */
    @Override
    public ResultData findHelpName(String s) {

        String ss=helpUserMapper.findHelpName(s);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",ss);
    }

    @Override
    public synchronized ResultData updateHelpDetail(AK11DD ak11DD) {

        //对数据进行处理
        Integer num=ak11DDMapper.updateHelpDetail(ak11DD);
        if(num==1)
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",1);
        }else
        {
            return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"false",0);
        }

        //return null;
    }

    /**
     * 判断是否签到
     * @param helpNumber
     * @return
     */
    @Override
    public ResultData isSign(String helpNumber) {
        SignInModel signInModel=new SignInModel();
        signInModel.setHelpTime(DateUtil.NowDate().toString());
        signInModel.setHelpNumber(helpNumber);
        Integer num=positionMapper.IsPosition(signInModel);
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",num);
    }

    /**
     * 最新的帮扶干部信息修改，最新
     * @param
     * @return
     */
    @Override
    public ResultData helpNumberDetail(Map<String,String> map) {

        if(map.get("helpNumber")==null || map.get("year")==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"参数不足");
        }
        AK11AC08DD ak11AC08DD = ak11DDMapper.findAk11Ac08(map);
        if(ak11AC08DD==null)
        {
            return ResultData.returnResultData(ResultData.DATA_MISS,"查无数据");
        }
        //性别
        if (ak11AC08DD.getAab003() != null)
        {
            ak11AC08DD.setAab003(PovertyDetailUtil.ISSex(ak11AC08DD.getAab003()));//转化性别
        }
        //政治面貌
        if(ak11AC08DD.getAak033()!=null)
        {
            ak11AC08DD.setAak033(aa10TABLEMapper.PoliticalOutlook(ak11AC08DD.getAak033()));
        }
        //学历
        if(ak11AC08DD.getAak036()!=null)
        {
            ak11AC08DD.setAak036(aa10TABLEMapper.findEducation(ak11AC08DD.getAak036()));
        }
        //技术特长
        if(ak11AC08DD.getAak037()!=null)
        {
            ak11AC08DD.setAak037(aa10TABLEMapper.SelectTechnicalExpertise(ak11AC08DD.getAak037()));
        }
        return ResultData.returnResultData(ResultData.RESULT_SUCCESS,"ok",ak11AC08DD);
    }
}
