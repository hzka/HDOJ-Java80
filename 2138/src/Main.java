import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        //有了惯性思维，以为不用判断hasNext，一切皆有可能。
        while (sc_01.hasNext()) {
            long num_mon = sc_01.nextLong();
            ArrayList<Integer> arrayList_01 = new ArrayList<Integer>();
            for (long i = 0; i < num_mon; i++) {
                int tmp = sc_01.nextInt();
                arrayList_01.add(tmp);
            }
            boolean result = false;
            long counting = 0;
            for (long i = 0; i < num_mon; i++) {
                result = check_Prime_number(arrayList_01.get((int) i));
                if (result) counting++;
            }
            System.out.println(counting);
        }
    }

    //存在时间复杂度过高的问题。三中优化方法：（1）num/2+1;(2)sqrt(num)+1;(3)去掉整数；（4）艾拉拖死筛选法
    private static boolean check_Prime_number(int num) {
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
