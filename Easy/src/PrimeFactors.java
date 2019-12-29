import java.util.ArrayList;
import java.util.Scanner;

// 获得一个数字的所有素数因子
// 例如：60 = 2×2×3×5
//     123 = 3×41
public class PrimeFactors {
    public static void main(String[] args) {
        System.out.println("输入一个数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        while (num % 2 == 0){
            array.add(2);
            num = num / 2;
        }
        while (num % 3 == 0){
            array.add(3);
            num = num / 3;
        }
        while (num % 5 == 0){
            array.add(5);
            num = num / 5;
        }
        while (num % 7 == 0){
            array.add(7);
            num = num / 7;
        }
        array.add(num);
        System.out.println(array);
    }
}
