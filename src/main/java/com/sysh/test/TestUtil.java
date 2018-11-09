package com.sysh.test;

import java.util.Scanner;

/**
 * ClassName:  <br/>
 * Function: 功能<br/>
 * date: 2018年11月07日  <br/>
 *
 * @author 苏积钰
 * @since JDK 1.8
 */
public class TestUtil {

    public static void main(String[] args)
    {
//        first();
        two();
    }
    //判断是否为0-127中的ascII值，然后输出数量
    public static void first()
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        Integer count=0;
        for(int i=0;i<s.length();i++)
        {
            int n=s.charAt(i);
            if(n>=0 && n<=127)
            {
                System.out.println("我看看对应的值 "+s.charAt(i)+"-----------"+n);
                count++;
            }
        }
        System.out.println("输出的的证件"+count);
    }
    //判断输入的字符串长度是不是大于8或者小于8，然后将小于8的补足，大于8的截取
    public static void two()
    {
        for(int j=0;j<2;j++)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入：");
            String s=scanner.nextLine();
            if(s.length()<8)
            {
                System.out.println("街区之后的字符串上长度多少"+s.length());
                int num=8-s.length();
                for(int i=0;i<num;i++)
                {
                    s=s+"0";
                }
                System.out.println(s);
            }
            else if(s.length()>8)
            {
                String ss=s.substring(0,8);
                String sss=s.substring(8);
                System.out.println("街区之后的字符串上长度多少"+sss.length());
                int num=8-sss.length();
                for(int i=0;i<num;i++)
                {
                    sss=sss+"0";
                }
                System.out.println(ss);
                System.out.println(sss);
            }
        }
    }



}
