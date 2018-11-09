package com.sysh.service;

import com.sysh.util.ResultData;

import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/23.
 */
public interface SubmitService {

    ResultData submitData(Map<String, String> map);

    ResultData submitEight(String helpNumber);
}
