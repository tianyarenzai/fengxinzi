package com.sysh.util;

import lombok.Data;

@Data
public class ResultData {

    public static final int RESULT_SUCCESS = 2000;

    public static final int DATA_MISS = 1004;

    public static final int DATA_FALSE = 1005;

    public static final int SYSTEM_FALSE = 1009;

    public static final int NON_LOGIN = 3000;

    public static final int NON_PERMISSION = 4000;

    private int code;

    private String message;

    private Object data;

    public ResultData(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultData returnResultData(int result,Object data){
        switch (result){
            case DATA_MISS : return new ResultData(DATA_MISS,"数据缺失",data);
            case DATA_FALSE : return new ResultData(DATA_FALSE,"数据有误",data);
            case RESULT_SUCCESS : return new ResultData(RESULT_SUCCESS,"未处理数据",data);
            case SYSTEM_FALSE : return new ResultData(SYSTEM_FALSE,"数据错误",data);
            case NON_PERMISSION : return new ResultData(NON_PERMISSION,"无请求权限",data);
            case NON_LOGIN : return new ResultData(NON_LOGIN,"未登录",data);
            default : return new ResultData(RESULT_SUCCESS,"成功处理了数据",data);
        }
    }

    public static ResultData returnResultData(int result,String message,Object data){
        switch (result){
            case DATA_MISS : return new ResultData(DATA_MISS,message,data);
            case DATA_FALSE : return new ResultData(DATA_FALSE,message,data);
            case RESULT_SUCCESS : return new ResultData(RESULT_SUCCESS,message,data);
            case SYSTEM_FALSE : return new ResultData(SYSTEM_FALSE,message,data);
            case NON_PERMISSION : return new ResultData(NON_PERMISSION,message,data);
            case NON_LOGIN : return new ResultData(NON_LOGIN,message,data);
            default : return new ResultData(RESULT_SUCCESS,message,data);
        }
    }

    public static ResultData returnResultData(int result,String message){
        switch (result){
            case DATA_MISS : return new ResultData(DATA_MISS,message,null);
            case DATA_FALSE : return new ResultData(DATA_FALSE,message,null);
            case RESULT_SUCCESS : return new ResultData(RESULT_SUCCESS,message,null);
            case SYSTEM_FALSE : return new ResultData(SYSTEM_FALSE,message,null);
            case NON_PERMISSION : return new ResultData(NON_PERMISSION,message,null);
            case NON_LOGIN : return new ResultData(NON_LOGIN,message,null);
            default : return new ResultData(RESULT_SUCCESS,message,null);
        }
    }

    public static ResultData returnResultData(int result){
        return returnResultData(result,null);
    }


}
