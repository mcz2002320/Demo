package 第十二届蓝桥杯;

import java.util.Scanner;

/*
试题 A: ASC
【问题描述】
已知大写字母 A 的 ASCII 码为 65，请问大写字母 L 的 ASCII 码是多少？
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
【解析】
这个题很简单，有很多办法。
1、自己数。A是65、B是66…L是76
2、写代码。
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        for (int i = 0; i < b.length(); i++) {
            System.out.println((byte)b.charAt(i));
        }
    }
}
