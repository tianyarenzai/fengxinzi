package com.sysh.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * 村基础信息的全部信息
 * Created by sjy Cotter on 2018/8/20.
 */

public class VillageNewModel implements Serializable {
    private String aar011,aaf031,aar012,aad004,aad035,aad038,aad037,
            aad036,aad019,aad027,aad021,aad022,aad023,aad024,aad025,aad005,aad006,aad008,aad009,aad010,aad012,
            aad013,aad014,aad015,aad016,aad017,aad018,aad301,aad302,aad311,aad313,aad328,aad323,aad331,
            aad332,aad358,aad361,aad371,aad381,aad383,aad382,aad384,aad391,aad392,aad393,aad394,aad401,aad411,aad413,
            aad412,aad414;
    //村负责人，村办公电话，村属性，村官人数，中共党员人数、百度经度、百度纬度、百度高程
    //耕地面积、有效灌溉面积（亩）、林地面积（亩）、退耕还林面积（亩）、林果面积（亩）、牧草地面积（亩）、水域面积（亩）
    //总户数、自然村（村民小组个数）、低保户数、五保户数、总人口数、低保人口数、五保人口数、低保贫困户数、低保贫困人口数、残疾人口数、残疾贫困人口数、外出务工人数、五保贫困户数、五保贫困人口数
    //农民人均纯收入（元）、村级集体经济收入（万元）
    //参加新型农村合作医疗人数、参加城乡居民基本养老保险人数
    //到乡镇是否通沥青路、是否通客运班车
    //未实现饮水安全户数
    //通生产用电自然村数
    //危房户数
    //农民专业合作社个数
    //开展乡村旅游的户数，乡村旅游从业人员数，经营农家乐的户数，经营农家乐年均收入
    //卫生室个数（个）、公共卫生厕所个数（个）、执业（助理）医师数（人）、垃圾集中堆放点个数（个）
    //行政村文化（图书）室个数（个）


    public VillageNewModel() {
        super();
    }

    public VillageNewModel(String aar011, String aaf031, String aar012, String aad004, String aad035, String aad038, String aad037, String aad036, String aad019, String aad027, String aad021, String aad022, String aad023, String aad024, String aad025, String aad005, String aad006, String aad008, String aad009, String aad010, String aad012, String aad013, String aad014, String aad015, String aad016, String aad017, String aad018, String aad301, String aad302, String aad311, String aad313, String aad328, String aad323, String aad331, String aad332, String aad358, String aad361, String aad371, String aad381, String aad383, String aad382, String aad384, String aad391, String aad392, String aad393, String aad394, String aad401, String aad411, String aad413, String aad412, String aad414) {
        this.aar011 = aar011;
        this.aaf031 = aaf031;
        this.aar012 = aar012;
        this.aad004 = aad004;
        this.aad035 = aad035;
        this.aad038 = aad038;
        this.aad037 = aad037;
        this.aad036 = aad036;
        this.aad019 = aad019;
        this.aad027 = aad027;
        this.aad021 = aad021;
        this.aad022 = aad022;
        this.aad023 = aad023;
        this.aad024 = aad024;
        this.aad025 = aad025;
        this.aad005 = aad005;
        this.aad006 = aad006;
        this.aad008 = aad008;
        this.aad009 = aad009;
        this.aad010 = aad010;
        this.aad012 = aad012;
        this.aad013 = aad013;
        this.aad014 = aad014;
        this.aad015 = aad015;
        this.aad016 = aad016;
        this.aad017 = aad017;
        this.aad018 = aad018;
        this.aad301 = aad301;
        this.aad302 = aad302;
        this.aad311 = aad311;
        this.aad313 = aad313;
        this.aad328 = aad328;
        this.aad323 = aad323;
        this.aad331 = aad331;
        this.aad332 = aad332;
        this.aad358 = aad358;
        this.aad361 = aad361;
        this.aad371 = aad371;
        this.aad381 = aad381;
        this.aad383 = aad383;
        this.aad382 = aad382;
        this.aad384 = aad384;
        this.aad391 = aad391;
        this.aad392 = aad392;
        this.aad393 = aad393;
        this.aad394 = aad394;
        this.aad401 = aad401;
        this.aad411 = aad411;
        this.aad413 = aad413;
        this.aad412 = aad412;
        this.aad414 = aad414;
    }

    public String getAar011() {
        return aar011;
    }

    public void setAar011(String aar011) {
        this.aar011 = aar011;
    }

    public String getAaf031() {
        return aaf031;
    }

    public void setAaf031(String aaf031) {
        this.aaf031 = aaf031;
    }

    public String getAar012() {
        return aar012;
    }

    public void setAar012(String aar012) {
        this.aar012 = aar012;
    }

    public String getAad004() {
        return aad004;
    }

    public void setAad004(String aad004) {
        this.aad004 = aad004;
    }

    public String getAad035() {
        return aad035;
    }

    public void setAad035(String aad035) {
        this.aad035 = aad035;
    }

    public String getAad038() {
        return aad038;
    }

    public void setAad038(String aad038) {
        this.aad038 = aad038;
    }

    public String getAad037() {
        return aad037;
    }

    public void setAad037(String aad037) {
        this.aad037 = aad037;
    }

    public String getAad036() {
        return aad036;
    }

    public void setAad036(String aad036) {
        this.aad036 = aad036;
    }

    public String getAad019() {
        return aad019;
    }

    public void setAad019(String aad019) {
        this.aad019 = aad019;
    }

    public String getAad027() {
        return aad027;
    }

    public void setAad027(String aad027) {
        this.aad027 = aad027;
    }

    public String getAad021() {
        return aad021;
    }

    public void setAad021(String aad021) {
        this.aad021 = aad021;
    }

    public String getAad022() {
        return aad022;
    }

    public void setAad022(String aad022) {
        this.aad022 = aad022;
    }

    public String getAad023() {
        return aad023;
    }

    public void setAad023(String aad023) {
        this.aad023 = aad023;
    }

    public String getAad024() {
        return aad024;
    }

    public void setAad024(String aad024) {
        this.aad024 = aad024;
    }

    public String getAad025() {
        return aad025;
    }

    public void setAad025(String aad025) {
        this.aad025 = aad025;
    }

    public String getAad005() {
        return aad005;
    }

    public void setAad005(String aad005) {
        this.aad005 = aad005;
    }

    public String getAad006() {
        return aad006;
    }

    public void setAad006(String aad006) {
        this.aad006 = aad006;
    }

    public String getAad008() {
        return aad008;
    }

    public void setAad008(String aad008) {
        this.aad008 = aad008;
    }

    public String getAad009() {
        return aad009;
    }

    public void setAad009(String aad009) {
        this.aad009 = aad009;
    }

    public String getAad010() {
        return aad010;
    }

    public void setAad010(String aad010) {
        this.aad010 = aad010;
    }

    public String getAad012() {
        return aad012;
    }

    public void setAad012(String aad012) {
        this.aad012 = aad012;
    }

    public String getAad013() {
        return aad013;
    }

    public void setAad013(String aad013) {
        this.aad013 = aad013;
    }

    public String getAad014() {
        return aad014;
    }

    public void setAad014(String aad014) {
        this.aad014 = aad014;
    }

    public String getAad015() {
        return aad015;
    }

    public void setAad015(String aad015) {
        this.aad015 = aad015;
    }

    public String getAad016() {
        return aad016;
    }

    public void setAad016(String aad016) {
        this.aad016 = aad016;
    }

    public String getAad017() {
        return aad017;
    }

    public void setAad017(String aad017) {
        this.aad017 = aad017;
    }

    public String getAad018() {
        return aad018;
    }

    public void setAad018(String aad018) {
        this.aad018 = aad018;
    }

    public String getAad301() {
        return aad301;
    }

    public void setAad301(String aad301) {
        this.aad301 = aad301;
    }

    public String getAad302() {
        return aad302;
    }

    public void setAad302(String aad302) {
        this.aad302 = aad302;
    }

    public String getAad311() {
        return aad311;
    }

    public void setAad311(String aad311) {
        this.aad311 = aad311;
    }

    public String getAad313() {
        return aad313;
    }

    public void setAad313(String aad313) {
        this.aad313 = aad313;
    }


    public String getAad328() {
        return aad328;
    }

    public void setAad328(String aad328) {
        this.aad328 = aad328;
    }

    public String getAad323() {
        return aad323;
    }

    public void setAad323(String aad323) {
        this.aad323 = aad323;
    }

    public String getAad331() {
        return aad331;
    }

    public void setAad331(String aad331) {
        this.aad331 = aad331;
    }

    public String getAad332() {
        return aad332;
    }

    public void setAad332(String aad332) {
        this.aad332 = aad332;
    }

    public String getAad358() {
        return aad358;
    }

    public void setAad358(String aad358) {
        this.aad358 = aad358;
    }

    public String getAad361() {
        return aad361;
    }

    public void setAad361(String aad361) {
        this.aad361 = aad361;
    }

    public String getAad371() {
        return aad371;
    }

    public void setAad371(String aad371) {
        this.aad371 = aad371;
    }

    public String getAad381() {
        return aad381;
    }

    public void setAad381(String aad381) {
        this.aad381 = aad381;
    }

    public String getAad383() {
        return aad383;
    }

    public void setAad383(String aad383) {
        this.aad383 = aad383;
    }

    public String getAad382() {
        return aad382;
    }

    public void setAad382(String aad382) {
        this.aad382 = aad382;
    }

    public String getAad384() {
        return aad384;
    }

    public void setAad384(String aad384) {
        this.aad384 = aad384;
    }

    public String getAad391() {
        return aad391;
    }

    public void setAad391(String aad391) {
        this.aad391 = aad391;
    }

    public String getAad392() {
        return aad392;
    }

    public void setAad392(String aad392) {
        this.aad392 = aad392;
    }

    public String getAad393() {
        return aad393;
    }

    public void setAad393(String aad393) {
        this.aad393 = aad393;
    }

    public String getAad394() {
        return aad394;
    }

    public void setAad394(String aad394) {
        this.aad394 = aad394;
    }

    public String getAad401() {
        return aad401;
    }

    public void setAad401(String aad401) {
        this.aad401 = aad401;
    }

    public String getAad411() {
        return aad411;
    }

    public void setAad411(String aad411) {
        this.aad411 = aad411;
    }

    public String getAad413() {
        return aad413;
    }

    public void setAad413(String aad413) {
        this.aad413 = aad413;
    }

    public String getAad412() {
        return aad412;
    }

    public void setAad412(String aad412) {
        this.aad412 = aad412;
    }

    public String getAad414() {
        return aad414;
    }

    public void setAad414(String aad414) {
        this.aad414 = aad414;
    }

    @Override
    public String toString() {
        return "VillageDDModel{" +
                "aar011='" + aar011 + '\'' +
                ", aaf031='" + aaf031 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", aad004='" + aad004 + '\'' +
                ", aad035='" + aad035 + '\'' +
                ", aad038='" + aad038 + '\'' +
                ", aad037='" + aad037 + '\'' +
                ", aad036='" + aad036 + '\'' +
                ", aad019='" + aad019 + '\'' +
                ", aad027='" + aad027 + '\'' +
                ", aad021='" + aad021 + '\'' +
                ", aad022='" + aad022 + '\'' +
                ", aad023='" + aad023 + '\'' +
                ", aad024='" + aad024 + '\'' +
                ", aad025='" + aad025 + '\'' +
                ", aad005='" + aad005 + '\'' +
                ", aad006='" + aad006 + '\'' +
                ", aad008='" + aad008 + '\'' +
                ", aad009='" + aad009 + '\'' +
                ", aad010='" + aad010 + '\'' +
                ", aad012='" + aad012 + '\'' +
                ", aad013='" + aad013 + '\'' +
                ", aad014='" + aad014 + '\'' +
                ", aad015='" + aad015 + '\'' +
                ", aad016='" + aad016 + '\'' +
                ", aad017='" + aad017 + '\'' +
                ", aad018='" + aad018 + '\'' +
                ", aad301='" + aad301 + '\'' +
                ", aad302='" + aad302 + '\'' +
                ", aad311='" + aad311 + '\'' +
                ", aad313='" + aad313 + '\'' +
                ", aad328='" + aad328 + '\'' +
                ", aad323='" + aad323 + '\'' +
                ", aad331='" + aad331 + '\'' +
                ", aad332='" + aad332 + '\'' +
                ", aad358='" + aad358 + '\'' +
                ", aad361='" + aad361 + '\'' +
                ", aad371='" + aad371 + '\'' +
                ", aad381='" + aad381 + '\'' +
                ", aad383='" + aad383 + '\'' +
                ", aad382='" + aad382 + '\'' +
                ", aad384='" + aad384 + '\'' +
                ", aad391='" + aad391 + '\'' +
                ", aad392='" + aad392 + '\'' +
                ", aad393='" + aad393 + '\'' +
                ", aad394='" + aad394 + '\'' +
                ", aad401='" + aad401 + '\'' +
                ", aad411='" + aad411 + '\'' +
                ", aad413='" + aad413 + '\'' +
                ", aad412='" + aad412 + '\'' +
                ", aad414='" + aad414 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VillageNewModel that = (VillageNewModel) o;
        return Objects.equals(aar011, that.aar011) &&
                Objects.equals(aaf031, that.aaf031) &&
                Objects.equals(aar012, that.aar012) &&
                Objects.equals(aad004, that.aad004) &&
                Objects.equals(aad035, that.aad035) &&
                Objects.equals(aad038, that.aad038) &&
                Objects.equals(aad037, that.aad037) &&
                Objects.equals(aad036, that.aad036) &&
                Objects.equals(aad019, that.aad019) &&
                Objects.equals(aad027, that.aad027) &&
                Objects.equals(aad021, that.aad021) &&
                Objects.equals(aad022, that.aad022) &&
                Objects.equals(aad023, that.aad023) &&
                Objects.equals(aad024, that.aad024) &&
                Objects.equals(aad025, that.aad025) &&
                Objects.equals(aad005, that.aad005) &&
                Objects.equals(aad006, that.aad006) &&
                Objects.equals(aad008, that.aad008) &&
                Objects.equals(aad009, that.aad009) &&
                Objects.equals(aad010, that.aad010) &&
                Objects.equals(aad012, that.aad012) &&
                Objects.equals(aad013, that.aad013) &&
                Objects.equals(aad014, that.aad014) &&
                Objects.equals(aad015, that.aad015) &&
                Objects.equals(aad016, that.aad016) &&
                Objects.equals(aad017, that.aad017) &&
                Objects.equals(aad018, that.aad018) &&
                Objects.equals(aad301, that.aad301) &&
                Objects.equals(aad302, that.aad302) &&
                Objects.equals(aad311, that.aad311) &&
                Objects.equals(aad313, that.aad313) &&
                Objects.equals(aad328, that.aad328) &&
                Objects.equals(aad323, that.aad323) &&
                Objects.equals(aad331, that.aad331) &&
                Objects.equals(aad332, that.aad332) &&
                Objects.equals(aad358, that.aad358) &&
                Objects.equals(aad361, that.aad361) &&
                Objects.equals(aad371, that.aad371) &&
                Objects.equals(aad381, that.aad381) &&
                Objects.equals(aad383, that.aad383) &&
                Objects.equals(aad382, that.aad382) &&
                Objects.equals(aad384, that.aad384) &&
                Objects.equals(aad391, that.aad391) &&
                Objects.equals(aad392, that.aad392) &&
                Objects.equals(aad393, that.aad393) &&
                Objects.equals(aad394, that.aad394) &&
                Objects.equals(aad401, that.aad401) &&
                Objects.equals(aad411, that.aad411) &&
                Objects.equals(aad413, that.aad413) &&
                Objects.equals(aad412, that.aad412) &&
                Objects.equals(aad414, that.aad414);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aar011, aaf031, aar012, aad004, aad035, aad038, aad037, aad036, aad019, aad027, aad021, aad022, aad023, aad024, aad025, aad005, aad006, aad008, aad009, aad010, aad012, aad013, aad014, aad015, aad016, aad017, aad018, aad301, aad302, aad311, aad313, aad328, aad323, aad331, aad332, aad358, aad361, aad371, aad381, aad383, aad382, aad384, aad391, aad392, aad393, aad394, aad401, aad411, aad413, aad412, aad414);
    }
}
