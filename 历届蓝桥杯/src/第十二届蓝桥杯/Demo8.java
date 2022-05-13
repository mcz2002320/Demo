package 第十二届蓝桥杯;


/*
杨辉三角形
如果我们按从上到下、从左到右的顺序把所有数排成一列，可以得到如下数列： 1, 1, 1, 1, 2, 1, 1, 3, 3, 1, 1, 4, 6, 4, 1, \cdots1,1,1,1,2,1,1,3,3,1,1,4,6,4,1,⋯
给定一个正整数 NN，请你输出数列中第一次出现 NN 是在第几个数？

输入描述
输入一个整数 NN。

输出描述
输出一个整数代表答案。

输入输出样例
示例 1
输入
6
输出
13
 */
import java.util.Scanner;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class Demo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        long count = 1;
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        if(n>3 ){
            int res = 0;
            for(int i = 1;res != n;i++){
                List<Integer> list = new ArrayList<>();
                for(int j = 0;j<i+1 && res != n;j++){
                    if(j == 0 || j==i)list.add(1);
                    else{
                        if(Integer.MAX_VALUE-lists.get(j) <= lists.get(j-1)){
                            list.add(Integer.MAX_VALUE);
                            count+=i-j+1;
                            break;
                        }
                        res = lists.get(j)+lists.get(j-1);
                        list.add(res);
                    }
                    count++;
                }
                lists = list;
                if(lists.size()>=3 && lists.get(2) == Integer.MAX_VALUE){
                    count=(long)(1+n)*n/2+2;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
