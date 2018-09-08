import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc_01 = new Scanner(System.in);
        while (sc_01.hasNext()) {
            int num_01 = sc_01.nextInt();
            int num_02 = sc_01.nextInt();
            int tmp = 0;
            if (num_01 == 0 && num_02 == 0) {
                break;
            } else {
                tmp = -Math.max(Math.abs(num_01),Math.abs(num_02));
                boolean result = check(num_01, num_02, tmp);
                if (result) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    private static boolean check(int num_01, int num_02, int tmp) {
        for (int i = tmp; i <= Math.abs(tmp); i++) {
            if (i != 0) {
                if (num_02 % i == 0 && (num_02 / i + i) == num_01) {
                    return true;
                }
            }
        }
        return false;
    }
}
