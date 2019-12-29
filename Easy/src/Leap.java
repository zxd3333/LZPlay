import java.util.Scanner;

// 判断是否是闰年
public class Leap {
    public static void main(String[] args) {
        System.out.print("输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0){
            System.out.println(year + "年是闰年");
        }else if (year % 4 ==0 && year %100 != 0){
            System.out.println(year + "年是闰年");
        }else {
            System.out.println(year + "年是平年");
        }
    }
}
