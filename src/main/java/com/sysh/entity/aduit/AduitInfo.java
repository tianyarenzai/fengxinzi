package com.sysh.entity.aduit;

import java.io.Serializable;

/**
 * ClassName:  <br/>
 * Function: 进入审核界面的信息<br/>
 * date: 2018年06月17日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class AduitInfo implements Comparable<AduitInfo> {

    private Long id,DataReviewTime;//这个ID加入界面点击详情的时候进行访问，可以查到具体的变化指标
    private String ModifyType,aac001;

    public AduitInfo(Long id, String aac001, Long dataReviewTime, String modifyType) {
        this.id = id;
        this.aac001 = aac001;
        DataReviewTime = dataReviewTime;
        ModifyType = modifyType;
    }

    public AduitInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAac001() {
        return aac001;
    }

    public void setAac001(String aac001) {
        this.aac001 = aac001;
    }

    public Long getDataReviewTime() {
        return DataReviewTime;
    }

    public void setDataReviewTime(Long dataReviewTime) {
        DataReviewTime = dataReviewTime;
    }

    public String getModifyType() {
        return ModifyType;
    }

    public void setModifyType(String modifyType) {
        ModifyType = modifyType;
    }

    @Override
    public int compareTo(AduitInfo o) {
        if(Long.valueOf(this.DataReviewTime)>Long.valueOf(o.DataReviewTime))
        {
            return 1;
        }
        else if(Long.valueOf(this.DataReviewTime)<Long.valueOf(o.DataReviewTime))
        {
            return -1;
        }
        else
        {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "AduitInfo{" +
                "id=" + id +
                ", aac001=" + aac001 +
                ", DataReviewTime=" + DataReviewTime +
                ", ModifyType='" + ModifyType + '\'' +
                '}';
    }
}
