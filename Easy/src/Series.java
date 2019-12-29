import java.util.Scanner;

// 划分数字串
/*
    给定一串数字,输出所有连续的n长度顺序子串
    例如：数字为：1234685  长度为：3
    输出：123 234 346 468 685
 */
public class Series {
    public static void main(String[] args) {
        System.out.println("输入一串数字");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("输入一个长度");
        int len = sc.nextInt();

        // 将int转换成String，然后再转换成字符数组
        // 将字符数组的长度与len进行比较
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        if (len > chars.length){
            System.out.println(num);
        }

        for (int i = 0; i <= chars.length - len; i++){
            System.out.print(new String(chars,i,len) + " ");
        }
    }
}
