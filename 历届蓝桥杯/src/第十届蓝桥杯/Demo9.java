package 第十届蓝桥杯;
/*
试题 I: 等差数列
时间限制: 1.0s 内存限制: 512.0MB 本题总分：25 分
【问题描述】
数学老师给小明出了一道等差数列求和的题目。但是粗心的小明忘记了一 部分的数列，只记得其中 N 个整数。
现在给出这 N 个整数，小明想知道包含这 N 个整数的最短的等差数列有 几项？
【输入格式】
输入的第一行包含一个整数 N。 第二行包含 N 个整数 A1,A2,··· ,AN。(注意 A1 ∼ AN 并不一定是按等差数 列中的顺序给出)
【输出格式】
输出一个整数表示答案。
【样例输入】 5 2 6 4 10 20
【样例输出】 10
【样例说明】

 */

import java.util.Arrays;
import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();//将获得的输入存入数组
        }
        Arrays.sort(arr);
        int[] tem = new int[n - 1];//用来存放两个数的差
        for (int i = 1; i < arr.length; i++) {
            tem[i - 1] = arr[i] - arr[i - 1];
        }

        Arrays.sort(tem);
        for (int i = tem[0]; i > 0; i--) {

            for (int j = 0; j < tem.length; j++) {
                if (tem[j] % i != 0) {
                    break;
                }
                if (j == tem.length - 1) {//最后一个值 和假设的公差都取余 都为0
                    System.out.println((arr[arr.length - 1] - arr[0]) / i + 1);
                    return;
                }
            }
        }
    }
}
