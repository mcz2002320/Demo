package 第十一届蓝桥杯;
/*
整数小拼接(暴力破解大概得百分之30分数)
问题描述

给定义个长度为 n nn 的数组 A 1 , A 2 , ⋅ ⋅ ⋅ , A n A_1, A_2, · · · , A_nA
1
​
 ,A
2
​
 ,⋅⋅⋅,A
n
​
 。你可以从中选出两个数 A i A_iA
i
​
  和 A j A_jA
j
​

(i ii 不等于 j jj)，然后将 A i A_iA
i
​
  和 A j A_jA
j
​
  一前一后拼成一个新的整数。例如 12 和 345 可
以拼成 12345 或 34512 。注意交换 A i A_iA
i
​
  和 A j A_jA
j
​
  的顺序总是被视为 2 种拼法，即便
是 A i A_iA
i
​
  = A j A_jA
j
​
  时。
请你计算有多少种拼法满足拼出的整数小于等于 K KK。
 */
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    String str = "" + arr[i] + arr[j];
                    int numu = Integer.parseInt(str);
                    if (numu <= k) {
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
