package com.sysh.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * ClassName:  <br/>
 * Function: 贫困户基本信息<br/>
 * date: 2018年06月06日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class AC01Basic implements Serializable {

    private String aac029;
    private String aac031;
    private String aar012;
    private Long aac001;
    private String aad001;
    private Long aar040;
    private String aaq002;
    private String aac004;
    private String aac005;
    private String aac006;
    private String aar010;
    private String aac007;
    private String aac008;
    private String aac011;
    private String aac012;
    private String aac013;
    private String aac014;
    private String aac015;
    private String aac017;
    private String aac019;
    private String aar007;
    private String aad041;

    public AC01Basic(String aac029, String aac031, String aar012, Long aac001, String aad001, Long aar040, String aaq002, String aac004, String aac005, String aac006, String aar010, String aac007, String aac008, String aac011, String aac012, String aac013, String aac014, String aac015, String aac017, String aac019, String aar007, String aad041) {
        this.aac029 = aac029;
        this.aac031 = aac031;
        this.aar012 = aar012;
        this.aac001 = aac001;
        this.aad001 = aad001;
        this.aar040 = aar040;
        this.aaq002 = aaq002;
        this.aac004 = aac004;
        this.aac005 = aac005;
        this.aac006 = aac006;
        this.aar010 = aar010;
        this.aac007 = aac007;
        this.aac008 = aac008;
        this.aac011 = aac011;
        this.aac012 = aac012;
        this.aac013 = aac013;
        this.aac014 = aac014;
        this.aac015 = aac015;
        this.aac017 = aac017;
        this.aac019 = aac019;
        this.aar007 = aar007;
        this.aad041 = aad041;
    }

    public AC01Basic() {
        super();
    }

    public String getAac029() {
        return aac029;
    }

    public void setAac029(String aac029) {
        this.aac029 = aac029;
    }

    public String getAac031() {
        return aac031;
    }

    public void setAac031(String aac031) {
        this.aac031 = aac031;
    }

    public String getAar012() {
        return aar012;
    }

    public void setAar012(String aar012) {
        this.aar012 = aar012;
    }

    public Long getAac001() {
        return aac001;
    }

    public void setAac001(Long aac001) {
        this.aac001 = aac001;
    }

    public String getAad001() {
        return aad001;
    }

    public void setAad001(String aad001) {
        this.aad001 = aad001;
    }

    public Long getAar040() {
        return aar040;
    }

    public void setAar040(Long aar040) {
        this.aar040 = aar040;
    }

    public String getAaq002() {
        return aaq002;
    }

    public void setAaq002(String aaq002) {
        this.aaq002 = aaq002;
    }

    public String getAac004() {
        return aac004;
    }

    public void setAac004(String aac004) {
        this.aac004 = aac004;
    }

    public String getAac005() {
        return aac005;
    }

    public void setAac005(String aac005) {
        this.aac005 = aac005;
    }

    public String getAac006() {
        return aac006;
    }

    public void setAac006(String aac006) {
        this.aac006 = aac006;
    }

    public String getAar010() {
        return aar010;
    }

    public void setAar010(String aar010) {
        this.aar010 = aar010;
    }

    public String getAac007() {
        return aac007;
    }

    public void setAac007(String aac007) {
        this.aac007 = aac007;
    }

    public String getAac008() {
        return aac008;
    }

    public void setAac008(String aac008) {
        this.aac008 = aac008;
    }

    public String getAac011() {
        return aac011;
    }

    public void setAac011(String aac011) {
        this.aac011 = aac011;
    }

    public String getAac012() {
        return aac012;
    }

    public void setAac012(String aac012) {
        this.aac012 = aac012;
    }

    public String getAac013() {
        return aac013;
    }

    public void setAac013(String aac013) {
        this.aac013 = aac013;
    }

    public String getAac014() {
        return aac014;
    }

    public void setAac014(String aac014) {
        this.aac014 = aac014;
    }

    public String getAac015() {
        return aac015;
    }

    public void setAac015(String aac015) {
        this.aac015 = aac015;
    }

    public String getAac017() {
        return aac017;
    }

    public void setAac017(String aac017) {
        this.aac017 = aac017;
    }

    public String getAac019() {
        return aac019;
    }

    public void setAac019(String aac019) {
        this.aac019 = aac019;
    }

    public String getAar007() {
        return aar007;
    }

    public void setAar007(String aar007) {
        this.aar007 = aar007;
    }

    public String getAad041() {
        return aad041;
    }

    public void setAad041(String aad041) {
        this.aad041 = aad041;
    }

    @Override
    public String toString() {
        return "AC01Basic{" +
                "aac029='" + aac029 + '\'' +
                ", aac031='" + aac031 + '\'' +
                ", aar012='" + aar012 + '\'' +
                ", aac001=" + aac001 +
                ", aad001=" + aad001 +
                ", aar040=" + aar040 +
                ", aaq002='" + aaq002 + '\'' +
                ", aac004='" + aac004 + '\'' +
                ", aac005='" + aac005 + '\'' +
                ", aac006='" + aac006 + '\'' +
                ", aar010='" + aar010 + '\'' +
                ", aac007='" + aac007 + '\'' +
                ", aac008='" + aac008 + '\'' +
                ", aac011='" + aac011 + '\'' +
                ", aac012='" + aac012 + '\'' +
                ", aac013='" + aac013 + '\'' +
                ", aac014='" + aac014 + '\'' +
                ", aac015='" + aac015 + '\'' +
                ", aac017='" + aac017 + '\'' +
                ", aac019='" + aac019 + '\'' +
                ", aar007='" + aar007 + '\'' +
                ", aad041=" + aad041 +
                '}';
    }

/*    @Override
    public boolean equals(Object obj) {
        boolean flag=false;
                //判断对像是否相同，基本是不可能的
                if(obj==this){
                            flag=true;
                    }
                if(!(obj instanceof AC01Basic)){
                   flag=false;
                  }
                else{
                     AC01Basic ac01Basic=(AC01Basic)obj;
                     if(ac01Basic.getAac029().equals(this.getAac029())&& ac01Basic.getAac031().equals(this.getAac031())&&
                             ac01Basic.getAar012().equals(this.getAar012())&&ac01Basic.getAac005().equals(this.getAac005())&&
                             ac01Basic.getAac001().equals(this.getAac001())&&ac01Basic.getAad001().equals(this.getAad001())&&
                             ac01Basic.getAar040().equals(this.getAar040())&&
                             ac01Basic.getAaq002().equals(this.getAaq002())&&
                                     ac01Basic.getAac004().equals(this.getAac004())&& ac01Basic.getAac006().equals(this.getAac006())&&
                                     ac01Basic.getAar010().equals(this.getAar010())&& ac01Basic.getAac007().equals(this.getAac007())&&
                                     ac01Basic.getAac008().equals(this.getAac008())&& ac01Basic.getAac011().equals(this.getAac011())&&
                                     ac01Basic.getAac012().equals(this.getAac012())&& ac01Basic.getAac013().equals(this.getAac013())&&
                                     ac01Basic.getAac014().equals(this.getAac014())&& ac01Basic.getAac015().equals(this.getAac015())&&
                                     ac01Basic.getAac017().equals(this.getAac017())&& ac01Basic.getAac019().equals(this.getAac019())&&
                                     ac01Basic.getAar007().equals(this.getAar007())&& ac01Basic.getAad041().equals(this.getAad041())
                     )
                     {

                         flag=true;
                     }
             }
         System.out.println(flag);
         return flag;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AC01Basic ac01Basic = (AC01Basic) o;
        return Objects.equals(aac029, ac01Basic.aac029) &&
                Objects.equals(aac031, ac01Basic.aac031) &&
                Objects.equals(aar012, ac01Basic.aar012) &&
                Objects.equals(aac001, ac01Basic.aac001) &&
                Objects.equals(aad001, ac01Basic.aad001) &&
                Objects.equals(aar040, ac01Basic.aar040) &&
                Objects.equals(aaq002, ac01Basic.aaq002) &&
                Objects.equals(aac004, ac01Basic.aac004) &&
                Objects.equals(aac005, ac01Basic.aac005) &&
                Objects.equals(aac006, ac01Basic.aac006) &&
                Objects.equals(aar010, ac01Basic.aar010) &&
                Objects.equals(aac007, ac01Basic.aac007) &&
                Objects.equals(aac008, ac01Basic.aac008) &&
                Objects.equals(aac011, ac01Basic.aac011) &&
                Objects.equals(aac012, ac01Basic.aac012) &&
                Objects.equals(aac013, ac01Basic.aac013) &&
                Objects.equals(aac014, ac01Basic.aac014) &&
                Objects.equals(aac015, ac01Basic.aac015) &&
                Objects.equals(aac017, ac01Basic.aac017) &&
                Objects.equals(aac019, ac01Basic.aac019) &&
                Objects.equals(aar007, ac01Basic.aar007) &&
                Objects.equals(aad041, ac01Basic.aad041);
    }

    @Override
    public int hashCode() {

        return Objects.hash(aac029, aac031, aar012, aac001, aad001, aar040, aaq002, aac004, aac005, aac006, aar010, aac007, aac008, aac011, aac012, aac013, aac014, aac015, aac017, aac019, aar007, aad041);
    }
}
