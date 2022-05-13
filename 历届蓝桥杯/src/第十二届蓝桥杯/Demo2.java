package 第十二届蓝桥杯;
/*
试题 B: 空间
【问题描述】
小蓝准备用 256MB 的内存空间开一个数组，数组的每个元素都是 32 位二进制整数，
如果不考虑程序占用的空间和维护内存需要的辅助空间，请问256MB 的空间可以存储多少个 32 位二进制整数？
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，
填写多余的内容将无法得分。

 */
public class Demo2 {
    public static void main(String[] args) {
        long Mb = 256;
        long kb = 1024;
        long b = 1024;
        long Byte = 8;
        System.out.println(Mb*kb*b*Byte/32);
    }
}
