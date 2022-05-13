package 第十二届蓝桥杯;
/*
试题 D: 相乘
【问题描述】
小蓝发现，他将 1 至 1000000007 之间的不同的数与 2021 相乘后再求除以1000000007 的余数，
会得到不同的数。小蓝想知道，能不能在 1 至 1000000007 之间找到一个数，与 2021 相乘后再除以 1000000007
后的余数为 999999999。如果存在，请在答案中提交这个数；如果不存在，请在答案中提交 0。
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，
填写多余的内容将无法得分。
 */

import java.math.BigInteger;

public class Demo4 {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("2021");
        BigInteger qi = new BigInteger("1000000007");
        BigInteger cont = new BigInteger("999999999");
        for (int i = 1; i < 1000000007; i++) {
            if (big.multiply(new BigInteger(i+"")).mod(qi).compareTo(cont)==0){
                System.out.println(i);
                break;
            }
            }
        }
    }



