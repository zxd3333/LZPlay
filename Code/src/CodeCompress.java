public class CodeCompress {

    // 压缩
    public String method(String s){
        // 把字符串转换成字符数组
        char[] ch = s.toCharArray();
        // 将字符数组中的数据保存在字符串数组(String[])中
        String[] arr = new String[s.length()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = String.valueOf(ch[i]);
        }
        // 记录下标
        int index = 0;
        int num = 1;
        StringBuilder sb = new StringBuilder();
        while (index < arr.length-1) {
            int i = code(arr, index, num);
            sb.append(i - index).append(arr[index]);
            index = i;
            num = i + 1;
        }
        sb.append(1).append(arr[index]);
        return sb.toString();
    }

    public static int code(String[] arr,int index,int num){
        while (arr[index].equals(arr[num])){
            num++;
        }
        return num;
    }

    // 解压缩
    public String method2(String s){
        // 将压缩的字符串转换成字符数组
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        // 记录下标
        int index = 0;
        while (index < ch.length-1){
            int count = ch[index] - '0';
            for (int i = 0; i < count; i++){
                sb.append(ch[index+1]);
            }
            index = index + 2;
        }
        return sb.toString();
    }
}
