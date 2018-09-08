import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int a[] = getPrime(99999);
        //添加所有素数
        while (sc_01.hasNext()) {
            int test_num = sc_01.nextInt();
            //判断素数并输出
            boolean test_resulet = false;
            if (test_num == 1) {
                System.out.println(0);
                continue;
            } else if (test_num % 2 == 0) {
                System.out.println(1);
                continue;
            } else {
                boolean test = false;
                //若其是素数，则输出长度即可，若不是素数，则输出一。
                for (int i = 0; a[i] <=test_num; i++) {
                    if (a[i] == test_num) {
                        System.out.println(i+1);
                        test =true;
                    }
                }
                if(test) continue;
                else{
                    System.out.println(1);
                    continue;
                }
            }
        }
    }



    /**
     * 功能：筛选法求素数(主要是素数倍数的数，肯定不是素数)
     *
     * @param severalPrime 第几个素数
     * @author Smilexs
     */

    public static int[] getPrime(int severalPrime) {
        int[] a = new int[severalPrime];//存放素数 的 数组
        int index = 0;//数组下标
        a[index] = 2;//第一个素数=2

        for (int n = 3; ; n++) {
            boolean flag = true;//标记是否是 素数，每次循环假定是 素数
            /*
             * 关键：
			 * 数组中遍历,n是否是数组里面某个数的倍数
			 * Math.sqrt(index) 大大大的提高了 运算速度
			 */
            for (int j = 0; j <= Math.sqrt(index); j++) {
                if (n % a[j] == 0) {
                    flag = false;//不是素数，直接下一轮
                    break;
                }
            }

            if (flag) {
                index++;
                a[index] = n;//是素数 存放数组里
            }
            if (index == severalPrime - 1) break;
        }
        return a;
    }
}