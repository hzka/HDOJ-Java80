import java.util.*;

public class Main {
//（1）求最大公约数法：最大公约数*最小公倍数 = 两个数之积。
//（2）使用辗转相除法求 比如：下图为求 2 4 6的最小公倍数，用2 4 6做辗转相除法可得最小公倍数为2*1*2
//    3.而第三种方法为：先求出n个数中最大的那个数max，如果这个数可以整除所有的数，则这是最小公倍数
//    如果不能则令max+1直到找到可以整除所有的数的那个数为止
    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int char_num = sc_01.nextInt();
            int[] all_num = new int[char_num];
            for (int i = 0; i < char_num; i++) {
                all_num[i] = sc_01.nextInt();
            }
            int counting = 0;
            //计算最大公约数
            int Max = check(all_num, counting);
            //计算最小公倍数
            int result = lease_multiple(all_num, counting, Max);
            all_num[counting + 1] = result;
            //循环计算两个数的最小公倍数，其中一个是之前两个数的公倍数。
            while (counting < char_num - 2) {
                counting++;
                Max = check(all_num, counting);
                result = lease_multiple(all_num, counting, Max);
                all_num[counting+1] = result;
            }
            System.out.println(result);
        }

    }

    private static int lease_multiple(int[] all_num, int counting, int max) {
        int result = (all_num[counting] / max) * all_num[counting + 1];
        return result;
    }

    private static int check(int[] all_num, int counting) {
        //先找出其中的最小值。
        int min = all_num[counting];
        if (all_num[counting + 1] < min) {
            int tmp = all_num[counting];
            all_num[counting] = all_num[counting + 1];
            all_num[counting + 1] = tmp;
        }
        int flag = 0;
        //反向遍历获取最大公约数。
        for (int i = all_num[counting]; i >= 1; i--) {
            if (all_num[counting] % i == 0 && all_num[counting + 1] % i == 0) {
                flag++;
            }
            if (flag == 1) {
                return i;
            }
        }
        return 1;
    }
}
