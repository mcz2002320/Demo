package 第十一届蓝桥杯;

import java.util.Scanner;

public class Demo8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[30][30];
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 1;
                } else if (i % 2 == 1 && j % 2 == 1) {//下标是奇数就赋值为0
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                }
            }
        }
        System.out.println(arr[n - 1][m - 1]);
    }
}
