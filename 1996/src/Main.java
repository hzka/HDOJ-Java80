import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int line_num=sc_01.nextInt();
        for(int i = 0;i< line_num;i++){
            int test_num = sc_01.nextInt();
            double result = Math.pow(3,test_num);
            System.out.println((long) result);
        }
    }
}
