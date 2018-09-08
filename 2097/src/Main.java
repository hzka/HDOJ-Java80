import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int orig_value = sc_01.nextInt();
            if (orig_value != 0) {
                //十进制各位数之和
                int sum_ten = get_result(orig_value,10);
                int sum_twelve = get_result(orig_value,12);
                int sum_sixteeen = get_result(orig_value,16);
                if (sum_ten == sum_sixteeen && sum_ten == sum_twelve && sum_twelve == sum_sixteeen) {
                    System.out.println(orig_value+" is a Sky Number.");
                } else {
                    System.out.println(orig_value+" is not a Sky Number.");
                }
            } else {
                break;
            }
        }

    }
    //一定要保证能跑通多个测试用例，要巧。
    private static int get_result(int orig_value, int i) {
        int counting = 0;
        while (orig_value!=0){
            counting += (orig_value % i);
            orig_value = orig_value / i;
        }
        return counting;
    }
}
