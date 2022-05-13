package 第十一届蓝桥杯;

/*
走方格

在平面上有一些二维的点阵。
这些点的编号就像二维数组的编号一样，从上到下依次为第 1 至第 n 行，
从左到右依次为第 1 至第 m 列，每一个点可以用行号和列号来表示。
现在有个人站在第 1 行第 1 列，要走到第 n 行第 m 列。只能向右或者向下
走。
注意，如果行号和列数都是偶数，不能走入这一格中。
问有多少种方案。

输入格式

输入一行包含两个整数 n, m。

输出格式

输出一个整数，表示答案。

 */

import java.util.Scanner;

public class Demo8 {

    private static int m;
    private static int n;
    private static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        def(1,1);
        System.out.println(sum);
    }

    public static void def(int i,int j){
        if (i%2==0 && j%2==0){
            return;//行号列号不为偶数
        }
        if (i > n || j > m){
            return;
        }
        if (i==n && j==m){
            sum++;
            return;
        }
        def(i+1,j);
        def(i,j+1);
    }
}
