package 第十一届蓝桥杯;


import java.util.Scanner;

/*
问题描述

输入一个字符串，请输出这个字符串包含多少个大写字母，多少个小写字
母，多少个数字。

输入格式

输入一行包含一个字符串。

输出格式

输出三行，每行一个整数，分别表示大写字母、小写字母和数字的个数。
 */
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int daxie = 0;
        int xiaoxie = 0;
        int shuzi = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                daxie++;
            }else if (ch >= 'a' && ch <= 'z'){
                xiaoxie++;
            }else if (ch >= '0' && ch <= '9'){
                shuzi++;
            }
        }
        System.out.println(daxie);
        System.out.println(xiaoxie);
        System.out.println(shuzi);
    }
}