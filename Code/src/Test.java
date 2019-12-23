import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        CodeCompress demo = new CodeCompress();

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("输入的字符串：" + s);

        String s1 = demo.method(s);
        System.out.println("压缩后的字符串：" + s1);

        String s2 = demo.method2(s1);
        System.out.println("解压后的字符串：" + s2);
    }
}
