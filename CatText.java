package com.hqyj.mc.Text;

public class CatText {
    //如果需要访问类中的成员方法或成员变量，需要一个对象
    /*
    * 创建对象的格式
    *   类名 对象名 = new 类名（）；
    * 类名 --> 构造方法，无参构造
    * java中默认提供一个无参构造
    *
    * 对象的使用
    * 对象.成员方法名
    * 对象.成员变量名
    * */
    public static void main(String[] args) {

    Cat cat = new Cat();
        System.out.println(cat.age);
    }
}
