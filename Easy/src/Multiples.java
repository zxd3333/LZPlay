import java.util.Scanner;

// 求倍数和
/*
    天花板是20，特殊数字是3、5
    求它们在20以下的倍数的总合，如果出现了两次，只按一次算
    3、5的倍数有3,5,6,9,10,12,15和18
    这些倍数的总和是78
 */
public class Multiples {
    public static void main(String[] args) {
        System.out.println("输入一个数字来当天花板");
        Scanner sc = new Scanner(System.in);
        int top = sc.nextInt();
        System.out.println("输入天花板之下的一个特殊数字");
        int a = sc.nextInt();
        System.out.println("输入天花板之下的一个特殊数字");
        int b = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= top; i++){
            int m = a*i;
            int n = b*i;
            int o = a*b*i;
            if (m < top ){
                sum += m;
            }
            if (n < top){
                sum += n;
            }
            if (o < top){
                sum -= o;
            }
        }
        System.out.println("倍数和为：" + sum);
    }
}
