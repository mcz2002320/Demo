package 第十届蓝桥杯;
/*
试题 D: 质数
本题总分：10 分
质数是只能被1和本身整除；
【问题描述】
我们知道第一个质数是 2、第二个质数是 3、第三个质数是 5……请你计算 第 2019 个质数是多少？
【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。

 */
public class Demo4{
    public static void main(String[] args) {
        int cont = 0;
        for (int i = 2; ;i++){
            if (zhishu(i)){
                cont++;
            }
           if (cont==2019){
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean zhishu(int a){
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}