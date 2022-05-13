public class Test {
    public static void main(String[] args) {
        int a = max(1,5);
        double b = max(23.3,302.1);
        double c = max(11.3,1.3,15);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static int max(int a,int b){
        int max = a>b?a:b;
        return max;
    }

    public static double max(double a,double b){
        double max = a>b?a:b;
        return max;
    }

    public static double max(double a,double b,int c){
        double t = a>b?a:b;
        double max = t>c?t:c;
        return max;
    }
}
