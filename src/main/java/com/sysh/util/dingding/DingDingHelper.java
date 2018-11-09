package com.sysh.util.dingding;

import com.dingtalk.open.client.api.model.corp.CorpUserBaseInfo;
import com.dingtalk.open.client.api.model.corp.CorpUserDetail;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年06月20日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class DingDingHelper {

    public static String getUserMobile(String s)
    {
        try {
            String AccessToken= AuthHelper.getAccessToken();
            System.out.println(AccessToken);
            String Ticket=AuthHelper.getJsapiTicket(AccessToken);
            try {
                CorpUserBaseInfo UserInfo = UserHelper.getUserInfo(AccessToken,s);
                System.out.println(UserInfo.toString());
                CorpUserDetail userDetail=UserHelper.getUser(AccessToken,UserInfo.getUserid());
                System.out.println("个人信息"+userDetail.getMobile()+"个人电话"+userDetail.getName());
                return userDetail.getMobile().toString();
            } catch (Exception e) {
                e.printStackTrace();
            }


        } catch (OApiException e) {
            e.printStackTrace();
        }
        return null;
    }

    public  static void  main(String args[])
    {
        String s= DingDingHelper.getUserMobile("b26548c9c2d9331da02e6f62c9107674");
        System.out.println(s);
    }
}
