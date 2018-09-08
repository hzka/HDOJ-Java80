//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext()) {
//            int num_lin = sc_01.nextInt();
//            //判断是否包含
//            ArrayList<String> arrayList_01 = new ArrayList<String>();
//            //进行添加
//            ArrayList<Counting> arrayList_02 = new ArrayList<Counting>();
//            //输入所有String字符串
//            if (num_lin != 0) {
//                for (int i = 0; i < num_lin; i++) {
//                    String strings = sc_01.next();
//                    if (!arrayList_01.contains(strings)) {
//                        //若输入的字符串不在该数组中。
//                        Counting counting_01 = new Counting();
//                        counting_01.conting = 1;
//                        counting_01.color_name = strings;
//                        arrayList_02.add(counting_01);
//                        arrayList_01.add(strings);
//                    } else {
//                        for (int j = 0; j < arrayList_02.size(); j++) {
//                            if (arrayList_02.get(j).color_name.equals(strings)) {
//                                arrayList_02.get(j).conting++;
//                            }
//                        }
//                    }
//                }
//            } else {
//                break;
//            }
//            int Max = arrayList_02.get(0).conting;
//            String MaxStrings = arrayList_02.get(0).color_name;
//            //统计
//            for (int k = 0; k < arrayList_01.size() - 1; k++) {
//                if (Max < arrayList_02.get(k + 1).conting){
//                    //只保存当时最大的值
//                    Max = arrayList_02.get(k+1).conting;
//                    MaxStrings = arrayList_02.get(k+1).color_name;
//                }
//            }
//            System.out.println(MaxStrings);
//        }
//    }
//
//    private static class Counting {
//        private static String color_name;
//        private static int conting;
//    }
//}
//别人的代码，用一维数组完全可以解决的呀。是不是傻，只存最大一个
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int combo = sc.nextInt();
            if (combo == 0) {
                return;
            }
            String color[] = new String[combo];
            for (int i = 0; i < color.length; i++) {
                color[i] = sc.next();
            }
            int max = 0, t = 0, Index = 0;
            for (int i = 0; i < color.length; i++) {
                for (int j = i; j < color.length; j++) {
                    if (color[i].equals(color[j])) {
                        t++;
                    }
                }
                if (t > max) {
                    max = t;
                    Index = i;
                }
                t=0;
            }
            System.out.println(color[Index]);
        }
    }
}

