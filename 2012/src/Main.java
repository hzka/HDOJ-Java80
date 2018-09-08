import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_begin = sc_01.nextInt();
            int num_end = sc_01.nextInt();
            boolean result01 = false;
            int flag = 0;//设置标志位
            if (num_begin == 0 && num_end == 0) break;
            else {
                for (int count = num_begin; count <= num_end; count++) {
                    int result = (int) (Math.pow(count, 2)) + count + 41;
                    result01 = jianchasushu(result);
                    if(result01 == true){//说明是没有素数的。
                        flag = 1;
                    }
                }
            }
            if(flag==1){
                System.out.println("Sorry");
            }else{
                System.out.println("OK");
            }
        }
    }
    //原来大家方法都差不多，感觉有时候不能想什么是权威？
    // 什么是标准？能解决问题自然是权威，自然是标准，都是人定的
    private static boolean jianchasushu(int result) {
        for(int i = 2;i<=(Math.pow(result,1.0/2)+1);i++){
            if(result%i==0){
                return true;
            }
        }
        return false;
    }
}
