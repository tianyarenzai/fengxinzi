package com.sysh.util;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月08日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class PovertyDetailUtil {

    //是否军烈属
    public static String IsMilitaryGenus(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return s="";
    }
    //是否独生子女户
    public static String IsOneChild(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return s="";
    }
    //是否独生子女户
    public static String IsTwoGirl(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return s="";
    }

    /**
     * 是否参加农村合作社
     * @param s
     * @return
     */
    public static String IsJoinRuralCoOperatives(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return "";
    }

    /**
     * 通生产水电
     * @param s
     * @return
     */
    public static String IsHydroelectricPower(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return "";
    }

    /**
     * 有无危房户
     * @param s
     * @return
     */
    public static String IsHOuseDanger(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }
        return "";
    }

    /**
     * 是否搬迁
     * @param s
     * @return
     */
    public static String IsMove(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "否";
        }
    }

    /**
     * 性别
     * @param s
     * @return
     */
    public static String ISSex(String s)
    {
        if("1".equals(s))
        {
            return "男";
        }
        else if("2".equals(s))
        {
            return "女";
        }
        else
        {
            return "未说明的性别";
        }

    }

    /**
     * 是否现役军人
     * @param s
     * @return
     */
    public static String IsServicemen(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "否";
        }
    }

    /**
     * 是否享受低保
     * @param s
     * @return
     */

    public static String IsLowInsurance(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "否";
        }
    }
    /**
     * 是否安全饮水
     * @param s
     * @return
     */

    public static String IsSafeWater(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "否";
        }
    }
    /**
     * 是否饮水困难
     * @param s
     * @return
     */

    public static String IsDifficult(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "是";
        }
    }

    /**
     * 是否驻村队员
     * @param s
     * @return
     */
    public static String IsVillageTeam(String s)
    {
        if("1".equals(s))
        {
            return "是";
        }
        else if("0".equals(s))
        {
            return "否";
        }else
        {
            return "是";
        }
    }

    /**
     * 有效标志
     * @param s
     * @return
     */
    public static String IsEffective(String s)
    {
        if("1".equals(s))
        {
            return "有效";
        }
        else if("0".equals(s))
        {
            return "无效";
        }else
        {
            return "无效";
        }
    }

    /**
     * 是否参加农村合作医疗
     * @param s
     * @return
     */
    public static String IsJoinRuralCooperativeMedicalCare(String s)
    {
        if("1".equals(s))
        {
            return "参加";
        }
        else if("0".equals(s))
        {
            return "未参加";
        }else
        {
            return "未参加";
        }
    }

    /**
     * 是否参加新型农村社会养老保险
     * @param s
     * @return
     */
    public static String IsRuralSocialEndowmentInsurance(String s)
    {
        if("1".equals(s))
        {
            return "参加";
        }
        else if("0".equals(s))
        {
            return "未参加";
        }else
        {
            return "未参加";
        }
    }

    /**
     * 是否参加大病保险
     * @param s
     * @return
     */
    public static String IsCriticalIllnessInsurance(String s)
    {
        if("1".equals(s))
        {
            return "参加";
        }
        else if("0".equals(s))
        {
            return "未参加";
        }else
        {
            return "未参加";
        }
    }


}
