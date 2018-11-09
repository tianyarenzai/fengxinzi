package com.sysh.util;

import net.sf.json.JSONObject;

import java.util.Map;

public class ToJson {

    /**
     * 转化成jsonp对象
     * @param map
     * @param callback
     * @return
     */
    public static String toJson(Map<String,Object> map, String callback)
    {
        String jsonObject= JSONObject.fromObject(map).toString();
        jsonObject=callback+"("+jsonObject+")";
        return jsonObject;
    }

    /**
     * 转化成jsonp对象
     * @param s
     * @param callback
     * @return
     */
    public static String StringtoJson(String s, String callback)
    {
        String jsonObject= JSONObject.fromObject(s).toString();
        jsonObject=callback+"("+jsonObject+")";
        return jsonObject;
    }

   /* public static String toString(Map<String,Object> map)
    {
        String jsonObject= JSONObject.fromObject(map).toString();
        //jsonObject=callback+"("+jsonObject+")";

        try {
            compress(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }*/


    /**
     * 文件压缩，但是压缩效果不是很明显，还有待改进，反而由于反复更换类型，致使性能更差
     */
    /*public static String compress(String str) throws IOException {
        if (null == str || str.length() <= 0) {
            return str;
        }
        // 创建一个新的输出流
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // 使用默认缓冲区大小创建新的输出流
        GZIPOutputStream gzip = new GZIPOutputStream(out);
        // 将字节写入此输出流
        gzip.write(str.getBytes("utf-8"));  //因为后台默认字符集有可能是GBK字符集，所以此处需指定一个字符集
        gzip.close();
        // 使用指定的 charsetName，通过解码字节将缓冲区内容转换为字符串
        return out.toString("ISO-8859-1");
    }*/





}
