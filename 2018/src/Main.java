//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext()) {
//            int num_01 = sc_01.nextInt();//多少天
//            if (num_01 == 0) {
//                break;
//            } else {
//                int cow_today = 0;
//                ArrayList<Integer> arr_01 = new ArrayList<Integer>();
//                //先把所有数组进行填充,填充至length长度
//                for (int i = 1; i <= num_01; i++) {
//                    if (i <= 4) {
//                        arr_01.add(1);
//                    } else {
//                        for (int j = 0; j < i - 3; j++) {
//                            cow_today += arr_01.get(j);
//                        }
//                        arr_01.add(cow_today);
//                        cow_today = 0;
//                    }
//                }
//                //计算所有总牛数并输出。
//                int cow_all = 0;
//                if (num_01 <= 4) {
//                    System.out.println(num_01);
//                } else {
//                    for (int i = 0; i < num_01 ; i++) {
//                        cow_all += arr_01.get(i);
//                    }
//                    System.out.println(cow_all);
//                }
//            }
//        }
//
//    }
//}

//更为简单的

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_01 = sc_01.nextInt();//多少天
            if (num_01 == 0) break;
            else {
                int result = countingPigs(num_01);
                System.out.println(result);
            }
        }
    }

    private static int countingPigs(int num_01) {
        if (num_01 <= 4) return num_01;
        else {
            return countingPigs(num_01 - 1) + countingPigs(num_01 - 3);
        }
    }
}