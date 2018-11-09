package com.sysh.util;

/**
 * ClassName:  <br/>
 * Function: 村基本信息工具类<br/>
 * date: 2018年06月10日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class VillageBasicUtil {

    /**
     * 是否同水泥路
     * @param s
     * @return
     */
    public static  String PassageWay(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "否";
        }
    }

    /**
     * 是否通客运班车
     * @param s
     * @return
     */
    public static String IsShuttleBus(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }

    /**
     * 根据字符串末尾判断男女
     * @param s
     * @return
     */
    public static String IsSex(String s)
    {
        Integer ss=Integer.parseInt(s.substring(10));
        if(ss%2==0)
        {
            return "女";
        }
        else {
            return "男";
        }
    }

    /**
     * 村路是否畅通
     * @param s
     * @return
     */
    public static String IsVillRoad(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }

    /**
     * 是否油返砂
     * @param s
     * @return
     */
    public static String IsOilToSand(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }

    /**
     * 是否有集中供水点
     * @param s
     * @return
     */
    public static String IsFousWater(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }

    /**
     * 是否通自来水
     * @param s
     * @return
     */
    public static String IsTapWater(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }
    /**
     * 是否有自然村生产用电输变线路和设施
     * @param s
     * @return
     */
    public static String IsNaturalElectric(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }
    /**
     * 是否有贫困户生活生产用电输变 电线路和设施
     * @param s
     * @return
     */
    public static String IsPovertyElectric(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }else if("0".equals(s))
        {
            return "否";
        }
        else
        {
            return "否";
        }
    }
}
