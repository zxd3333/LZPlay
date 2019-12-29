import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 千兆秒
public class GigaSecond {
    public static void main(String[] args) {

        // Date 和 SimpleDateFormat 和 Calendar 的使用
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间：" + sdf.format(now));
        Date date = addDate(now, 1000000000);
        System.out.println("千兆秒后：" + sdf.format(date));

    }

    public static Date addDate(Date date, int second){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND,second);
        return c.getTime();
    }
}
