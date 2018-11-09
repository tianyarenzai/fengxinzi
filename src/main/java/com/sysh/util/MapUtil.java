package com.sysh.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 给集合添加值，专门用于不想等的修改添加
 * Created by sjy Cotter on 2018/7/21.
 */
public class MapUtil {

    public static final Map<String,String> villageBasic()
    {
        Map<String,String> map=new HashMap<>();
        map.put("aar100","有效标志");
        map.put("aaf031","职务");
        map.put("aar012","联系电话");
        map.put("aad004","村属性");
        map.put("aad035","发展方向属性");
        map.put("aad038","大学生村官人数");
        map.put("aad037","中共党员人数");
        map.put("aad036","地形地貌属性");
        map.put("aar101","经度");
        map.put("aar102","纬度");
        map.put("aad019","耕地面积");
        map.put("aad027","有效浇灌面积");
        map.put("aad021","林地面积");
        map.put("aad022","退耕还林面积");
        map.put("aad023","林果面积");
        map.put("aad024","牧草地面积");
        map.put("aad025","水域面积");
        map.put("aad005","总户数");
        map.put("aad302","村级集体经济收入");
        map.put("aad301","农民那个人均纯收入（元）");
        map.put("aad311","参加新型农村合作医疗人数");
        map.put("aad313","参加城乡居民基本养老保险人数");
        map.put("aad314","参加城镇职工基本养老保险人数");
        map.put("aad006","自然村（村民小组）数");
        map.put("aad008","低保户数");
        map.put("aad009","五保户数");
        map.put("aad010","总人口数");
        map.put("aad012","低保人口数");
        map.put("aad013","五保人口数");
        map.put("aad014","少数民族人口数");
        map.put("aad015","妇女人口数");
        map.put("aad016","残疾人口数");
        map.put("aad017","劳动力人数");
        map.put("aad018","外出务工人数");
        map.put("aad328","到乡镇是否通沥青（水泥）路");
        map.put("aad323","是否通客运班车");
        map.put("aad331","未实现饮水安全户数");
        map.put("aad332","饮水困难户数");
        map.put("aad358","已通电自然村（20户以上）数（个）");
        map.put("aad361","危房户数");
        map.put("aad371","农民专业合作社个数");
        map.put("aad381","开展乡村旅游的户数");
        map.put("aad383","乡村旅游从业人员数");
        map.put("aad382","经营农家乐的户数");
        map.put("aad384","经营农家乐户年均收入");
        map.put("aad391","行政村卫生室个数");
        map.put("aad392","行政村公共卫生厕所个数");
        map.put("aad393","行政村执业（助理）医师（人）");
        map.put("aad394","行政村生产生活垃圾集中堆放点个数（个）");
        map.put("aad401","行政村文化（图书）室个数（个）");
        map.put("aad411","通宽带户数（户）");
        map.put("aad412","通宽带的村小学个数（个）");
        map.put("aad413","能用手机上网的户数（户）");
        map.put("aad414","行政村信息员个数");
        map.put("aac016","变更年度");
        map.put("aar011","村负责人");
       // map.put("aad381","开展乡村旅游的户数");

        return map;
    }

    public static final Map<String,String> mapHelp()
    {
        Map<String,String> map=new HashMap<>();
        map.put("aab002","姓名");
        map.put("aab003","性别");
        map.put("aap001","单位名称");
        map.put("aak888","派出单位职务");
        map.put("aab004","证件号码");
        map.put("aar012","联系电话");
        map.put("aak033","政治面貌");
        map.put("aak036","学历");
        map.put("aak037","技术特长");
        map.put("aac029","户主姓名");
        map.put("aac001","户主编号");
        map.put("aar020","开始时间");
        map.put("aar021","结束时间");
        return map;
    }
}
