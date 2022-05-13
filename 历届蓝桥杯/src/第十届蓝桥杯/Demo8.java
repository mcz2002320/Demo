package 第十届蓝桥杯;
/*
试题 H: 人物相关性分析
时间限制: 1.0s 内存限制: 512.0MB 本题总分：20 分
【问题描述】
小明正在分析一本小说中的人物相关性。他想知道在小说中 Alice 和 Bob 有多少次同时出现。
 更准确的说，小明定义 Alice 和 Bob“同时出现”的意思是：在小说文本 中 Alice 和 Bob 之间不超过 K 个字符。
  例如以下文本： ThisisastoryaboutAliceandBob.AlicewantstosendaprivatemessagetoBob.
  假设 K = 20，则 Alice 和 Bob 同时出现了 2 次，分别是”Alice and Bob” 和”Bob. Alice”。
  前者 Alice 和 Bob 之间有 5 个字符，后者有 2 个字符。 注意: 1. Alice 和 Bob 是大小写敏感的，
  alice 或 bob 等并不计算在内。 2. Alice 和 Bob 应为单独的单词，前后可以有标点符号和空格，但是不能
  有字母。例如 Bobbi 並不算出现了 Bob。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = Integer.valueOf(str);
        String message = sc.nextLine();

        List<Integer> list = new ArrayList<>();

        int a = message.indexOf("Alice");
        while (a!=-1){
            list.add(a);
            a=message.indexOf("Alice",a+1);

        }
    }
}
