//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext()) {
//            int line_nunm = sc_01.nextInt();
//            if (line_nunm == 1) {
//                System.out.println("1");
//                System.out.println();
//            } else if (line_nunm == 2) {
//                System.out.println("1");
//                System.out.println("1 1");
//                System.out.println();
//            } else {
//                System.out.println("1");
//                System.out.println("1 1");
//                int[] Inital_val = {1, 1};
//                int counting = 2;
//                while (counting < line_nunm) {
//                    int[] Out_val = new int[Inital_val.length + 1];
//                    Out_val[0] = 1;
//                    Out_val[Out_val.length - 1] = 1;
//                    //计算第i行的值。
//                    for (int i = 1; i < Out_val.length - 1; i++) {
//                        Out_val[i] = Inital_val[i] + Inital_val[i - 1];
//                    }
//                    //输出第i行结果
//                    for (int i = 0; i < Out_val.length - 1; i++) {
//                        System.out.print(Out_val[i] + " ");
//                    }
//                    System.out.println(Out_val[Out_val.length - 1]);
//                    //更新旧Value的值
//                    Inital_val = Out_val;
//                    counting++;
//                }
//                System.out.println();
//            }
//        }
//    }
//}

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int line_nunm = sc_01.nextInt();
            int[][] a = new int[32][32];
            for (int i = 1; i <= 30; i++) a[i][0] = 1;
            for (int i = 2; i <= 30; i++)
                for (int j = 1; j < i; j++) a[i][j] = a[i - 1][j - 1] + a[i - 1][j];

            for (int i = 1; i <= line_nunm; i++) {
                for (int j = 0; j < i - 1; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println(a[i][i - 1]);
            }
            System.out.println();
        }
    }
}