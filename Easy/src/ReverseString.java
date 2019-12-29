import java.util.Scanner;

// 反转字符串
public class ReverseString {
    public static void main(String[] args) {
        System.out.print("输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("输入的字符串：" + str);

        // 方法一：通过字符数组
        char temp;
        char[] ch = str.toCharArray();
        for (int i = 0, j = ch.length - 1; i < j; i++, j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
        System.out.println("反转的字符串：" + new String(ch));

        // 方法二：通过charAt() 和 字符数组
        char[] chars = new char[str.length()];
        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++){
            chars[j] = str.charAt(i);
        }
        System.out.println("反转的字符串：" + new String(chars));

        // 方法三：charAt 和 StringBuffer/StringBuilder
        StringBuilder s = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            s.append(str.charAt(i));
        }
        System.out.println("反转的字符串：" + s.toString());

        // 方法四：通过StringBuffer/StringBuilder 的 reverse() 方法
        StringBuffer sb = new StringBuffer(str);
        System.out.println("反转的字符串：" + sb.reverse().toString());

    }
}
