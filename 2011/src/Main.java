import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int number_amount = sc_01.nextInt();
            //测试个数
            int[] test_num = new int[number_amount];
            //输入每个元素
            for (int number = 0; number < number_amount; number++) {
                test_num[number] = sc_01.nextInt();
            }
            //对每个元素分别求值。
            for (int number = 0; number < number_amount; number++) {
                double result = 0,fenmu = 0;
                for (int i = 0; i < test_num[number]; i++) {
                    fenmu = Math.pow(-1, i);
                    result += fenmu / (i+1);
                }
                System.out.println(String.format("%.2f", result));
            }
        }
    }
}
