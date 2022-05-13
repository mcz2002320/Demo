package 第十一届蓝桥杯;



public class Demo8_1 {
    private static int m;
    private static int n;
    private static int sum;

    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            for (int j = 1; j <= 30; j++) {
                n = i;
                m = j;
                sum = 0;
                def(1,1);
                System.out.println(sum);
            }
        }
    }

    public static void def(int i,int j){
        if (i%2==0 && j%2==0){
            return;//行号列号不为偶数
        }
        if (i > n || j > m){
            return;
        }
        if (i==n && j==m){
            sum++;
            return;
        }
        def(i+1,j);
        def(i,j+1);
    }
}
