package 第十一届蓝桥杯;
/*
#I 字符串编码
时间限制: 1.0s 内存限制: 512.0MB 本题总分：25 分

问题描述

小明发明了一种给由全大写字母组成的字符串编码的方法。对于每一个大
写字母，小明将它转换成它在 26 个英文字母中序号，即 A → 1, B → 2, … Z →
26。
这样一个字符串就能被转化成一个数字序列：
比如 ABCXYZ → 123242526。
现在给定一个转换后的数字序列，小明想还原出原本的字符串。当然这样
的还原有可能存在多个符合条件的字符串。小明希望找出其中字典序最大的字
符串。
 */

import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//数字数列
        //处理数字序列

        StringBuilder str2 = new StringBuilder();

        int len = str.length();//数字序列的长度


        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (a == '1') {
                //后面第2位 为0 不能直接和后面的1位拼接 只能是A
                if (i < len - 2 && str.charAt(i + 2) == '0') {
                    str2.append("A");
                } else if (i < len - 1) {

                    char next = str.charAt(i + 1);

                    str2.append((char) (next - '0' + 1 * 10 + 64));
                    i++;//这个地方一次性处理了两个数字
                } else {
                    str2.append("A");
                }
            } else if (a == '2') {
                //后面第2位 为0 不能直接和后面的1位拼接 只能是A
                if (i < len - 2 && str.charAt(i + 2) == '0') {
                    str2.append("B");
                } else if (i < len - 1 && str.charAt(i + 1) <= '6') {

                    char next = str.charAt(i + 1);

                    str2.append((char) (next - '0' + 2 * 10 + 64));
                    i++;
                } else {
                    str2.append("B");
                }
            } else {
                str2.append((char) (a - '0' + 64));
            }
        }
        System.out.println(str2.toString());
    }
}
