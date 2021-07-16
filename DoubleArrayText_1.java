package com.hqyj.mc.Text;

public class DoubleArrayText_1 {
    //二维数组
    public static void main(String[] args) {

//        //定义格式：数据类型[][] 数组名 = new 数据类型[长度][];
//        int[][] arr01 = new int[2][1];
//        //二维数组的大小:只和第一个[]中的值有关
//        //二维数组中元素的个数：就是[][]值相乘
//        System.out.println(arr01.length);
//        int[][] arr02 = new int[3][];
//        System.out.println(arr02.length);
//        //数组的访问
//        System.out.println(arr01);//[[I@1b6d3586
//        System.out.println(arr02);//[[I@4554617c
//
//
//
//        System.out.println(arr01[0][0]);//0
//        //System.out.println(arr02[0][0]);//NullPointerException
//
//        System.out.println(arr02[0]);
//        arr02[0] = new int[2];
//        arr02[1] = new int[3];
//        arr02[2] = new int[4];
//        System.out.println(arr02[0]);
//        System.out.println(arr02[1]);
//        System.out.println(arr02[2]);

        //遍历一个二维数组int[][] arr = {{1,2,23},{12,2,32,3}}

        int[][] arr = {{1,2,23},{12,2,32,3}};
        //一维数组
        for (int i = 0; i < arr.length; i++) {
            //遍历一维数组
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int[] arr01 : arr) {
            for (int value : arr01) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }

}
