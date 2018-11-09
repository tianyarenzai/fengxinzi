package com.sysh.entity.aduit;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName:  <br/>
 * Function: 审核通过，未通过，待审核，详情展示<br/>
 * date: 2018年06月17日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class AduitDetailInfo implements Serializable {

    private String infoName,updateBefore,updateAfter;//信息内容，信息变更前，信息变更后
    private String dataReviewId;//得到外间编号，便于信息审核的时候使用，确认审核

    public AduitDetailInfo(String infoName, String updateBefore, String updateAfter, String dataReviewId) {
        this.infoName = infoName;
        this.updateBefore = updateBefore;
        this.updateAfter = updateAfter;
        this.dataReviewId = dataReviewId;
    }

    public String getDataReviewId() {
        return dataReviewId;
    }

    public void setDataReviewId(String dataReviewId) {
        this.dataReviewId = dataReviewId;
    }

    public AduitDetailInfo() {
        super();
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName;
    }

    public String getUpdateBefore() {
        return updateBefore;
    }

    public void setUpdateBefore(String updateBefore) {
        this.updateBefore = updateBefore;
    }

    public String getUpdateAfter() {
        return updateAfter;
    }

    public void setUpdateAfter(String updateAfter) {
        this.updateAfter = updateAfter;
    }


    @Override
    public String toString() {
        return "AduitDetailInfo{" +
                "infoName='" + infoName + '\'' +
                ", updateBefore='" + updateBefore + '\'' +
                ", updateAfter='" + updateAfter + '\'' +
                ", dataReviewId=" + dataReviewId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AduitDetailInfo that = (AduitDetailInfo) o;
        return Objects.equals(infoName, that.infoName) &&
                Objects.equals(updateBefore, that.updateBefore) &&
                Objects.equals(updateAfter, that.updateAfter) &&
                Objects.equals(dataReviewId, that.dataReviewId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(infoName, updateBefore, updateAfter, dataReviewId);
    }
}
