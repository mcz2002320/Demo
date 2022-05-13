package 第十届蓝桥杯;
//输入版
import java.util.Scanner;

public class Demo2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cont = 0;
            while (true){
                if (y==0){
                    break;
                }
                if (x>y){
                    x = x-y;
                }else {
                    y=y-x;
                }
                cont++;
            }
            System.out.println(cont);
        }
    }

