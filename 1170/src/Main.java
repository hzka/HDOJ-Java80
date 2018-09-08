import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
//        Scanner sc_02 = new Scanner(System.in);
        //杭电OJf***k,只能有一个输入，不能有两次初始化，谢谢。
        int line_num = sc_01.nextInt();
        sc_01.nextLine();
        for (int i = 0; i < line_num; i++) {
            String test_str = sc_01.nextLine();
            String[] test_cahr = test_str.split(" ");
            int lefft_op = Integer.parseInt(test_cahr[1]);
            int right_op = Integer.parseInt(test_cahr[2]);
            if (test_cahr[0].equals("+")) {
                System.out.println(lefft_op + right_op);
            } else if (test_cahr[0].equals("-")) {
                System.out.println(lefft_op - right_op);
            } else if (test_cahr[0].equals("*")) {
                System.out.println(lefft_op * right_op);
            } else {
                if (lefft_op % right_op == 0) {
                    System.out.println(lefft_op / right_op);
                } else {
                    System.out.println(String.format("%.2f", (double) lefft_op / right_op));
                }
            }
        }
    }
}
