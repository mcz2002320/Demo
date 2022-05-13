package 第十二届蓝桥杯;

import java.util.Scanner;

/*
试题 G: 最少砝码
时间限制: 1.0s 内存限制: 512.0MB 本题总分：20 分
【问题描述】
你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意小于等于 N 的正整数重量。
那么这套砝码最少需要包含多少个砝码？注意砝码可以放在天平两边。
【输入格式】
输入包含一个正整数 N。
【输出格式】
输出一个整数代表答案。
【样例输入】
7
【样例输出】
3
【样例说明】
3 个砝码重量是 1、4、6，可以称出 1 至 7 的所有重量。
1 = 1；
2 = 6 − 4 (天平一边放 6，另一边放 4)；
3 = 4 − 1；
4 = 4；
5 = 6 − 1；
6 = 6；
7 = 1 + 6；
少于 3 个砝码不可能称出 1 至 7 的所有重量。
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        while (a<n){
            a+=(a+a+1);
            b++;
        }
        System.out.println(b);
    }
}
