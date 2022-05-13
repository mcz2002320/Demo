package 第十一届蓝桥杯;

/*
指数运算

7 月 1 日是建党日，从 1921 年到 2020 年，中国共产党已经带领中国人民
走过了 99 年。
请计算：7的2020次方mod1921，其中 A mod B 表示 A 除以 B 的余数。
*/

import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {
        BigInteger s = new BigInteger("7");
        System.out.println(s.pow(2020).mod(new BigInteger("1921")));
    }
}
