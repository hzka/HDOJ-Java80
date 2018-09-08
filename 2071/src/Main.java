import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        int group_num = sc_01.nextInt();
        for (int i = 0; i < group_num; i++) {
            int stu_num = sc_01.nextInt();
            double Max = -1;
            for (int j = 0; j < stu_num; j++) {
                double stu_height = sc_01.nextDouble();
                if (Max < stu_height) {
                    Max = stu_height;
                }
            }
            System.out.println(String.format("%.2f",Max));
        }

    }
}
