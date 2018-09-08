import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_01 = sc_01.nextInt();
            ArrayList<Long> arrayList_01 = new ArrayList<Long>();
            arrayList_01.add((long) 0);
            arrayList_01.add((long) 1);
            if (num_01 != -1) {
                if(num_01 == 0 ){
                    System.out.println(arrayList_01.get(0));
                }else if(num_01 ==1){
                    System.out.println(arrayList_01.get(1));
                }else {
                    for(int i=2;i<=num_01;i++){
                        arrayList_01.add(arrayList_01.get(i-1)+arrayList_01.get(i-2));
                    }
                    System.out.println(arrayList_01.get(arrayList_01.size()-1));
                }
            }else{
                break;
            }
        }
    }
}


//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc_01 = new Scanner(System.in);
//        while (sc_01.hasNext()) {
//            int num_01 = sc_01.nextInt();
//            if (num_01 != -1) {
//                long result = getResult(num_01);
//                System.out.println(result);
//            } else {
//                break;
//            }
//        }
//    }
//
//    private static long getResult(int num_01) {
//        if (num_01 == 0) {
//            return 0;
//        } else if (num_01 == 1) {
//            return 1;
//        } else {
//            return getResult(num_01 - 1) + getResult(num_01 - 2);
//            //递归不一定需要相等。
//        }
//    }
//}