public class ChangeToEnglish {

    // [0,20)的读法
    public static String oneNumber(String[] str,int num){
        return str[num];
    }

    // [20,100)的两位数的读法
    public static String twoNumber(String[] str, int num){
        if (num < 20){
            return oneNumber(str,num);
        }
        int a = 20 + (num - 20)/10;
        int b = num%10;
        if ( b == 0){
            return str[a];
        } else {
            return (str[a] + "-" + str[b]);
        }
    }

    // [100,1000)三位数的读法
    public static String threeNumber(String[] str,int num){
        if (num < 100){
            return twoNumber(str,num);
        }
        int a = num/100;
        int b = num - 100*a;
        int c = num%10;
        if (b == 0 && c != 0){
            return (str[a] + " hundred and " + str[c]);
        }
        if ( b == 0){
            return (str[a] + " hundred");
        } else {
            String s = twoNumber(str,b);
            return (str[a] + " hundred and " + s);
        }
    }


    public void method(int num) {
        // 定义数组表示用到的数字的英文读法
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
                "nineteen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        // 如果数字在[0,20]内，直接输出数组中对应的值
        if (0 < num && num <= 20) {
            System.out.println(oneNumber(str,num));
        }

        // 如果数字在(20,100)
        if (20 < num && num < 100) {
            System.out.println(twoNumber(str, num));
        }

        // 如果数字在[100,1000)
        if (100 <= num && num < 1000) {
            System.out.println(threeNumber(str, num));
        }

        if (num >= 1000) {
            // 1.把int类型的数据转换成String类型
            String s = Integer.toString(num);

            // 2.把String类型转换成String数组
            String[] arr = new String[s.length()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = String.valueOf(s.charAt(i) - '0');
            }

            // 3.分块
            // StringBuilder可以拼接字符串
            StringBuilder sb = new StringBuilder();
            // 三个数字一组进行分块，根据字符串长度除以3的余数实现
            int a = s.length() % 3;

            // 余数为0的格式：xxx,xxx   xxx,xxx,xxx
            if (a == 0) {
                // 遍历数组进行拼接
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    if (i == 2) {
                        sb.append(",");
                    }
                    if (i == 5 && arr.length > 6) {
                        sb.append(",");
                    }
                }
            }
            if (a == 1) {
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    if (i == 0) {
                        sb.append(",");
                    }
                    if (i == 3 && arr.length > 4) {
                        sb.append(",");
                    }
                    if (i == 6 && arr.length > 7) {
                        sb.append(",");
                    }
                }
            }
            if (a == 2) {
                for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    if (i == 1) {
                        sb.append(",");
                    }
                    if (i == 4) {
                        sb.append(",");
                    }
                }
            }
            // 得到拼接后的字符串
            String result = sb.toString();

            // 4.将字符串分割存入数组
            StringBuilder sb1 = new StringBuilder();
            // 按照","进行分割
            String[] array = result.split(",");
            // 定义数字数组，用来存入分割的数字
            int[] h1 = new int[array.length];
            for (int i = 0; i < array.length; i++){
                // 将获取到的每一个字符串元素放入int数组中
                h1[i] = Integer.parseInt(array[i]);
            }
            // 5.拼接
            if (h1.length > 3) {
                sb1.append(str[h1[0]]).append(" BILLION ");
                if (h1[1] != 0) {
                    sb1.append(threeNumber(str, h1[1])).append(" MILLION ");
                }
                if (h1[2] != 0) {
                    sb1.append(threeNumber(str, h1[2])).append(" THOUSAND ");
                }
                if (h1[3] != 0) {
                    sb1.append("and ").append(threeNumber(str, h1[3]));
                }
            } else if (h1.length < 3){
                sb1.append(threeNumber(str, h1[0])).append(" THOUSAND ")
                        .append(threeNumber(str, h1[1]));
            } else {
                sb1.append(threeNumber(str, h1[0])).append(" MILLION ");
                if (h1[1] != 0) {
                    sb1.append(threeNumber(str, h1[1])).append(" THOUSAND ");
                }
                if (h1[2] != 0){
                    sb1.append("and ").append(threeNumber(str,h1[2]));
                }
            }
            System.out.println(sb1.toString());
        }
    }
}
