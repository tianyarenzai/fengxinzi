package com.sysh.util;

import org.springframework.format.datetime.DateFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:  <br/>
 * Function: 时间工具类<br/>
 * date: 2018年06月09日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class DateUtil {
    /**
     * 截取年份判断年龄
     * @return
     */
    public static Long age(String s)
    {
        Date d =new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy");
        String ss=simpleDateFormat.format(d);
        Long result=null;

        if(Long.valueOf(s.substring(0,4))<Long.valueOf(ss))
        {
            return   result=Long.valueOf(ss)-Long.valueOf(s.substring(0,4));
        }else
        {
            return result;
        }


    }

    /**
     * 得到当前时间组合的时间，作为删改的数据
     * @return
     */
    public static Long NowDate()
    {
        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMdd");
        String s=simpleDateFormat.format(d);
        return Long.valueOf(s);
    }
    /**
     * 得到当前时间组合的时间，时分秒
     * @return
     */
    public static Long NowDateSecond()
    {
        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMMddhhmmss");
        String s=simpleDateFormat.format(d);
        return Long.valueOf(s);
    }
    /**
     * 得到当前时间组合的时间，时分
     * @return
     */
    public static Long NowDateMonth()
    {
        Date d=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyyMM");
        String s=simpleDateFormat.format(d);
        return Long.valueOf(s);
    }
}
