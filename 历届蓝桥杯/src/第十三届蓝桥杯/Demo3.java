package 第十三届蓝桥杯;

import java.util.Scanner;
/*
纸张尺寸

在 ISO 国际标准中定义了 A0 纸张的大小为 1189mm × 841mm，将 A0 纸沿长边对折后为 A1 纸，
大小为 841mm × 594mm，在对折的过程中长度直接取下整（实际裁剪时可能有损耗）。
将 A1 纸沿长边对折后为 A2 纸，依此类推。

输入纸张的名称，请输出纸张的大小。
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        switch (n){
            case "A0":
                System.out.println(1189);
                System.out.println(841);
                break;
            case "A1":
                System.out.println(841);
                System.out.println(594);
                break;
            case "A2":
                System.out.println(594);
                System.out.println(420);
                break;
            case "A3":
                System.out.println(420);
                System.out.println(297);
                break;
            case "A4":
                System.out.println(297);
                System.out.println(210);
                break;
            case "A5":
                System.out.println(210);
                System.out.println(148);
                break;
            case "A6":
                System.out.println(148);
                System.out.println(105);
                break;
            case "A7":
                System.out.println(105);
                System.out.println(74);
                break;
            case "A8":
                System.out.println(74);
                System.out.println(52);
                break;
            case "A9":
                System.out.println(52);
                System.out.println(37);
                break;
        }
    }
}
