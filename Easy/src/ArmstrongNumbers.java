import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.print("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // sum 记录和
        int sum = 0;
        // b表示每个数字的对应次幂
        int b = 0;

        // 把数字转换成字符串
        String str = String.valueOf(num);
        // 字符串转换成字符数组
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            // 获得每个数字
            int a = ch[i] - '0';
            // 计算每个数字对应次幂
            b = (int)Math.pow(a,ch.length);
            // 求和
            sum += b;
        }
        // 比较
        if (sum == num){
            System.out.println(num + "是水仙花数");
        }else {
            System.out.println("不是");
        }
    }
}
