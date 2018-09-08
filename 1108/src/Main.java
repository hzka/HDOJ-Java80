import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_01 = sc_01.nextInt();
            int num_02 = sc_01.nextInt();
            int tmp = 0;
            if (num_01 < num_02) {
                tmp = num_01;
                num_01 = num_02;
                num_02 = tmp;
            }
            int Gre_Div = greatest_divisor(num_01, num_02);
            int lea_mul = num_01 /Gre_Div*num_02/Gre_Div * Gre_Div;
            System.out.println(lea_mul);
        }
    }
    //利用辗转相除法。
    private static int greatest_divisor(int num_01, int num_02) {
        int tmp = 0;
        while (num_01 % num_02 != 0) {
            tmp = num_02;
            num_02 = num_01 % num_02;
            num_01 = tmp;
        }
        return num_02;
    }
}
