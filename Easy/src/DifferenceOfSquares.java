import java.util.Scanner;

// 平方和 -- 和平方
public class DifferenceOfSquares {
    public static void main(String[] args) {
        System.out.println("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 0;
        for (int i = 1; i <= num; i++){
            a += i;
        }
        System.out.println("1~" + num +" 的和平方为：" + a*a);

        int b = 0;
        for (int i = 0; i <= num; i++){
            b += i*i;
        }
        System.out.println("1~" + num +" 的平方和为：" + b);
    }
}
