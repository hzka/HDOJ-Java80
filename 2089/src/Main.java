import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int[] all_num = new int[1000001];
        int counting = 0;
        //使用累加法
        for (int i = 1; i <= 1000000; i++) {
            String deal_str = String.valueOf(i);
            if (deal_str.contains("4") || deal_str.contains("62")) {
                all_num[i] = all_num[i - 1] ;
            } else {
                all_num[i] = all_num[i-1] +1;//不吉利的个数。
            }
        }

        while (sc_01.hasNext()) {
            int begin_num = sc_01.nextInt();
            int end_num = sc_01.nextInt();
            if (begin_num == 0 && end_num == 0) {
                break;
            } else {
                //这样时间复杂度过高，必须先行计算所有数组元素，输入之后数值这样执行时间会减少。
                System.out.println(all_num[end_num]-all_num[begin_num-1]);
            }
        }
    }
}
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] dp = new int[1000001];
//        for (int i = 1; i <= 1000000; i++) {
//            String s = String.valueOf(i);
//            if (!(s.contains("4") || s.contains("62"))) dp[i] = dp[i - 1] + 1;
//            else dp[i] = dp[i - 1];
//        }
//        while (in.hasNext()) {
//            int n = in.nextInt(), m = in.nextInt();
//            if (n == 0 && m == 0) break;
//            System.out.println(dp[m] - dp[n - 1]);
//        }
//    }
//}