package 第十二届蓝桥杯;
/*
试题 E: 路径
【问题描述】
小蓝学习了最短路径之后特别高兴，他定义了一个特别的图，希望找到图中的最短路径。
小蓝的图由 2021 个结点组成，依次编号 1 至 2021。对于两个不同的结点 a, b，如果 a 和 b 的差的绝对值大于 21，
则两个结点之间没有边相连；如果 a 和 b 的差的绝对值小于等于 21，则两个点之间有一条
长度为 a 和 b 的最小公倍数的无向边相连。
例如：结点 1 和结点 23 之间没有边相连；结点 3 和结点 24 之间有一条无向边，长度为 24；结点 15 和结点 25 之间有一条无向边，长度为 75。
请计算，结点 1 和结点 2021 之间的最短路径长度是多少。
提示：建议使用计算机编程解决问题。
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class Demo5 {
    public static void main(String[] args) {
        int map[][] = new int[2050][2050];
        for(int i=1;i<=2021;i++) {
            for(int j=i;j<=i+21;j++) {
                map[i][j] = lcm(j,i);
            }
        }
        boolean bj[] = new boolean[2050];
        int dis[] = new int[2050];
        for(int i=1;i<=2021;i++)dis[i]=map[1][i];
        int min,minIdx=0;
        while(!bj[2021]) {
            min = Integer.MAX_VALUE;
            for(int i=2;i<=2021;i++) {
                if(!bj[i] && dis[i]!=0 && dis[i]<min) {
                    min = dis[i];
                    minIdx = i;
                }
            }
            bj[minIdx]=true;
            for(int i=minIdx+1;i<=minIdx+21;i++) {
                if(map[minIdx][i]!=0) {
                    if(dis[i]==0)dis[i] = dis[minIdx]+map[minIdx][i];
                    else{
                        if(dis[minIdx]+map[minIdx][i]<dis[i])dis[i]=dis[minIdx]+map[minIdx][i];
                    }
                }
            }
        }
        System.out.println(dis[2021]);
    }
    public static int gcd(int x,int y) {
        return x%y!=0 ? gcd(y, x % y) : y;
    }
    public static int lcm(int x,int y) {
        return x * y / gcd(x, y);
    }
}

