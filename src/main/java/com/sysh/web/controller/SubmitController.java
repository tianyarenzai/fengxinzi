package com.sysh.web.controller;

import com.sysh.service.SubmitService;
import com.sysh.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by sjy Cotter on 2018/8/23.
 */
@RestController
@RequestMapping(value = "/submit")
public class SubmitController {
    @Autowired
    private SubmitService submitService;

    @RequestMapping(value = "/dataview")
    ResultData DataView(@RequestParam Map<String,String> map)
    {
        ResultData resultData=submitService.submitData(map);
        return resultData;
    }
    @RequestMapping(value = "/eight")
    ResultData EightReview(String helpNumber)
    {
        ResultData resultData=submitService.submitEight(helpNumber);
        return resultData;
    }

}
