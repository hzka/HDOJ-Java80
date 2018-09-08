import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);

        while (sc_01.hasNext()) {
            double result = 0;
            double UpdateValue;
            //初始值
            int Initial_value = sc_01.nextInt();
            UpdateValue = (double)Initial_value;
            //计算个数
            int number = sc_01.nextInt();

            for (int i = 0; i < number; i++) {
                result+=UpdateValue;
                UpdateValue =  Math.pow(UpdateValue, 1.0 / 2);

            }
            System.out.println(String.format("%.2f", result));
        }

    }
}
