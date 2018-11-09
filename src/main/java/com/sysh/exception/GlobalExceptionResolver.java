package com.sysh.exception;

import com.sysh.util.JsonUtils;
import com.sysh.util.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * @DESCRIPTION ：
 * @AUTHOR ：cxm
 * @CREATETIME ：2018-07-16 12:03
 **/
public class GlobalExceptionResolver implements HandlerExceptionResolver {


    private final Logger log = LoggerFactory.getLogger(GlobalExceptionResolver.class);
    /**
     * 全局异常处理器
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        //使用response返回json错误信息
        httpServletResponse.setStatus(HttpStatus.OK.value());//设置状态码
        httpServletResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);//设置json
        try {
            httpServletRequest.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }
        httpServletResponse.setCharacterEncoding("utf-8");
        httpServletResponse.setHeader("Cache-Control","no-cache,must-revalidate");
        try {
            log.error(e.getMessage());
            log.error(e.getLocalizedMessage());
            ResultData resultData = ResultData.returnResultData(ResultData.SYSTEM_FALSE,"服务端发生错误",e.getMessage());
            httpServletResponse.getWriter().write(JsonUtils.objectToJson(resultData));
        }catch (IOException ex){
            ex.printStackTrace();
        }
        log.debug("服务端异常："+e.getMessage());
        return mv;
    }
}
