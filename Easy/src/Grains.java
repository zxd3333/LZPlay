import java.util.ArrayList;

// 棋盘麦粒问题
/*
    第1个格子放1个
    第2个格子放2个
    第3个格子放4个
    第4个格子放8个
    ...
    第25个格子放xxx个
    总共有xxx个
 */
public class Grains {
    public static void main(String[] args) {
        ArrayList<Long> array = new ArrayList<>();
        long sum = 0;
        for (int i = 1; i <= 25; i++){
            long num = (long) Math.pow(2,(i-1));
            array.add(num);
            sum += num;
        }
        for (int i = 1; i <= 25; i++){
            System.out.println("第" + i + "个格子上有" + array.get(i-1) + "个麦粒");
        }
        System.out.println("麦粒总数为：" + sum);
    }
}
