import java.util.Scanner;

// 3n+1 猜想
// 对于每一个正整数，如果它是奇数，则对它乘 3 再加 1，如果它是偶数，则对它除以 2，如此循环，最终都能够得到 1
// 结果输出进行操作的次数
public class Collatz {
    public static void main(String[] args) {
        System.out.print("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        while (true){
            if (num % 2 == 0){
                count++;
                num = num / 2;
            }
            if (num % 2 != 0 && num != 1){
                count++;
                num = num * 3 + 1;
            }
            if (num == 1){
                break;
            }
        }
        System.out.println("进行了" + count + "次操作");
    }
}
