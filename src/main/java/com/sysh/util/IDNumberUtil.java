package com.sysh.util;

/**
 * ClassName:  <br/>
 * Function: 身份证号工具类<br/>
 * date: 2018年06月13日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class IDNumberUtil {
    /**
     * 截取身份证的性别
     * @param s
     * @return
     */
    public static String sex(String s)
    {
        String ss=s.substring(16,17);
        if(Integer.parseInt(ss)%2==0)
        {
            return "女";
        }
        else
        {
            return "男";
        }
    }

    /**
     * 区别身份证和残疾证
     * @param s
     * @return
     */
    public static String IsIdNumber(String s)
    {
        String ss=s.substring(0,17);
        return ss;
    }


}
