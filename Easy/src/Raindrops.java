import java.util.Scanner;

// 雨滴声
public class Raindrops {
    public static void main(String[] args) {
        System.out.print("输入一个数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // String 实现
        String str = "";
        if (num % 3 == 0){
            str += "Pling";
        }
        if (num % 5 == 0){
            str += "Plang";
        }
        if (num % 7 == 0){
            str += "Plong";
        }

        if (str.length() > 1){
            System.out.println(str);
        }else {
            System.out.println(num);
        }

        // StringBuilder 实现
        StringBuilder sb = new StringBuilder();
        if (num % 3 == 0){
            sb.append("Pling");
        }
        if (num % 5 == 0){
            sb.append("Plang");
        }
        if (num % 7 == 0){
            sb.append("Plong");
        }
        if (sb.length() > 0){
            System.out.println(sb.toString());
        }else {
            System.out.println(num);
        }
    }
}
