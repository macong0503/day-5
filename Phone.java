package com.hqyj.mc.Text;

import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class Phone {
    //定义手机类，属性有品牌、价格、颜色，行为有打电话、发短信
    //价格
    String brand = "傻妞";
    //价格
    int price;
    //颜色
    String colour = "透明的";

    String name;

    public void call(){
        System.out.println("打电话");
    }
    public void sms(){
        System.out.println("发短信");
    }

    public void callphone(){
        System.out.println("我在使用"+brand+"品牌手机,价格是"+price+"，颜色是"+colour+",给"+name+"打电话，发短信");
    }

}
