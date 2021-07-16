package com.hqyj.mc.Text;

import java.util.Random;
import java.util.Scanner;

public class Text01 {
    public void caishuzi(){
        Random random = new Random();
        int n = random.nextInt(100);
        //System.out.println(n);
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入数字：");
            int a = sc.nextInt();
            if (a > 100) {
                System.out.println("输入错误");
            }
            if (a == n) {
                System.out.println("猜对了");
                break;
            }
            if (a < n) {
                System.out.println("猜小了");
            }
            if (a > n) {
                System.out.println("猜大了");
            }

        }
    }

    public static void main(String[] args) {
        Text01 text01 = new Text01();
        text01.caishuzi();
    }
}
