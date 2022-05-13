package 第十二届蓝桥杯;

import java.util.Scanner;

public class Demo6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long hours = 60 * 60 * 1000;
        long mins = 60 * 1000;
        long hour = (n / hours) % 24;
        n /= hours;
        long min = n / mins;
        n /= mins;
        long sec = n / 1000;
        System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
    }
}
