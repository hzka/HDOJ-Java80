import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num = sc_01.nextInt();
        for (int i = 0; i < line_num; i++) {
            int num_01 = sc_01.nextInt();
            int GCD_01 = sc_01.nextInt();
            int num_02 = 0;
            if(num_01 / GCD_01 == 1){
                num_02 = GCD_01 * 2;
                System.out.println(num_02);
            }else{
                int division_01 = num_01 / GCD_01;
                int division_02 =2;
                //对其进行判断。若是两个数除1以外的公约数，则return false,否则return true;
                while (!checkGCD(division_01,division_02)){
                    division_02++;
                }
                System.out.println(division_02 *GCD_01);
            }
        }
    }

    private static boolean checkGCD(int division_01, int division_02) {
        int tmp = 0;
        //调换次序。大数放在前面.
        if(division_01 < division_02){
            tmp = division_01;
            division_01 = division_02;
            division_02 = tmp;
        }
        while (division_01 % division_02 != 0 ){
            tmp = division_02;
            division_02 = division_01 %division_02;
            division_01 = tmp;
        }
        if(division_02 == 1){
            return true;
        }else{
            return false;
        }
    }
}
