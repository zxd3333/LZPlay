import java.util.ArrayList;
import java.util.Scanner;

// 第n个素数
public class NthPrime {
    public static void main(String[] args) {
        System.out.println("请输入一个数字(不要太大)：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 记录素数的个数
        int count = 0;

        // 将前num个素数保存在这个数组里
        ArrayList<Integer> array = new ArrayList<>();

        // i 会不断递增
        int i = 2;

        // 网上说：如果一个数不是素数，那么它可以进行因式分解
        // 分解之后，一个结果 <= 根号i      另一个结果 >= 根号i
        // 这里只要判断 i 与 [0,根号i] 之间的所有数字的余数都不为0，就可以保证它是素数
        while (true){

            // Math.sqrt(i) 表示：根号i
            double j = Math.sqrt(i);

            // m 记录i 与 [0,根号i] 之间的所有数字的余数为0的个数
            int m = 0;
            for (int x = 1; x <= j; x++){
                if (i % x == 0){
                    m++;
                }
            }
            // m == 1 表示这个数字是素数
            if (m == 1){
                count++;
                array.add(i);
            }
            if (count == num){
                System.out.println("第" + num + "个素数是：" + i);
                System.out.println("前" + num + "个素数分别是：" + array);
                break;
            }
            i++;
        }
    }
}
