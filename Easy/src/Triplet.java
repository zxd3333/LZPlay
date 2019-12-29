// 勾股数
// 找出 a，b，c，恰好符合勾股定理, 而其中 a+b+c=1000
public class Triplet {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++){
            for (int b = a + 1; b < 1000 - a; b++){
                int c = 1000 - a - b;
                if (a < b && b < c && a*a + b*b == c*c){
                    System.out.println(a + "," + b + "," + c);
                    System.out.println(a*b*c);
                }
            }
        }
    }
}
