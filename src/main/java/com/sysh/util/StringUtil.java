package com.sysh.util;

/**
 * 工具类
 */
public class StringUtil {
    /**
     * 将字符串转化为整型
     * @param name
     * @return
     */
    public static Integer toInteger(String name)
    {
        Integer r=Integer.parseInt(name);
        return r;
    }

    /**
     * 验证字符串正确性，不能为空或者为null
     * @param name
     * @return
     */
    public static Integer StringValidator(String name)
    {
        if("".equalsIgnoreCase(name)||name==null)
        {
            return 1;
        }
        else
        {
            return toInteger(name);
        }
    }
}
