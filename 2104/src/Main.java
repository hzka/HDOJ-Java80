import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int People_num = sc_01.nextInt();//初始人数
            int Initia_val = sc_01.nextInt();//间隔数
            //如果输入均为-1的话。则退出，else
            if (People_num == -1 && Initia_val == -1) {
                break;
            } else {
                //判断两者的最大公约数是不是等于1
                int test_result = gcd(People_num, Initia_val);
                if (test_result == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("POOR Haha");
                }
            }
        }
    }

    private static int gcd(int people_num, int initia_val) {
        if(initia_val == 0){
            return people_num;
        }else{
            return gcd(initia_val,people_num%initia_val);
        }
    }

}
