package com.sysh.util;

import net.sf.json.JSONObject;

import java.util.Map;

public class mapToJson {

    public static String ToJson(Map<String,Object> map, String callback)
    {
        String jsonObject= JSONObject.fromObject(map).toString();
        jsonObject=callback+"("+jsonObject+")";
        return jsonObject;
    }
}
