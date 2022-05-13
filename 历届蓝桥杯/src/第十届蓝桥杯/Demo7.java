package 第十届蓝桥杯;

import java.util.Scanner;

/*
试题 G: 外卖店优先级
时间限制: 1.0s 内存限制: 512.0MB 本题总分：20 分
【问题描述】
“饱了么”外卖系统中维护着 N 家外卖店，编号 1 ∼ N。每家外卖店都有 一个优先级，初始时 (0 时刻) 优先级都为 0。 每经过 1 个时间单位，如果外卖店没有订单，则优先级会减少 1，最低减 到 0；而如果外卖店有订单，则优先级不减反加，每有一单优先级加 2。 如果某家外卖店某时刻优先级大于 5，则会被系统加入优先缓存中；如果 优先级小于等于 3，则会被清除出优先缓存。 给定 T 时刻以内的 M 条订单信息，请你计算 T 时刻时有多少外卖店在优 先缓存中。
【输入格式】 第一行包含 3 个整数 N、M 和 T。 以下 M 行每行包含两个整数 ts 和 id，表示 ts 时刻编号 id 的外卖店收到 一个订单。
【输出格式】
输出一个整数代表答案。
【样例输入】 2 6 6 1 1 5 2 3 1 6 2 2 1 6 2
试题G: 外卖店优先级 9
第十届蓝桥杯大赛软件类省赛 Java 大学 C 组
【样例输出】 1
【样例解释】 6 时刻时，1 号店优先级降到 3，被移除出优先缓存；2 号店优先级升到 6， 加入优先缓存。所以是有 1 家店 (2 号) 在优先缓存中。
【评测用例规模与约定】 对于 80% 的评测用例，1≤ N,M,T ≤10000。 对于所有评测用例，1≤ N,M,T ≤100000，1≤ts≤T，1≤id ≤ N。

 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n家店
        int m = sc.nextInt();//多少行数据
        int t = sc.nextInt();//时刻的总长度
        int c = 0;
        int[][] arr = new int[n][t];
        for (int i = 0; i < m; i++) {
            int ts = sc.nextInt();//时刻
            int id = sc.nextInt();//店

            arr[id-1][ts-1]+=1;//来了一个订单  对应位置+1
        }

        for (int i = 0; i < n; i++) {
            //每一家店处理
            int leve = 0;//优先级
            boolean cont = false;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0){
                    leve-=1;
                    if (leve<0){
                        leve=0;
                    }
                    if (leve<=3){
                        cont = false;
                    }
                }else {
                    leve+=(2*arr[i][j]);
                    if (leve>5){
                        cont=true;
                    }
                }
                System.out.print(arr[i][j]+" ");
            }
            if (cont){//换行时进行判断是否在缓存
                c++;
            }
            System.out.println();
        }
        System.out.println(c);
    }
}
