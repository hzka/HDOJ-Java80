import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        //输出1w以内的整数。
        while (sc_01.hasNext()) {
            int counting = 0;
            int test_num = sc_01.nextInt();
            //加入二元素
            //每隔两个加一
            if (test_num != 0) {
                //因为素数是从3开始的且每次+2操作，因为偶数肯定不是素数。
                for (int i = 3; i < test_num / 2; i=i+2) {
                    //无需存储进数组和判断，只需要判定每一次结果是否是素数即可，两者均是素数，则count+1；两步并一步相当于。
                     if(checkSushu(i) && checkSushu(test_num -i)){
                         counting++;
                     }
                }
                System.out.println(counting);
            } else {
                break;
            }

        }
    }
    //若为素数，时间老超。
    private static boolean checkSushu(int num) {
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
