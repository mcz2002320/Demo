package 第十二届蓝桥杯;

/*
问题描述】
你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意小于等于 N 的正整数重量。
那么这套砝码最少需要包含多少个砝码？注意砝码可以放在天平两边。
【输入格式】
输入包含一个正整数 N。
【输出格式】
输出一个整数代表答案。
【样例输入】
3
1 4 6
【样例输出】
10
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Demo7_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        Set<Integer> set=new HashSet<Integer>();	//用来去重
        List<Integer> list;							//用来遍历，不能直接遍历set
        //因为在遍历的过程中要往set增加
        set.add(sc.nextInt());
        while(n-->1){
            a=sc.nextInt();
            list=new ArrayList<>(set);
            for (Integer in : list) {				//遍历前面的种类，与新加入的砝码组合

                if(in!=a)set.add(Math.abs(in-a));	//防止相减时出现0
                set.add(in+a);
            }
            set.add(a);
        }

        System.out.println(set.size());

    }


}
