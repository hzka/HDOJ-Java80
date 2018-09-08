import java.util.Scanner;

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

            for (int i = 1; i < char_num; i++) {
                if(all_num[i]>all_num[0]){
                    int max  = all_num[0];
                    all_num[0] = all_num[i];
                    all_num[i] = max;
                }
            }
            int least_multiple = all_num[0];
            least_multiple = check_Mul(all_num,least_multiple);
            System.out.println(least_multiple);
        }
    }

    private static int check_Mul(int[] all_num, int least_multiple) {
        while (true){
            int couting =0;
            for(int i = 0;i<all_num.length;i++){
                if(least_multiple % all_num[i] == 0){
                    couting ++;
                }
            }
            if(couting == all_num.length){
                return least_multiple;
            }else{
                least_multiple++;
            }
        }
    }
}