package 第十届蓝桥杯;

import javax.security.auth.Subject;
import java.util.HashSet;
import java.util.Set;

/*
试题 C: 不同子串
本题总分：10 分
【问题描述】
一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
注意在计算时，只算本质不同的串的个数。 请问，字符串0100110001010001 有多少个不同的非空子串？
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Demo3 {
    public static void main(String[] args) {
        String str = "0100110001010001";
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                String a = str.substring(i,j);
                set.add(a);
            }
        }
        System.out.println(set.size());
    }
}
