package 第十三届蓝桥杯;
/*
试题 A: 排列字母
本题总分：5 55 分

【问题描述】

小蓝要把一个字符串中的字母按其在字母表中的顺序排列。

例如，L A N Q I A O \mathrm{LANQIAO}LANQIAO 排列后为 A A I L N O Q \mathrm{AAILNOQ}AAILNOQ。
又如，G O O D G O O D S T U D Y D A Y D A Y U P \mathrm{GOODGOODSTUDYDAYDAYUP}GOODGOODSTUDYDAYDAYUP
排列后为 A A D D D D D G G O O O O P S T U U Y Y Y \mathrm{AADDDDDGGOOOOPSTUUYYY}AADDDDDGGOOOOPSTUUYYY。

请问对于以下字符串，排列之后字符串是什么？

W H E R E T H E R E I S A W I L L T H E R E I S A W A Y

 */
public class Demo1 {
    public static void main(String[] args) {
                java.util.Arrays.stream("WHERETHEREISAWILLTHEREISAWAY".split("")).sorted().forEach(System.out::print);
            }

}
