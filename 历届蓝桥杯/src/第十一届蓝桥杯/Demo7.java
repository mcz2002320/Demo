package 第十一届蓝桥杯;
/*
问题描述

有一个序列，序列的第一个数是 n，后面的每个数是前一个数整除 2，请输
出这个序列中值为正数的项。
 */

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        while (a>=1){
            System.out.print(a+" ");
            a=a/2;
        }
    }
}
