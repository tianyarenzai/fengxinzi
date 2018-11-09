package com.sysh.vo;

import java.io.Serializable;

/**
 * 第一书记或者报错干部登陆成功之后的审核，可以看到的大体信息
 * Created by sjy Cotter on 2018/8/22.
 */

public class EvidenceFirstModel implements Serializable {

    private  String id, accountNo,imageType,uploadTime;
    //自增长序列，户编号，图片类型，上传时间

    public EvidenceFirstModel(String id, String accountNo, String imageType, String uploadTime) {
        this.id = id;
        this.accountNo = accountNo;
        this.imageType = imageType;
        this.uploadTime = uploadTime;
    }

    public EvidenceFirstModel() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    @Override
    public String toString() {
        return "EvidenceFirstModel{" +
                "id='" + id + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", imageType='" + imageType + '\'' +
                ", uploadTime='" + uploadTime + '\'' +
                '}';
    }
}
